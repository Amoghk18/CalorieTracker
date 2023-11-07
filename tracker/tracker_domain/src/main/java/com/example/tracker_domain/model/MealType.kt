package com.example.tracker_domain.model

sealed class MealType(val name: String) {

    object BreakFast: MealType("breakfast")
    object Lunch: MealType("lunch")
    object Dinner: MealType("dinner")
    object Snack: MealType("snack")

    companion object {

        fun fromString(name: String): MealType {
            return when(name) {
                BreakFast.name -> BreakFast
                Lunch.name -> Lunch
                Dinner.name -> Dinner
                Snack.name -> Snack
                else -> BreakFast
            }
        }

    }

}
