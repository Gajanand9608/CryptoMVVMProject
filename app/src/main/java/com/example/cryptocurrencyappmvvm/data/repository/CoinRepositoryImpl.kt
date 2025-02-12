package com.example.cryptocurrencyappmvvm.data.repository

import com.example.cryptocurrencyappmvvm.data.remote.CoinPaprikaApi
import com.example.cryptocurrencyappmvvm.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyappmvvm.data.remote.dto.CoinDto
import com.example.cryptocurrencyappmvvm.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}