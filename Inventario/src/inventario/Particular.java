/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author usuario
 */
public class Particular extends Vehiculo{

    
    String Color;

    public Comercial(String Placa, String Tipo, String Velocidad, String Pasajeros, String Color){

        super(Placa,Tipo,Pasajeros,Velocidad);
        this.Color=Color;
    }

    @override
    public String toString(){
        String salida = "\t Vehiculo Comercial - Placa: "+ this.Placa+"\n"
        +"\t Velocidad: " + this.Velocidad + "km/h" + "\n"
        +"\t Tipo: " + this.Tipo + "\n"
        +"\t Pasajeros: " + this.Pasajeros + "\n" 
        +"\t Color: " + this.Color + "\n"

    }
    
}
