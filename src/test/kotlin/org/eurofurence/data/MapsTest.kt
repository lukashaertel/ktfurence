package org.eurofurence.data

import org.eurofurence.data.apis.MapsApi
import org.junit.Test
import kotlin.test.assertEquals


class MapsTest {
    private val endpoint = MapsApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2MapsGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2MapsGet().firstOrNull() ?: return
        val actual = endpoint.apiV2MapsByIdGet(gold.Id)
        assertEquals(gold, actual)
    }

    @Test
    fun `Getting entries should not fail`() {
        val map = endpoint.apiV2MapsGet().firstOrNull() ?: return
        endpoint.apiV2MapsByIdEntriesGet(map.Id)
    }

    @Test
    fun `Getting entry by ID gives same as finding in all`() {
        val map = endpoint.apiV2MapsGet().firstOrNull() ?: return
        val gold = endpoint.apiV2MapsByIdEntriesGet(map.Id).firstOrNull() ?: return
        val actual = endpoint.apiV2MapsByIdEntriesByEntryIdGet(map.Id, gold.Id)
        assertEquals(gold, actual)
    }
}