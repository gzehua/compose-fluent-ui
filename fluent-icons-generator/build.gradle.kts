plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvm()
    sourceSets {
        jvmMain.dependencies {
            implementation(libs.ktor.client.java)
            implementation(libs.jsoup)
            implementation(libs.google.guava)
            implementation(libs.android.tools.common)
            implementation(libs.android.tools.sdk.common)
            implementation(libs.squareup.kotlinpoet)
        }
    }
}