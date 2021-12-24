package com.laundry.controller;

import com.laundry.domain.User;
import com.laundry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/prueba")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/lis")
    public List<User> getAll(){
        List<User> usuario = null;
        try {
            System.out.println("Entra");
            usuario = (List<User>) service.getUsuarios();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo buscar, revise su request");
        }
        return usuario;
    }
}
