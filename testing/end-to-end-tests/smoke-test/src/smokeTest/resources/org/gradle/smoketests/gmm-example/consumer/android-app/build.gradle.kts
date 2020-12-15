plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(29)
    buildToolsVersion = "29.0.2"
    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    flavorDimensions("org.gradle.example.my-own-flavor")
    productFlavors {
        create("full") {
            dimension = "org.gradle.example.my-own-flavor"
            versionNameSuffix = "-full"
        }
    }

}

dependencies {
    implementation("example:java-library:1.0")
    implementation("example:kotlin-library:1.0")
    implementation("example:android-kotlin-library:1.0")
    implementation("example:android-library:1.0") // automatically selects right flavor based on own flavor
    implementation("example:android-library-single-variant:1.0")
    implementation("example:kotlin-mpp-library:1.0") // selects JVM variant because of 'usage' attribute
    implementation("example:kotlin-mpp-android-library:1.0")
}
