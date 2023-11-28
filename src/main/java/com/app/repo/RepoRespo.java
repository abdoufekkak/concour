package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entities.RespConcours;


@Repository
public interface RepoRespo extends JpaRepository<RespConcours, Integer> {

}
