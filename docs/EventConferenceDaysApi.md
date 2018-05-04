# EventConferenceDaysApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2EventConferenceDaysByIdGet**](EventConferenceDaysApi.md#apiV2EventConferenceDaysByIdGet) | **GET** /Api/v2/EventConferenceDays/{Id} | Retrieve a single event conference day in the event schedule.
[**apiV2EventConferenceDaysGet**](EventConferenceDaysApi.md#apiV2EventConferenceDaysGet) | **GET** /Api/v2/EventConferenceDays | Retrieves a list of all event conference days in the event schedule.


<a name="apiV2EventConferenceDaysByIdGet"></a>
# **apiV2EventConferenceDaysByIdGet**
> EventConferenceDayRecord apiV2EventConferenceDaysByIdGet(id)

Retrieve a single event conference day in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventConferenceDaysApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : EventConferenceDayRecord = apiInstance.apiV2EventConferenceDaysByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventConferenceDaysApi#apiV2EventConferenceDaysByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventConferenceDaysApi#apiV2EventConferenceDaysByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**EventConferenceDayRecord**](EventConferenceDayRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2EventConferenceDaysGet"></a>
# **apiV2EventConferenceDaysGet**
> kotlin.Array&lt;EventConferenceDayRecord&gt; apiV2EventConferenceDaysGet()

Retrieves a list of all event conference days in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventConferenceDaysApi()
try {
    val result : kotlin.Array<EventConferenceDayRecord> = apiInstance.apiV2EventConferenceDaysGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventConferenceDaysApi#apiV2EventConferenceDaysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventConferenceDaysApi#apiV2EventConferenceDaysGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventConferenceDayRecord&gt;**](EventConferenceDayRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

