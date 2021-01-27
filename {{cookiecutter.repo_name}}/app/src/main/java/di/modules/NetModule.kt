package {{ cookiecutter.package_name }}.di.modules

import {{ cookiecutter.package_name }}.net.ExampleService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetModule {

    @Provides
    @Singleton
    fun provideAPI(): ExampleService {
        return Retrofit.Builder()
            .baseUrl("") // TODO : Put API URL
            .addConverterFactory(
                MoshiConverterFactory.create()
            )
            .build()
            .create(ExampleService::class.java)
    }
}