package com.example.mvvm_shopping_list.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvm_shopping_list.model.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllShopItems(): LiveData<List<ShoppingItem>>
}