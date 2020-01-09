package com.sbaier.bun

class SauceTypeSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun withoutSauce(): CheeseTypeSelector
    {
        data.sauceType = SauceType.None
        return createCheeseTypeSelector()
    }

    fun usingSpecialSauce(): CheeseTypeSelector
    {
        data.sauceType = SauceType.Special
        return createCheeseTypeSelector()
    }

    fun usingChiliSauce(): CheeseTypeSelector
    {
        data.sauceType = SauceType.Chili
        return createCheeseTypeSelector()
    }

    fun usingCocktailSauce(): CheeseTypeSelector
    {
        data.sauceType = SauceType.Cocktail
        return createCheeseTypeSelector()
    }

    fun usingCurrySauce(): CheeseTypeSelector
    {
        data.sauceType = SauceType.Curry
        return createCheeseTypeSelector()
    }

    private fun createCheeseTypeSelector(): CheeseTypeSelector
    {
        return CheeseTypeSelector(data)
    }
}