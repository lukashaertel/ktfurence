package org.eurofurence.data

import org.eurofurence.data.apis.CommunicationApi
import org.eurofurence.data.auth.setFor
import org.junit.Test

class CommunicationTest {
    private val endpoint = CommunicationApi(Config.testingEndpoint)

    @Test
    fun `Getting all should not fail`() {
        Config.auth.setFor(endpoint) {
            apiV2CommunicationPrivateMessagesGet()
        }
    }

}