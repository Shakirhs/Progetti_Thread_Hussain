/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani2;

/**
 *
 * @author 77827985
 */
public class Nani2 {
    public static void main(String[] args) {
        Thread thr1 = new ContaINani2("Gianluca");
        Thread thr2 = new ContaINani2("Gianluigi");
        thr1.start();
        thr2.start();
    }
}
