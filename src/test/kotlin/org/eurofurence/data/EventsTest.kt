package org.eurofurence.data

import org.eurofurence.data.apis.EventsApi
import org.eurofurence.data.auth.setFor
import org.junit.Test
import kotlin.test.assertEquals

class EventsTest {
    private val endpoint = EventsApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2EventsGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2EventsGet().firstOrNull() ?: return
        val actual = endpoint.apiV2EventsByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}