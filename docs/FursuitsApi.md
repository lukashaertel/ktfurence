# FursuitsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV2FursuitsBadgesByIdImageGet**](FursuitsApi.md#apiV2FursuitsBadgesByIdImageGet) | **GET** /Api/v2/Fursuits/Badges/{Id}/Image | Retrieve the badge image content for a given fursuit badge id
[**apiV2FursuitsBadgesGet**](FursuitsApi.md#apiV2FursuitsBadgesGet) | **GET** /Api/v2/Fursuits/Badges | Return all Fursuit Badge Registrations
[**apiV2FursuitsBadgesRegistrationPost**](FursuitsApi.md#apiV2FursuitsBadgesRegistrationPost) | **POST** /Api/v2/Fursuits/Badges/Registration | Upsert Fursuit Badge information
[**apiV2FursuitsCollectingGameFursuitParticipationGet**](FursuitsApi.md#apiV2FursuitsCollectingGameFursuitParticipationGet) | **GET** /Api/v2/Fursuits/CollectingGame/FursuitParticipation | 
[**apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet**](FursuitsApi.md#apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet) | **GET** /Api/v2/Fursuits/CollectingGame/FursuitParticipation/Scoreboard | 
[**apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost**](FursuitsApi.md#apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost) | **POST** /Api/v2/Fursuits/CollectingGame/FursuitParticpation/Badges/{FursuitBadgeId}/Token | Register (link/assign) a valid, unused token to a fursuit badge.
[**apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost**](FursuitsApi.md#apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost) | **POST** /Api/v2/Fursuits/CollectingGame/FursuitParticpation/Badges/{FursuitBadgeId}/Token:safe | 
[**apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost**](FursuitsApi.md#apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost) | **POST** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/CollectToken | 
[**apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost**](FursuitsApi.md#apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost) | **POST** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/CollectToken:safe | 
[**apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet**](FursuitsApi.md#apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet) | **GET** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/CollectionEntries | 
[**apiV2FursuitsCollectingGamePlayerParticipationGet**](FursuitsApi.md#apiV2FursuitsCollectingGamePlayerParticipationGet) | **GET** /Api/v2/Fursuits/CollectingGame/PlayerParticipation | 
[**apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet**](FursuitsApi.md#apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet) | **GET** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/Scoreboard | 
[**apiV2FursuitsCollectingGameTokensBatchPost**](FursuitsApi.md#apiV2FursuitsCollectingGameTokensBatchPost) | **POST** /Api/v2/Fursuits/CollectingGame/Tokens/Batch | 
[**apiV2FursuitsCollectingGameTokensPost**](FursuitsApi.md#apiV2FursuitsCollectingGameTokensPost) | **POST** /Api/v2/Fursuits/CollectingGame/Tokens | 


<a name="apiV2FursuitsBadgesByIdImageGet"></a>
# **apiV2FursuitsBadgesByIdImageGet**
> ByteArray apiV2FursuitsBadgesByIdImageGet(id)

Retrieve the badge image content for a given fursuit badge id

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val id : java.util.UUID =  // java.util.UUID | \"Id\" of the fursuit badge
try {
    val result : ByteArray = apiInstance.apiV2FursuitsBadgesByIdImageGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsBadgesByIdImageGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsBadgesByIdImageGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| \&quot;Id\&quot; of the fursuit badge |

### Return type

[**ByteArray**](ByteArray.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsBadgesGet"></a>
# **apiV2FursuitsBadgesGet**
> kotlin.Array&lt;FursuitBadgeRecord&gt; apiV2FursuitsBadgesGet()

Return all Fursuit Badge Registrations

  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;FursuitBadgeSystem&#x60;**, **&#x60;System&#x60;**  **Not meant to be consumed by the mobile apps**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
try {
    val result : kotlin.Array<FursuitBadgeRecord> = apiInstance.apiV2FursuitsBadgesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsBadgesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsBadgesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;FursuitBadgeRecord&gt;**](FursuitBadgeRecord.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsBadgesRegistrationPost"></a>
# **apiV2FursuitsBadgesRegistrationPost**
> apiV2FursuitsBadgesRegistrationPost(registration)

Upsert Fursuit Badge information

  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;FursuitBadgeSystem&#x60;**, **&#x60;System&#x60;**  This is used by the fursuit badge system to push badge information to this backend.  **Not meant to be consumed by the mobile apps**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val registration : FursuitBadgeRegistration =  // FursuitBadgeRegistration | 
try {
    apiInstance.apiV2FursuitsBadgesRegistrationPost(registration)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsBadgesRegistrationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsBadgesRegistrationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registration** | [**FursuitBadgeRegistration**](FursuitBadgeRegistration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGameFursuitParticipationGet"></a>
# **apiV2FursuitsCollectingGameFursuitParticipationGet**
> kotlin.Array&lt;FursuitParticipationInfo&gt; apiV2FursuitsCollectingGameFursuitParticipationGet()



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
try {
    val result : kotlin.Array<FursuitParticipationInfo> = apiInstance.apiV2FursuitsCollectingGameFursuitParticipationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticipationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticipationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;FursuitParticipationInfo&gt;**](FursuitParticipationInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet"></a>
# **apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet**
> kotlin.Array&lt;FursuitScoreboardEntry&gt; apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet(top)



### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val top : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Array<FursuitScoreboardEntry> = apiInstance.apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet(top)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **top** | **kotlin.Int**|  |

### Return type

[**kotlin.Array&lt;FursuitScoreboardEntry&gt;**](FursuitScoreboardEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost"></a>
# **apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost**
> apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost(fursuitBadgeId, tokenValue)

Register (link/assign) a valid, unused token to a fursuit badge.

  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val fursuitBadgeId : java.util.UUID =  // java.util.UUID | 
val tokenValue : kotlin.String = tokenValue_example // kotlin.String | 
try {
    apiInstance.apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost(fursuitBadgeId, tokenValue)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fursuitBadgeId** | [**java.util.UUID**](.md)|  |
 **tokenValue** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost"></a>
# **apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost**
> ApiSafeResult apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost(fursuitBadgeId, tokenValue)



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val fursuitBadgeId : java.util.UUID =  // java.util.UUID | 
val tokenValue : kotlin.String = tokenValue_example // kotlin.String | 
try {
    val result : ApiSafeResult = apiInstance.apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost(fursuitBadgeId, tokenValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fursuitBadgeId** | [**java.util.UUID**](.md)|  |
 **tokenValue** | **kotlin.String**|  | [optional]

### Return type

[**ApiSafeResult**](ApiSafeResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost"></a>
# **apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost**
> CollectTokenResponse apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost(tokenValue)



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val tokenValue : kotlin.String = tokenValue_example // kotlin.String | 
try {
    val result : CollectTokenResponse = apiInstance.apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost(tokenValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenValue** | **kotlin.String**|  | [optional]

### Return type

[**CollectTokenResponse**](CollectTokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost"></a>
# **apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost**
> ApiSafeResultLeft_Square_BracketCollectTokenResponseRight_Square_Bracket apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost(tokenValue)



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val tokenValue : kotlin.String = tokenValue_example // kotlin.String | 
try {
    val result : ApiSafeResultLeft_Square_BracketCollectTokenResponseRight_Square_Bracket = apiInstance.apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost(tokenValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenValue** | **kotlin.String**|  | [optional]

### Return type

[**ApiSafeResultLeft_Square_BracketCollectTokenResponseRight_Square_Bracket**](ApiSafeResultLeft_Square_BracketCollectTokenResponseRight_Square_Bracket.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet"></a>
# **apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet**
> kotlin.Array&lt;PlayerCollectionEntry&gt; apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet()



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
try {
    val result : kotlin.Array<PlayerCollectionEntry> = apiInstance.apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PlayerCollectionEntry&gt;**](PlayerCollectionEntry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGamePlayerParticipationGet"></a>
# **apiV2FursuitsCollectingGamePlayerParticipationGet**
> PlayerParticipationInfo apiV2FursuitsCollectingGamePlayerParticipationGet()



  * Requires authorization     * Requires any of the following roles: **&#x60;Attendee&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
try {
    val result : PlayerParticipationInfo = apiInstance.apiV2FursuitsCollectingGamePlayerParticipationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlayerParticipationInfo**](PlayerParticipationInfo.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet"></a>
# **apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet**
> kotlin.Array&lt;PlayerScoreboardEntry&gt; apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet(top)



### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val top : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Array<PlayerScoreboardEntry> = apiInstance.apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet(top)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **top** | **kotlin.Int**|  |

### Return type

[**kotlin.Array&lt;PlayerScoreboardEntry&gt;**](PlayerScoreboardEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGameTokensBatchPost"></a>
# **apiV2FursuitsCollectingGameTokensBatchPost**
> apiV2FursuitsCollectingGameTokensBatchPost(tokenValues)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val tokenValues : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | 
try {
    apiInstance.apiV2FursuitsCollectingGameTokensBatchPost(tokenValues)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGameTokensBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGameTokensBatchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenValues** | **kotlin.Array&lt;kotlin.String&gt;**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiV2FursuitsCollectingGameTokensPost"></a>
# **apiV2FursuitsCollectingGameTokensPost**
> apiV2FursuitsCollectingGameTokensPost(tokenValue)



  * Requires authorization     * Requires any of the following roles: **&#x60;Developer&#x60;**, **&#x60;System&#x60;**

### Example
```kotlin
// Import classes:
//import org.eurofurence.data.infrastructure.*
//import org.eurofurence.data.models.*

val apiInstance = FursuitsApi()
val tokenValue : kotlin.String = tokenValue_example // kotlin.String | 
try {
    apiInstance.apiV2FursuitsCollectingGameTokensPost(tokenValue)
} catch (e: ClientException) {
    println("4xx response calling FursuitsApi#apiV2FursuitsCollectingGameTokensPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FursuitsApi#apiV2FursuitsCollectingGameTokensPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenValue** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

