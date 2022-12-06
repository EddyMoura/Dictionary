package com.plcoding.dictionary.feture_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.plcoding.dictionary.feture_dictionary.domain.model.Definition

data class DefinitionDto(
    @SerializedName("antonyms")
    val antonyms: List<String>,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("synonyms")
    val synonyms: List<String>
) {
    fun toDefinition(): Definition {
        return Definition(
            antonyms = antonyms,
            definition = definition,
            synonyms = synonyms
        )
    }
}