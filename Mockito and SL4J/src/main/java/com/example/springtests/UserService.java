
package com.example.springtests;

import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }
    public User getUserById(Long id) {
        return repo.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
    }
    public User saveUser(User u) { return repo.save(u); }
}
