package br.com.wendellgabriel.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


/**
 * IUserRepository
 */
public interface IUserRepository extends JpaRepository<UserModel, UUID>{

    UserModel findByUsername(String username);
    
}