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
public class Comercial extends Vehiculo{

    String Carga_maxima;

    public Comercial(String Placa, String Tipo, String Velocidad, String Pasajeros, String Carga_maxima){

        super(Placa,Tipo,Pasajeros,Velocidad);
        this.Carga_maxima=Carga_maxima;
    }

    @override
    public String toString(){
        String salida = "\t Vehiculo Comercial - Placa: "+ this.Placa+"\n"
        +"\t Velocidad: " + this.Velocidad + "km/h" + "\n"
        +"\t Tipo: " + this.Tipo + "\n"
        +"\t Pasajeros: " + this.Pasajeros + "\n" 
        +"\t Carga maxima: " + this.Carga_maxima + "\n"

        return salida;
    }
    
}
