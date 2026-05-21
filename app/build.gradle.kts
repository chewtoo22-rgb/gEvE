plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.room")
    kotlin("ksp")
}

android {
    namespace = "com.matt.geve"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.matt.geve"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0-gEvE"
    }
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.14" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation(platform("androidx.compose:compose-bom:2024.10.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    implementation("dev.rikka.shizuku:api:13.6.0")
    implementation("dev.rikka.shizuku:provider:13.6.0")
}