// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.ServiceConfigurationResourceInner;
import com.azure.resourcemanager.hybridconnectivity.models.ServiceConfigurationResourcePatch;

/** An instance of this class provides access to all the operations defined in ServiceConfigurationsClient. */
public interface ServiceConfigurationsClient {
    /**
     * Lists of all the services associated with endpoint resource.
     *
     * <p>API to enumerate registered services in service configurations under a Endpoint Resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of serviceConfigurations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceConfigurationResourceInner> listByEndpointResource(String resourceUri, String endpointName);

    /**
     * Lists of all the services associated with endpoint resource.
     *
     * <p>API to enumerate registered services in service configurations under a Endpoint Resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of serviceConfigurations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceConfigurationResourceInner> listByEndpointResource(
        String resourceUri, String endpointName, Context context);

    /**
     * Gets the details about the service to the resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the service to the resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceConfigurationResourceInner> getWithResponse(
        String resourceUri, String endpointName, String serviceConfigurationName, Context context);

    /**
     * Gets the details about the service to the resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details about the service to the resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceConfigurationResourceInner get(String resourceUri, String endpointName, String serviceConfigurationName);

    /**
     * Create or update a service in serviceConfiguration for the endpoint resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param serviceConfigurationResource Service details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service configuration details associated with the target resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceConfigurationResourceInner> createOrupdateWithResponse(
        String resourceUri,
        String endpointName,
        String serviceConfigurationName,
        ServiceConfigurationResourceInner serviceConfigurationResource,
        Context context);

    /**
     * Create or update a service in serviceConfiguration for the endpoint resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param serviceConfigurationResource Service details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service configuration details associated with the target resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceConfigurationResourceInner createOrupdate(
        String resourceUri,
        String endpointName,
        String serviceConfigurationName,
        ServiceConfigurationResourceInner serviceConfigurationResource);

    /**
     * Update the service details in the service configurations of the target resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param serviceConfigurationResource Service details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service configuration details associated with the target resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceConfigurationResourceInner> updateWithResponse(
        String resourceUri,
        String endpointName,
        String serviceConfigurationName,
        ServiceConfigurationResourcePatch serviceConfigurationResource,
        Context context);

    /**
     * Update the service details in the service configurations of the target resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param serviceConfigurationResource Service details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service configuration details associated with the target resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceConfigurationResourceInner update(
        String resourceUri,
        String endpointName,
        String serviceConfigurationName,
        ServiceConfigurationResourcePatch serviceConfigurationResource);

    /**
     * Deletes the service details to the target resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceUri, String endpointName, String serviceConfigurationName, Context context);

    /**
     * Deletes the service details to the target resource.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
     * @param endpointName The endpoint name.
     * @param serviceConfigurationName The service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceUri, String endpointName, String serviceConfigurationName);
}