package mashup.spring.actiontest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ActionTestApplication

fun main(args: Array<String>) {
    println("test")
    runApplication<ActionTestApplication>(*args)
}
