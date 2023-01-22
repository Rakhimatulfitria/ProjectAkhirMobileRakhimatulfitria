package com.example.projectakhirmobilerakhimatulfitria.core.domain.usecase.movie

import com.example.projectakhirmobilerakhimatulfitria.core.data.remote.Resource
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.Movie
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface MovieUseCase{
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}