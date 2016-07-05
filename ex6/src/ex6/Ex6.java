/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author Gabriela
 */
public class Ex6 {

    public static void main(String[] args) {
        Buffer buffer =  new Buffer();
        
        Writer writer = new Writer("file.txt",buffer);
        
        Reader c1 = new Reader(buffer);
        Thread t1 =  new Thread(c1);
        t1.start();
        
        Reader c2 = new Reader(buffer);
        Thread t2 = new Thread(c2);
        t2.start();
        
        Reader c3 = new Reader(buffer);
        Thread t3 = new Thread(c3);
        t3.start();
    }
    
}
