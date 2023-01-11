package com.example.todoappbyjetpack.domain.util


sealed class OrderType {

    object Ascending: OrderType()
    object Descending: OrderType()
}