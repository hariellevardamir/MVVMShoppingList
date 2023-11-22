package com.example.mvvm_shopping_list.ui

import androidx.lifecycle.ViewModel
import com.example.mvvm_shopping_list.model.ShoppingItem
import com.example.mvvm_shopping_list.repository.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val repository: ShoppingRepository) : ViewModel() {

    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingListItem() = repository.getAllShoppingItems()
}