# PushNotificationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2PushNotificationsFcmDeviceRegistrationPost**](PushNotificationsApi.md#apiV2PushNotificationsFcmDeviceRegistrationPost) | **POST** /Api/v2/PushNotifications/FcmDeviceRegistration | 
[**apiV2PushNotificationsSyncRequestPost**](PushNotificationsApi.md#apiV2PushNotificationsSyncRequestPost) | **POST** /Api/v2/PushNotifications/SyncRequest | 
[**apiV2PushNotificationsWnsChannelRegistrationPost**](PushNotificationsApi.md#apiV2PushNotificationsWnsChannelRegistrationPost) | **POST** /Api/v2/PushNotifications/WnsChannelRegistration | 
[**apiV2PushNotificationsWnsToastPost**](PushNotificationsApi.md#apiV2PushNotificationsWnsToastPost) | **POST** /Api/v2/PushNotifications/WnsToast | 


<a name="apiV2PushNotificationsFcmDeviceRegistrationPost"></a>
# **apiV2PushNotificationsFcmDeviceRegistrationPost**
> apiV2PushNotificationsFcmDeviceRegistrationPost(request)



### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = PushNotificationsApi()
val request : PostFcmDeviceRegistrationRequest =  // PostFcmDeviceRegistrationRequest | 
try {
    apiInstance.apiV2PushNotificationsFcmDeviceRegistrationPost(request)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationsApi#apiV2PushNotificationsFcmDeviceRegistrationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationsApi#apiV2PushNotificationsFcmDeviceRegistrationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PostFcmDeviceRegistrationRequest**](PostFcmDeviceRegistrationRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiV2PushNotificationsSyncRequestPost"></a>
# **apiV2PushNotificationsSyncRequestPost**
> apiV2PushNotificationsSyncRequestPost()



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = PushNotificationsApi()
try {
    apiInstance.apiV2PushNotificationsSyncRequestPost()
} catch (e: ClientException) {
    println("4xx response calling PushNotificationsApi#apiV2PushNotificationsSyncRequestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationsApi#apiV2PushNotificationsSyncRequestPost")
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

<a name="apiV2PushNotificationsWnsChannelRegistrationPost"></a>
# **apiV2PushNotificationsWnsChannelRegistrationPost**
> apiV2PushNotificationsWnsChannelRegistrationPost(request)



### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = PushNotificationsApi()
val request : PostWnsChannelRegistrationRequest =  // PostWnsChannelRegistrationRequest | 
try {
    apiInstance.apiV2PushNotificationsWnsChannelRegistrationPost(request)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationsApi#apiV2PushNotificationsWnsChannelRegistrationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationsApi#apiV2PushNotificationsWnsChannelRegistrationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PostWnsChannelRegistrationRequest**](PostWnsChannelRegistrationRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiV2PushNotificationsWnsToastPost"></a>
# **apiV2PushNotificationsWnsToastPost**
> apiV2PushNotificationsWnsToastPost(request)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = PushNotificationsApi()
val request : ToastTest =  // ToastTest | 
try {
    apiInstance.apiV2PushNotificationsWnsToastPost(request)
} catch (e: ClientException) {
    println("4xx response calling PushNotificationsApi#apiV2PushNotificationsWnsToastPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PushNotificationsApi#apiV2PushNotificationsWnsToastPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ToastTest**](ToastTest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

