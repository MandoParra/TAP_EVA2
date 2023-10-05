/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel Fernando Parra Gonzalez 22550032 04/10/2023
 */
public class miHilo extends Thread {

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        //Aqui va el codigo que quieren ejecutar simultaneamente(multitarea)
        for(int i= 0; i<10;i++){
            try {
                Thread.sleep(2000);
                System.out.println("Clase thread" + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(miHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
