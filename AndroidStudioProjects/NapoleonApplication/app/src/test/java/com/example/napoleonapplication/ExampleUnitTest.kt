package com.example.napoleonapplication

import org.junit.Test

import org.junit.Assert.*


class ExampleUnitTest {
    fun formatPrise(price: Double, size: String, discount: Int) {
        if(discount != 0){
            val discountPrice: Double = price - (price * discount/100)
            if (Math.floor(discountPrice)==discountPrice){
                val formatted: String = String.format("%.0f", discountPrice)
                println("Цена товара: $formatted/$size (скидка $discount%)")
            }
            else{
                val formatted: String = String.format("%.2f", discountPrice)
                println("Цена товара: $formatted/$size (скидка $discount%)")
            }
        }
        else{
            if (Math.floor(price)==price){
                val formatted: String = String.format("%.0f", price)
                println("Цена товара: $formatted/$size")
            }
            else{
                val formatted: String = String.format("%.2f", price)
                println("Цена товара: $formatted/$size")
            }

        }
    }


    @Test
    fun addition_fun(){
        formatPrise(price = 10.0,size = "kg",discount = 10)
    }


//    fun Discrimenant(a:Double,b:Double,c:Double){
//        var D = Math.pow(b,2.0) - 4*a*c
//        var x1 = (-b - Math.sqrt(D))/(2*a)
//        var x2 = (-b + Math.sqrt(D))/(2*a)
//        println("x1 = $x1")
//        print("x2 = $x2")
//    }
}
