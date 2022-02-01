package com.ioleynikov

import org.http4k.core.Method.GET
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class minimal_serviceTest {

    @Test
    fun `Ping test`() {
        assertEquals(app(Request(GET, "/ping")), Response(OK).body("pong"))
    }
    @Test
    fun `Health test`() {
        assertEquals(app(Request(GET, "/health")), Response(OK).body("{\"status\": \"OK\"}"))
    }

}
