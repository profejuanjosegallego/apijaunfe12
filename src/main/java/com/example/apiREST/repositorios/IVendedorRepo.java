package com.example.apiREST.repositorios;

import com.example.apiREST.modelos.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVendedorRepo extends JpaRepository<Vendedor,Integer> {
}
