package com.example.TaxisUser.Services;
import com.example.TaxisUser.Model.User;
import com.example.TaxisUser.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class UserServices {
    @Autowired
   UserRepository userRepository;

    public ArrayList<User> ObtenerUser(){return (ArrayList<User>) userRepository.findAll(); }

    public User guardarUser(User user){
        return userRepository.save(user);
    }

    public Optional<User>ObtenerPorId(Long id){
        return userRepository.findById(id);
    }
    public boolean EliminarUser(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
