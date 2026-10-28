buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Built-in Kotlin in AGP 9.2 defaults to 2.2.10. KSP 2.3.x needs Kotlin 2.3.
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.3.20")
    }
}

plugins {
    id("com.android.application") version "9.2.1" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.3.20" apply false
    id("com.google.devtools.ksp") version "2.3.12" apply false
    id("com.google.dagger.hilt.android") version "2.59.2" apply false
    id("com.google.gms.google-services") version "4.5.0" apply false
}
