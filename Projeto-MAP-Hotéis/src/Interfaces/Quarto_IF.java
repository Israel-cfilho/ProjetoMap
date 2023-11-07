/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import projeto.map.hoteis.Hotel;

public interface Quarto_IF {
    public boolean isReservado(int idQuarto, Hotel hotel);
    public void reservar(int idQuarto, Hotel hotel);
    public void cancelarReserva(int idQuarto, Hotel hotel);
}

