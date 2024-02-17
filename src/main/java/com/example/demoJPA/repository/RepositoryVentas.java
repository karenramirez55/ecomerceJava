package com.example.demoJPA.repository;

import com.example.demoJPA.models.Productos;
import com.example.demoJPA.models.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryVentas  extends  JpaRepository <Ventas, Long>{
}

