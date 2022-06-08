package com.pawelprotas.wtbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WtBackendApplication

fun main(args: Array<String>) {
    runApplication<WtBackendApplication>(*args)
}
