package com.example.Integrate.Repository;

import com.example.Integrate.Modal.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceRepo extends JpaRepository<Service,Long> {
    @Query("SELECT MAX(CAST(s.csrNo AS int)) FROM Service s")
    Integer findMaxCsrNo();

    List<Service> findAllByOrderByIdDesc();
}
