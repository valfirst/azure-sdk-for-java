// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.fluent.WebPubSubManagementClient;
import com.azure.resourcemanager.webpubsub.implementation.OperationsImpl;
import com.azure.resourcemanager.webpubsub.implementation.UsagesImpl;
import com.azure.resourcemanager.webpubsub.implementation.WebPubSubManagementClientBuilder;
import com.azure.resourcemanager.webpubsub.implementation.WebPubSubPrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.webpubsub.implementation.WebPubSubPrivateLinkResourcesImpl;
import com.azure.resourcemanager.webpubsub.implementation.WebPubSubSharedPrivateLinkResourcesImpl;
import com.azure.resourcemanager.webpubsub.implementation.WebPubSubsImpl;
import com.azure.resourcemanager.webpubsub.models.Operations;
import com.azure.resourcemanager.webpubsub.models.Usages;
import com.azure.resourcemanager.webpubsub.models.WebPubSubPrivateEndpointConnections;
import com.azure.resourcemanager.webpubsub.models.WebPubSubPrivateLinkResources;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSharedPrivateLinkResources;
import com.azure.resourcemanager.webpubsub.models.WebPubSubs;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to WebPubSubManager. REST API for Azure WebPubSub Service. */
public final class WebPubSubManager {
    private Operations operations;

    private WebPubSubs webPubSubs;

    private Usages usages;

    private WebPubSubPrivateEndpointConnections webPubSubPrivateEndpointConnections;

    private WebPubSubPrivateLinkResources webPubSubPrivateLinkResources;

    private WebPubSubSharedPrivateLinkResources webPubSubSharedPrivateLinkResources;

    private final WebPubSubManagementClient clientObject;

    private WebPubSubManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new WebPubSubManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of WebPubSub service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the WebPubSub service API instance.
     */
    public static WebPubSubManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create WebPubSubManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new WebPubSubManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of WebPubSub service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the WebPubSub service API instance.
         */
        public WebPubSubManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.webpubsub")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new WebPubSubManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of WebPubSubs. */
    public WebPubSubs webPubSubs() {
        if (this.webPubSubs == null) {
            this.webPubSubs = new WebPubSubsImpl(clientObject.getWebPubSubs(), this);
        }
        return webPubSubs;
    }

    /** @return Resource collection API of Usages. */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /** @return Resource collection API of WebPubSubPrivateEndpointConnections. */
    public WebPubSubPrivateEndpointConnections webPubSubPrivateEndpointConnections() {
        if (this.webPubSubPrivateEndpointConnections == null) {
            this.webPubSubPrivateEndpointConnections =
                new WebPubSubPrivateEndpointConnectionsImpl(
                    clientObject.getWebPubSubPrivateEndpointConnections(), this);
        }
        return webPubSubPrivateEndpointConnections;
    }

    /** @return Resource collection API of WebPubSubPrivateLinkResources. */
    public WebPubSubPrivateLinkResources webPubSubPrivateLinkResources() {
        if (this.webPubSubPrivateLinkResources == null) {
            this.webPubSubPrivateLinkResources =
                new WebPubSubPrivateLinkResourcesImpl(clientObject.getWebPubSubPrivateLinkResources(), this);
        }
        return webPubSubPrivateLinkResources;
    }

    /** @return Resource collection API of WebPubSubSharedPrivateLinkResources. */
    public WebPubSubSharedPrivateLinkResources webPubSubSharedPrivateLinkResources() {
        if (this.webPubSubSharedPrivateLinkResources == null) {
            this.webPubSubSharedPrivateLinkResources =
                new WebPubSubSharedPrivateLinkResourcesImpl(
                    clientObject.getWebPubSubSharedPrivateLinkResources(), this);
        }
        return webPubSubSharedPrivateLinkResources;
    }

    /**
     * @return Wrapped service client WebPubSubManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public WebPubSubManagementClient serviceClient() {
        return this.clientObject;
    }
}