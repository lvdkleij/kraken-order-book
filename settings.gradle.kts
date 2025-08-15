rootProject.name = "kraken-order-book"

include("consumer")
project(":consumer").projectDir = file("./projects/consumer")

include("producer")
project(":producer").projectDir = file("./projects/producer")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}