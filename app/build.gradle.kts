plugins {
    id("com.github.ben-manes.versions") version "0.48.0"
    application
    jacoco
    checkstyle
    id("io.freefair.lombok") version "8.4"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
//    compileOnly("org.projectlombok:lombok:1.18.34")
//    annotationProcessor("org.projectlombok:lombok:1.18.34")
}

tasks.test {
    useJUnitPlatform()
}

application {
	mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.jacocoTestReport { reports { xml.required.set(true) } }
