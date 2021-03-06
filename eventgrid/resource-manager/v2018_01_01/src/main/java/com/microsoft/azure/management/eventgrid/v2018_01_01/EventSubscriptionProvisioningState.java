/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EventSubscriptionProvisioningState.
 */
public final class EventSubscriptionProvisioningState extends ExpandableStringEnum<EventSubscriptionProvisioningState> {
    /** Static value Creating for EventSubscriptionProvisioningState. */
    public static final EventSubscriptionProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for EventSubscriptionProvisioningState. */
    public static final EventSubscriptionProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for EventSubscriptionProvisioningState. */
    public static final EventSubscriptionProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for EventSubscriptionProvisioningState. */
    public static final EventSubscriptionProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for EventSubscriptionProvisioningState. */
    public static final EventSubscriptionProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for EventSubscriptionProvisioningState. */
    public static final EventSubscriptionProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a EventSubscriptionProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding EventSubscriptionProvisioningState
     */
    @JsonCreator
    public static EventSubscriptionProvisioningState fromString(String name) {
        return fromString(name, EventSubscriptionProvisioningState.class);
    }

    /**
     * @return known EventSubscriptionProvisioningState values
     */
    public static Collection<EventSubscriptionProvisioningState> values() {
        return values(EventSubscriptionProvisioningState.class);
    }
}
