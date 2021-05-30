
import cajero.Cuenta;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joan
 */
public class CajeroJUnitTest {

    Cuenta cuenta;

    @Before
    public void before() {
        cuenta = new Cuenta("Antonio Palacios", "2564-1265-86-111111111", 5000);
        System.out.println("before");
    }
    
    @Test
    public void testIngresar() throws Exception {
        System.out.println("Ingreso");
        int ingreso=5;
        
        double antes=cuenta.estado();
        System.out.println("Antes: "+antes);
        cuenta.ingresar(ingreso);
        double saldo=cuenta.estado();
        System.out.println("Despues: "+saldo);
        
        assertTrue(antes+ingreso==saldo);
    }
    
    @Test
    public void testRetirar() throws Exception {
         System.out.println("Retirar");
         int retirar=5;
         
        double antes=cuenta.estado();
        System.out.println("Antes: "+antes);
        cuenta.retirar(retirar);
        double saldo=cuenta.estado();
        System.out.println("Despues: "+saldo);
        
        assertTrue(antes-retirar==saldo);
    }

    @Test
    public void testIngresarLetra() throws Exception {
        System.out.println("Ingreso Letra");
        char ingreso='j';
        
        double antesIngreso = cuenta.estado();
        System.out.println("Antes: "+antesIngreso);
        cuenta.ingresar(ingreso);
        double despuesIngreso = cuenta.estado();
        System.out.println("Despues: "+despuesIngreso);

        assertTrue(antesIngreso - despuesIngreso == 0);
    }

    @Test
    public void testRetirarLetra() throws Exception {
        System.out.println("Retirar Letra");
        char ingreso='j';
        
        double antesIngreso = cuenta.estado();
        System.out.println("Antes: "+antesIngreso);
        cuenta.retirar(ingreso);
        double despuesIngreso = cuenta.estado();
        System.out.println("Despues: "+despuesIngreso);

        assertTrue(antesIngreso - despuesIngreso == 0);
    }

    @Test
    public void testRetirarDemasiado() throws Exception {
        System.out.println("Retirar Demasiado");
        double retirar=5000.1;
        
        double antesIngreso = cuenta.estado();
        System.out.println("Antes: "+antesIngreso);
        cuenta.retirar(retirar);
        double despuesIngreso = cuenta.estado();
        System.out.println("Despues: "+despuesIngreso);

        assertTrue(despuesIngreso>= 0);
    }

}
