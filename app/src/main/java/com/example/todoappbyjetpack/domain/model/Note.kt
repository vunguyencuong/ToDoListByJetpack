package com.example.todoappbyjetpack.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todoappbyjetpack.ui.theme.BabyBlue
import com.example.todoappbyjetpack.ui.theme.LightGreen
import com.example.todoappbyjetpack.ui.theme.RedOrange
import com.example.todoappbyjetpack.ui.theme.RedPink
import com.example.todoappbyjetpack.ui.theme.Violet
import java.lang.Exception

@Entity // support for Room
data class Note(
    val title : String,
    val content: String,
    val timestamp : Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue,RedPink)
    }
}


class InvalidNoteException(message:String): Exception(message)