/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents information about an operation in a terminal state (Completed or
 * Faulted).
 */
public class InvokeDataLossResult {
    /**
     * If OperationState is Completed, this is 0.  If OperationState is
     * Faulted, this is an error code indicating the reason.
     */
    @JsonProperty(value = "ErrorCode")
    private Integer errorCode;

    /**
     * This class returns information about the partition that the user-induced
     * operation acted upon.
     */
    @JsonProperty(value = "SelectedPartition")
    private SelectedPartition selectedPartition;

    /**
     * Get if OperationState is Completed, this is 0.  If OperationState is Faulted, this is an error code indicating the reason.
     *
     * @return the errorCode value
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Set if OperationState is Completed, this is 0.  If OperationState is Faulted, this is an error code indicating the reason.
     *
     * @param errorCode the errorCode value to set
     * @return the InvokeDataLossResult object itself.
     */
    public InvokeDataLossResult withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get this class returns information about the partition that the user-induced operation acted upon.
     *
     * @return the selectedPartition value
     */
    public SelectedPartition selectedPartition() {
        return this.selectedPartition;
    }

    /**
     * Set this class returns information about the partition that the user-induced operation acted upon.
     *
     * @param selectedPartition the selectedPartition value to set
     * @return the InvokeDataLossResult object itself.
     */
    public InvokeDataLossResult withSelectedPartition(SelectedPartition selectedPartition) {
        this.selectedPartition = selectedPartition;
        return this;
    }

}
