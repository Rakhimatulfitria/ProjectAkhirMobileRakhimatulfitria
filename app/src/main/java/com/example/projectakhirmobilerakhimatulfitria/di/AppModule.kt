package com.example.projectakhirmobilerakhimatulfitria.di

import com.example.projectakhirmobilerakhimatulfitria.ui.movie.MovieViewModel
import com.example.projectakhirmobilerakhimatulfitria.core.domain.usecase.movie.MovieInteractor
import com.example.projectakhirmobilerakhimatulfitria.core.domain.usecase.movie.MovieUseCase
import com.example.projectakhirmobilerakhimatulfitria.ui.tvshow.TvShowViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { TvShowViewModel(get()) }
}