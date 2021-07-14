group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
}

dependencies {
    api(project(":core"))
    api(Libraries.Kotlin.extensions)
    api(npm("@material-ui/icons", Libraries.Npm.MaterialUi.icons))

    testImplementation(Libraries.Kotlin.jsTest)
}
