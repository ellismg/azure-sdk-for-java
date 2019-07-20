/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.servicefabric.LoadMetricInformation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about load in a Service Fabric cluster. It holds a summary of
 * all metrics and their load in a cluster.
 */
public class ClusterLoadInfoInner {
    /**
     * The starting time of last resource balancing run.
     */
    @JsonProperty(value = "LastBalancingStartTimeUtc")
    private DateTime lastBalancingStartTimeUtc;

    /**
     * The end time of last resource balancing run.
     */
    @JsonProperty(value = "LastBalancingEndTimeUtc")
    private DateTime lastBalancingEndTimeUtc;

    /**
     * List that contains metrics and their load information in this cluster.
     */
    @JsonProperty(value = "LoadMetricInformation")
    private List<LoadMetricInformation> loadMetricInformation;

    /**
     * Get the starting time of last resource balancing run.
     *
     * @return the lastBalancingStartTimeUtc value
     */
    public DateTime lastBalancingStartTimeUtc() {
        return this.lastBalancingStartTimeUtc;
    }

    /**
     * Set the starting time of last resource balancing run.
     *
     * @param lastBalancingStartTimeUtc the lastBalancingStartTimeUtc value to set
     * @return the ClusterLoadInfoInner object itself.
     */
    public ClusterLoadInfoInner withLastBalancingStartTimeUtc(DateTime lastBalancingStartTimeUtc) {
        this.lastBalancingStartTimeUtc = lastBalancingStartTimeUtc;
        return this;
    }

    /**
     * Get the end time of last resource balancing run.
     *
     * @return the lastBalancingEndTimeUtc value
     */
    public DateTime lastBalancingEndTimeUtc() {
        return this.lastBalancingEndTimeUtc;
    }

    /**
     * Set the end time of last resource balancing run.
     *
     * @param lastBalancingEndTimeUtc the lastBalancingEndTimeUtc value to set
     * @return the ClusterLoadInfoInner object itself.
     */
    public ClusterLoadInfoInner withLastBalancingEndTimeUtc(DateTime lastBalancingEndTimeUtc) {
        this.lastBalancingEndTimeUtc = lastBalancingEndTimeUtc;
        return this;
    }

    /**
     * Get list that contains metrics and their load information in this cluster.
     *
     * @return the loadMetricInformation value
     */
    public List<LoadMetricInformation> loadMetricInformation() {
        return this.loadMetricInformation;
    }

    /**
     * Set list that contains metrics and their load information in this cluster.
     *
     * @param loadMetricInformation the loadMetricInformation value to set
     * @return the ClusterLoadInfoInner object itself.
     */
    public ClusterLoadInfoInner withLoadMetricInformation(List<LoadMetricInformation> loadMetricInformation) {
        this.loadMetricInformation = loadMetricInformation;
        return this;
    }

}
