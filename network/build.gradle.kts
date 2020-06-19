plugins {
    id("java-library")
    id("kotlin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Dependencies.kotlin)
    implementation(Dependencies.apollo)
    implementation(Dependencies.apolloCoroutines)
    implementation(Dependencies.apolloRuntime)
}

repositories {
    mavenCentral()
    maven(url = "http://dl.bintray.com/apollographql/android")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}