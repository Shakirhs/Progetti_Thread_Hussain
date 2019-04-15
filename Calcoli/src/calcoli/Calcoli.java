/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoli;

/**
 * il programma assegna un numero variabile di Thread, i quali aggiungono 1 alla variabile globale
 * 
 * @author 77827985
 */
public class Calcoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestCalcoli GC = new GestCalcoli();
        GC.setRisultato(0);
        System.out.println(GC.getRisultato());
        
        for (int i = 0; i < 10; i++) {
            new Thread(new CalcoloEdInserisco(1,GC)).start();
        }
        while(Thread.activeCount()>1)
            System.out.println(Thread.activeCount()); 
        
        System.out.println("Concluso");
        System.out.println(Thread.activeCount());
        System.out.println("Risultato finale: " + GC.getRisultato());
    }
    
}
