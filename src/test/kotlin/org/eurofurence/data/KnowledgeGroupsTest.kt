package org.eurofurence.data

import org.eurofurence.data.apis.KnowledgeEntriesApi
import org.eurofurence.data.apis.KnowledgeGroupsApi
import org.junit.Test
import kotlin.test.assertEquals


class KnowledgeGroupsTest {
    private val endpoint = KnowledgeGroupsApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2KnowledgeGroupsGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2KnowledgeGroupsGet().firstOrNull() ?: return
        val actual = endpoint.apiV2KnowledgeGroupsByIdGet(gold.Id)
        assertEquals(gold, actual)
    }
}