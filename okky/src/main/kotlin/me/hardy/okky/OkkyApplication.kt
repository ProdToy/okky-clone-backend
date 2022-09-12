package me.hardy.okky

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OkkyApplication

fun main(args: Array<String>) {
    runApplication<OkkyApplication>(*args)
}
