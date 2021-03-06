/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.DetectorDefinitionInner;

/**
 * Type representing DetectorDefinition.
 */
public interface DetectorDefinition extends HasInner<DetectorDefinitionInner>, HasManager<AppServiceManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isEnabled value.
     */
    Boolean isEnabled();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the rank value.
     */
    Double rank();

    /**
     * @return the type value.
     */
    String type();

}
