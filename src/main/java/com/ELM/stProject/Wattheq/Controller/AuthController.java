package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.DTO.LoginRequest;
import com.ELM.stProject.Wattheq.DTO.RegisterRequest;
import com.ELM.stProject.Wattheq.Service.AuthService;
import com.ELM.stProject.Wattheq.Service.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(value = "/api/auth", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthController {

    @Autowired
    private AuthService authService;

    @CrossOrigin
    @GetMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
    return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }
}
