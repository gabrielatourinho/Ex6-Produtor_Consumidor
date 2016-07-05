/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriela
 */
public class Reader implements Runnable {
    Buffer b;
    
    public void run(){
        char x;
        try {
            while ((x = b.get()) != '\032')
                System.out.print(x);
        } catch (InterruptedException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Reader(Buffer b){
        this.b = b;
    }
}
