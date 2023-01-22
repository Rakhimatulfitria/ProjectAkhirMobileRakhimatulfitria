package com.example.projectakhirmobilerakhimatulfitria.core.domain.usecase.movie

import com.example.projectakhirmobilerakhimatulfitria.core.data.remote.Resource
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.Movie
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.TvShow
import com.example.projectakhirmobilerakhimatulfitria.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow

class MovieInteractor(private val repository: IMovieRepository): MovieUseCase {
    override fun getMovies(): Flow<Resource<List<Movie>>> = repository.getMovies()
    override fun getTvShow(): Flow<Resource<List<TvShow>>> = repository.getTvShow()
}