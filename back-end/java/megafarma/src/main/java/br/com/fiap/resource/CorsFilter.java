package br.com.fiap.resource;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class CorsFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Permitir origem (pode restringir para um domínio específico)
        response.setHeader("Access-Control-Allow-Origin", "*");
        // Métodos permitidos
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        // Headers permitidos
        response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type");
        // Permitir envio de credenciais (cookies, auth)
        response.setHeader("Access-Control-Allow-Credentials", "true");
        // Tempo de cache da preflight request
        response.setHeader("Access-Control-Max-Age", "3600");
        // Se for requisição OPTIONS (preflight), responde direto
        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            return;
        }
        filterChain.doFilter(request, response);
    }
}

