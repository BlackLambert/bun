package com.sbaier.bun

data class Burger(val bunType: BunType,
                  val pattyType: PattyType,
                  val pattyAmount: PattyAmount,
                  val beefPreparation: BeefPattyPreparationType,
                  val sauceType: SauceType,
                  val cheeseType: CheeseType,
                  val additionalIngredients: List<BurgerIngredient>)
{
    override fun toString(): String
    {
        return "This is a delicious burger with ${bunTypeToString()} and ${pattyToString()} patties. A tasty " +
                "${sauceTypeToString()} sauce adds up to the flavour. This burger contains ${cheeseTypeToString()} " +
                "cheese${ingredientsToString()}."
    }

    private fun bunTypeToString(): String
    {
        return bunType.toString()
    }

    private fun pattyToString(): String
    {
        return when(pattyType)
        {
            PattyType.Beef -> "${pattyType.toString()} (${pattyAmount.toString()}, ${beefPreparation.toString()})"
            else -> "${pattyType.toString()} (${pattyAmount.toString()})"
        }
    }

    private fun sauceTypeToString(): String
    {
        return sauceType.toString()
    }

    private fun cheeseTypeToString(): String
    {
        return when(cheeseType)
        {
            CheeseType.None -> "no"
            else -> cheeseType.toString()
        }
    }

    private fun ingredientsToString(): String
    {
        val result: String =   " and fresh "
        return when(additionalIngredients.count())
        {
            0 -> ""
            1 -> result + additionalIngredients[0].toString()
            else -> result + "${firstIngredientsToString()} and ${additionalIngredients[additionalIngredients.count()-1]}"
        }
    }

    private fun firstIngredientsToString(): String
    {
        var result = additionalIngredients[0].toString()
        for(i in 1 until additionalIngredients.count())
        {
            result += ", ${additionalIngredients[i]}"
        }
        return result
    }
}