package com.project.project1.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.SchedulingConfigurer
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
import org.springframework.scheduling.config.ScheduledTaskRegistrar

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = ["scheduler.enabled"], matchIfMissing = true)
class SchedulerConfig : SchedulingConfigurer {
    private val POOL_SIZE = 2

    override fun configureTasks(taskRegistrar: ScheduledTaskRegistrar) {
        val threadPoolTaskScheduler = ThreadPoolTaskScheduler()
        threadPoolTaskScheduler.poolSize = POOL_SIZE
        threadPoolTaskScheduler.setThreadNamePrefix("scheduled-task-pool-")
        threadPoolTaskScheduler.initialize()
        taskRegistrar.setTaskScheduler(threadPoolTaskScheduler)
    }
}