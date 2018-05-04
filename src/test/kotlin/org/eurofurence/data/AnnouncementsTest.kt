package org.eurofurence.data

import org.eurofurence.data.apis.AnnouncementsApi
import org.junit.Test
import kotlin.test.assertEquals

class AnnouncementsTest {
    private val endpoint = AnnouncementsApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2AnnouncementsGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2AnnouncementsGet().firstOrNull() ?: return
        val actual = endpoint.apiV2AnnouncementsByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}