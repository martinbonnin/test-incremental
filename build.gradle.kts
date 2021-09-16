plugins {
  id("org.jetbrains.kotlin.jvm").version("1.5.30")
}

repositories {
  mavenCentral()
}

kotlin {
  sourceSets["main"].kotlin.srcDir("src/other/kotlin")
}