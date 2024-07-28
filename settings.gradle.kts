
rootProject.name = "otuskotlin-marketplace"

pluginManagement {
    val kotlinVersion: String by settings
    val foojayResolverVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion
        id("org.gradle.toolchains.foojay-resolver-convention") version foojayResolverVersion
    }
}

include("m1l1-first")

