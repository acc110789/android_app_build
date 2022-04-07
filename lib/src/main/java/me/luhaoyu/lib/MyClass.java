package me.luhaoyu.lib;

import org.gradle.api.artifacts.ConfigurationContainer;

public class MyClass {

    void hehe(ConfigurationContainer container) {
        container.all((configuration) -> {
        });
    }
}