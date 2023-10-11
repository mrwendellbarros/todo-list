package br.com.wendellgabriel.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MinhaPrimeiraController {


    
    public String primeiraMendagem() {
        return "Funcionou";
    }


}
