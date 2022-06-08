package com.pawelprotas.wtbackend.entity

import javax.persistence.*

@Entity
class Workout(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long,

    @Column(nullable = false)
    override var title: String,

    @OneToMany
    @JoinTable
    var exercises: List<Exercise> = emptyList()
) : BaseWorkout
