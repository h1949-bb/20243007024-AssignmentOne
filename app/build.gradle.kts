plugins { id("com.android.application") }
android {
    namespace = "com.example.assignmentone"
    compileSdk { version = release(37) }
    defaultConfig {
        applicationId = "com.example.assignmentone"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
