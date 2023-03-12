package com.gardner.cypherpunk.presentation.coin_list

import com.gardner.cypherpunk.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
