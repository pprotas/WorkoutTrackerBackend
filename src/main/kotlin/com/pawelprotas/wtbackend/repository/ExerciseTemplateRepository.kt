package com.pawelprotas.wtbackend.repository

import com.pawelprotas.wtbackend.entity.ExerciseTemplate
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ExerciseTemplateRepository : JpaRepository<ExerciseTemplate, Long>
