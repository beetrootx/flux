plugins {
    kotlin("jvm") version Libs.Versions.kotlin apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
