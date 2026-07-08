package com.cognizant.ormapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormapping.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
