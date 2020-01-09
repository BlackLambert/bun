package com.sbaier.bun

class PattyAmountSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun single(): SauceTypeSelector
    {
        data.pattyAmount = PattyAmount.Single
        return createSauceTypeSelector()
    }

    fun double(): SauceTypeSelector
    {
        data.pattyAmount = PattyAmount.Double
        return createSauceTypeSelector()
    }

    fun triple(): SauceTypeSelector
    {
        data.pattyAmount = PattyAmount.Triple
        return createSauceTypeSelector()
    }

    private fun createSauceTypeSelector(): SauceTypeSelector
    {
        return SauceTypeSelector(data)
    }
}