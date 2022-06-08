package com.pawelprotas.wtbackend.repository

import com.pawelprotas.wtbackend.entity.Exercise
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ExerciseRepository : JpaRepository<Exercise, Long>
