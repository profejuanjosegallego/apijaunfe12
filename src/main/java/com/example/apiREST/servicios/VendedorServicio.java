package com.example.apiREST.servicios;

import com.example.apiREST.modelos.Vendedor;
import com.example.apiREST.repositorios.IVendedorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorServicio {

    @Autowired
    IVendedorRepo repositorio;

    public Vendedor  guardar(Vendedor datos){
        return repositorio.save(datos);
    }

}
