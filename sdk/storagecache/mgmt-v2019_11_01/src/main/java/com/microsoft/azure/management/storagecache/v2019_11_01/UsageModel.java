/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storagecache.v2019_11_01.implementation.UsageModelInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storagecache.v2019_11_01.implementation.StorageCacheManager;

/**
 * Type representing UsageModel.
 */
public interface UsageModel extends HasInner<UsageModelInner>, HasManager<StorageCacheManager> {
    /**
     * @return the display value.
     */
    UsageModelDisplay display();

    /**
     * @return the modelName value.
     */
    String modelName();

    /**
     * @return the targetType value.
     */
    String targetType();

}