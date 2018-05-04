package org.eurofurence.data

import org.eurofurence.data.apis.CommunicationApi
import org.eurofurence.data.apis.DealersApi
import org.eurofurence.data.auth.setFor
import org.junit.Test
import kotlin.test.assertEquals


class DealersTest {
    private val endpoint = DealersApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2DealersGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2DealersGet().firstOrNull() ?: return
        val actual = endpoint.apiV2DealersByIdGet(gold.Id)
        assertEquals(gold, actual)
    }


}