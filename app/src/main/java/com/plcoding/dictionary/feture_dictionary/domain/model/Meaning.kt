package com.plcoding.dictionary.feture_dictionary.domain.model

data class Meaning(
    val definition: List<Definition>,
    val partOfSpeech: String,
)