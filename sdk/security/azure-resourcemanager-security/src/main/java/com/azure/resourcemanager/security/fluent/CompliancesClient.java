// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ComplianceInner;

/** An instance of this class provides access to all the operations defined in CompliancesClient. */
public interface CompliancesClient {
    /**
     * The Compliance scores of the specific management group.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Compliance objects response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComplianceInner> list(String scope);

    /**
     * The Compliance scores of the specific management group.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Compliance objects response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComplianceInner> list(String scope, Context context);

    /**
     * Details of a specific Compliance.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param complianceName name of the Compliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compliance of a scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComplianceInner get(String scope, String complianceName);

    /**
     * Details of a specific Compliance.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param complianceName name of the Compliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return compliance of a scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComplianceInner> getWithResponse(String scope, String complianceName, Context context);
}