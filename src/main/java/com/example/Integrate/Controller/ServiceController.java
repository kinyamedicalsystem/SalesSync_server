package com.example.Integrate.Controller;

import com.example.Integrate.Modal.Service;
import com.example.Integrate.Modal.ServiceSpare;
import com.example.Integrate.Repository.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "https://imaginative-sunshine-8b82db.netlify.app/")
public class ServiceController {

    @Autowired
    private ServiceRepo repo;

    @PostMapping
    public Service save(@RequestBody Service data) {
        Integer maxCsr=repo.findMaxCsrNo();
        int nextCsr=(maxCsr == null) ? 1:maxCsr+1;
        data.setCsrNo(nextCsr);

        if (data.getSpares() != null) {
            for (ServiceSpare sp : data.getSpares()) {
                sp.setService(data);
            }
        }
        if(data.getClosedDate()!=null && !data.getClosedDate().isEmpty()){
            data.setStatus("CLOSED");
        }
        else {
            data.setStatus("OPEN");
        }
        return repo.save(data);
    }

    @GetMapping
    public List<Service> getAll() {
        return repo.findAllByOrderByIdDesc();
    }


    @PutMapping("/{id}")
    public Service update(@PathVariable Long id, @RequestBody Service data) {
        Service existing = repo.findById(id).orElseThrow();

        existing.setDate(data.getDate());
        existing.setCustomerName(data.getCustomerName());
        existing.setCity(data.getCity());
        existing.setCustomerContact(data.getCustomerContact());
        existing.setAddress(data.getAddress());
        existing.setEquipmentName(data.getEquipmentName());
        existing.setSerialNo(data.getSerialNo());
        existing.setManufacturer(data.getManufacturer());
        existing.setModel(data.getModel());
        existing.setCustomerProblem(data.getCustomerProblem());
        existing.setDiagnosis(data.getDiagnosis());
        existing.setRectification(data.getRectification());
        existing.setServiceType(data.getServiceType());
        existing.setEvent(data.getEvent());
        existing.setStartOfService(data.getStartOfService());
        existing.setEndOfService(data.getEndOfService());
        existing.setRootCause(data.getRootCause());
        existing.setCorrectiveAction(data.getCorrectiveAction());
        existing.setPreventiveAction(data.getPreventiveAction());
        existing.setExpectedClosedDate(data.getExpectedClosedDate());
        existing.setClosedDate(data.getClosedDate());
        existing.setEngineerName(data.getEngineerName());
        if(data.getClosedDate()!=null && !data.getClosedDate().isEmpty()){
            existing.setStatus("CLOSED");
        }
       else{
            existing.setStatus("OPEN");
        }

        existing.getSpares().clear();
        for(ServiceSpare spare:data.getSpares()){
            spare.setService(existing);
            existing.getSpares().add(spare);
        }

        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
      public ResponseEntity<?> delete(@PathVariable Long id){
        repo.deleteById(id);
        return ResponseEntity.ok("Deleted Successfully");

    }

}