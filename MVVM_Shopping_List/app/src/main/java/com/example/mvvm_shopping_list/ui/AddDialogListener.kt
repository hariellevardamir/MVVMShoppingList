package com.example.mvvm_shopping_list.ui

import com.example.mvvm_shopping_list.model.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}