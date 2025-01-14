plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.fixify"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.fixify"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}




dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.google.firebase:firebase-database:20.3.1")
    implementation("com.google.android.libraries.places:places:3.4.0")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation("com.google.android.gms:play-services-auth:21.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.firebase:geofire-android:3.2.0")
    implementation ("com.firebase:geofire-android-common:3.2.0")
    implementation ("com.akexorcist:googledirectionlibrary:1.1.1")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation ("com.logicbeanzs.uberpolylineanimation:library:1.0.0")
    implementation ("com.ncorti.slidetoact:slidetoact:2.0.0")
    implementation ("com.ncorti:slidetoact:2.0.0")
    implementation ("com.github.tintinscorpion:Dual-color-Polyline-Animation:1.0.0")
    implementation ("com.addisonelliott:segmented-button:2.0.0")
    implementation ("com.paypal.sdk:paypal-android-sdk:2.21.0")
    implementation ("com.onesignal:OneSignal:5.1.7")
    implementation ("com.stripe:stripe-android:20.40.3")
    implementation ("com.github.tintinscorpion:Dual-color-Polyline-Animation:{latest_version}")
    implementation ("com.ncorti:slidetoact:0.11.0")
    implementation ("com.github.tintinscorpion:Dual-color-Polyline-Animation:{latest_version}")


}