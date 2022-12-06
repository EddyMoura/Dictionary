package com.plcoding.dictionary.feture_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.plcoding.dictionary.feture_dictionary.data.local.entity.WordInfoEntity

data class WordInfoDto(
    @SerializedName("license")
    val license: License,
    @SerializedName("meaningDtos")
    val meanings: List<MeaningDto>,
    @SerializedName("phonetic")
    val phonetic: String,
    @SerializedName("phoneticDtos")
    val phonetics: List<PhoneticDto>,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>,
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