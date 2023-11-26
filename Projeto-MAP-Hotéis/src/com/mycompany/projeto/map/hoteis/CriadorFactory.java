package com.mycompany.projeto.map.hoteis;
import Interfaces.Factory_IF;
//CRIADOR BASE
public abstract class CriadorFactory{

  public Quarto criarQuarto(int numero, String classificacao, float preco) {
      return new Quarto(numero,classificacao, preco);
  }
  public abstract Factory_IF criarLocalDeAluguel(int numero, String classificacao, float preço);
  
}
