package com.example.screenmatch_frases.repository;

import com.example.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

  @Query("""
        SELECT f
        FROM Frase f
        ORDER BY FUNCTION('RANDOM')
        LIMIT 1
  """)
  Frase buscarFraseAleatoria();
}