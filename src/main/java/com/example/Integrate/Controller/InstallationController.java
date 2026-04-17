    package com.example.Integrate.Controller;

    import com.example.Integrate.Modal.Installation;
    import com.example.Integrate.Modal.InstallationItems;
    import com.example.Integrate.Repository.InstallationRepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/installations")
    @CrossOrigin(origins = "https://imaginative-sunshine-8b82db.netlify.app/")
    public class InstallationController {

        @Autowired
        private InstallationRepo repo;

        @PostMapping
        public Installation save(@RequestBody Installation data) {
            if (data.getItems() != null) {
                for (InstallationItems item : data.getItems()) {
                    item.setInstallation(data);
                }
            }
            return repo.save(data);
        }

        @GetMapping
        public List<Installation> getAll() {
            return repo.findAllByOrderByIdDesc();
        }

        @PutMapping("/{id}")
        public Installation update(@PathVariable Long id, @RequestBody Installation data) {
            Installation existing = repo.findById(id).orElseThrow();

            existing.setDate(data.getDate());
            existing.setCustomerName(data.getCustomerName());
            existing.setCity(data.getCity());
            existing.setCustomerContact(data.getCustomerContact());
            existing.setAddress(data.getAddress());
            existing.setInvoiceNo(data.getInvoiceNo());
            existing.setInvoiceDate(data.getInvoiceDate());
            existing.setInstallationDate(data.getInstallationDate());
            existing.setEngineerName(data.getEngineerName());
            existing.setEngineerContact(data.getEngineerContact());
            existing.setWarranty(data.getWarranty());
            existing.setDemoGiven(data.getDemoGiven());
            existing.setTrainingGiven(data.getTrainingGiven());
            existing.setEventStart(data.getEventStart());
            existing.setEventEnd(data.getEventEnd());

            existing.getItems().clear();
            for(InstallationItems item:data.getItems()){
                item.setInstallation(existing);
                existing.getItems().add(item);
            }

            return repo.save(existing);
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<?> delete(@PathVariable Long id) {
            repo.deleteById(id);
            return ResponseEntity.ok("Deleted Successfully");
        }
    }