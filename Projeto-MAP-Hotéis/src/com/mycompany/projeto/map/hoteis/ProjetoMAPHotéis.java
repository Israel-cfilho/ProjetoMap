package com.mycompany.projeto.map.hoteis;


public class ProjetoMAPHotéis {

    
    public static void main(String[] args) {
    	// Criação de instâncias de hotéis e quartos
        Hotel hotel1 = new Hotel(1,"Hotel A","3","999912744");
        Hotel hotel2 = new Hotel(2,"Hotel B","3","999917567");

        // Registro dos hotéis no HotelGerente
        HotelGerente hotelGerente = HotelGerente.getInstance();
        hotelGerente.cadastrarHotel(hotel1);
        hotelGerente.cadastrarHotel(hotel2);
        
        //Registrar quartos utilizando o HotelGerente para criar os quartos
        Quarto quarto1 = hotelGerente.criarQuartoHotel(101,"1",100);
        Quarto quarto2 = hotelGerente.criarQuartoHotel(102,"1",100);
        Quarto quarto3 = hotelGerente.criarQuartoHotel(201,"1",300);
        Quarto quarto4 = hotelGerente.criarQuartoHotel(202,"1",200);
        hotel1.adicionarQuarto(quarto1);
        hotel1.adicionarQuarto(quarto2);
        hotel2.adicionarQuarto(quarto3);
        hotel2.adicionarQuarto(quarto4);
        
        hotelGerente.hoteisDisponiveis();
        hotelGerente.quartosDisponiveisDeHotel(hotel1);
        hotelGerente.quartosDisponiveisDeHotel(hotel2);
        
        hotelGerente.reservarQuarto(quarto3, hotel2);
        hotelGerente.quartosDisponiveisDeHotel(hotel2);
        hotelGerente.CancelarReservarQuarto(quarto3, hotel2);
        hotelGerente.quartosDisponiveisDeHotel(hotel2);
    }
    
}
