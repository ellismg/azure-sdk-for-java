/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.CustomerSubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CustomerSubscriptions.
 */
public interface CustomerSubscriptions extends SupportsCreating<CustomerSubscription.DefinitionStages.Blank>, HasInner<CustomerSubscriptionsInner> {
    /**
     * Returns the specified product.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomerSubscription> getAsync(String resourceGroup, String registrationName, String customerSubscriptionName);

    /**
     * Returns a list of products.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomerSubscription> listAsync(final String resourceGroup, final String registrationName);

    /**
     * Deletes a customer subscription under a registration.
     *
     * @param resourceGroup Name of the resource group.
     * @param registrationName Name of the Azure Stack registration.
     * @param customerSubscriptionName Name of the product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroup, String registrationName, String customerSubscriptionName);

}