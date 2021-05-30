/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author jserrano
 */
public class Cuenta {
     
    private String nom;
    private String cuenta;
    private double saldo;

    public Cuenta (String nom, String cuenta, double saldo){
        this.nom    = nom;
        this.cuenta = cuenta;
        this.saldo  = saldo;
    }

    public void asignarNombre(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

     public double estado(){
        return saldo;
    }

    public String obtenerCuenta(){
        return cuenta;
    }
    
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar (double cantidad) throws Exception{
        if (cantidad < 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        saldo = saldo - cantidad;
    }


}
