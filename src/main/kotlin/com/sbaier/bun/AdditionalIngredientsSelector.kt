package com.sbaier.bun

class AdditionalIngredientsSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun andAdd(vararg ingredients: BurgerIngredient): BurgerBuilderEnd
    {
        for(ingredient in ingredients)
            data.additionalIngredients.add(ingredient)
        return BurgerBuilderEnd(data)
    }
}