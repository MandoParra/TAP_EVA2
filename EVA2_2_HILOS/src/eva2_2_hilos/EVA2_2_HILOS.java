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
public class EVA2_2_HILOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                //Cualquier tarea que se quiera ejecutar sistematicamente
                //No necesariamente de duracion infinita
                for(int i= 0; i<10; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EVA2_2_HILOS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        //RUNNABLE no se ejecuta directamente
        //Se debe ejecutar a traves de un THREAD
        Thread thread = new Thread(runnable);
        thread.start();//Inicio del HILO
        //-----------------------------------------------
        miHilo miHilo = new miHilo();
        miHilo.start();//Inicia el hilo
    }
}
