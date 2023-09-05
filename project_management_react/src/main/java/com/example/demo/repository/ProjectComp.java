package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProjectCompetitors;

public interface ProjectComp extends JpaRepository<ProjectCompetitors, Integer> {

}
