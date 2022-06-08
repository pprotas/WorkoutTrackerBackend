package com.pawelprotas.wtbackend.entity

import javax.persistence.*

@Entity
class WorkoutTemplate(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long,

    @Column(nullable = false)
    override var title: String,

    @OneToMany
    @JoinTable
    var exerciseTemplates: List<ExerciseTemplate> = emptyList()
) : BaseWorkout


