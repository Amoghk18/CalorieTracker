package com.example.onboarding_domain.di

import com.example.onboarding_domain.use_case.ValidateNutrients
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object OnBoardingDomainModule {

    @Provides
    @ViewModelScoped
    fun providesValidateNutrientsUseCase(): ValidateNutrients {
        return ValidateNutrients()
    }
}