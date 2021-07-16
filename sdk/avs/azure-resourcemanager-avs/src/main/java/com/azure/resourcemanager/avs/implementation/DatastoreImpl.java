// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.DatastoreInner;
import com.azure.resourcemanager.avs.models.Datastore;
import com.azure.resourcemanager.avs.models.DatastoreProvisioningState;
import com.azure.resourcemanager.avs.models.DiskPoolVolume;
import com.azure.resourcemanager.avs.models.NetAppVolume;

public final class DatastoreImpl implements Datastore, Datastore.Definition, Datastore.Update {
    private DatastoreInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DatastoreProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetAppVolume netAppVolume() {
        return this.innerModel().netAppVolume();
    }

    public DiskPoolVolume diskPoolVolume() {
        return this.innerModel().diskPoolVolume();
    }

    public DatastoreInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String clusterName;

    private String datastoreName;

    public DatastoreImpl withExistingCluster(String resourceGroupName, String privateCloudName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        this.clusterName = clusterName;
        return this;
    }

    public Datastore create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatastores()
                .createOrUpdate(
                    resourceGroupName, privateCloudName, clusterName, datastoreName, this.innerModel(), Context.NONE);
        return this;
    }

    public Datastore create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatastores()
                .createOrUpdate(
                    resourceGroupName, privateCloudName, clusterName, datastoreName, this.innerModel(), context);
        return this;
    }

    DatastoreImpl(String name, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = new DatastoreInner();
        this.serviceManager = serviceManager;
        this.datastoreName = name;
    }

    public DatastoreImpl update() {
        return this;
    }

    public Datastore apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatastores()
                .createOrUpdate(
                    resourceGroupName, privateCloudName, clusterName, datastoreName, this.innerModel(), Context.NONE);
        return this;
    }

    public Datastore apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatastores()
                .createOrUpdate(
                    resourceGroupName, privateCloudName, clusterName, datastoreName, this.innerModel(), context);
        return this;
    }

    DatastoreImpl(DatastoreInner innerObject, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.privateCloudName = Utils.getValueFromIdByName(innerObject.id(), "privateClouds");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.datastoreName = Utils.getValueFromIdByName(innerObject.id(), "datastores");
    }

    public Datastore refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatastores()
                .getWithResponse(resourceGroupName, privateCloudName, clusterName, datastoreName, Context.NONE)
                .getValue();
        return this;
    }

    public Datastore refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatastores()
                .getWithResponse(resourceGroupName, privateCloudName, clusterName, datastoreName, context)
                .getValue();
        return this;
    }

    public DatastoreImpl withNetAppVolume(NetAppVolume netAppVolume) {
        this.innerModel().withNetAppVolume(netAppVolume);
        return this;
    }

    public DatastoreImpl withDiskPoolVolume(DiskPoolVolume diskPoolVolume) {
        this.innerModel().withDiskPoolVolume(diskPoolVolume);
        return this;
    }
}