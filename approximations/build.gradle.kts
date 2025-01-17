plugins {
    java
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jacodb:jacodb-api:1.4.0")
    compileOnly("org.jacodb:jacodb-approximations:1.4.0")
    compileOnly(files(rootDir.resolve("usvm-api/usvm-api.jar")))
}

group = "org.usvm.approximations.java.stdlib"
version = "0.0.0"

tasks.withType<JavaCompile> {
    //options.release = 8
    //options.compilerArgs.add("--add-exports=java.base/sun.nio.ch=ALL-UNNAMED")
    options.compilerArgs.add("-target")
    options.compilerArgs.add("1.8")
    options.compilerArgs.add("-source")
    options.compilerArgs.add("1.8")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
