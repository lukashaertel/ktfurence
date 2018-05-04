# TokensApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2TokensRegSysPost**](TokensApi.md#apiV2TokensRegSysPost) | **POST** /Api/v2/Tokens/RegSys | 
[**apiV2TokensWhoAmIGet**](TokensApi.md#apiV2TokensWhoAmIGet) | **GET** /Api/v2/Tokens/WhoAmI | 


<a name="apiV2TokensRegSysPost"></a>
# **apiV2TokensRegSysPost**
> AuthenticationResponse apiV2TokensRegSysPost(request)



### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = TokensApi()
val request : RegSysAuthenticationRequest =  // RegSysAuthenticationRequest | 
try {
    val result : AuthenticationResponse = apiInstance.apiV2TokensRegSysPost(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#apiV2TokensRegSysPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#apiV2TokensRegSysPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RegSysAuthenticationRequest**](RegSysAuthenticationRequest.md)|  | [optional]

### Return type

[**AuthenticationResponse**](AuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2TokensWhoAmIGet"></a>
# **apiV2TokensWhoAmIGet**
> kotlin.String apiV2TokensWhoAmIGet()



  * Requires authorization   

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = TokensApi()
try {
    val result : kotlin.String = apiInstance.apiV2TokensWhoAmIGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#apiV2TokensWhoAmIGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#apiV2TokensWhoAmIGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

