package org.grails.demo

import grails.plugins.DynamicGrailsPlugin
import grails.plugins.exceptions.PluginException

import org.grails.plugins.AbstractModuleDescriptor

class MenuItemModuleDescriptor extends AbstractModuleDescriptor {

    String menu
    String title
    String link
    String location
    int order

    MenuItemModuleDescriptor() {
        super()
    }

    @Override
    void init(DynamicGrailsPlugin plugin, Map args) throws PluginException {
        super.init(plugin, args)
        this.menu = args.menu
        this.title = args.title
        this.link = args.link
        this.location = args.location
    }

    @Override
    String toString() {
        StringBuffer sb = new StringBuffer()
        sb.append("MenuItemModuleDescriptor: [")
                .append("\n    key: ").append(key)
                .append("\n    name: ").append(name)
                .append("\n    description: ").append(description)
                .append("\n    link: ").append(link)
                .append("\n    title: ").append(title)
                .append("\n    menu: ").append(menu)
                .append("\n    location: ").append(location)
                .append("\n    order: ").append(order)
                .append("\n    params: ").append(params)
                .append("]")
        sb.toString()
    }
}
