package com.phitoTec_backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.phitoTec_backEnd.entity.Plant;

import java.util.List;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    List<Plant> findByIndication(String indication);
}