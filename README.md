# org.eurofurence.data - Kotlin client library for Eurofurence API for Mobile Apps

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnouncementsApi* | [**apiV2AnnouncementsByIdDelete**](docs/AnnouncementsApi.md#apiv2announcementsbyiddelete) | **DELETE** /Api/v2/Announcements/{Id} | 
*AnnouncementsApi* | [**apiV2AnnouncementsByIdGet**](docs/AnnouncementsApi.md#apiv2announcementsbyidget) | **GET** /Api/v2/Announcements/{Id} | Retrieve a single announcement.
*AnnouncementsApi* | [**apiV2AnnouncementsDelete**](docs/AnnouncementsApi.md#apiv2announcementsdelete) | **DELETE** /Api/v2/Announcements | 
*AnnouncementsApi* | [**apiV2AnnouncementsGet**](docs/AnnouncementsApi.md#apiv2announcementsget) | **GET** /Api/v2/Announcements | Retrieves a list of all announcement entries.
*AnnouncementsApi* | [**apiV2AnnouncementsPost**](docs/AnnouncementsApi.md#apiv2announcementspost) | **POST** /Api/v2/Announcements | 
*AnnouncementsApi* | [**apiV2AnnouncementsPut**](docs/AnnouncementsApi.md#apiv2announcementsput) | **PUT** /Api/v2/Announcements | 
*ArtShowApi* | [**apiV2ArtShowItemActivitesLogPost**](docs/ArtShowApi.md#apiv2artshowitemactiviteslogpost) | **POST** /Api/v2/ArtShow/ItemActivites/Log | 
*ArtShowApi* | [**apiV2ArtShowItemActivitesNotificationBundlesSendPost**](docs/ArtShowApi.md#apiv2artshowitemactivitesnotificationbundlessendpost) | **POST** /Api/v2/ArtShow/ItemActivites/NotificationBundles/Send | 
*ArtShowApi* | [**apiV2ArtShowItemActivitesNotificationBundlesSimulationGet**](docs/ArtShowApi.md#apiv2artshowitemactivitesnotificationbundlessimulationget) | **GET** /Api/v2/ArtShow/ItemActivites/NotificationBundles/Simulation | 
*CommunicationApi* | [**apiV2CommunicationPrivateMessagesByMessageIdReadPost**](docs/CommunicationApi.md#apiv2communicationprivatemessagesbymessageidreadpost) | **POST** /Api/v2/Communication/PrivateMessages/{MessageId}/Read | Marks a given private message as read (reading receipt).
*CommunicationApi* | [**apiV2CommunicationPrivateMessagesGet**](docs/CommunicationApi.md#apiv2communicationprivatemessagesget) | **GET** /Api/v2/Communication/PrivateMessages | Retrieves all private messages of an authenticated attendee.
*CommunicationApi* | [**apiV2CommunicationPrivateMessagesPost**](docs/CommunicationApi.md#apiv2communicationprivatemessagespost) | **POST** /Api/v2/Communication/PrivateMessages | Sends a private message to a specific recipient/attendee.
*DealersApi* | [**apiV2DealersByIdGet**](docs/DealersApi.md#apiv2dealersbyidget) | **GET** /Api/v2/Dealers/{Id} | Retrieve a single dealer.
*DealersApi* | [**apiV2DealersGet**](docs/DealersApi.md#apiv2dealersget) | **GET** /Api/v2/Dealers | Retrieves a list of all dealer entries.
*EventConferenceDaysApi* | [**apiV2EventConferenceDaysByIdGet**](docs/EventConferenceDaysApi.md#apiv2eventconferencedaysbyidget) | **GET** /Api/v2/EventConferenceDays/{Id} | Retrieve a single event conference day in the event schedule.
*EventConferenceDaysApi* | [**apiV2EventConferenceDaysGet**](docs/EventConferenceDaysApi.md#apiv2eventconferencedaysget) | **GET** /Api/v2/EventConferenceDays | Retrieves a list of all event conference days in the event schedule.
*EventConferenceRoomsApi* | [**apiV2EventConferenceRoomsByIdGet**](docs/EventConferenceRoomsApi.md#apiv2eventconferenceroomsbyidget) | **GET** /Api/v2/EventConferenceRooms/{Id} | Retrieve a single event conference room in the event schedule.
*EventConferenceRoomsApi* | [**apiV2EventConferenceRoomsGet**](docs/EventConferenceRoomsApi.md#apiv2eventconferenceroomsget) | **GET** /Api/v2/EventConferenceRooms | Retrieves a list of all event conference Rooms in the event schedule.
*EventConferenceTracksApi* | [**apiV2EventConferenceTracksByIdGet**](docs/EventConferenceTracksApi.md#apiv2eventconferencetracksbyidget) | **GET** /Api/v2/EventConferenceTracks/{Id} | Retrieve a single event conference track in the event schedule.
*EventConferenceTracksApi* | [**apiV2EventConferenceTracksGet**](docs/EventConferenceTracksApi.md#apiv2eventconferencetracksget) | **GET** /Api/v2/EventConferenceTracks | Retrieves a list of all event conference tracks in the event schedule.
*EventFeedbackApi* | [**apiV2EventFeedbackGet**](docs/EventFeedbackApi.md#apiv2eventfeedbackget) | **GET** /Api/v2/EventFeedback | 
*EventFeedbackApi* | [**apiV2EventFeedbackPost**](docs/EventFeedbackApi.md#apiv2eventfeedbackpost) | **POST** /Api/v2/EventFeedback | 
*EventsApi* | [**apiV2EventsByIdGet**](docs/EventsApi.md#apiv2eventsbyidget) | **GET** /Api/v2/Events/{Id} | Retrieve a single event in the event schedule.
*EventsApi* | [**apiV2EventsGet**](docs/EventsApi.md#apiv2eventsget) | **GET** /Api/v2/Events | Retrieves a list of all events in the event schedule.
*FursuitsApi* | [**apiV2FursuitsBadgesByIdImageGet**](docs/FursuitsApi.md#apiv2fursuitsbadgesbyidimageget) | **GET** /Api/v2/Fursuits/Badges/{Id}/Image | Retrieve the badge image content for a given fursuit badge id
*FursuitsApi* | [**apiV2FursuitsBadgesGet**](docs/FursuitsApi.md#apiv2fursuitsbadgesget) | **GET** /Api/v2/Fursuits/Badges | Return all Fursuit Badge Registrations
*FursuitsApi* | [**apiV2FursuitsBadgesRegistrationPost**](docs/FursuitsApi.md#apiv2fursuitsbadgesregistrationpost) | **POST** /Api/v2/Fursuits/Badges/Registration | Upsert Fursuit Badge information
*FursuitsApi* | [**apiV2FursuitsCollectingGameFursuitParticipationGet**](docs/FursuitsApi.md#apiv2fursuitscollectinggamefursuitparticipationget) | **GET** /Api/v2/Fursuits/CollectingGame/FursuitParticipation | 
*FursuitsApi* | [**apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet**](docs/FursuitsApi.md#apiv2fursuitscollectinggamefursuitparticipationscoreboardget) | **GET** /Api/v2/Fursuits/CollectingGame/FursuitParticipation/Scoreboard | 
*FursuitsApi* | [**apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenPost**](docs/FursuitsApi.md#apiv2fursuitscollectinggamefursuitparticpationbadgesbyfursuitbadgeidtokenpost) | **POST** /Api/v2/Fursuits/CollectingGame/FursuitParticpation/Badges/{FursuitBadgeId}/Token | Register (link/assign) a valid, unused token to a fursuit badge.
*FursuitsApi* | [**apiV2FursuitsCollectingGameFursuitParticpationBadgesByFursuitBadgeIdTokenSafePost**](docs/FursuitsApi.md#apiv2fursuitscollectinggamefursuitparticpationbadgesbyfursuitbadgeidtokensafepost) | **POST** /Api/v2/Fursuits/CollectingGame/FursuitParticpation/Badges/{FursuitBadgeId}/Token:safe | 
*FursuitsApi* | [**apiV2FursuitsCollectingGamePlayerParticipationCollectTokenPost**](docs/FursuitsApi.md#apiv2fursuitscollectinggameplayerparticipationcollecttokenpost) | **POST** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/CollectToken | 
*FursuitsApi* | [**apiV2FursuitsCollectingGamePlayerParticipationCollectTokenSafePost**](docs/FursuitsApi.md#apiv2fursuitscollectinggameplayerparticipationcollecttokensafepost) | **POST** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/CollectToken:safe | 
*FursuitsApi* | [**apiV2FursuitsCollectingGamePlayerParticipationCollectionEntriesGet**](docs/FursuitsApi.md#apiv2fursuitscollectinggameplayerparticipationcollectionentriesget) | **GET** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/CollectionEntries | 
*FursuitsApi* | [**apiV2FursuitsCollectingGamePlayerParticipationGet**](docs/FursuitsApi.md#apiv2fursuitscollectinggameplayerparticipationget) | **GET** /Api/v2/Fursuits/CollectingGame/PlayerParticipation | 
*FursuitsApi* | [**apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet**](docs/FursuitsApi.md#apiv2fursuitscollectinggameplayerparticipationscoreboardget) | **GET** /Api/v2/Fursuits/CollectingGame/PlayerParticipation/Scoreboard | 
*FursuitsApi* | [**apiV2FursuitsCollectingGameTokensBatchPost**](docs/FursuitsApi.md#apiv2fursuitscollectinggametokensbatchpost) | **POST** /Api/v2/Fursuits/CollectingGame/Tokens/Batch | 
*FursuitsApi* | [**apiV2FursuitsCollectingGameTokensPost**](docs/FursuitsApi.md#apiv2fursuitscollectinggametokenspost) | **POST** /Api/v2/Fursuits/CollectingGame/Tokens | 
*ImagesApi* | [**apiV2ImagesByIdContentGet**](docs/ImagesApi.md#apiv2imagesbyidcontentget) | **GET** /Api/v2/Images/{Id}/Content | Retrieve a single image content.
*ImagesApi* | [**apiV2ImagesByIdGet**](docs/ImagesApi.md#apiv2imagesbyidget) | **GET** /Api/v2/Images/{Id} | Retrieve a single image.
*ImagesApi* | [**apiV2ImagesGet**](docs/ImagesApi.md#apiv2imagesget) | **GET** /Api/v2/Images | Retrieves a list of all images.
*KnowledgeEntriesApi* | [**apiV2KnowledgeEntriesByIdDelete**](docs/KnowledgeEntriesApi.md#apiv2knowledgeentriesbyiddelete) | **DELETE** /Api/v2/KnowledgeEntries/{Id} | Delete a knowledge entry.
*KnowledgeEntriesApi* | [**apiV2KnowledgeEntriesByIdGet**](docs/KnowledgeEntriesApi.md#apiv2knowledgeentriesbyidget) | **GET** /Api/v2/KnowledgeEntries/{Id} | Retrieve a single knowledge entry.
*KnowledgeEntriesApi* | [**apiV2KnowledgeEntriesByIdPut**](docs/KnowledgeEntriesApi.md#apiv2knowledgeentriesbyidput) | **PUT** /Api/v2/KnowledgeEntries/{Id} | Update an existing knowledge entry.
*KnowledgeEntriesApi* | [**apiV2KnowledgeEntriesGet**](docs/KnowledgeEntriesApi.md#apiv2knowledgeentriesget) | **GET** /Api/v2/KnowledgeEntries | Retrieves a list of all knowledge entries.
*KnowledgeEntriesApi* | [**apiV2KnowledgeEntriesPost**](docs/KnowledgeEntriesApi.md#apiv2knowledgeentriespost) | **POST** /Api/v2/KnowledgeEntries | Create a new knowledge entry.
*KnowledgeGroupsApi* | [**apiV2KnowledgeGroupsByIdDelete**](docs/KnowledgeGroupsApi.md#apiv2knowledgegroupsbyiddelete) | **DELETE** /Api/v2/KnowledgeGroups/{Id} | Delete a knowledge group.
*KnowledgeGroupsApi* | [**apiV2KnowledgeGroupsByIdGet**](docs/KnowledgeGroupsApi.md#apiv2knowledgegroupsbyidget) | **GET** /Api/v2/KnowledgeGroups/{Id} | Retrieve a single knowledge group.
*KnowledgeGroupsApi* | [**apiV2KnowledgeGroupsByIdPut**](docs/KnowledgeGroupsApi.md#apiv2knowledgegroupsbyidput) | **PUT** /Api/v2/KnowledgeGroups/{Id} | Update an existing knowledge group.
*KnowledgeGroupsApi* | [**apiV2KnowledgeGroupsGet**](docs/KnowledgeGroupsApi.md#apiv2knowledgegroupsget) | **GET** /Api/v2/KnowledgeGroups | Retrieves a list of all knowledge groups.
*KnowledgeGroupsApi* | [**apiV2KnowledgeGroupsPost**](docs/KnowledgeGroupsApi.md#apiv2knowledgegroupspost) | **POST** /Api/v2/KnowledgeGroups | Create a new knowledge group.
*MapsApi* | [**apiV2MapsByIdEntriesByEntryIdDelete**](docs/MapsApi.md#apiv2mapsbyidentriesbyentryiddelete) | **DELETE** /Api/v2/Maps/{Id}/Entries/{EntryId} | Delete a specific map entry for a specific map
*MapsApi* | [**apiV2MapsByIdEntriesByEntryIdGet**](docs/MapsApi.md#apiv2mapsbyidentriesbyentryidget) | **GET** /Api/v2/Maps/{Id}/Entries/{EntryId} | Get all specific map entry for a specific map
*MapsApi* | [**apiV2MapsByIdEntriesByEntryIdPut**](docs/MapsApi.md#apiv2mapsbyidentriesbyentryidput) | **PUT** /Api/v2/Maps/{Id}/Entries/{EntryId} | Create or Update an existing map entry in a specific map
*MapsApi* | [**apiV2MapsByIdEntriesDelete**](docs/MapsApi.md#apiv2mapsbyidentriesdelete) | **DELETE** /Api/v2/Maps/{Id}/Entries | Delete all map entries for a specific map
*MapsApi* | [**apiV2MapsByIdEntriesGet**](docs/MapsApi.md#apiv2mapsbyidentriesget) | **GET** /Api/v2/Maps/{Id}/Entries | Get all map entries for a specific map
*MapsApi* | [**apiV2MapsByIdEntriesPost**](docs/MapsApi.md#apiv2mapsbyidentriespost) | **POST** /Api/v2/Maps/{Id}/Entries | Create a new map entry in a specific map
*MapsApi* | [**apiV2MapsByIdGet**](docs/MapsApi.md#apiv2mapsbyidget) | **GET** /Api/v2/Maps/{Id} | Get a specific map
*MapsApi* | [**apiV2MapsGet**](docs/MapsApi.md#apiv2mapsget) | **GET** /Api/v2/Maps | Get all maps
*PushNotificationsApi* | [**apiV2PushNotificationsFcmDeviceRegistrationPost**](docs/PushNotificationsApi.md#apiv2pushnotificationsfcmdeviceregistrationpost) | **POST** /Api/v2/PushNotifications/FcmDeviceRegistration | 
*PushNotificationsApi* | [**apiV2PushNotificationsSyncRequestPost**](docs/PushNotificationsApi.md#apiv2pushnotificationssyncrequestpost) | **POST** /Api/v2/PushNotifications/SyncRequest | 
*PushNotificationsApi* | [**apiV2PushNotificationsWnsChannelRegistrationPost**](docs/PushNotificationsApi.md#apiv2pushnotificationswnschannelregistrationpost) | **POST** /Api/v2/PushNotifications/WnsChannelRegistration | 
*PushNotificationsApi* | [**apiV2PushNotificationsWnsToastPost**](docs/PushNotificationsApi.md#apiv2pushnotificationswnstoastpost) | **POST** /Api/v2/PushNotifications/WnsToast | 
*RichPreviewApi* | [**linkEventsByIdGet**](docs/RichPreviewApi.md#linkeventsbyidget) | **GET** /Link/Events/{Id} | 
*SyncApi* | [**apiV2SyncGet**](docs/SyncApi.md#apiv2syncget) | **GET** /Api/v2/Sync | Returns everything you could ever wish for.
*TokensApi* | [**apiV2TokensRegSysPost**](docs/TokensApi.md#apiv2tokensregsyspost) | **POST** /Api/v2/Tokens/RegSys | 
*TokensApi* | [**apiV2TokensWhoAmIGet**](docs/TokensApi.md#apiv2tokenswhoamiget) | **GET** /Api/v2/Tokens/WhoAmI | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.eurofurence.data.models.AggregatedDeltaResponse](docs/AggregatedDeltaResponse.md)
 - [org.eurofurence.data.models.AnnouncementRecord](docs/AnnouncementRecord.md)
 - [org.eurofurence.data.models.ApiErrorResult](docs/ApiErrorResult.md)
 - [org.eurofurence.data.models.ApiSafeResult](docs/ApiSafeResult.md)
 - [org.eurofurence.data.models.ApiSafeResultLeft_Square_BracketCollectTokenResponseRight_Square_Bracket](docs/ApiSafeResultLeft_Square_BracketCollectTokenResponseRight_Square_Bracket.md)
 - [org.eurofurence.data.models.AuthenticationResponse](docs/AuthenticationResponse.md)
 - [org.eurofurence.data.models.BadgeInfo](docs/BadgeInfo.md)
 - [org.eurofurence.data.models.CollectTokenResponse](docs/CollectTokenResponse.md)
 - [org.eurofurence.data.models.DealerRecord](docs/DealerRecord.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketAnnouncementRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketAnnouncementRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketDealerRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketDealerRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketEventConferenceDayRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketEventConferenceDayRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketEventConferenceRoomRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketEventConferenceRoomRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketEventConferenceTrackRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketEventConferenceTrackRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketEventRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketEventRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketImageRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketImageRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketKnowledgeEntryRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketKnowledgeEntryRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketKnowledgeGroupRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketKnowledgeGroupRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.DeltaResponseLeft_Square_BracketMapRecordRight_Square_Bracket](docs/DeltaResponseLeft_Square_BracketMapRecordRight_Square_Bracket.md)
 - [org.eurofurence.data.models.EventConferenceDayRecord](docs/EventConferenceDayRecord.md)
 - [org.eurofurence.data.models.EventConferenceRoomRecord](docs/EventConferenceRoomRecord.md)
 - [org.eurofurence.data.models.EventConferenceTrackRecord](docs/EventConferenceTrackRecord.md)
 - [org.eurofurence.data.models.EventFeedbackRecord](docs/EventFeedbackRecord.md)
 - [org.eurofurence.data.models.EventRecord](docs/EventRecord.md)
 - [org.eurofurence.data.models.FursuitBadgeRecord](docs/FursuitBadgeRecord.md)
 - [org.eurofurence.data.models.FursuitBadgeRegistration](docs/FursuitBadgeRegistration.md)
 - [org.eurofurence.data.models.FursuitParticipationInfo](docs/FursuitParticipationInfo.md)
 - [org.eurofurence.data.models.FursuitParticipationRecord](docs/FursuitParticipationRecord.md)
 - [org.eurofurence.data.models.FursuitScoreboardEntry](docs/FursuitScoreboardEntry.md)
 - [org.eurofurence.data.models.ImageRecord](docs/ImageRecord.md)
 - [org.eurofurence.data.models.KnowledgeEntryRecord](docs/KnowledgeEntryRecord.md)
 - [org.eurofurence.data.models.KnowledgeGroupRecord](docs/KnowledgeGroupRecord.md)
 - [org.eurofurence.data.models.LinkFragment](docs/LinkFragment.md)
 - [org.eurofurence.data.models.MapEntryRecord](docs/MapEntryRecord.md)
 - [org.eurofurence.data.models.MapRecord](docs/MapRecord.md)
 - [org.eurofurence.data.models.PlayerCollectionEntry](docs/PlayerCollectionEntry.md)
 - [org.eurofurence.data.models.PlayerParticipationInfo](docs/PlayerParticipationInfo.md)
 - [org.eurofurence.data.models.PlayerScoreboardEntry](docs/PlayerScoreboardEntry.md)
 - [org.eurofurence.data.models.PostFcmDeviceRegistrationRequest](docs/PostFcmDeviceRegistrationRequest.md)
 - [org.eurofurence.data.models.PostWnsChannelRegistrationRequest](docs/PostWnsChannelRegistrationRequest.md)
 - [org.eurofurence.data.models.PrivateMessageRecord](docs/PrivateMessageRecord.md)
 - [org.eurofurence.data.models.RegSysAuthenticationRequest](docs/RegSysAuthenticationRequest.md)
 - [org.eurofurence.data.models.SendPrivateMessageRequest](docs/SendPrivateMessageRequest.md)
 - [org.eurofurence.data.models.ToastTest](docs/ToastTest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

