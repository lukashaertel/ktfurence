package org.eurofurence.data

import org.eurofurence.data.apis.EventsApi
import org.eurofurence.data.apis.SyncApi
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class SyncTest {
    private val endpointEvents = EventsApi(Config.testingEndpoint)
    private val endpointSync = SyncApi(Config.testingEndpoint)

    @Test
    fun `Sync should all data with min`() {
        val gold = endpointEvents.apiV2EventsGet()
        val sync = endpointSync.apiV2SyncGet(LocalDateTime.now().minusYears(50))
        assertNotNull(sync.Events)
        assertArrayEquals(gold, sync.Events!!.ChangedEntities!!)
    }

    @Test
    fun `Sync should return no data with max`() {
        val sync = endpointSync.apiV2SyncGet(LocalDateTime.now().plusYears(50))
        assertNotNull(sync.Events)
        assertEquals(0, sync.Events!!.ChangedEntities!!.size)
    }
}