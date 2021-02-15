package com.example.mvpeducamaisspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mvpeducamaisspring.model.Atividade;


@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

}
