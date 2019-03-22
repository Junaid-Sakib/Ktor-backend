package com.rtss.selfcare.couchbase

import com.couchbase.client.java.Bucket
import com.couchbase.client.java.Cluster
import com.couchbase.client.java.document.json.JsonObject

class CouchInit {


    fun openBucket(cluster: Cluster, bucketName: String) {
        try {
            val bucket: Bucket = cluster.openBucket(bucketName, "rtss")
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun addToBucket(jObj : JsonObject){
        val content = JsonObject.empty()
            .put("name", "John Doe")
            .put("type", "Person")
            .put("email", "john.doe@mydomain.com")
            .put("homeTown", "Chicago")



    }

}