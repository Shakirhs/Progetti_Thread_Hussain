/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din_don;

/**
 *
 * @author 77827985
 */
public class Campana implements Runnable {
    
    String suono;
    int volte;
    
    public Campana(String suono, int volte){
        this.suono=suono;
        this.volte=volte;
    }
    // stampa il numero di volte che la campana deve suonare
    public void run (){
        for (int k=0; k< volte; k++){
            System.out.print((k+1)+suono+" ");
        }
    }
}
