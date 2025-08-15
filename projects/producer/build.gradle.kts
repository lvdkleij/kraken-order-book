plugins {
    java
    alias(libs.plugins.graalvm.buildtools.native)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.springframework.boot)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation(libs.spring.boot.starter.web)

    developmentOnly(libs.spring.boot.devtools)

    testImplementation(libs.spring.boot.starter.test)

    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
