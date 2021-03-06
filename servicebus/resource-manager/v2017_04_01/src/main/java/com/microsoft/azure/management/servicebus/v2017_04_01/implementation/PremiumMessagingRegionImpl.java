/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.servicebus.v2017_04_01.PremiumMessagingRegion;
import rx.Observable;
import com.microsoft.azure.management.servicebus.v2017_04_01.PremiumMessagingRegionProperties;

class PremiumMessagingRegionImpl extends GroupableResourceCoreImpl<PremiumMessagingRegion, PremiumMessagingRegionInner, PremiumMessagingRegionImpl, ServiceBusManager> implements PremiumMessagingRegion {
    PremiumMessagingRegionImpl(String name, PremiumMessagingRegionInner inner, ServiceBusManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PremiumMessagingRegion> createResourceAsync() {
        PremiumMessagingRegionsInner client = this.manager().inner().premiumMessagingRegions();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<PremiumMessagingRegion> updateResourceAsync() {
        PremiumMessagingRegionsInner client = this.manager().inner().premiumMessagingRegions();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<PremiumMessagingRegionInner> getInnerAsync() {
        PremiumMessagingRegionsInner client = this.manager().inner().premiumMessagingRegions();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public PremiumMessagingRegionProperties properties() {
        return this.inner().properties();
    }

}
