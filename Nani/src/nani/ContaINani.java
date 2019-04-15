/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 *
 * @author 77827985
 */
public class ContaINani extends Thread{
    public void run(){
        setName("sette nani");
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 7; i++) {
            System.out.println((i+1) + " ");
        }
    }
}
