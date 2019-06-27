/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.powerbiembedded.v2016_01_29;

import rx.Observable;
import com.microsoft.azure.management.powerbiembedded.v2016_01_29.implementation.WorkspacesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Workspaces.
 */
public interface Workspaces extends HasInner<WorkspacesInner> {
    /**
     * Retrieves all existing Power BI workspaces in the specified workspace collection.
     *
     * @param resourceGroupName Azure resource group
     * @param workspaceCollectionName Power BI Embedded Workspace Collection name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Workspace> listAsync(String resourceGroupName, String workspaceCollectionName);

}
