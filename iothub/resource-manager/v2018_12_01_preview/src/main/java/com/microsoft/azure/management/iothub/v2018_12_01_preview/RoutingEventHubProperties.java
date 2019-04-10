/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties related to an event hub endpoint.
 */
public class RoutingEventHubProperties {
    /**
     * The connection string of the event hub endpoint.
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /**
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The subscription identifier of the event hub endpoint.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The name of the resource group of the event hub endpoint.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get the connection string of the event hub endpoint.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string of the event hub endpoint.
     *
     * @param connectionString the connectionString value to set
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @param name the name value to set
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscription identifier of the event hub endpoint.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscription identifier of the event hub endpoint.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the name of the resource group of the event hub endpoint.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the name of the resource group of the event hub endpoint.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

}
