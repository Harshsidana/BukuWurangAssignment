package com.project.bukuwurangassignment.di

import com.project.bukuwurangassignment.Application
import com.project.bukuwurangassignment.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, NetworkResolver::class, ActivityResolver::class, UseCasesBinder::class,ViewModelBinder::class,DatabaseBinder::class]
)
interface AppComponent : AndroidInjector<Application> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}