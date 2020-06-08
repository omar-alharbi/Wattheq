package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.DTO.LoginRequest;
import com.ELM.stProject.Wattheq.DTO.RegisterRequest;
import com.ELM.stProject.Wattheq.Security.JwtProvider;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service

public class AuthService {


    @Autowired
    private UserRepo userrepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired JwtProvider jwtProvider;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUserName());
        user.setFullName(registerRequest.getFullName());
        user.setNationalID(registerRequest.getNationalID());
        user.setPassword(encodePassword (registerRequest.getPassword()));
        user.setDob(registerRequest.getDob());
        user.setEmail(registerRequest.getEmail());
        user.setPhoneNumber(registerRequest.getPhoneNumber());
        user.setAuth(registerRequest.getAuth());
        userrepo.save(user);
    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    public AuthenticationResponse login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        String authenticationToken = jwtProvider.generateToken(authenticate);
        return new AuthenticationResponse(authenticationToken, loginRequest.getUsername());
    }
}
