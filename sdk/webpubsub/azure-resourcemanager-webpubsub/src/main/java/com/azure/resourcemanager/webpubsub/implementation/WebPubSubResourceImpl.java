// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubResourceInner;
import com.azure.resourcemanager.webpubsub.models.DiagnosticConfiguration;
import com.azure.resourcemanager.webpubsub.models.EventHandlerSettings;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentity;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointConnection;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.RegenerateKeyParameters;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubKeys;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class WebPubSubResourceImpl
    implements WebPubSubResource, WebPubSubResource.Definition, WebPubSubResource.Update {
    private WebPubSubResourceInner innerObject;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceSku sku() {
        return this.innerModel().sku();
    }

    public ManagedIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String externalIp() {
        return this.innerModel().externalIp();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public Integer publicPort() {
        return this.innerModel().publicPort();
    }

    public Integer serverPort() {
        return this.innerModel().serverPort();
    }

    public String version() {
        return this.innerModel().version();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        List<SharedPrivateLinkResourceInner> inner = this.innerModel().sharedPrivateLinkResources();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new SharedPrivateLinkResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public WebPubSubTlsSettings tls() {
        return this.innerModel().tls();
    }

    public DiagnosticConfiguration diagnosticConfiguration() {
        return this.innerModel().diagnosticConfiguration();
    }

    public EventHandlerSettings eventHandler() {
        return this.innerModel().eventHandler();
    }

    public WebPubSubNetworkACLs networkACLs() {
        return this.innerModel().networkACLs();
    }

    public String publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Boolean disableLocalAuth() {
        return this.innerModel().disableLocalAuth();
    }

    public Boolean disableAadAuth() {
        return this.innerModel().disableAadAuth();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WebPubSubResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    public WebPubSubResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public WebPubSubResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubs()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public WebPubSubResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubs()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    WebPubSubResourceImpl(String name, com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerObject = new WebPubSubResourceInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public WebPubSubResourceImpl update() {
        return this;
    }

    public WebPubSubResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubs()
                .update(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public WebPubSubResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubs()
                .update(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    WebPubSubResourceImpl(
        WebPubSubResourceInner innerObject, com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "webPubSub");
    }

    public WebPubSubResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubs()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public WebPubSubResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebPubSubs()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public WebPubSubKeys listKeys() {
        return serviceManager.webPubSubs().listKeys(resourceGroupName, resourceName);
    }

    public Response<WebPubSubKeys> listKeysWithResponse(Context context) {
        return serviceManager.webPubSubs().listKeysWithResponse(resourceGroupName, resourceName, context);
    }

    public WebPubSubKeys regenerateKey(RegenerateKeyParameters parameters) {
        return serviceManager.webPubSubs().regenerateKey(resourceGroupName, resourceName, parameters);
    }

    public WebPubSubKeys regenerateKey(RegenerateKeyParameters parameters, Context context) {
        return serviceManager.webPubSubs().regenerateKey(resourceGroupName, resourceName, parameters, context);
    }

    public void restart() {
        serviceManager.webPubSubs().restart(resourceGroupName, resourceName);
    }

    public void restart(Context context) {
        serviceManager.webPubSubs().restart(resourceGroupName, resourceName, context);
    }

    public WebPubSubResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WebPubSubResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WebPubSubResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public WebPubSubResourceImpl withSku(ResourceSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public WebPubSubResourceImpl withIdentity(ManagedIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public WebPubSubResourceImpl withTls(WebPubSubTlsSettings tls) {
        this.innerModel().withTls(tls);
        return this;
    }

    public WebPubSubResourceImpl withDiagnosticConfiguration(DiagnosticConfiguration diagnosticConfiguration) {
        this.innerModel().withDiagnosticConfiguration(diagnosticConfiguration);
        return this;
    }

    public WebPubSubResourceImpl withEventHandler(EventHandlerSettings eventHandler) {
        this.innerModel().withEventHandler(eventHandler);
        return this;
    }

    public WebPubSubResourceImpl withNetworkACLs(WebPubSubNetworkACLs networkACLs) {
        this.innerModel().withNetworkACLs(networkACLs);
        return this;
    }

    public WebPubSubResourceImpl withPublicNetworkAccess(String publicNetworkAccess) {
        this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    public WebPubSubResourceImpl withDisableLocalAuth(Boolean disableLocalAuth) {
        this.innerModel().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    public WebPubSubResourceImpl withDisableAadAuth(Boolean disableAadAuth) {
        this.innerModel().withDisableAadAuth(disableAadAuth);
        return this;
    }
}