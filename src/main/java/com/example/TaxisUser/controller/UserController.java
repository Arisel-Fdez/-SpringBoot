package com.example.TaxisUser.controller;
import com.example.TaxisUser.Model.User;
import com.example.TaxisUser.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController  {
    @Autowired
    UserServices userServices;

    @GetMapping()
    public ArrayList<User> ObtenerUser(){
        return userServices.ObtenerUser();
    }

    @PostMapping()
    public User guardarUser(@RequestBody User user){
        return this.userServices.guardarUser(user);

    }


    @GetMapping(path = "/{id}")
    public Optional<User> obtenerUsersPorId(@PathVariable("id") Long id){
        return this.userServices.ObtenerPorId(id);
    }



    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userServices.EliminarUser(id);
        if (ok){
            return "Se eliminó el usuario con id: " + id;
        }else{
            return "No pudo eliminar el usuario con id: " + id;
        }
    }


}
