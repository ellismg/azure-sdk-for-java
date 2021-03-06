/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateSsisTaskOutputProjectLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType", defaultImpl = MigrateSsisTaskOutputProjectLevel.class)
@JsonTypeName("SsisProjectLevelOutput")
public class MigrateSsisTaskOutputProjectLevel extends MigrateSsisTaskOutput {
    /**
     * Name of the folder.
     */
    @JsonProperty(value = "folderName", access = JsonProperty.Access.WRITE_ONLY)
    private String folderName;

    /**
     * Name of the project.
     */
    @JsonProperty(value = "projectName", access = JsonProperty.Access.WRITE_ONLY)
    private String projectName;

    /**
     * Current state of migration. Possible values include: 'None',
     * 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Stage of SSIS migration. Possible values include: 'None', 'Initialize',
     * 'InProgress', 'Completed'.
     */
    @JsonProperty(value = "stage", access = JsonProperty.Access.WRITE_ONLY)
    private SsisMigrationStage stage;

    /**
     * Migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Migration progress message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Migration exceptions and warnings.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get name of the folder.
     *
     * @return the folderName value
     */
    public String folderName() {
        return this.folderName;
    }

    /**
     * Get name of the project.
     *
     * @return the projectName value
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Get current state of migration. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get stage of SSIS migration. Possible values include: 'None', 'Initialize', 'InProgress', 'Completed'.
     *
     * @return the stage value
     */
    public SsisMigrationStage stage() {
        return this.stage;
    }

    /**
     * Get migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get migration progress message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get migration exceptions and warnings.
     *
     * @return the exceptionsAndWarnings value
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

}
