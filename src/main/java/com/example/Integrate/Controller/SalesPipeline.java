package com.example.Integrate.Controller;

import com.example.Integrate.Modal.SalesRecords;
import com.example.Integrate.Repository.SalesRecordsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
@CrossOrigin(origins = "https://imaginative-sunshine-8b82db.netlify.app/")
public class SalesPipeline {



        @Autowired
        private SalesRecordsRepo repo;

        // GET all
        @GetMapping
        public List<SalesRecords> getAll() {
            return repo.findAllByOrderByIdDesc();
        }

        // POST (create)
        @PostMapping
        public SalesRecords create(@RequestBody SalesRecords record) {
            return repo.save(record);
        }

        // PUT (update)
        @PutMapping("/{id}")
        public SalesRecords update(@PathVariable Long id, @RequestBody SalesRecords record) {
            record.setId(id);
            return repo.save(record);
        }

        // DELETE
        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            repo.deleteById(id);
        }
    }

