package org.eurofurence.data

import org.eurofurence.data.apis.FursuitsApi
import org.eurofurence.data.apis.ImagesApi
import org.eurofurence.util.base64Encode
import org.junit.Test
import java.security.MessageDigest
import kotlin.test.assertEquals

class ImagesTest {
    private val endpoint = ImagesApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        endpoint.apiV2ImagesGet()
    }

    @Test
    fun `Getting by ID gives same as finding in all`() {
        val gold = endpoint.apiV2ImagesGet().firstOrNull() ?: return
        val actual = endpoint.apiV2ImagesByIdGet(gold.Id)
        assertEquals(gold, actual)
    }

    @Test
    fun `Images should be delivered`() {
        // Get image and it's data
        val image = endpoint.apiV2ImagesGet().firstOrNull() ?: return
        val data = endpoint.apiV2ImagesByIdContentGet(image.Id)

        // Assert that the SHA1s are equal.
        MessageDigest.getInstance("SHA1").let {
            val md = it.digest(data)
            assertEquals(image.ContentHashSha1, base64Encode(md))
        }
    }
}