package com.plcoding.dictionary.feture_dictionary.domain.usecase

import com.plcoding.dictionary.core.util.Resource
import com.plcoding.dictionary.feture_dictionary.domain.model.WordInfo
import com.plcoding.dictionary.feture_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetWordInfoUseCase @Inject constructor(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}