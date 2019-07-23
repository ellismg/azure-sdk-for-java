/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity provider details.
 */
public class IdentityProviderDetails {
    /**
     * The tenant Id for the service principal with which the on-premise
     * management/data plane components would communicate with our Azure
     * services.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The application/client Id for the service principal with which the
     * on-premise management/data plane components would communicate with our
     * Azure services.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /**
     * The object Id of the service principal with which the on-premise
     * management/data plane components would communicate with our Azure
     * services.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * The intended Audience of the service principal with which the on-premise
     * management/data plane components would communicate with our Azure
     * services.
     */
    @JsonProperty(value = "audience")
    private String audience;

    /**
     * The base authority for Azure Active Directory authentication.
     */
    @JsonProperty(value = "aadAuthority")
    private String aadAuthority;

    /**
     * Get the tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @param tenantId the tenantId value to set
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @param applicationId the applicationId value to set
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @param objectId the objectId value to set
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the intended Audience of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @return the audience value
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the intended Audience of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     *
     * @param audience the audience value to set
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Get the base authority for Azure Active Directory authentication.
     *
     * @return the aadAuthority value
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Set the base authority for Azure Active Directory authentication.
     *
     * @param aadAuthority the aadAuthority value to set
     * @return the IdentityProviderDetails object itself.
     */
    public IdentityProviderDetails withAadAuthority(String aadAuthority) {
        this.aadAuthority = aadAuthority;
        return this;
    }

}