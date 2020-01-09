package com.sbaier.bun

class PattyTypeSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun withBeefPatty(): BeefPreparationSelector
    {
        data.pattyType = PattyType.Beef
        return createBeefPreparationSelector()
    }

    fun withVeggiePatty(): PattyAmountSelector
    {
        data.pattyType = PattyType.Vegetarian
        return createPattyAmountSelector()
    }

    fun withCrispyChicken(): PattyAmountSelector
    {
        data.pattyType = PattyType.CrispyChicken
        return createPattyAmountSelector()
    }

    private fun createBeefPreparationSelector(): BeefPreparationSelector
    {
        return BeefPreparationSelector(data)
    }

    private fun createPattyAmountSelector(): PattyAmountSelector
    {
        return PattyAmountSelector(data)
    }
}