package com.mycompany.projeto.map.hoteis;

import java.util.ArrayList;
import java.util.List;

public class Hotel{
    
    private int idHotel;
    private String nome;
    private String classificacao;
    private String telefone;
    private List<Quarto> quartos;

    public Hotel(int idHotel, String nome, String classificacao, String telefone) {
        this.idHotel = idHotel;
        this.nome = nome;
        this.classificacao = classificacao;
        this.telefone = telefone;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void getQuartosDisponiveis(Hotel hotel) {
        for (Quarto quarto : hotel.quartos) {
            if (!quarto.isReservado(quarto.getNumero(),hotel)) {
                System.out.println(quarto.getNumero());
            }
        }
    }
    
    public void removerQuarto(int idQuarto, Hotel hotel) {
         if(hotel.isEmpty(hotel.getIdHotel())){
             System.out.println("Quarto não existente");
             return;
         }
            for (Quarto quartoSelecionado : hotel.getQuartos()) {
               if(quartoSelecionado.getNumero() == idQuarto){
                   hotel.getQuartos().remove(quartoSelecionado);
                   System.out.println("Quarto removido");
                   return;
               }
           }
        System.out.println("Quarto não encontrado");
     }
    
    public boolean isEmpty(int idHotel){
        return idHotel == -1;
    }
    
    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
