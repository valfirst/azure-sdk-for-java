// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotAlertsClient;
import com.azure.resourcemanager.security.fluent.models.IotAlertModelInner;
import com.azure.resourcemanager.security.models.IotAlertModel;
import com.azure.resourcemanager.security.models.IotAlerts;
import com.azure.resourcemanager.security.models.ManagementState;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotAlertsImpl implements IotAlerts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotAlertsImpl.class);

    private final IotAlertsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotAlertsImpl(
        IotAlertsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IotAlertModel> list(String scope) {
        PagedIterable<IotAlertModelInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new IotAlertModelImpl(inner1, this.manager()));
    }

    public PagedIterable<IotAlertModel> list(
        String scope,
        String minStartTimeUtc,
        String maxStartTimeUtc,
        String alertType,
        ManagementState deviceManagementType,
        String compromisedEntity,
        Integer limit,
        String skipToken,
        Context context) {
        PagedIterable<IotAlertModelInner> inner =
            this
                .serviceClient()
                .list(
                    scope,
                    minStartTimeUtc,
                    maxStartTimeUtc,
                    alertType,
                    deviceManagementType,
                    compromisedEntity,
                    limit,
                    skipToken,
                    context);
        return Utils.mapPage(inner, inner1 -> new IotAlertModelImpl(inner1, this.manager()));
    }

    public IotAlertModel get(String scope, String iotAlertId) {
        IotAlertModelInner inner = this.serviceClient().get(scope, iotAlertId);
        if (inner != null) {
            return new IotAlertModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotAlertModel> getWithResponse(String scope, String iotAlertId, Context context) {
        Response<IotAlertModelInner> inner = this.serviceClient().getWithResponse(scope, iotAlertId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotAlertModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IotAlertsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}