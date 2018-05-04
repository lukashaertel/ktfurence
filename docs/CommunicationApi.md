# CommunicationApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2CommunicationPrivateMessagesByMessageIdReadPost**](CommunicationApi.md#apiV2CommunicationPrivateMessagesByMessageIdReadPost) | **POST** /Api/v2/Communication/PrivateMessages/{MessageId}/Read | Marks a given private message as read (reading receipt).
[**apiV2CommunicationPrivateMessagesGet**](CommunicationApi.md#apiV2CommunicationPrivateMessagesGet) | **GET** /Api/v2/Communication/PrivateMessages | Retrieves all private messages of an authenticated attendee.
[**apiV2CommunicationPrivateMessagesPost**](CommunicationApi.md#apiV2CommunicationPrivateMessagesPost) | **POST** /Api/v2/Communication/PrivateMessages | Sends a private message to a specific recipient/attendee.


<a name="apiV2CommunicationPrivateMessagesByMessageIdReadPost"></a>
# **apiV2CommunicationPrivateMessagesByMessageIdReadPost**
> java.time.LocalDateTime apiV2CommunicationPrivateMessagesByMessageIdReadPost(messageId)

Marks a given private message as read (reading receipt).

  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**  Calling this on a message that has already been marked as read  will not update the &#x60;ReadDateTimeUtc&#x60; property, but return the  &#x60;ReadDateTimeUtc&#x60; value of the first call.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = CommunicationApi()
val messageId : java.util.UUID =  // java.util.UUID | `Id` of the message to mark as read
try {
    val result : java.time.LocalDateTime = apiInstance.apiV2CommunicationPrivateMessagesByMessageIdReadPost(messageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommunicationApi#apiV2CommunicationPrivateMessagesByMessageIdReadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommunicationApi#apiV2CommunicationPrivateMessagesByMessageIdReadPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | [**java.util.UUID**](.md)| &#x60;Id&#x60; of the message to mark as read |

### Return type

[**java.time.LocalDateTime**](java.time.LocalDateTime.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2CommunicationPrivateMessagesGet"></a>
# **apiV2CommunicationPrivateMessagesGet**
> kotlin.Array&lt;PrivateMessageRecord&gt; apiV2CommunicationPrivateMessagesGet()

Retrieves all private messages of an authenticated attendee.

  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**  This will set the &#x60;ReceivedDateTimeUtc&#x60; to the current server time on all messages retrieved  that have not been retrieved in a previous call.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = CommunicationApi()
try {
    val result : kotlin.Array<PrivateMessageRecord> = apiInstance.apiV2CommunicationPrivateMessagesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommunicationApi#apiV2CommunicationPrivateMessagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommunicationApi#apiV2CommunicationPrivateMessagesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PrivateMessageRecord&gt;**](PrivateMessageRecord.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2CommunicationPrivateMessagesPost"></a>
# **apiV2CommunicationPrivateMessagesPost**
> java.util.UUID apiV2CommunicationPrivateMessagesPost(request)

Sends a private message to a specific recipient/attendee.

  * Requires authorization     * Requires any of the following roles: **&#x60;Action-PrivateMessages-Send&#x60;**, **&#x60;Developer&#x60;**, **&#x60;System&#x60;**  If the backend has a push-channel available to any given device(s) that are currently signed into the app  with the same recipient uid, it will push a toast message to those devices.  The toast message content is defined by the &#x60;ToastTitle&#x60; and &#x60;ToastMessage&#x60; properties.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = CommunicationApi()
val request : SendPrivateMessageRequest =  // SendPrivateMessageRequest | 
try {
    val result : java.util.UUID = apiInstance.apiV2CommunicationPrivateMessagesPost(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommunicationApi#apiV2CommunicationPrivateMessagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommunicationApi#apiV2CommunicationPrivateMessagesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SendPrivateMessageRequest**](SendPrivateMessageRequest.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

