package com.example.chall9

import java.util.*

data class Crime(val id:UUID = UUID.randomUUID() ,
                 var title : String = " " ,
                 var date : Date = Date() ,
                 var requiresPolice:Boolean = false,
                 var isSolved :Boolean = false)
{

}
