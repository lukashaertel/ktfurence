# ArtShowApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ArtShowItemActivitesLogPost**](ArtShowApi.md#apiV2ArtShowItemActivitesLogPost) | **POST** /Api/v2/ArtShow/ItemActivites/Log | 
[**apiV2ArtShowItemActivitesNotificationBundlesSendPost**](ArtShowApi.md#apiV2ArtShowItemActivitesNotificationBundlesSendPost) | **POST** /Api/v2/ArtShow/ItemActivites/NotificationBundles/Send | 
[**apiV2ArtShowItemActivitesNotificationBundlesSimulationGet**](ArtShowApi.md#apiV2ArtShowItemActivitesNotificationBundlesSimulationGet) | **GET** /Api/v2/ArtShow/ItemActivites/NotificationBundles/Simulation | 


<a name="apiV2ArtShowItemActivitesLogPost"></a>
# **apiV2ArtShowItemActivitesLogPost**
> apiV2ArtShowItemActivitesLogPost(payload)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = ArtShowApi()
val payload : ByteArray = BINARY_DATA_HERE // ByteArray | Art show log contents
try {
    apiInstance.apiV2ArtShowItemActivitesLogPost(payload)
} catch (e: ClientException) {
    println("4xx response calling ArtShowApi#apiV2ArtShowItemActivitesLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ArtShowApi#apiV2ArtShowItemActivitesLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | **ByteArray**| Art show log contents |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: Not defined

<a name="apiV2ArtShowItemActivitesNotificationBundlesSendPost"></a>
# **apiV2ArtShowItemActivitesNotificationBundlesSendPost**
> apiV2ArtShowItemActivitesNotificationBundlesSendPost()



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = ArtShowApi()
try {
    apiInstance.apiV2ArtShowItemActivitesNotificationBundlesSendPost()
} catch (e: ClientException) {
    println("4xx response calling ArtShowApi#apiV2ArtShowItemActivitesNotificationBundlesSendPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ArtShowApi#apiV2ArtShowItemActivitesNotificationBundlesSendPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV2ArtShowItemActivitesNotificationBundlesSimulationGet"></a>
# **apiV2ArtShowItemActivitesNotificationBundlesSimulationGet**
> apiV2ArtShowItemActivitesNotificationBundlesSimulationGet()



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = ArtShowApi()
try {
    apiInstance.apiV2ArtShowItemActivitesNotificationBundlesSimulationGet()
} catch (e: ClientException) {
    println("4xx response calling ArtShowApi#apiV2ArtShowItemActivitesNotificationBundlesSimulationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ArtShowApi#apiV2ArtShowItemActivitesNotificationBundlesSimulationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

