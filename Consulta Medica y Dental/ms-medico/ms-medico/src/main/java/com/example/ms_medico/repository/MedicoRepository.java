package com.example.ms_medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_medico.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, String>{

}
