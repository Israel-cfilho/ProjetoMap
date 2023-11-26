package com.mycompany.projeto.map.hoteis;

//classe CRIADOR CONCRETO, seguindo padrão factory

import Interfaces.Factory_IF; 

public class QuartoCriador extends CriadorFactory {
      @Override
    public Factory_IF criarLocalDeAluguel(int numero, String classificacao, float preço) {
        return new Quarto(numero,classificacao,preço);
    }
    
}

