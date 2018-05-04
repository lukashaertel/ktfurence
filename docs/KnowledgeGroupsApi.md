# KnowledgeGroupsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2KnowledgeGroupsByIdDelete**](KnowledgeGroupsApi.md#apiV2KnowledgeGroupsByIdDelete) | **DELETE** /Api/v2/KnowledgeGroups/{Id} | Delete a knowledge group.
[**apiV2KnowledgeGroupsByIdGet**](KnowledgeGroupsApi.md#apiV2KnowledgeGroupsByIdGet) | **GET** /Api/v2/KnowledgeGroups/{Id} | Retrieve a single knowledge group.
[**apiV2KnowledgeGroupsByIdPut**](KnowledgeGroupsApi.md#apiV2KnowledgeGroupsByIdPut) | **PUT** /Api/v2/KnowledgeGroups/{Id} | Update an existing knowledge group.
[**apiV2KnowledgeGroupsGet**](KnowledgeGroupsApi.md#apiV2KnowledgeGroupsGet) | **GET** /Api/v2/KnowledgeGroups | Retrieves a list of all knowledge groups.
[**apiV2KnowledgeGroupsPost**](KnowledgeGroupsApi.md#apiV2KnowledgeGroupsPost) | **POST** /Api/v2/KnowledgeGroups | Create a new knowledge group.


<a name="apiV2KnowledgeGroupsByIdDelete"></a>
# **apiV2KnowledgeGroupsByIdDelete**
> apiV2KnowledgeGroupsByIdDelete(id)

Delete a knowledge group.

  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = KnowledgeGroupsApi()
val id : java.util.UUID =  // java.util.UUID | 
try {
    apiInstance.apiV2KnowledgeGroupsByIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsByIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsByIdDelete")
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
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2KnowledgeGroupsByIdGet"></a>
# **apiV2KnowledgeGroupsByIdGet**
> KnowledgeGroupRecord apiV2KnowledgeGroupsByIdGet(id)

Retrieve a single knowledge group.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = KnowledgeGroupsApi()
val id : java.util.UUID =  // java.util.UUID | id of the requested entity
try {
    val result : KnowledgeGroupRecord = apiInstance.apiV2KnowledgeGroupsByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the requested entity |

### Return type

[**KnowledgeGroupRecord**](KnowledgeGroupRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2KnowledgeGroupsByIdPut"></a>
# **apiV2KnowledgeGroupsByIdPut**
> apiV2KnowledgeGroupsByIdPut(id, record)

Update an existing knowledge group.

  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = KnowledgeGroupsApi()
val id : java.util.UUID =  // java.util.UUID | 
val record : KnowledgeGroupRecord =  // KnowledgeGroupRecord | 
try {
    apiInstance.apiV2KnowledgeGroupsByIdPut(id, record)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsByIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsByIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)|  |
 **record** | [**KnowledgeGroupRecord**](KnowledgeGroupRecord.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2KnowledgeGroupsGet"></a>
# **apiV2KnowledgeGroupsGet**
> kotlin.Array&lt;KnowledgeGroupRecord&gt; apiV2KnowledgeGroupsGet()

Retrieves a list of all knowledge groups.

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = KnowledgeGroupsApi()
try {
    val result : kotlin.Array<KnowledgeGroupRecord> = apiInstance.apiV2KnowledgeGroupsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;KnowledgeGroupRecord&gt;**](KnowledgeGroupRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2KnowledgeGroupsPost"></a>
# **apiV2KnowledgeGroupsPost**
> java.util.UUID apiV2KnowledgeGroupsPost(record)

Create a new knowledge group.

  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = KnowledgeGroupsApi()
val record : KnowledgeGroupRecord =  // KnowledgeGroupRecord | 
try {
    val result : java.util.UUID = apiInstance.apiV2KnowledgeGroupsPost(record)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeGroupsApi#apiV2KnowledgeGroupsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **record** | [**KnowledgeGroupRecord**](KnowledgeGroupRecord.md)|  | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

