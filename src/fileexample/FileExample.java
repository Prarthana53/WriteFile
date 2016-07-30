/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;



import java.io.FileOutputStream;

import java.io.IOException;


/**
 *
 * @author Pavilion G4
 */
public class FileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       try{
           
           String writer=new String("C:\\Users\\Pavilion G4\\Desktop\\output\\output.txt");
           String bytes="Hello! We are writing to the file............";
           byte[] buffer=bytes.getBytes();
           
           FileOutputStream os=new FileOutputStream(writer);
        
           
           os.write(buffer);
          os.close();
           System.out.println("\n"+"Wrote "+buffer.length+" bytes.");
           
           
       }catch(IOException ioe){
           System.out.println(ioe.getMessage());
       
       
       
       }
        
    }
    
}
