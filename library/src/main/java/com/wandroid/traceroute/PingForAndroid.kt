package com.wandroid.traceroute

/**
 * @desc
 * @author xiedong
 * @date   2020-06-29.
 */

object PingForAndroid {

    init {
        System.loadLibrary("traceroute")
    }

    external fun ping(domain: String): String
}