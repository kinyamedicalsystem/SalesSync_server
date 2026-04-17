package com.example.Integrate.Controller;

import com.example.Integrate.Modal.User;
import com.example.Integrate.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://imaginative-sunshine-8b82db.netlify.app/")
public class Authentication {
    @Autowired
    private UserRepo repo;

    // ✅ Signup API
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody User user) {

        // check if user exists
        Optional<User> existing = repo.findByEmail(user.getEmail());
        if (existing.isPresent()) {
            return ResponseEntity
                    .badRequest()
                    .body("User already exists");
        }
        repo.save(user);

        return ResponseEntity.ok("User registered successfully");
    }

    // ✅ Login API
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {

        Optional<User> dbUser = repo.findByEmail(user.getEmail());

        if (dbUser.isPresent() &&
                dbUser.get().getPassword().equals(user.getPassword())) {

            Map<String, String> response = new HashMap<>();
            response.put("role", dbUser.get().getRole());
            response.put("user", dbUser.get().getName());
            response.put("email", dbUser.get().getEmail());


            return ResponseEntity.ok(response);
        }

        return ResponseEntity.status(401).body("Invalid credentials");
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody User user) {

        Optional<User> dbUser = repo.findByEmail(user.getEmail());

        if (dbUser.isPresent()) {
            User existing = dbUser.get();

            existing.setName(user.getName());
           /// existing.setRole(user.getRole());

            repo.save(existing);
                return ResponseEntity.ok("Updated successfully");
        }

        return ResponseEntity.status(404).body("User not found");
    }
}
