package com.eyam.ejemploMVC.personaServices;

import com.eyam.ejemploMVC.personaEntitys.User;
import com.eyam.ejemploMVC.personaRepository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository= repository;
    }

    public User createUser(User newUser){
        return this.repository.save(newUser);
    }
    public User findUserByEmail(String email){
            return this.repository.findByEmail(email);
    }
    public User generateOrcreateUsuario(Map<String, Object> UserData){
        //User user= new User();
        String email= (String) UserData.get("email");
        User user= findUserByEmail(email);
        if(user==null){
            String image= (String) UserData.get("picture");
            String auth0Id= (String) UserData.get("sub");
            User newUser = new User(email = email, image= image, auth0Id=auth0Id);
            return createUser(newUser);
        }
        //String name= (String) UserData.get("name");
        return user;
    }
}
