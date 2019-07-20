/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a health policy used to evaluate the health of the cluster or of a
 * cluster node.
 */
public class ClusterHealthPolicy {
    /**
     * Indicates whether warnings are treated with the same severity as errors.
     */
    @JsonProperty(value = "ConsiderWarningAsError")
    private Boolean considerWarningAsError;

    /**
     * The maximum allowed percentage of unhealthy nodes before reporting an
     * error. For example, to allow 10% of nodes to be unhealthy, this value
     * would be 10.
     *
     * The percentage represents the maximum tolerated percentage of nodes that
     * can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy node,
     * the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy nodes
     * over the total number of nodes in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of
     * nodes. Default percentage is zero.
     *
     * In large clusters, some nodes will always be down or out for repairs, so
     * this percentage should be configured to tolerate that.
     */
    @JsonProperty(value = "MaxPercentUnhealthyNodes")
    private Integer maxPercentUnhealthyNodes;

    /**
     * The maximum allowed percentage of unhealthy applications before
     * reporting an error. For example, to allow 10% of applications to be
     * unhealthy, this value would be 10.
     *
     * The percentage represents the maximum tolerated percentage of
     * applications that can be unhealthy before the cluster is considered in
     * error.
     * If the percentage is respected but there is at least one unhealthy
     * application, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy applications over
     * the total number of application instances in the cluster, excluding
     * applications of application types that are included in the
     * ApplicationTypeHealthPolicyMap.
     * The computation rounds up to tolerate one failure on small numbers of
     * applications. Default percentage is zero.
     */
    @JsonProperty(value = "MaxPercentUnhealthyApplications")
    private Integer maxPercentUnhealthyApplications;

    /**
     * Defines a map with max percentage unhealthy applications for specific
     * application types.
     * Each entry specifies as key the application type name and as value an
     * integer that represents the MaxPercentUnhealthyApplications percentage
     * used to evaluate the applications of the specified application type.
     *
     * The application type health policy map can be used during cluster health
     * evaluation to describe special application types.
     * The application types included in the map are evaluated against the
     * percentage specified in the map, and not with the global
     * MaxPercentUnhealthyApplications defined in the cluster health policy.
     * The applications of application types specified in the map are not
     * counted against the global pool of applications.
     * For example, if some applications of a type are critical, the cluster
     * administrator can add an entry to the map for that application type
     * and assign it a value of 0% (that is, do not tolerate any failures).
     * All other applications can be evaluated with
     * MaxPercentUnhealthyApplications set to 20% to tolerate some failures out
     * of the thousands of application instances.
     * The application type health policy map is used only if the cluster
     * manifest enables application type health evaluation using the
     * configuration entry for
     * HealthManager/EnableApplicationTypeHealthEvaluation.
     */
    @JsonProperty(value = "ApplicationTypeHealthPolicyMap")
    private List<ApplicationTypeHealthPolicyMapItem> applicationTypeHealthPolicyMap;

    /**
     * Get indicates whether warnings are treated with the same severity as errors.
     *
     * @return the considerWarningAsError value
     */
    public Boolean considerWarningAsError() {
        return this.considerWarningAsError;
    }

    /**
     * Set indicates whether warnings are treated with the same severity as errors.
     *
     * @param considerWarningAsError the considerWarningAsError value to set
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withConsiderWarningAsError(Boolean considerWarningAsError) {
        this.considerWarningAsError = considerWarningAsError;
        return this;
    }

    /**
     * Get the maximum allowed percentage of unhealthy nodes before reporting an error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster is considered in error.
     If the percentage is respected but there is at least one unhealthy node, the health is evaluated as Warning.
     The percentage is calculated by dividing the number of unhealthy nodes over the total number of nodes in the cluster.
     The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured to tolerate that.
     *
     * @return the maxPercentUnhealthyNodes value
     */
    public Integer maxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes;
    }

    /**
     * Set the maximum allowed percentage of unhealthy nodes before reporting an error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster is considered in error.
     If the percentage is respected but there is at least one unhealthy node, the health is evaluated as Warning.
     The percentage is calculated by dividing the number of unhealthy nodes over the total number of nodes in the cluster.
     The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured to tolerate that.
     *
     * @param maxPercentUnhealthyNodes the maxPercentUnhealthyNodes value to set
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withMaxPercentUnhealthyNodes(Integer maxPercentUnhealthyNodes) {
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
        return this;
    }

    /**
     * Get the maximum allowed percentage of unhealthy applications before reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the cluster is considered in error.
     If the percentage is respected but there is at least one unhealthy application, the health is evaluated as Warning.
     This is calculated by dividing the number of unhealthy applications over the total number of application instances in the cluster, excluding applications of application types that are included in the ApplicationTypeHealthPolicyMap.
     The computation rounds up to tolerate one failure on small numbers of applications. Default percentage is zero.
     *
     * @return the maxPercentUnhealthyApplications value
     */
    public Integer maxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications;
    }

    /**
     * Set the maximum allowed percentage of unhealthy applications before reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the cluster is considered in error.
     If the percentage is respected but there is at least one unhealthy application, the health is evaluated as Warning.
     This is calculated by dividing the number of unhealthy applications over the total number of application instances in the cluster, excluding applications of application types that are included in the ApplicationTypeHealthPolicyMap.
     The computation rounds up to tolerate one failure on small numbers of applications. Default percentage is zero.
     *
     * @param maxPercentUnhealthyApplications the maxPercentUnhealthyApplications value to set
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withMaxPercentUnhealthyApplications(Integer maxPercentUnhealthyApplications) {
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
        return this;
    }

    /**
     * Get defines a map with max percentage unhealthy applications for specific application types.
     Each entry specifies as key the application type name and as value an integer that represents the MaxPercentUnhealthyApplications percentage used to evaluate the applications of the specified application type.
     The application type health policy map can be used during cluster health evaluation to describe special application types.
     The application types included in the map are evaluated against the percentage specified in the map, and not with the global MaxPercentUnhealthyApplications defined in the cluster health policy.
     The applications of application types specified in the map are not counted against the global pool of applications.
     For example, if some applications of a type are critical, the cluster administrator can add an entry to the map for that application type
     and assign it a value of 0% (that is, do not tolerate any failures).
     All other applications can be evaluated with MaxPercentUnhealthyApplications set to 20% to tolerate some failures out of the thousands of application instances.
     The application type health policy map is used only if the cluster manifest enables application type health evaluation using the configuration entry for HealthManager/EnableApplicationTypeHealthEvaluation.
     *
     * @return the applicationTypeHealthPolicyMap value
     */
    public List<ApplicationTypeHealthPolicyMapItem> applicationTypeHealthPolicyMap() {
        return this.applicationTypeHealthPolicyMap;
    }

    /**
     * Set defines a map with max percentage unhealthy applications for specific application types.
     Each entry specifies as key the application type name and as value an integer that represents the MaxPercentUnhealthyApplications percentage used to evaluate the applications of the specified application type.
     The application type health policy map can be used during cluster health evaluation to describe special application types.
     The application types included in the map are evaluated against the percentage specified in the map, and not with the global MaxPercentUnhealthyApplications defined in the cluster health policy.
     The applications of application types specified in the map are not counted against the global pool of applications.
     For example, if some applications of a type are critical, the cluster administrator can add an entry to the map for that application type
     and assign it a value of 0% (that is, do not tolerate any failures).
     All other applications can be evaluated with MaxPercentUnhealthyApplications set to 20% to tolerate some failures out of the thousands of application instances.
     The application type health policy map is used only if the cluster manifest enables application type health evaluation using the configuration entry for HealthManager/EnableApplicationTypeHealthEvaluation.
     *
     * @param applicationTypeHealthPolicyMap the applicationTypeHealthPolicyMap value to set
     * @return the ClusterHealthPolicy object itself.
     */
    public ClusterHealthPolicy withApplicationTypeHealthPolicyMap(List<ApplicationTypeHealthPolicyMapItem> applicationTypeHealthPolicyMap) {
        this.applicationTypeHealthPolicyMap = applicationTypeHealthPolicyMap;
        return this;
    }

}
