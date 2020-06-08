package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.DTO.UserDTO;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userService;



}
