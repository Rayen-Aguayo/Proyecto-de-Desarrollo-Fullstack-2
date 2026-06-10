package com.example.ms_facturacion.y.presupuesto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_facturacion.y.presupuesto.controller.FacturacionYPresupuesto;

@Repository
public interface FacturacionYPresupuestoRepository extends JpaRepository<FacturacionYPresupuesto, Long>{

}

