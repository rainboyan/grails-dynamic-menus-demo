package org.grails.demo

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Component

import grails.core.GrailsApplicationClass
import grails.plugins.GrailsPluginManager

@Component
@Slf4j
class ApplicationRunner implements GrailsApplicationClass {

    @Override
    void onStartup(Map<String, Object> event) {
        log.info("Load Dynamic Modules...")
        println('-' * 94)
        GrailsPluginManager pluginManager = event.source
        pluginManager.getModuleDescriptors().each {
            println it
        }
        println('-' * 94)
    }

    @Override
    void onShutdown(Map<String, Object> event) {
        log.info("Shutdown.")
    }
}
