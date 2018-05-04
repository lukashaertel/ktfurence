# EventsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2EventsByIdGet**](EventsApi.md#apiV2EventsByIdGet) | **GET** /Api/v2/Events/{Id} | Retrieve a single event in the event schedule.
[**apiV2EventsGet**](EventsApi.md#apiV2EventsGet) | **GET** /Api/v2/Events | Retrieves a list of all events in the event schedule.


<a name="apiV2EventsByIdGet"></a>
# **apiV2EventsByIdGet**
> EventRecord apiV2EventsByIdGet(id)

Retrieve a single event in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventsApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : EventRecord = apiInstance.apiV2EventsByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#apiV2EventsByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#apiV2EventsByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**EventRecord**](EventRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2EventsGet"></a>
# **apiV2EventsGet**
> kotlin.Array&lt;EventRecord&gt; apiV2EventsGet()

Retrieves a list of all events in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventsApi()
try {
    val result : kotlin.Array<EventRecord> = apiInstance.apiV2EventsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#apiV2EventsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#apiV2EventsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventRecord&gt;**](EventRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

