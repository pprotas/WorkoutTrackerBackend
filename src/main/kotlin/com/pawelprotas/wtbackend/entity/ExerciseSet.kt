package com.pawelprotas.wtbackend.entity

import javax.persistence.*

@Entity
class ExerciseSet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = true)
    val reps: Long,

    @Column(nullable = true)
    val weight: Long,

    @Column(nullable = false)
    val isCompleted: Boolean
)

