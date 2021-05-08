package com.ws.sidecar.egress

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WsSidecarEgressApplication


fun main(args: Array<String>) {
    //
    runApplication<WsSidecarEgressApplication>(*args)
}
