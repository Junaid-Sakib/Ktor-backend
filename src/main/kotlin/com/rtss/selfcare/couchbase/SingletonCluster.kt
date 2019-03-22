package com.rtss.selfcare.couchbase

import com.couchbase.client.java.Cluster
import com.couchbase.client.java.CouchbaseCluster

object SingletonCluster {
    var cluster: Cluster = CouchbaseCluster.create("localhost")
}