package com.zudiewiener.coderswag2.Services

import com.zudiewiener.coderswag2.Model.Category
import com.zudiewiener.coderswag2.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRT","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HAT","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRT","shirtimage"),
    Category("HOODIE","hoodieimage"),
    Category("HAT","hatimage"),
    Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Black Beanie","$20","hat1"),
        Product("Blue Cap","$20","hat2"),
        Product("White Cap","$20","hat3"),
        Product("Blue & White Cap","$20","hat4")
    )

    val hoodies = listOf(
        Product("Blue Hoodie","$45", "hoodie1"),
        Product("Red Hoodie","$45", "hoodie2"),
        Product("Brown Hoodie","$45", "hoodie3"),
        Product("Black Hoodie","$45", "hoodie4")
    )

    val shirts = listOf(
        Product("Black T-Shirt","$30","shirt1"),
        Product("White T-Shirt","$30","shirt2"),
        Product("Red T-Shirt","$30","shirt3"),
        Product("Grey T-Shirt","$30","shirt4"),
        Product("Blue T-Shirt","$30","shirt5")
    )
}