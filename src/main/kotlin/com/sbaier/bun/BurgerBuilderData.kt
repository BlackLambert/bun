package com.sbaier.bun

data class BurgerBuilderData(var bunType: BunType = BunType.Basic,
                             var pattyType: PattyType = PattyType.Beef,
                             var pattyAmount: PattyAmount = PattyAmount.Single,
                             var beefPreparation: BeefPattyPreparationType = BeefPattyPreparationType.Medium,
                             var sauceType: SauceType = SauceType.Special,
                             var cheeseType: CheeseType = CheeseType.None,
                             var additionalIngredients: MutableList<BurgerIngredient> = mutableListOf())
{
}