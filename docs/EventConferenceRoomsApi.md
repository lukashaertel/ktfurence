# EventConferenceRoomsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2EventConferenceRoomsByIdGet**](EventConferenceRoomsApi.md#apiV2EventConferenceRoomsByIdGet) | **GET** /Api/v2/EventConferenceRooms/{Id} | Retrieve a single event conference room in the event schedule.
[**apiV2EventConferenceRoomsGet**](EventConferenceRoomsApi.md#apiV2EventConferenceRoomsGet) | **GET** /Api/v2/EventConferenceRooms | Retrieves a list of all event conference Rooms in the event schedule.


<a name="apiV2EventConferenceRoomsByIdGet"></a>
# **apiV2EventConferenceRoomsByIdGet**
> EventConferenceRoomRecord apiV2EventConferenceRoomsByIdGet(id)

Retrieve a single event conference room in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventConferenceRoomsApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : EventConferenceRoomRecord = apiInstance.apiV2EventConferenceRoomsByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventConferenceRoomsApi#apiV2EventConferenceRoomsByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventConferenceRoomsApi#apiV2EventConferenceRoomsByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**EventConferenceRoomRecord**](EventConferenceRoomRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2EventConferenceRoomsGet"></a>
# **apiV2EventConferenceRoomsGet**
> kotlin.Array&lt;EventConferenceRoomRecord&gt; apiV2EventConferenceRoomsGet()

Retrieves a list of all event conference Rooms in the event schedule.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = EventConferenceRoomsApi()
try {
    val result : kotlin.Array<EventConferenceRoomRecord> = apiInstance.apiV2EventConferenceRoomsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventConferenceRoomsApi#apiV2EventConferenceRoomsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventConferenceRoomsApi#apiV2EventConferenceRoomsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;EventConferenceRoomRecord&gt;**](EventConferenceRoomRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

