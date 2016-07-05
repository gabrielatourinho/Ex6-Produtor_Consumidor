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
        System.out.println("Criando buffer.");
        Buffer buffer =  new Buffer();
        
        System.out.println("Criando writer.");
        Writer writer = new Writer("file.txt",buffer);
        System.out.println("Criando thread writer.");
        Thread w = new Thread(writer);
        System.out.println("Start na thread writer.");
        w.start();
        
        System.out.println("Criando reader 1.");
        Reader c1 = new Reader(buffer, 1);
        System.out.println("Criando thread reader 1.");
        Thread t1 =  new Thread(c1);
        System.out.println("Start na thread 1.");
        t1.start();
        
        
        /*Reader c2 = new Reader(buffer, 2);
        Thread t2 = new Thread(c2);
        t2.start();
        
        Reader c3 = new Reader(buffer, 3);
        Thread t3 = new Thread(c3);
        t3.start();*/
    }
    
}
