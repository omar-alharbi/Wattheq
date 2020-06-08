package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserService extends JpaRepository<User,Long> {

}
