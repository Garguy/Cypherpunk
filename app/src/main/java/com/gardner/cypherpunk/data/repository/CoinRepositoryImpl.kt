package com.gardner.cypherpunk.data.repository

import com.gardner.cypherpunk.data.remote.CoinPaprikaApi
import com.gardner.cypherpunk.data.remote.dto.CoinDetailDto
import com.gardner.cypherpunk.data.remote.dto.CoinDto
import com.gardner.cypherpunk.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    
    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
    
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }
}