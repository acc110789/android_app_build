package me.luhaoyu.testapplication2

import com.kwai.kim.module_suite.base.ModuleImpl

@ModuleImpl(module = [AppModule::class])
class AppModuleImpl : AppModule {
    override fun doBusinessOne(): Int {
        return 2
    }

    override fun doBusinessTwo(): String {
        return "doBusinessApp"
    }
}