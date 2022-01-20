pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.android.application") {
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
}

rootProject.name = "flux"

// Enable FeaturePreview.
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS") // Dependencies between projects in a multi-project build.

// TODO: Add sub-modules.
