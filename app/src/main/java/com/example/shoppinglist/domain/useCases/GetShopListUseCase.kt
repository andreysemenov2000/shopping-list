package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.models.ShopItem
import com.example.shoppinglist.domain.repositories.ShopListRepository

class GetShopListUseCase(private val shopItemRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopItemRepository.getShopList()
    }
}