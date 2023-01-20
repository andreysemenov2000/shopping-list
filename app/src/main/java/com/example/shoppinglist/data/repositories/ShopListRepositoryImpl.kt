package com.example.shoppinglist.data.repositories

import com.example.shoppinglist.domain.models.ShopItem
import com.example.shoppinglist.domain.repositories.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        shopItem.id = autoIncrementId++
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val editedItemIndex = shopList.indexOfFirst { it.id == shopItem.id }
        shopList.removeAt(editedItemIndex)
        shopList.add(editedItemIndex, shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId }
            ?: throw RuntimeException("Element wit id: $shopItemId was not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toMutableList() // Чтобы вернуть копию листа
    }

}