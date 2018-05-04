# EventConferenceTracksApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2EventConferenceTracksByIdGet**](EventConferenceTracksApi.md#apiV2EventConferenceTracksByIdGet) | **GET** /Api/v2/EventConferenceTracks/{Id} | Retrieve a single event conference track in the event schedule.
[**apiV2EventConferenceTracksGet**](EventConferenceTracksApi.md#apiV2EventConferenceTracksGet) | **GET** /Api/v2/EventConferenceTracks | Retrieves a list of all event conference tracks in the event schedule.


<a name="apiV2EventConferenceTracksByIdGet"></a>
# **apiV2EventConferenceTracksByIdGet**
> EventConferenceTrackRecord apiV2EventConferenceTracksByIdGet(id)

Retrieve a single event conference track in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventConferenceTracksApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : EventConferenceTrackRecord = apiInstance.apiV2EventConferenceTracksByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventConferenceTracksApi#apiV2EventConferenceTracksByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventConferenceTracksApi#apiV2EventConferenceTracksByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**EventConferenceTrackRecord**](EventConferenceTrackRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2EventConferenceTracksGet"></a>
# **apiV2EventConferenceTracksGet**
> kotlin.Array&lt;EventConferenceTrackRecord&gt; apiV2EventConferenceTracksGet()

Retrieves a list of all event conference tracks in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventConferenceTracksApi()
try {
    val result : kotlin.Array<EventConferenceTrackRecord> = apiInstance.apiV2EventConferenceTracksGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventConferenceTracksApi#apiV2EventConferenceTracksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventConferenceTracksApi#apiV2EventConferenceTracksGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventConferenceTrackRecord&gt;**](EventConferenceTrackRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

