/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation;

import com.microsoft.azure.management.kusto.v2018_09_07_preview.AzureSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.AzureSkuName;

class AzureSkuImpl extends WrapperImpl<AzureSkuInner> implements AzureSku {
    private final KustoManager manager;
    AzureSkuImpl(AzureSkuInner inner, KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public Integer capacity() {
        return this.inner().capacity();
    }

    @Override
    public AzureSkuName name() {
        return this.inner().name();
    }

    @Override
    public String tier() {
        return this.inner().tier();
    }

}
