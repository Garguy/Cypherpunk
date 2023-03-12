package com.gardner.cypherpunk.domain.repository

import com.gardner.cypherpunk.data.remote.dto.CoinDetailDto
import com.gardner.cypherpunk.data.remote.dto.CoinDto

interface CoinRepository {
    
    suspend fun getCoins(): List<CoinDto>
    
    suspend fun getCoinById(coinId: String): CoinDetailDto
}