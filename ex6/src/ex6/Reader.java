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
    int id;
    
    public void run(){
        char x;
        try {
            System.out.println("Try "+id);
            while ((x = b.get()) != '\032')
                System.out.println("Cliente "+id+" lendo: "+x);
        } catch (InterruptedException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Exception na thread "+id);
        }
    }
    
    Reader(Buffer b, int id){
        this.b = b;
        this.id = id;
    }
}
