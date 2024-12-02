rootProject.name = "demo"

pluginManagement {
	repositories {
		mavenCentral()
		gradlePluginPortal()
		maven("https://repo.spring.io/milestone")
		maven("https://maven.vaadin.com/vaadin-prereleases/")
	}

	val kotlinVersion = "1.9.25"

	plugins {
		kotlin("jvm") version kotlinVersion
		kotlin("plugin.spring") version kotlinVersion

		// https://plugins.gradle.org/plugin/org.springframework.boot
		id("org.springframework.boot") version "3.3.6"

		// https://plugins.gradle.org/plugin/com.vaadin
		id("com.vaadin") version "24.4.15" // TODO: Sync it below
	}
}

dependencyResolutionManagement {
	repositories {
		mavenCentral()
		maven("https://repo.spring.io/milestone")
		maven("https://maven.vaadin.com/vaadin-prereleases/")
	}

	versionCatalogs {
		create("libs") {

			// https://mvnrepository.com/artifact/com.vaadin/vaadin-bom
			library("vaadin-bom", "com.vaadin", "vaadin-bom").version("24.4.15") // TODO: Sync it above

			// https://mvnrepository.com/artifact/com.github.mvysny.karibudsl/karibu-dsl-v23
			library("vaadin-kotlin-dsl", "com.github.mvysny.karibudsl", "karibu-dsl-v23").version("2.1.4")

		}
	}
}
