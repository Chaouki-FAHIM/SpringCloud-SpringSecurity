package com.book.bookservice.controler;

import com.book.bookservice.config.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")

@RequiredArgsConstructor
@RestController
@RequestMapping("/api2")

public class AuthController {
    private final UserService userService;
    private final UserAuthProvider userAuthProvider;
    @PostMapping("/login")
    public ResponseEntity<UserDto> login (@RequestBody @Valid CredentialsDto credentialsDto){
        UserDto user=userService.login(credentialsDto);
        user.setToken(userAuthProvider.createToken(user.getLogin()));
        return ResponseEntity.ok(user);
    }
    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody @Valid SignUpDto signUpDto){
       UserDto user= userService.register(signUpDto);
       user.setToken(userAuthProvider.createToken(user.getLogin()));
       return ResponseEntity.created(URI.create("/users/"+user.getId())).body(user);
    }
    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages() {
        return ResponseEntity.ok(Arrays.asList("first","second"));
    }

}
