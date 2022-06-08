package com.pawelprotas.wtbackend.entity

interface BaseExercise {
    val id: Long
    val title: String
    val sets: List<ExerciseSet>
}

