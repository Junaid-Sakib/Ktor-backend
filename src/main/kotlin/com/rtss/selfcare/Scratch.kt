package com.rtss.selfcare

class Scratch {

    /* get("/") {

            val json: String = "[\n" +
                    "    {\n" +
                    "        \"name\": \"Junaid\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"name\": \"Arun\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"name\": \"Hernan\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"name\": \"Sethu\"\n" +
                    "    }\n" +
                    "]"

            call.respondText(json, ContentType.Application.Json)
            val couchbase = SingletonCluster.cluster
            CouchInit().openBucket(couchbase, "game-bucket")
        }

        post("/do-post") {
            val postBody = call.receive<String>()
            logger.info("POST BODY: $postBody")
            val resp = GeneralResponse("dd", "dd", 0)
            val gson = Gson()
            call.respondText(gson.toJson(resp), ContentType.Application.Json)
        }
*/
}