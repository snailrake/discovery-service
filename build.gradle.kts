plugins {
    java
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "ru.intership"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    /**
     * Spring cloud starters
     */
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.5")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:4.1.1")

    /**
     * Tests
     */
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
