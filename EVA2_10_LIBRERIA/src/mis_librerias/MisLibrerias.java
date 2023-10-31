/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mis_librerias;

/**
 *
 * @author MANUEL FERNANDO PARR GONZALEZ 22550032 30/10/2023
 */
public class MisLibrerias {
    
    public static int calcuFacto(int valor) {
        int facto = 1;
        for (int i = 1; i <= valor; i++) {
            facto*=i;
        }
        return facto;
    }
}
