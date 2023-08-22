/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteA;

/**
 *
 * @author Usuario
 */
public class Vehicle {
    //creacion de los atributos
    private String placa;
    private String marca;
    private String color;
    //----------------------------------


    //constructor lleno
    public Vehicle(String placa, String marca, String color) {
    this.placa = placa;
    this.marca = marca;
    this.color = color;
    }
    //-------------------------------------------------------------


    //constructor vacio
public Vehicle() {
    placa = "";
    marca = "";
    color = "";
    }


//-------------------------------------------------------------------------

//metodos GET Y SET
    public String getPlaca() {
    return placa;
    }

 

    public void setPlaca(String placa) {
    this.placa = placa;
    }

 

    public String getMarca() {
    return marca;
    }

 

    public void setMarca(String marca) {
    this.marca = marca;
    }

 

    public String getColor() {
    return color;
    }

 

    public void setColor(String color) {
    this.color = color;
    }
    //------------------------------------------------------------
}
