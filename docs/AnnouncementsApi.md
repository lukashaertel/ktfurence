# AnnouncementsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2AnnouncementsByIdDelete**](AnnouncementsApi.md#apiV2AnnouncementsByIdDelete) | **DELETE** /Api/v2/Announcements/{Id} | 
[**apiV2AnnouncementsByIdGet**](AnnouncementsApi.md#apiV2AnnouncementsByIdGet) | **GET** /Api/v2/Announcements/{Id} | Retrieve a single announcement.
[**apiV2AnnouncementsDelete**](AnnouncementsApi.md#apiV2AnnouncementsDelete) | **DELETE** /Api/v2/Announcements | 
[**apiV2AnnouncementsGet**](AnnouncementsApi.md#apiV2AnnouncementsGet) | **GET** /Api/v2/Announcements | Retrieves a list of all announcement entries.
[**apiV2AnnouncementsPost**](AnnouncementsApi.md#apiV2AnnouncementsPost) | **POST** /Api/v2/Announcements | 
[**apiV2AnnouncementsPut**](AnnouncementsApi.md#apiV2AnnouncementsPut) | **PUT** /Api/v2/Announcements | 


<a name="apiV2AnnouncementsByIdDelete"></a>
# **apiV2AnnouncementsByIdDelete**
> apiV2AnnouncementsByIdDelete(id)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = AnnouncementsApi()
val id : java.util.UUID =  // java.util.UUID | 
try {
    apiInstance.apiV2AnnouncementsByIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementsApi#apiV2AnnouncementsByIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementsApi#apiV2AnnouncementsByIdDelete")
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

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV2AnnouncementsByIdGet"></a>
# **apiV2AnnouncementsByIdGet**
> AnnouncementRecord apiV2AnnouncementsByIdGet(id)

Retrieve a single announcement.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = AnnouncementsApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : AnnouncementRecord = apiInstance.apiV2AnnouncementsByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementsApi#apiV2AnnouncementsByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementsApi#apiV2AnnouncementsByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**AnnouncementRecord**](AnnouncementRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2AnnouncementsDelete"></a>
# **apiV2AnnouncementsDelete**
> apiV2AnnouncementsDelete()



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = AnnouncementsApi()
try {
    apiInstance.apiV2AnnouncementsDelete()
} catch (e: ClientException) {
    println("4xx response calling AnnouncementsApi#apiV2AnnouncementsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementsApi#apiV2AnnouncementsDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiV2AnnouncementsGet"></a>
# **apiV2AnnouncementsGet**
> kotlin.Array&lt;AnnouncementRecord&gt; apiV2AnnouncementsGet()

Retrieves a list of all announcement entries.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = AnnouncementsApi()
try {
    val result : kotlin.Array<AnnouncementRecord> = apiInstance.apiV2AnnouncementsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementsApi#apiV2AnnouncementsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementsApi#apiV2AnnouncementsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;AnnouncementRecord&gt;**](AnnouncementRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2AnnouncementsPost"></a>
# **apiV2AnnouncementsPost**
> apiV2AnnouncementsPost(record)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = AnnouncementsApi()
val record : AnnouncementRecord =  // AnnouncementRecord | 
try {
    apiInstance.apiV2AnnouncementsPost(record)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementsApi#apiV2AnnouncementsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementsApi#apiV2AnnouncementsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**AnnouncementRecord**](AnnouncementRecord.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiV2AnnouncementsPut"></a>
# **apiV2AnnouncementsPut**
> apiV2AnnouncementsPut(record)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = AnnouncementsApi()
val record : AnnouncementRecord =  // AnnouncementRecord | 
try {
    apiInstance.apiV2AnnouncementsPut(record)
} catch (e: ClientException) {
    println("4xx response calling AnnouncementsApi#apiV2AnnouncementsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnouncementsApi#apiV2AnnouncementsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**AnnouncementRecord**](AnnouncementRecord.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

