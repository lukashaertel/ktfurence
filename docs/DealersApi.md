# DealersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2DealersByIdGet**](DealersApi.md#apiV2DealersByIdGet) | **GET** /Api/v2/Dealers/{Id} | Retrieve a single dealer.
[**apiV2DealersGet**](DealersApi.md#apiV2DealersGet) | **GET** /Api/v2/Dealers | Retrieves a list of all dealer entries.


<a name="apiV2DealersByIdGet"></a>
# **apiV2DealersByIdGet**
> DealerRecord apiV2DealersByIdGet(id)

Retrieve a single dealer.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = DealersApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : DealerRecord = apiInstance.apiV2DealersByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealersApi#apiV2DealersByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealersApi#apiV2DealersByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**DealerRecord**](DealerRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2DealersGet"></a>
# **apiV2DealersGet**
> kotlin.Array&lt;DealerRecord&gt; apiV2DealersGet()

Retrieves a list of all dealer entries.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = DealersApi()
try {
    val result : kotlin.Array<DealerRecord> = apiInstance.apiV2DealersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealersApi#apiV2DealersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealersApi#apiV2DealersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;DealerRecord&gt;**](DealerRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

