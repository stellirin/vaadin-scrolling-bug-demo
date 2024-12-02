import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
	kotlin("jvm")
	kotlin("plugin.spring")

	id("org.springframework.boot")
	id("com.vaadin")
}

group = "com.example.demo"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(21))
	}
}

kotlin {
	compilerOptions {
		jvmTarget.set(JvmTarget.JVM_21)
	}
}

dependencies {
	implementation(platform(SpringBootPlugin.BOM_COORDINATES))
	implementation("org.springframework.boot:spring-boot-starter")

	implementation(platform(libs.vaadin.bom))
	implementation("com.vaadin:vaadin-spring-boot-starter")
	implementation(libs.vaadin.kotlin.dsl)
}
