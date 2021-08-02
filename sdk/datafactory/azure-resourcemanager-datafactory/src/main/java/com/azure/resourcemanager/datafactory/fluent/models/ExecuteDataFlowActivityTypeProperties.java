// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Execute data flow activity properties. */
@Fluent
public final class ExecuteDataFlowActivityTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExecuteDataFlowActivityTypeProperties.class);

    /*
     * Data flow reference.
     */
    @JsonProperty(value = "dataFlow", required = true)
    private DataFlowReference dataFlow;

    /*
     * Staging info for execute data flow activity.
     */
    @JsonProperty(value = "staging")
    private DataFlowStagingInfo staging;

    /*
     * The integration runtime reference.
     */
    @JsonProperty(value = "integrationRuntime")
    private IntegrationRuntimeReference integrationRuntime;

    /*
     * Compute properties for data flow activity.
     */
    @JsonProperty(value = "compute")
    private ExecuteDataFlowActivityTypePropertiesCompute compute;

    /*
     * Trace level setting used for data flow monitoring output. Supported
     * values are: 'coarse', 'fine', and 'none'. Type: string (or Expression
     * with resultType string)
     */
    @JsonProperty(value = "traceLevel")
    private Object traceLevel;

    /*
     * Continue on error setting used for data flow execution. Enables
     * processing to continue if a sink fails. Type: boolean (or Expression
     * with resultType boolean)
     */
    @JsonProperty(value = "continueOnError")
    private Object continueOnError;

    /*
     * Concurrent run setting used for data flow execution. Allows sinks with
     * the same save order to be processed concurrently. Type: boolean (or
     * Expression with resultType boolean)
     */
    @JsonProperty(value = "runConcurrently")
    private Object runConcurrently;

    /**
     * Get the dataFlow property: Data flow reference.
     *
     * @return the dataFlow value.
     */
    public DataFlowReference dataFlow() {
        return this.dataFlow;
    }

    /**
     * Set the dataFlow property: Data flow reference.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withDataFlow(DataFlowReference dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get the staging property: Staging info for execute data flow activity.
     *
     * @return the staging value.
     */
    public DataFlowStagingInfo staging() {
        return this.staging;
    }

    /**
     * Set the staging property: Staging info for execute data flow activity.
     *
     * @param staging the staging value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withStaging(DataFlowStagingInfo staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the integrationRuntime property: The integration runtime reference.
     *
     * @return the integrationRuntime value.
     */
    public IntegrationRuntimeReference integrationRuntime() {
        return this.integrationRuntime;
    }

    /**
     * Set the integrationRuntime property: The integration runtime reference.
     *
     * @param integrationRuntime the integrationRuntime value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withIntegrationRuntime(
        IntegrationRuntimeReference integrationRuntime) {
        this.integrationRuntime = integrationRuntime;
        return this;
    }

    /**
     * Get the compute property: Compute properties for data flow activity.
     *
     * @return the compute value.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute compute() {
        return this.compute;
    }

    /**
     * Set the compute property: Compute properties for data flow activity.
     *
     * @param compute the compute value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        this.compute = compute;
        return this;
    }

    /**
     * Get the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @return the traceLevel value.
     */
    public Object traceLevel() {
        return this.traceLevel;
    }

    /**
     * Set the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     *
     * @param traceLevel the traceLevel value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withTraceLevel(Object traceLevel) {
        this.traceLevel = traceLevel;
        return this;
    }

    /**
     * Get the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnError value.
     */
    public Object continueOnError() {
        return this.continueOnError;
    }

    /**
     * Set the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnError the continueOnError value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withContinueOnError(Object continueOnError) {
        this.continueOnError = continueOnError;
        return this;
    }

    /**
     * Get the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @return the runConcurrently value.
     */
    public Object runConcurrently() {
        return this.runConcurrently;
    }

    /**
     * Set the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     *
     * @param runConcurrently the runConcurrently value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withRunConcurrently(Object runConcurrently) {
        this.runConcurrently = runConcurrently;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataFlow() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataFlow in model ExecuteDataFlowActivityTypeProperties"));
        } else {
            dataFlow().validate();
        }
        if (staging() != null) {
            staging().validate();
        }
        if (integrationRuntime() != null) {
            integrationRuntime().validate();
        }
        if (compute() != null) {
            compute().validate();
        }
    }
}