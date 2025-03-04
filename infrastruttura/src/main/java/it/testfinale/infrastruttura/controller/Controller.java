package it.testfinale.infrastruttura.controller;

import it.testfinale.infrastruttura.object.model.User;
import it.testfinale.infrastruttura.service.UtenteService;
import it.testfinale.infrastruttura.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController@RequestMapping("/api/users")
@RequiredArgsConstructor
    public class UserController {

        private final UtenteService userService;

        @GetMapping    public List<User> getUsers() {
            return userService.getAllUsers();    }

    @GetMapping("/{id}")
        public ResponseEntity<Object> getUserById(@PathVariable Long id) {
            return userService.getUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());

        }

        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody User user) {
            return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));    }

    @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUser(@PathVariable Long id) {userService.deleteUser(id);
            return ResponseEntity.noContent().build();    }}



