package com.plcoding.dictionary.feture_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.plcoding.dictionary.feture_dictionary.domain.model.Meaning

data class MeaningDto(
    @SerializedName("definitionDtos")
    val definitions: List<DefinitionDto>,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String,
) {
    fun toMeaning(): Meaning {
        return Meaning(
            definition = definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}