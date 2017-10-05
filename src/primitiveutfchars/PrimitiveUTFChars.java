/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveutfchars;

import java.io.IOException;

/**
 *
 * @author oracle
 */
public class PrimitiveUTFChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         texto txt = new texto();
        txt.carpeta();
        txt.archivo();
        txt.escritura("Esta e unha cadea \n");
        txt.lecturachar();



    }
    
}
