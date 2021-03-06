/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.storagecache.v2019_08_01.implementation.CachesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Caches.
 */
public interface Caches extends SupportsCreating<Cache.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Cache>, SupportsListingByResourceGroup<Cache>, SupportsListing<Cache>, HasInner<CachesInner> {
    /**
     * Tells a cache to write all dirty data to the StorageTarget(s).  During the flush, clients will see errors returned until the flush is complete.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> flushAsync(String resourceGroupName, String cacheName);

    /**
     * Tells a Stopped state cache to transition to Active state.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> startAsync(String resourceGroupName, String cacheName);

    /**
     * Tells an Active cache to transition to Stopped state.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> stopAsync(String resourceGroupName, String cacheName);

    /**
     * Tells a cache to upgrade its firmware.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> upgradeFirmwareAsync(String resourceGroupName, String cacheName);

}
