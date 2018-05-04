package org.eurofurence.data

import org.eurofurence.data.apis.*
import org.eurofurence.data.auth.setFor
import org.junit.Test
import kotlin.test.assertEquals


class EventConferenceTracksTest {
    private val endpoint = EventConferenceTracksApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2EventConferenceTracksGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2EventConferenceTracksGet().firstOrNull() ?: return
        val actual = endpoint.apiV2EventConferenceTracksByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}