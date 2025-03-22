plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation(kotlin("gradle-plugin", libs.versions.kotlin.get()))
}

kotlin {
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}

gradlePlugin {
    plugins {
        create("BuildPlugin") {
            id = "io.github.composefluent.plugin.build"
            implementationClass = "io.github.composefluent.plugin.build.BuildPlugin"
        }
    }
}