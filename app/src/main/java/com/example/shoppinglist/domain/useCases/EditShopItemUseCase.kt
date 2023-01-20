package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.models.ShopItem
import com.example.shoppinglist.domain.repositories.ShopListRepository

class EditShopItemUseCase(private val shopItemRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopItemRepository.editShopItem(shopItem)
    }

}