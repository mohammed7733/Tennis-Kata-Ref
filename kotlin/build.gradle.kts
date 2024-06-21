plugins {
    kotlin("jvm") version "2.0.0"
    application
}

group = "org.sammancoaching"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.test {
    useJUnitPlatform()
}

val javaVersion = JavaLanguageVersion.of(21)

kotlin {
    jvmToolchain {
        languageVersion.set(javaVersion)
    }
}

java {
    toolchain {
        languageVersion.set(javaVersion)
    }
}

