package br.com.wendellgabriel.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

                var authorization = request.getHeader("Authorization");
                System.out.println("Authorization");
                System.out.println(authorization);

                authorization.substring("Basic".length()).trim();
        
                filterChain.doFilter(request, response);
    }
    
}
