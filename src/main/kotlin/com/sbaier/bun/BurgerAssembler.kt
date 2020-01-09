package com.sbaier.bun

class BurgerAssembler
{
    fun createBurger(): BunSelector
    {
        return BunSelector(BurgerBuilderData())
    }
}