/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.io.FileInputStream;

/**
 *
 * @author Gabriela
 */
public class Writer implements Runnable {
    Buffer b;
    FileInputStream fs;
    
    public void run() {
        int x;
        try {
            while ((x = fs.read()) != -1)
                b.put((char) x);
            b.put('\032');
        } catch (Exception e) {
            System.err.println("Cannot read");
            System.exit(1);
        }
    }
    
    Writer (String fname, Buffer b) {
        this.b = b;
        try {
            fs =  new FileInputStream(fname);
        } catch (Exception e) {
            fs = null;
            System.err.println("Cannot open "+fname);
            System.exit(1);
        }
    }
}
