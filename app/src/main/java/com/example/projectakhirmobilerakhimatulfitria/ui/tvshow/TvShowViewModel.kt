package com.example.projectakhirmobilerakhimatulfitria.ui.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.projectakhirmobilerakhimatulfitria.core.domain.usecase.movie.MovieUseCase

class TvShowViewModel(private val useCase: MovieUseCase): ViewModel() {
    fun getTvShow() = useCase.getTvShow().asLiveData()
}