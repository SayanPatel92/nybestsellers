package com.codepath.bestsellerlistapp

import androidx.recyclerview.widget.RecyclerView

/**
 * This interface is used by the [BestSellerBooksRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestSellerBooksFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: BestSellerBook)
    abstract fun updateAdapter(progressBar: Any, recyclerView: RecyclerView)
}
