package com.pawelprotas.wtbackend.entity

import javax.persistence.*

@Entity
class Exercise(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long,

    @Column(nullable = false)
    override var title: String,

    @OneToMany
    @JoinTable
    override var sets: List<ExerciseSet> = emptyList()
) : BaseExercise
