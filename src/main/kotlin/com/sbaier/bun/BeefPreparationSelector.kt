package com.sbaier.bun

class BeefPreparationSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun bloody(): PattyAmountSelector
    {
        data.beefPreparation = BeefPattyPreparationType.Bloody
        return createPattyAmountSelector()
    }

    fun mediumWell(): PattyAmountSelector
    {
        data.beefPreparation = BeefPattyPreparationType.MediumWell
        return createPattyAmountSelector()
    }

    fun medium(): PattyAmountSelector
    {
        data.beefPreparation = BeefPattyPreparationType.Medium
        return createPattyAmountSelector()
    }

    private fun createPattyAmountSelector(): PattyAmountSelector
    {
        return PattyAmountSelector(data)
    }
}