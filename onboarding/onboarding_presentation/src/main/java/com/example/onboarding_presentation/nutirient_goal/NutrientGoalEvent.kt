package com.example.onboarding_presentation.nutirient_goal

sealed class NutrientGoalEvent {
    data class OnCarbRadioEnter(val ratio: String) : NutrientGoalEvent()
    data class OnProteinRadioEnter(val ratio: String) : NutrientGoalEvent()
    data class OnFatRadioEnter(val ratio: String) : NutrientGoalEvent()
    object onNextClick : NutrientGoalEvent()
}
