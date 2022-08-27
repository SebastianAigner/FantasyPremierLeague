
object Versions {
    const val kotlin = "1.7.10"
    const val kotlinCoroutines = "1.6.4"
    const val ktor = "2.1.0"
    const val kotlinxSerialization = "1.3.3"
    const val koin = "3.2.0"
    const val realm = "1.0.2"
    const val kermit = "1.0.0"
    const val kotlinxDateTime = "0.4.0"
    const val multiplatformSettings = "1.0.0-alpha01"

    const val kmpNativeCoroutinesVersion = "0.12.6-new-mm"

    const val slf4j = "1.7.30"
    const val compose = "1.2.1"
    const val composeCompiler = "1.3.0"
    const val navCompose = "2.5.1"
    const val accompanist = "0.25.1"
    const val coilCompose = "2.1.0"
    const val composeDesktop =  "1.2.0-alpha01-dev755"
    const val koalaPlot =  "0.1.0"

    const val junit = "4.13"
}


object AndroidSdk {
    const val min = 21
    const val compile = 32
    const val target = compile
}

object Deps {
    const val realm = "io.realm.kotlin:library-base:${Versions.realm}"
    const val kermit = "co.touchlab:kermit:${Versions.kermit}"

    const val multiplatformSettings = "com.russhwolf:multiplatform-settings:${Versions.multiplatformSettings}"
    const val multiplatformSettingsCoroutines = "com.russhwolf:multiplatform-settings-coroutines:${Versions.multiplatformSettings}"

    object Kotlinx {
        const val serializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDateTime}"
    }

    object Koin {
        val core = "io.insert-koin:koin-core:${Versions.koin}"
        val test = "io.insert-koin:koin-test:${Versions.koin}"
        val android = "io.insert-koin:koin-android:${Versions.koin}"
        val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
    }

    object Ktor {
        const val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
        const val json = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"

        const val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val clientJava = "io.ktor:ktor-client-java:${Versions.ktor}"
        const val slf4j = "org.slf4j:slf4j-simple:${Versions.slf4j}"
        const val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
    }

}

object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

object Compose {
    const val compiler = "androidx.compose.compiler:compiler:${Versions.composeCompiler}"
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"
    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coilCompose}"
    const val accompanistSwipeRefresh = "com.google.accompanist:accompanist-swiperefresh:${Versions.accompanist}"
    const val koalaPlot = "io.github.koalaplot:koalaplot-core:${Versions.koalaPlot}"
}




