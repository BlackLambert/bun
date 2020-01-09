package com.sbaier.bun

abstract class BurgerBuilderBase (protected val data: BurgerBuilderData)
{
    fun assemble(): Burger
    {
        return Burger(data.bunType,
                data.pattyType,
                data.pattyAmount,
                data.beefPreparation,
                data.sauceType,
                data.cheeseType,
                data.additionalIngredients)
    }
}