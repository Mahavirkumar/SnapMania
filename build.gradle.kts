buildscript {
    repositories {
        google()
        mavenCentral()
    }
    configurations.all {
        exclude(group = "gradle", module = "gradle")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
        classpath("com.google.gms:google-services:4.4.2")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Plugins applied in submodules — versions managed in buildscript above
}
