package org.grails.demo

import grails.plugins.DynamicGrailsPlugin
import grails.plugins.exceptions.PluginException

import org.grails.plugins.AbstractModuleDescriptor

class LanguageModuleDescriptor extends AbstractModuleDescriptor {

    String title

    LanguageModuleDescriptor() {
        super()
    }

    @Override
    void init(DynamicGrailsPlugin plugin, Map args) throws PluginException {
        super.init(plugin, args)
        this.title = args.title
    }

    @Override
    String toString() {
        StringBuffer sb = new StringBuffer()
        sb.append("LanguageModuleDescriptor: [")
                .append("\n    key: ").append(key)
                .append("\n    name: ").append(name)
                .append("\n    description: ").append(description)
                .append("\n    title: ").append(title)
                .append("]")
        sb.toString()
    }
}
