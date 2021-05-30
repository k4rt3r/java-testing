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
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Cuenta miCuenta = new Cuenta("Miquel Torres","2564-1265-86-111111111",5000);
        
        //Pruebas método ingresar
        try{
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar('j');
        }catch (Exception e){
            System.err.println(e.getMessage());
            System.out.println("Error al ingresar");
        }
        
        //Pruebas método retirar
        try{
            System.out.println("Sacando dinero de la cuenta");
            //miCuenta.retirar(x);
        }catch (Exception e){
            System.err.println(e.getMessage());
            System.out.println("Error al retirar");
        }
        
        System.out.println("El saldo actual es " + miCuenta.estado() );
    }

}
