/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ApiSchemas;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SchemaContract;

class ApiSchemasImpl extends WrapperImpl<ApiSchemasInner> implements ApiSchemas {
    private final ApiManagementManager manager;

    ApiSchemasImpl(ApiManagementManager manager) {
        super(manager.inner().apiSchemas());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public SchemaContractImpl define(String name) {
        return wrapModel(name);
    }

    private SchemaContractImpl wrapModel(SchemaContractInner inner) {
        return  new SchemaContractImpl(inner, manager());
    }

    private SchemaContractImpl wrapModel(String name) {
        return new SchemaContractImpl(name, this.manager());
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String schemaId) {
        ApiSchemasInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId, schemaId).toCompletable();
    }

    @Override
    public Observable<SchemaContract> listByApiAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        ApiSchemasInner client = this.inner();
        return client.listByApiAsync(resourceGroupName, serviceName, apiId)
        .flatMapIterable(new Func1<Page<SchemaContractInner>, Iterable<SchemaContractInner>>() {
            @Override
            public Iterable<SchemaContractInner> call(Page<SchemaContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SchemaContractInner, SchemaContract>() {
            @Override
            public SchemaContract call(SchemaContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SchemaContract> getAsync(String resourceGroupName, String serviceName, String apiId, String schemaId) {
        ApiSchemasInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId, schemaId)
        .map(new Func1<SchemaContractInner, SchemaContract>() {
            @Override
            public SchemaContract call(SchemaContractInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String schemaId, String ifMatch) {
        ApiSchemasInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, schemaId, ifMatch).toCompletable();
    }

}
