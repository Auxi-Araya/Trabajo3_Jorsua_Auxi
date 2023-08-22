/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteA;

/**
 *
 * @author Usuario
 */
public class Pet {
    private String Type;
    private String weight;
    private String generalDescription;

    //constructor lleno
    public Pet(String Type, String weight, String generalDescription) {
    this.Type = Type;
    this.weight = weight;
    this.generalDescription = generalDescription;
    }


    //constructor vacio
    public Pet() {
    Type = "";
    weight = "";
    generalDescription = "";
    }


    //getter y setters

     public String getType() {
    return Type;
    }

 

    public void setType(String Type) {
    this.Type = Type;
    }

 

    public String getWeight() {
    return weight;
    }

 

    public void setWeight(String weight) {
    this.weight = weight;
    }

 

    public String getGeneralDescription() {
    return generalDescription;
    }

 

    public void setGeneralDescription(String generalDescription) {
    this.generalDescription = generalDescription;
    }


     public void ShowPetInfo(String Type,String weight,String generalDescription){

    //Mostrar la informacion del vehiculo:


    System.out.println("Informacion general de la mascota: \nTipo: "+Type+"\nPeso: "+weight+"\nDescripcion general: "+generalDescription);



    }
}
