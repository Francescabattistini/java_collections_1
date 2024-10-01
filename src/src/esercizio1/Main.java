package esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
ArrayList<String> arrayParoleScartate =  new ArrayList<String>();
HashSet<String> arrayparole = new HashSet<String>();
     Scanner scanner = new Scanner(System.in);
     try {
             System.out.println("inserisci un numero degli elementi da inserire");
              int numeroElementi = scanner.nextInt();
              scanner.nextLine();
        System.out.println("inserisci " + numeroElementi + "parole da inserire dentro l'array");
        for ( int i = 0; i< numeroElementi ; i++){
            System.out.println("inserisci la parola numero "+ (i+1) );
            String parola = scanner.nextLine();
            if(arrayparole.contains(parola)) {
                System.out.println("questa parola è già presente");
                arrayParoleScartate.add(parola);
            }
            else {
                arrayparole.add(parola);
            }
            System.out.println("le parole inserite sono : " + arrayparole);
            System.out.println("le parole scartate in quanti duplicati sono : " + arrayParoleScartate);

        }

     } catch (Exception e) {
        System.out.println("errore inatteso " + e.getMessage());

    }


}

}
