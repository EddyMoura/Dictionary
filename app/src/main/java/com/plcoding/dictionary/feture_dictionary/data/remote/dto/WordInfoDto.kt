package com.plcoding.dictionary.feture_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.plcoding.dictionary.feture_dictionary.data.local.entity.WordInfoEntity

data class WordInfoDto(
    @SerializedName("meaningDtos")
    val meanings: List<MeaningDto>,
    @SerializedName("phonetic")
    val phonetic: String,
    @SerializedName("word")
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            word = word,
        )
    }
}