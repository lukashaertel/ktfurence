package org.eurofurence.data

import org.eurofurence.data.apis.CommunicationApi
import org.eurofurence.data.apis.DealersApi
import org.eurofurence.data.apis.EventConferenceDaysApi
import org.eurofurence.data.apis.EventConferenceRoomsApi
import org.eurofurence.data.auth.setFor
import org.junit.Test
import kotlin.test.assertEquals


class EventConferenceRoomsTest {
    private val endpoint = EventConferenceRoomsApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2EventConferenceRoomsGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2EventConferenceRoomsGet().firstOrNull() ?: return
        val actual = endpoint.apiV2EventConferenceRoomsByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}