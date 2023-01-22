package com.example.projectakhirmobilerakhimatulfitria.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.projectakhirmobilerakhimatulfitria.core.domain.model.TvShow

class DivTvShowCallback(private val oldItem: MutableList<TvShow>, private val newItem: MutableList<TvShow>): DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id
}