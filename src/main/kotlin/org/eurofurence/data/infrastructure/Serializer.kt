package org.eurofurence.data.infrastructure

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.Rfc3339DateJsonAdapter
import org.eurofurence.moshi.LocalDateTimeJsonAdapter
import org.eurofurence.moshi.UUIDJsonAdapter
import java.time.LocalDateTime
import java.util.*

object Serializer {
    @JvmStatic
    val moshi: Moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(Date::class.java, Rfc3339DateJsonAdapter().nullSafe())
            .add(UUID::class.java, UUIDJsonAdapter().nullSafe())
            .add(LocalDateTime::class.java, LocalDateTimeJsonAdapter().nullSafe())
            .build()
}
