package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.repositories.ShopListRepository

class EditShopItemUseCase(private val shopItemRepository: ShopListRepository) {

    fun editShopItem(shopItemId: Int) {
        shopItemRepository.editShopItem(shopItemId)
    }

}