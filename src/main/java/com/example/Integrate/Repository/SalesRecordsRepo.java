package com.example.Integrate.Repository;

import com.example.Integrate.Modal.SalesRecords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesRecordsRepo extends JpaRepository<SalesRecords,Long> {
    List<SalesRecords> findAllByOrderByIdDesc();
}
