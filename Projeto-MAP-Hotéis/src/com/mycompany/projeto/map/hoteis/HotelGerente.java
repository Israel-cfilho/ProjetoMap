package com.mycompany.projeto.map.hoteis;

import Interfaces.HotelGerente_IF;
import java.util.ArrayList;
import java.util.List;

public class HotelGerente implements HotelGerente_IF{
    
    private static HotelGerente instance;
    final List<Hotel> hoteis;
    private final QuartoCriador quartoFactory; // Usar a fábrica para criar quartos
    
    private HotelGerente() {
        hoteis = new ArrayList<>();
        quartoFactory = new QuartoCriador(); // Inicialização da fábrica de quartos
    }

    // Criando instância única (Padrão Singleton)
    public static HotelGerente getInstance() {
        if (instance == null) {
            instance = new HotelGerente();
        }
        return instance;
    }

    //Acessa os quartos por hotel
    public Quarto criarQuartoHotel(int numero, String classificacao, float preco) {
        return (Quarto) quartoFactory.criarLocalDeAluguel(numero,classificacao,preco);
    }
    
    public void quartosDisponiveisDeHotel(Hotel HotelRecebido) {
        for (Hotel hotel : hoteis) {
            if (hotel.getIdHotel()== HotelRecebido.getIdHotel()) {
                hotel.getQuartosDisponiveis(HotelRecebido);
                return;
            }
        }
    }

     public void removerQuartoHotel(int idQuarto, Hotel hotel) {
        hotel.removerQuarto(idQuarto, hotel);
     }
     
     public void reservarQuarto(Quarto quarto, Hotel hotel){
         quarto.reservar(quarto.getNumero(), hotel);
     }
    public void CancelarReservarQuarto(Quarto quarto, Hotel hotel){
         quarto.cancelarReserva(quarto.getNumero(), hotel);
     }
     
     
    //Gerenciar Hotel
    @Override
    public void cadastrarHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    @Override
    public void editarHotel(Hotel hotel) {
    }

    @Override
    public void removerHotel(Hotel hotel) {
        if(hotel.isEmpty(hotel.getIdHotel())){
            hotel.setQuartos(null);
        }
        for (Hotel hotelSelecionado : hoteis) {
            if(hotelSelecionado.getIdHotel() == hotel.getIdHotel()){
                hoteis.remove(hotelSelecionado);
                System.out.println("Hotel removido");
                return;
            }
        }
        System.out.println("Hotel não encontrao");
    }
    
    @Override
    public void hoteisDisponiveis() {
        for (Hotel hotel : hoteis) {
            System.out.println(hotel.getNome());
        } 
    }
}
