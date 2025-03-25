package com.example.apiREST.servicios;

import com.example.apiREST.modelos.Producto;
import com.example.apiREST.repositorios.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

    @Autowired
    IProductoRepo repositorio;

    public Producto guardar(Producto datos){
        return repositorio.save(datos);
    }


}
