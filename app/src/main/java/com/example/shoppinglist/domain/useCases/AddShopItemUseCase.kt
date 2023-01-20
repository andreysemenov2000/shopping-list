package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.models.ShopItem
import com.example.shoppinglist.domain.repositories.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }

}