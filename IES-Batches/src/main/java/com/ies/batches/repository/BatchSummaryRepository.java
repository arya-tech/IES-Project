package com.ies.batches.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.batches.entities.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary, Integer>{

}
