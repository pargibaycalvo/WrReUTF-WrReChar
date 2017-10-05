/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveutfchars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle PED90
 */
public class texto {
    
    File directorio = new File("/home/oracle/NetBeansProjects/primitiveUTFChars/archivos");
    File archivo = new File("/home/oracle/NetBeansProjects/primitiveUTFChars/archivos/texto4.txt");
    
    public void carpeta(){
        
        if(directorio.exists())
            System.out.println("Directorio existente "+directorio.getPath());
        else
            directorio.mkdir();
    }
    
    public void archivo() throws IOException{
        
        if(archivo.exists())
            System.out.println("Archivo de texto existente "+archivo.getPath());
        else
            archivo.createNewFile();

    }
    
    public void escritura(String cadea) throws FileNotFoundException, IOException{
        DataOutputStream grabar = new DataOutputStream (new BufferedOutputStream(new FileOutputStream(archivo)));

            grabar.writeUTF(cadea);
            System.out.println("writeUTF escribiu: "+cadea);
            System.out.println("writeUTF escribiu: "+cadea.length()+"bytes");
        
            grabar.writeChars(cadea);
            System.out.println("writeChars escribiu: "+cadea);
            System.out.println("writeChars escribiu: "+cadea.length()+"bytes");
            
            grabar.writeUTF(cadea);
            System.out.println("writeUTF escribiu: "+cadea);
            System.out.println("writeUTF escribiu: "+cadea.length()+"bytes");
        
            
        System.out.println("Bytes totais escritos: "+grabar.size()+"bytes");
        grabar.close();
        System.out.println("");
    }
    
    public void lecturachar() throws FileNotFoundException, IOException{
        int numerocad=0;
        DataInputStream lectura = new DataInputStream (new BufferedInputStream(new FileInputStream(archivo)));
        numerocad=lectura.available();
        int ch=lectura.read();
        char chr;
        
            while(ch!=-1){
            chr=(char)ch;
            System.out.println(chr);
            ch=lectura.read();
            }
            System.out.println("Bytes totais lidos: "+(numerocad-lectura.available()+"bytes"));
            System.out.println("Numero de bytes por ler = "+lectura.available());
            System.out.println("Esta e a segunda cadea: "+lectura.readLine());
    
    //Este método abre el fichero completo y lee los UTF y los Chars, con lo cual al mostrar el número de bytes que quedan 
    //por leer el resultado es 0 y las lineas que quedan por leer será null.
            
    }
    
}
            


