package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.models.ShopItem
import com.example.shoppinglist.domain.repositories.ShopListRepository

class GetShopItemUseCase(private val shopItemRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopItemRepository.getShopItem(shopItemId)
    }

}