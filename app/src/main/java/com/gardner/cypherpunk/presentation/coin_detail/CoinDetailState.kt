package com.gardner.cypherpunk.presentation.coin_detail

import com.gardner.cypherpunk.domain.model.Coin
import com.gardner.cypherpunk.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
