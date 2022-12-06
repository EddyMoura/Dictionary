package com.plcoding.dictionary.feture_dictionary.presentation

import com.plcoding.dictionary.feture_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)