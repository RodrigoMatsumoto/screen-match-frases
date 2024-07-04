package com.example.screenmatch_frases.service;

import com.example.screenmatch_frases.dto.FraseDTO;
import com.example.screenmatch_frases.model.Frase;
import com.example.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

  @Autowired
  private FraseRepository fraseRepository;

  public FraseDTO obterFraseAleatoria() {
    Frase frase = fraseRepository.buscarFraseAleatoria();
    return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
  }
}