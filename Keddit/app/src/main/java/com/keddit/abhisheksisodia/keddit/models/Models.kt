package com.keddit.abhisheksisodia.keddit.models

import com.keddit.abhisheksisodia.keddit.adapter.AdapterType
import com.keddit.abhisheksisodia.keddit.adapter.ViewType

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterType.NEWS
}