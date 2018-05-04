package org.eurofurence.data

import org.eurofurence.data.apis.FursuitsApi
import org.eurofurence.data.auth.setFor
import org.junit.Test
import kotlin.test.assertTrue

class FursuitsTest {
    private val endpoint = FursuitsApi(Config.testingEndpoint)

    @Test
    fun `Getting fursuit images should not fail`() {
        Config.auth.setFor(endpoint) {
            val badge = try {
                endpoint.apiV2FursuitsBadgesGet().firstOrNull() ?: return
            } catch (_: Throwable) {
                return
            }

            endpoint.apiV2FursuitsBadgesByIdImageGet(badge.Id)
        }
    }

    @Test
    fun `Getting all fursuit participation should not fail`() {
        Config.auth.setFor(endpoint) {
            endpoint.apiV2FursuitsCollectingGameFursuitParticipationGet()
        }
    }

    @Test
    fun `Getting all player participation should not fail`() {
        Config.auth.setFor(endpoint) {
            endpoint.apiV2FursuitsCollectingGamePlayerParticipationGet()
        }
    }

    @Test
    fun `Top 5 fursuiters should return at max 5`() {
        assertTrue(5 >= endpoint.apiV2FursuitsCollectingGameFursuitParticipationScoreboardGet(5).size,
                "Should not return more than 5 results")
    }

    @Test
    fun `Top 5 players should return at max 5`() {
        assertTrue(5 >= endpoint.apiV2FursuitsCollectingGamePlayerParticipationScoreboardGet(5).size,
                "Should not return more than 5 results")
    }
}