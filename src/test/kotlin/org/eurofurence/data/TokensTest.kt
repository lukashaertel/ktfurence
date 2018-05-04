package org.eurofurence.data

import org.eurofurence.data.apis.TokensApi
import org.eurofurence.data.auth.setFor
import org.eurofurence.data.infrastructure.ClientException
import org.eurofurence.data.models.RegSysAuthenticationRequest
import org.junit.Test

class TokensTest {
    private val endpoint = TokensApi(Config.testingEndpoint)

    @Test(expected = ClientException::class)
    fun `Invalid login should fail`() {
        endpoint.apiV2TokensRegSysPost(RegSysAuthenticationRequest(
                -1, "no", "user"))
    }

    @Test
    fun `whoami should get the logged in user`() {
        Config.auth.setFor(endpoint) {
            apiV2TokensWhoAmIGet()
        }
    }
}