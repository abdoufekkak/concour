package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entities.Concours;
@Repository

public interface RepoConcours  extends JpaRepository<Concours, Integer>{
}
