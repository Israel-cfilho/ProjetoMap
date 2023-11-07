package Interfaces;

import projeto.map.hoteis.Hotel;

public interface HotelGerente_IF {
    public void cadastrarHotel(Hotel hotel);
    public void editarHotel(Hotel hotel);
    public void removerHotel(Hotel hotel);
    public void hoteisDisponiveis();
}
