package com.example.Integrate.Repository;

import com.example.Integrate.Modal.Installation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstallationRepo extends JpaRepository<Installation,Long> {
    List<Installation> findAllByOrderByIdDesc();
}
