package org.eurofurence.data

import org.eurofurence.data.apis.*
import org.eurofurence.data.auth.setFor
import org.eurofurence.data.models.EventFeedbackRecord
import org.junit.Test
import java.time.LocalDateTime
import java.util.*
import kotlin.test.assertTrue


class EventFeedbackTest {
    private val endpointEvents = EventsApi(Config.testingEndpoint)
    private val endpointFeedback = EventFeedbackApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        Config.auth.setFor(endpointFeedback) {
            endpointFeedback.apiV2EventFeedbackGet()
        }
    }

    //@Test
    fun `After posting, the feedback should be contained`() {
        // Get an event, do not fail here if events API failed
        val event = try {
            endpointEvents.apiV2EventsGet().firstOrNull() ?: return
        } catch (_: Throwable) {
            return
        }

        Config.auth.setFor(endpointFeedback) {
            // Compose the record
            val record = EventFeedbackRecord(
                    LocalDateTime.now(), UUID.randomUUID(), event.Id, Config.uid, 5, false, "Feedback testing message.")

            // Post the record
            endpointFeedback.apiV2EventFeedbackPost(record)

            val all = endpointFeedback.apiV2EventFeedbackGet()

            // Assert that the record is in the responses.
            assertTrue(record in all, "Record not in feedback.")
        }
    }
}