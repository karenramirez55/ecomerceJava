package com.example.demoJPA.repository;

import com.example.demoJPA.models.Clientes;
import com.example.demoJPA.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Clientes, Long>  {
}

