plugins {
    id("java")
    id("org.openapi.generator") version "7.4.0"
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "aoleg.com.github"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.data:spring-data-commons")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
    compileOnly("org.projectlombok:lombok:1.18.30")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

openApiGenerate {
    inputSpecRootDirectory = "$projectDir/swagger"
    generatorName = "spring"
    library = "spring-boot"
    outputDir = "$projectDir"
    modelPackage = "userdatamanager.aoleg.com.github.dto"
    apiPackage = "userdatamanager.aoleg.com.github.api"
    generateModelDocumentation = true
    generateApiDocumentation = true
    generateApiTests = false
    generateModelTests = false
    skipOperationExample = true
    configOptions.set(hashMapOf(
            "generateForOpenFeign" to "true",
            "configPackage" to "userdatamanager.aoleg.com.github.config",
            "openApiNullable" to "false",
            "useResponseEntity" to "false"
    ))
}

openApiValidate {
    inputSpec.set("$projectDir/swagger/openapi.yaml")
}