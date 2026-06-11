package com.example.ms_paciente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ms_paciente.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, String> {

}
