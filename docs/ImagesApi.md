# ImagesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2ImagesByIdContentGet**](ImagesApi.md#apiV2ImagesByIdContentGet) | **GET** /Api/v2/Images/{Id}/Content | Retrieve a single image content.
[**apiV2ImagesByIdGet**](ImagesApi.md#apiV2ImagesByIdGet) | **GET** /Api/v2/Images/{Id} | Retrieve a single image.
[**apiV2ImagesGet**](ImagesApi.md#apiV2ImagesGet) | **GET** /Api/v2/Images | Retrieves a list of all images.


<a name="apiV2ImagesByIdContentGet"></a>
# **apiV2ImagesByIdContentGet**
> ByteArray apiV2ImagesByIdContentGet(id)

Retrieve a single image content.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = ImagesApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : ByteArray = apiInstance.apiV2ImagesByIdContentGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#apiV2ImagesByIdContentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#apiV2ImagesByIdContentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**ByteArray**](ByteArray.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2ImagesByIdGet"></a>
# **apiV2ImagesByIdGet**
> ImageRecord apiV2ImagesByIdGet(id)

Retrieve a single image.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = ImagesApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : ImageRecord = apiInstance.apiV2ImagesByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#apiV2ImagesByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#apiV2ImagesByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**ImageRecord**](ImageRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2ImagesGet"></a>
# **apiV2ImagesGet**
> kotlin.Array&lt;ImageRecord&gt; apiV2ImagesGet()

Retrieves a list of all images.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = ImagesApi()
try {
    val result : kotlin.Array<ImageRecord> = apiInstance.apiV2ImagesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#apiV2ImagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#apiV2ImagesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ImageRecord&gt;**](ImageRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

