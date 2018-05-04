package org.eurofurence.data

import org.eurofurence.data.apis.EventsApi
import org.eurofurence.data.apis.RichPreviewApi
import org.junit.Test
import kotlin.test.assertTrue

class RichPreviewTest {
    private val endpointEvents = EventsApi(Config.testingEndpoint)
    private val endpointRichPreview = RichPreviewApi(Config.testingEndpoint)


    @Test
    fun `Getting the rich preview should return data`() {
        // Get an event, do not fail here if events API failed
        val event = try {
            endpointEvents.apiV2EventsGet().firstOrNull() ?: return
        } catch (_: Throwable) {
            return
        }

        assertTrue(endpointRichPreview.linkEventsByIdGet(event.Id).isNotEmpty(), "Did not receive a string")
    }
}