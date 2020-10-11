package com.example.hike.di

import com.project.bukuwurangassignment.di.modules.ActivityResolver
import com.project.bukuwurangassignment.di.modules.DataSourceResolver
import com.project.bukuwurangassignment.di.modules.NetworkResolver
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, NetworkResolver::class, ActivityResolver::class, DataSourceResolver::class]
)
interface AppComponent : AndroidInjector<com.example.hike.Application> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: com.example.hike.Application): Builder

        fun build(): AppComponent
    }
}