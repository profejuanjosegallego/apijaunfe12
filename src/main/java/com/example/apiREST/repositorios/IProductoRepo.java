package com.example.apiREST.repositorios;

import com.example.apiREST.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepo extends JpaRepository<Producto,Integer> {
}
