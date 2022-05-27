buildscript {
    dependencies {
        classpath(libs.android.gradle.plugin)
        classpath(libs.kotlin.gradle.plugin)
    }

    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}
