package com.sbaier.bun

class CheeseTypeSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun withoutCheese(): AdditionalIngredientsSelector
    {
        data.cheeseType = CheeseType.None
        return  createAdditionalIngredientsSelector()
    }

    fun withCheddar(): AdditionalIngredientsSelector
    {
        data.cheeseType = CheeseType.Cheddar
        return  createAdditionalIngredientsSelector()
    }

    fun withGouda(): AdditionalIngredientsSelector
    {
        data.cheeseType = CheeseType.Gouda
        return  createAdditionalIngredientsSelector()
    }

    fun withMozzarella(): AdditionalIngredientsSelector
    {
        data.cheeseType = CheeseType.Mozzarella
        return  createAdditionalIngredientsSelector()
    }

    private fun createAdditionalIngredientsSelector(): AdditionalIngredientsSelector
    {
        return AdditionalIngredientsSelector(data)
    }
}