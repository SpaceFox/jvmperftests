import me.champeau.jmh.JMHTask
import me.champeau.jmh.JmhBytecodeGeneratorTask

plugins {
    id("java")
    id("me.champeau.jmh") version "0.7.0"
}

group = "fr.spacefox"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    jmh("org.openjdk.jmh:jmh-core:1.36")
    jmh("org.openjdk.jmh:jmh-generator-annprocess:1.36")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

val jvmStackTrace = "-Xss4m"
tasks {
    // Stack size increase is required for JMH to handle absurdly deep inheritance graph
    withType<JmhBytecodeGeneratorTask> {
        jvmArgs.add(jvmStackTrace)
    }
    withType<JMHTask> {
        jvmArgs.add(jvmStackTrace)
    }
    withType<Test> {
        jvmArgs = listOf(jvmStackTrace)
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}