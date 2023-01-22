package com.example.projectakhirmobilerakhimatulfitria.core.domain.repository

import com.example.projectakhirmobilerakhimatulfitria.core.data.remote.Resource
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.Movie
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.TvShow
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getMovies(): Flow<Resource<List<Movie>>>
    fun getTvShow(): Flow<Resource<List<TvShow>>>
}