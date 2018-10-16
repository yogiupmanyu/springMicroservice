package com.example.ec.repo;

import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    TourPackage findByName(String name);
    
 
    Optional<TourPackage> findById(String id);
}

