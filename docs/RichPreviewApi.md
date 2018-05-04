# RichPreviewApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linkEventsByIdGet**](RichPreviewApi.md#linkEventsByIdGet) | **GET** /Link/Events/{Id} | 


<a name="linkEventsByIdGet"></a>
# **linkEventsByIdGet**
> linkEventsByIdGet(id)



### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = RichPreviewApi()
val id : java.util.UUID =  // java.util.UUID | 
try {
    apiInstance.linkEventsByIdGet(id)
} catch (e: ClientException) {
    println("4xx response calling RichPreviewApi#linkEventsByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RichPreviewApi#linkEventsByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

