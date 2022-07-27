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

}

