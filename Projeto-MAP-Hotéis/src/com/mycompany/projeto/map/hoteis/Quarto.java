package com.mycompany.projeto.map.hoteis;

import Interfaces.Factory_IF;

public class Quarto implements Factory_IF {
    private int numero;
    private String classificacao;
    private float preço;
    private boolean reservado;

    public Quarto(int numero, String classificacao, float preço) {
        this.numero = numero;
        this.classificacao = classificacao;
        this.preço = preço;
        this.reservado = false;
    }
    
    @Override
    public boolean isReservado(int idQuarto, Hotel hotel) {
         if(hotel.isEmpty(hotel.getIdHotel())){
             return false;
         }
            for (Quarto quartoSelecionado : hotel.getQuartos()) {
               if(quartoSelecionado.getNumero() == idQuarto && quartoSelecionado.reservado == true){
                   return true;
               }
           }
        return false;
    }

    @Override
    public void reservar(int idQuarto, Hotel hotel) {
          System.out.println("\n");
          if(hotel.isEmpty(hotel.getIdHotel())){
             System.out.println("Quarto não existente");
             return;
         }
            for (Quarto quartoSelecionado : hotel.getQuartos()) {
               if(quartoSelecionado.getNumero() == idQuarto){
                   reservado = true;
                   System.out.println("Quarto "+idQuarto+" reservado no hotel "+hotel.getNome());
                   return;
               }
           }
        System.out.println("Quarto não encontrado");
        
    }

    @Override
    public void cancelarReserva(int idQuarto, Hotel hotel) {
        if(hotel.isEmpty(hotel.getIdHotel())){
           System.out.println("Quarto não existente");
           return;
       }
          for (Quarto quartoSelecionado : hotel.getQuartos()) {
              System.out.println("\n");
             if(quartoSelecionado.getNumero() == idQuarto && reservado == true){
                 reservado = false;
                 System.out.println("Quarto "+idQuarto+" reservado no hotel "+hotel.getNome()+" foi cancelado");
                 return;
             }
         }
        System.out.println("Quarto não encontrado");
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }     


}
