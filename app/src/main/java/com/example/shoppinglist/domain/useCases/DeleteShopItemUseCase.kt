package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.models.ShopItem
import com.example.shoppinglist.domain.repositories.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }

}