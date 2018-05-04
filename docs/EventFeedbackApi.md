# EventFeedbackApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2EventFeedbackGet**](EventFeedbackApi.md#apiV2EventFeedbackGet) | **GET** /Api/v2/EventFeedback | 
[**apiV2EventFeedbackPost**](EventFeedbackApi.md#apiV2EventFeedbackPost) | **POST** /Api/v2/EventFeedback | 


<a name="apiV2EventFeedbackGet"></a>
# **apiV2EventFeedbackGet**
> kotlin.Array&lt;EventFeedbackRecord&gt; apiV2EventFeedbackGet()



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**, **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventFeedbackApi()
try {
    val result : kotlin.Array<EventFeedbackRecord> = apiInstance.apiV2EventFeedbackGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventFeedbackApi#apiV2EventFeedbackGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventFeedbackApi#apiV2EventFeedbackGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventFeedbackRecord&gt;**](EventFeedbackRecord.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2EventFeedbackPost"></a>
# **apiV2EventFeedbackPost**
> apiV2EventFeedbackPost(record)



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**, **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventFeedbackApi()
val record : EventFeedbackRecord =  // EventFeedbackRecord | 
try {
    apiInstance.apiV2EventFeedbackPost(record)
} catch (e: ClientException) {
    println("4xx response calling EventFeedbackApi#apiV2EventFeedbackPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventFeedbackApi#apiV2EventFeedbackPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**EventFeedbackRecord**](EventFeedbackRecord.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

