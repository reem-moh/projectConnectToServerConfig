package com.project.project1.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.cloud.context.config.annotation.RefreshScope

@ConstructorBinding
@ConfigurationProperties(prefix = "general")
@RefreshScope
data class ConfigInfo
    (
    var hello: String,
) {

    @JvmName("setHello1")
    fun setHello(hello: String) {
        this.hello = this.hello
    }

}
//@ConfigurationProperties(prefix = "general", ignoreUnknownFields = false)
//@ConstructorBinding
//class ConfigInfo {
//
//    public val hello: String? = null
//}
//
//@ConfigurationProperties(prefix = "general", ignoreUnknownFields = false)
//fun setHello(): ConfigInfo? {
//    return ConfigInfo()
//}

