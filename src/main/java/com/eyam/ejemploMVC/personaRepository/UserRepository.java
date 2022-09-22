package com.eyam.ejemploMVC.personaRepository;

import com.eyam.ejemploMVC.personaEntitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
}
