apply(from = "../dsl/android-library.gradle")
apply(from = "../dsl/ktlint.gradle")
apply(from = "../dsl/bintray.gradle")

dependencies {
    "api"("com.eaglesakura.armyknife.armyknife-jetpack:armyknife-jetpack:1.3.0")

    "api"("androidx.core:core:1.0.2")
    "api"("androidx.core:core-ktx:1.0.2")
    "api"("androidx.collection:collection-ktx:1.0.0")
    "api"("androidx.fragment:fragment-ktx:1.0.0")
    "api"("androidx.appcompat:appcompat:1.0.2")
    "api"("androidx.lifecycle:lifecycle-extensions:2.0.0")
    "api"("androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0")
}