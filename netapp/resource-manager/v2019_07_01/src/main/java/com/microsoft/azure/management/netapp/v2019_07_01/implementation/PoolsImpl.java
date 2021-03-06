/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.netapp.v2019_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2019_07_01.Pools;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.netapp.v2019_07_01.CapacityPool;

class PoolsImpl extends WrapperImpl<PoolsInner> implements Pools {
    private final NetAppManager manager;

    PoolsImpl(NetAppManager manager) {
        super(manager.inner().pools());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public CapacityPoolImpl define(String name) {
        return wrapModel(name);
    }

    private CapacityPoolImpl wrapModel(CapacityPoolInner inner) {
        return  new CapacityPoolImpl(inner, manager());
    }

    private CapacityPoolImpl wrapModel(String name) {
        return new CapacityPoolImpl(name, this.manager());
    }

    @Override
    public Observable<CapacityPool> listAsync(String resourceGroupName, String accountName) {
        PoolsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<CapacityPoolInner>, Observable<CapacityPoolInner>>() {
            @Override
            public Observable<CapacityPoolInner> call(List<CapacityPoolInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CapacityPoolInner, CapacityPool>() {
            @Override
            public CapacityPool call(CapacityPoolInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<CapacityPool> getAsync(String resourceGroupName, String accountName, String poolName) {
        PoolsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, poolName)
        .flatMap(new Func1<CapacityPoolInner, Observable<CapacityPool>>() {
            @Override
            public Observable<CapacityPool> call(CapacityPoolInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((CapacityPool)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String poolName) {
        PoolsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, poolName).toCompletable();
    }

}
