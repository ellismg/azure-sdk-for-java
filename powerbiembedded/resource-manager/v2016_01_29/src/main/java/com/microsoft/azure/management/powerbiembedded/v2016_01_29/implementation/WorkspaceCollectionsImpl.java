/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.powerbiembedded.v2016_01_29.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.WorkspaceCollections;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.WorkspaceCollection;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.WorkspaceCollectionAccessKeys;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.CheckNameResponse;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.CheckNameRequest;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.MigrateWorkspaceCollectionRequest;

class WorkspaceCollectionsImpl extends GroupableResourcesCoreImpl<WorkspaceCollection, WorkspaceCollectionImpl, WorkspaceCollectionInner, WorkspaceCollectionsInner, PowerBIEmbeddedManager>  implements WorkspaceCollections {
    protected WorkspaceCollectionsImpl(PowerBIEmbeddedManager manager) {
        super(manager.inner().workspaceCollections(), manager);
    }

    @Override
    protected Observable<WorkspaceCollectionInner> getInnerAsync(String resourceGroupName, String name) {
        WorkspaceCollectionsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        WorkspaceCollectionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<WorkspaceCollection> listByResourceGroup(String resourceGroupName) {
        WorkspaceCollectionsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<WorkspaceCollection> listByResourceGroupAsync(String resourceGroupName) {
        WorkspaceCollectionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<WorkspaceCollectionInner>, Observable<WorkspaceCollectionInner>>() {
            @Override
            public Observable<WorkspaceCollectionInner> call(Page<WorkspaceCollectionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<WorkspaceCollectionInner, WorkspaceCollection>() {
            @Override
            public WorkspaceCollection call(WorkspaceCollectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<WorkspaceCollection> list() {
        WorkspaceCollectionsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<WorkspaceCollection> listAsync() {
        WorkspaceCollectionsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<WorkspaceCollectionInner>, Observable<WorkspaceCollectionInner>>() {
            @Override
            public Observable<WorkspaceCollectionInner> call(Page<WorkspaceCollectionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<WorkspaceCollectionInner, WorkspaceCollection>() {
            @Override
            public WorkspaceCollection call(WorkspaceCollectionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public WorkspaceCollectionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<WorkspaceCollectionAccessKeys> getAccessKeysAsync(String resourceGroupName, String workspaceCollectionName) {
        WorkspaceCollectionsInner client = this.inner();
        return client.getAccessKeysAsync(resourceGroupName, workspaceCollectionName)
        .map(new Func1<WorkspaceCollectionAccessKeysInner, WorkspaceCollectionAccessKeys>() {
            @Override
            public WorkspaceCollectionAccessKeys call(WorkspaceCollectionAccessKeysInner inner) {
                return new WorkspaceCollectionAccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WorkspaceCollectionAccessKeys> regenerateKeyAsync(String resourceGroupName, String workspaceCollectionName) {
        WorkspaceCollectionsInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, workspaceCollectionName)
        .map(new Func1<WorkspaceCollectionAccessKeysInner, WorkspaceCollectionAccessKeys>() {
            @Override
            public WorkspaceCollectionAccessKeys call(WorkspaceCollectionAccessKeysInner inner) {
                return new WorkspaceCollectionAccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    protected WorkspaceCollectionImpl wrapModel(WorkspaceCollectionInner inner) {
        return  new WorkspaceCollectionImpl(inner.name(), inner, manager());
    }

    @Override
    protected WorkspaceCollectionImpl wrapModel(String name) {
        return new WorkspaceCollectionImpl(name, new WorkspaceCollectionInner(), this.manager());
    }

    @Override
    public Observable<CheckNameResponse> checkNameAvailabilityAsync(String location, CheckNameRequest body) {
        WorkspaceCollectionsInner client = this.inner();
        return client.checkNameAvailabilityAsync(location, body)
        .map(new Func1<CheckNameResponseInner, CheckNameResponse>() {
            @Override
            public CheckNameResponse call(CheckNameResponseInner inner) {
                return new CheckNameResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable migrateAsync(String resourceGroupName, MigrateWorkspaceCollectionRequest body) {
        WorkspaceCollectionsInner client = this.inner();
        return client.migrateAsync(resourceGroupName, body).toCompletable();
    }

}
