package org.eurofurence.data

import org.eurofurence.data.apis.TokensApi
import org.eurofurence.data.auth.BearerAuth
import org.eurofurence.data.infrastructure.ClientException
import org.eurofurence.data.infrastructure.ServerException
import org.eurofurence.data.models.AuthenticationResponse
import org.eurofurence.data.models.RegSysAuthenticationRequest

object Config {
    private const val testingBadgeNo = 99998

    private const val testingUser = "AndroidTestUser"

    private const val testingPassword = "991477"

    /**
     * The endpoint of the testing API.
     */
    val testingEndpoint = "https://app.eurofurence.org:40000"

    /**
     * The response by RegSys.
     */
    val response by lazy(LazyThreadSafetyMode.SYNCHRONIZED, ::acquireResponse)

    /**
     * The user ID.
     */
    val uid get() = response.Uid

    /**
     * The token that can be used in Bearer authorization.
     */
    val token get() = response.Token

    /**
     * Gets the Bearer authorization on [token].
     */
    val auth get() = BearerAuth(token)

    /**
     * Acquires the token for bearer authorization.
     */
    private fun acquireResponse(): AuthenticationResponse {
        try {
            // Get the tokens API on the endpoint
            val tokens = TokensApi(testingEndpoint)

            // Send test login data to acquire token
            return tokens.apiV2TokensRegSysPost(RegSysAuthenticationRequest(
                    testingBadgeNo, testingUser, testingPassword))
        } catch (ex: ClientException) {
            // Client exception, this is most likely 403
            throw IllegalStateException("Client error while logging in.", ex)
        } catch (ex: ServerException) {
            // Something went wrong on the server side
            throw IllegalStateException("Problems connecting to the endpoint.", ex)
        }
    }
}