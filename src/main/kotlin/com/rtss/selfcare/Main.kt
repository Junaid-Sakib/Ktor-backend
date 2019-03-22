package com.rtss.selfcare

import com.rtss.selfcare.bean.response.AgeResponse
import com.rtss.selfcare.bean.response.DepartmentResponse
import com.rtss.selfcare.bean.response.NameResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.post
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.GsonConverter
import io.ktor.routing.*
import org.slf4j.LoggerFactory
import org.slf4j.event.Level


val logger = LoggerFactory.getLogger("MAIN")

fun Application.module() {
    install(DefaultHeaders)
    install(CallLogging) {
        level = Level.INFO
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter(GsonBuilder().apply {
            setPrettyPrinting()
        }.create()))

    }
    install(Routing) {
        trace { application.log.trace(it.buildText()) } // Remove from prod

        post("/username") {
            logger.info("POST BODY: /username")
            val response = NameResponse("Hsiang")
            val gson = Gson()
            call.respondText(gson.toJson(response), ContentType.Application.Json)
        }


        post("/age") {
            logger.info("POST BODY: /age")
            val response = AgeResponse(26)
            val gson = Gson()
            call.respondText(gson.toJson(response), ContentType.Application.Json)
        }

        post("/department") {
            logger.info("POST BODY: /department")
            val response = DepartmentResponse("Fly weight Boxing")
            val gson = Gson()
            call.respondText(gson.toJson(response), ContentType.Application.Json)
        }
    }
}


fun main() {
    embeddedServer(Netty, 8080, watchPaths = listOf("CouchbaseDemo"), module = Application::module).start()
}
