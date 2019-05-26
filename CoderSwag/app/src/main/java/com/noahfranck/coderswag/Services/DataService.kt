package com.noahfranck.coderswag.Services

import com.noahfranck.coderswag.Model.Category
import com.noahfranck.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat White","$18","hat02"),
        Product("Devslopes Hat Black","$20","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28","hoodie01"),
        Product("Devslopes Hoodie Red", "$32","hoodie02"),
        Product("Devslopes Gray Hoodie", "$32","hoodie03"),
        Product("Devslopes black Hoodie", "$28","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Gray Shirt", "$28","shirt01"),
        Product("Devslopes Red Shirt", "$32","shirt02"),
        Product("Devslopes Collared Shirt", "$32","shirt03"),
        Product("Devslopes Black Shirt", "$28","shirt04")
    )
}