pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
    plugins {
        id("de.fayard.refreshVersions") version "0.60.5"
        id("com.github.ben-manes.versions") version "0.51.0"
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ProjectManagementMessenger"
include(":app")
include(":backend")

