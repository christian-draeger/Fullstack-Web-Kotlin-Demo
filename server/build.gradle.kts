plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.springBoot)
    alias(libs.plugins.springDependencyManagement)
    alias(libs.plugins.kotlinSpring)
}

dependencies {
    implementation(projects.shared)
    implementation(libs.bundles.spring)
}