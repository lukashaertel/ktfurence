package org.eurofurence.data

import org.eurofurence.data.apis.CommunicationApi
import org.eurofurence.data.apis.DealersApi
import org.eurofurence.data.apis.EventConferenceDaysApi
import org.eurofurence.data.auth.setFor
import org.junit.Test
import kotlin.test.assertEquals


class EventConferenceDaysTest {
    private val endpoint = EventConferenceDaysApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2EventConferenceDaysGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2EventConferenceDaysGet().firstOrNull() ?: return
        val actual = endpoint.apiV2EventConferenceDaysByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}