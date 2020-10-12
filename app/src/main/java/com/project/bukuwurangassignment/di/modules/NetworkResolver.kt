package com.project.bukuwurangassignment.di.modules
import com.project.bukuwurangassignment.data.remote.config.ApiManager
import com.project.bukuwurangassignment.data.remote.config.BaseUrl
import com.project.bukuwurangassignment.data.remote.sources.UsersService
import com.project.bukuwurangassignment.data.repoImpl.UserDataRepoImpl
import com.project.bukuwurangassignment.data.repository.UsersRepository
import com.project.bukuwurangassignment.data.sharedPref.SharedPrefRepo
import com.project.bukuwurangassignment.data.sharedPref.SharedPrefRepoImpl
import com.project.bukuwurangassignment.data.sharedPref.SharedPrefs
import com.project.bukuwurangassignment.useCases.SharedPrefUseCase
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkResolver {
    @Singleton
    @Provides
    fun provideSharedPrefRepo(
        sharedPrefs: SharedPrefs
    ): SharedPrefRepo = SharedPrefRepoImpl(sharedPrefs)
    @Singleton
    @Provides
    fun provideOkHttpClient() : OkHttpClient = OkHttpClient
        .Builder()
        .build()

    @Singleton
    @Provides
    fun provideRetrofitClient(okHttpClient : OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BaseUrl.dev)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Singleton
    @Provides
    fun provideUserService(apiManager: ApiManager): UsersService = apiManager.userService
    @Singleton
    @Provides
    fun provideApiManager(retrofit: Retrofit) = ApiManager(retrofit)


    @Singleton
    @Provides
    fun provideUserDataRepoImpl(
        usersService: UsersService
    ): UsersRepository =
        UserDataRepoImpl(usersService)



}