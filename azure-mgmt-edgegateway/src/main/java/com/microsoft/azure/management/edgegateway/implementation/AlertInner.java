/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.edgegateway.AlertSeverity;
import com.microsoft.azure.management.edgegateway.AlertErrorDetails;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.edgegateway.ARMBaseModel;

/**
 * Alert on the data box edge/gateway device.
 */
@JsonFlatten
public class AlertInner extends ARMBaseModel {
    /**
     * Alert title.
     */
    @JsonProperty(value = "properties.title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /**
     * Alert type.
     */
    @JsonProperty(value = "properties.alertType", access = JsonProperty.Access.WRITE_ONLY)
    private String alertType;

    /**
     * UTC time when the alert appeared.
     */
    @JsonProperty(value = "properties.appearedAtDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime appearedAtDateTime;

    /**
     * Alert recommendation.
     */
    @JsonProperty(value = "properties.recommendation", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendation;

    /**
     * Severity of the alert. Possible values include: 'Informational',
     * 'Warning', 'Critical'.
     */
    @JsonProperty(value = "properties.severity", access = JsonProperty.Access.WRITE_ONLY)
    private AlertSeverity severity;

    /**
     * Error details of the alert.
     */
    @JsonProperty(value = "properties.errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private AlertErrorDetails errorDetails;

    /**
     * Alert details.
     */
    @JsonProperty(value = "properties.detailedInformation", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> detailedInformation;

    /**
     * Get alert title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Get alert type.
     *
     * @return the alertType value
     */
    public String alertType() {
        return this.alertType;
    }

    /**
     * Get uTC time when the alert appeared.
     *
     * @return the appearedAtDateTime value
     */
    public DateTime appearedAtDateTime() {
        return this.appearedAtDateTime;
    }

    /**
     * Get alert recommendation.
     *
     * @return the recommendation value
     */
    public String recommendation() {
        return this.recommendation;
    }

    /**
     * Get severity of the alert. Possible values include: 'Informational', 'Warning', 'Critical'.
     *
     * @return the severity value
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Get error details of the alert.
     *
     * @return the errorDetails value
     */
    public AlertErrorDetails errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get alert details.
     *
     * @return the detailedInformation value
     */
    public Map<String, String> detailedInformation() {
        return this.detailedInformation;
    }

}