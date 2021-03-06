package com.example.newtest.app.di2.module.app

import com.example.newtest.app.di2.module.activity.FragmentModule
import com.example.newtest.app.di2.scope.ActivityScope
import com.example.newtest.app.feature.news.main.MainActivity
import dagger.android.ContributesAndroidInjector

interface ActivitiesModule
{
    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    fun bindActivity():MainActivity
}