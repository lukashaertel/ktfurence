# SyncApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2SyncGet**](SyncApi.md#apiV2SyncGet) | **GET** /Api/v2/Sync | Returns everything you could ever wish for.


<a name="apiV2SyncGet"></a>
# **apiV2SyncGet**
> AggregatedDeltaResponse apiV2SyncGet(since)

Returns everything you could ever wish for.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = SyncApi()
val since : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
try {
    val result : AggregatedDeltaResponse = apiInstance.apiV2SyncGet(since)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#apiV2SyncGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#apiV2SyncGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **java.time.LocalDateTime**|  | [optional]

### Return type

[**AggregatedDeltaResponse**](AggregatedDeltaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

