package org.eurofurence.data

import org.eurofurence.data.apis.KnowledgeEntriesApi
import org.junit.Test
import kotlin.test.assertEquals


class KnowledgeEntriesTest {
    private val endpoint = KnowledgeEntriesApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2KnowledgeEntriesGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2KnowledgeEntriesGet().firstOrNull() ?: return
        val actual = endpoint.apiV2KnowledgeEntriesByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}