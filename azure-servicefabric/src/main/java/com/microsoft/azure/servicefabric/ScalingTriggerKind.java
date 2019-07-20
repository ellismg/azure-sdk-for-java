/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ScalingTriggerKind.
 */
public final class ScalingTriggerKind extends ExpandableStringEnum<ScalingTriggerKind> {
    /** Static value Invalid for ScalingTriggerKind. */
    public static final ScalingTriggerKind INVALID = fromString("Invalid");

    /** Static value AveragePartitionLoad for ScalingTriggerKind. */
    public static final ScalingTriggerKind AVERAGE_PARTITION_LOAD = fromString("AveragePartitionLoad");

    /** Static value AverageServiceLoad for ScalingTriggerKind. */
    public static final ScalingTriggerKind AVERAGE_SERVICE_LOAD = fromString("AverageServiceLoad");

    /**
     * Creates or finds a ScalingTriggerKind from its string representation.
     * @param name a name to look for
     * @return the corresponding ScalingTriggerKind
     */
    @JsonCreator
    public static ScalingTriggerKind fromString(String name) {
        return fromString(name, ScalingTriggerKind.class);
    }

    /**
     * @return known ScalingTriggerKind values
     */
    public static Collection<ScalingTriggerKind> values() {
        return values(ScalingTriggerKind.class);
    }
}
