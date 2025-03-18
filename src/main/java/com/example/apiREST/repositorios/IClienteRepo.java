package com.example.apiREST.repositorios;

import com.example.apiREST.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepo extends JpaRepository<Cliente,Integer> {
}
