package com.example.mvvm_shopping_list.ui

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.example.mvvm_shopping_list.R
import com.example.mvvm_shopping_list.model.ShoppingItem
import kotlinx.android.synthetic.main.dialog_shopping_item.*
import kotlinx.android.synthetic.main.shopping_item.*

class AddShoppingItemDialog(context: Context, var addDialogListener: AddDialogListener) :
    AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_shopping_item)

        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()

            if (name.isEmpty() || amount.isEmpty()) {
                Toast.makeText(context, "Please enter all information", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val item = ShoppingItem(name, amount.toInt())
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }
        tvCancel.setOnClickListener {
            cancel()
        }
    }
}