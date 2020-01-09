package com.sbaier.bun

class BunSelector(data: BurgerBuilderData): BurgerBuilderBase(data)
{
    fun withClassicBun(): PattyTypeSelector
    {
        data.bunType = BunType.Basic
        return createPattyTypeSelector()
    }

    fun withSesameBun(): PattyTypeSelector
    {
        data.bunType = BunType.Sesame
        return createPattyTypeSelector()
    }

    fun withWholeGrainBun(): PattyTypeSelector
    {
        data.bunType = BunType.WholeGrain
        return createPattyTypeSelector()
    }

    private fun createPattyTypeSelector():PattyTypeSelector
    {
        return PattyTypeSelector(data)
    }
}