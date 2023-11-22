package com.example.mvvm_shopping_list.repository

import com.example.mvvm_shopping_list.db.ShoppingDatabase
import com.example.mvvm_shopping_list.model.ShoppingItem

class ShoppingRepository(private val db: ShoppingDatabase) {

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShopItems()
}