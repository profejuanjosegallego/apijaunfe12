package com.example.apiREST.servicios;

import com.example.apiREST.modelos.Cliente;
import com.example.apiREST.repositorios.IClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio {

    @Autowired
    IClienteRepo repositorio;

    //guardar
    public Cliente guardar(Cliente datos){
        return repositorio.save(datos);
    }

    //buscar
    public List<Cliente> buscar(){
        return repositorio.findAll();
    }

    //editar
    public Cliente editar(Cliente datos){
        if(datos.getId()==1){
            return repositorio.save(datos);
        }else{
            return null;
        }
    }

    //eliminar
    public Boolean eliminar(Integer id){
        if(id==1){
            repositorio.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

}
