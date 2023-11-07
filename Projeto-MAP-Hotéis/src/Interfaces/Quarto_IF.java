package Interfaces;

import com.mycompany.projeto.map.hoteis.Hotel;

public interface Quarto_IF {
    public boolean isReservado(int idQuarto, Hotel hotel);
    public void reservar(int idQuarto, Hotel hotel);
    public void cancelarReserva(int idQuarto, Hotel hotel);
}

