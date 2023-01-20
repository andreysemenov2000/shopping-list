package com.example.shoppinglist.domain.useCases

import com.example.shoppinglist.domain.repositories.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(shopItemId: Int) {
        shopListRepository.deleteShopItem(shopItemId)
    }

}