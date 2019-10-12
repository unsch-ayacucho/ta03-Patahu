/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author patro
 */
public class Ejercicio002 {public static void main(String[] args) {
        int pivote=0;
        Impar imp;
        int numero;
        int[ ] lista=new int[10]; 
        for(int i=0;i<10;i++){
            lista[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Numero"));

        }
        for(int a=0;a<10;a++){
            System.out.println("  "+ lista[a]);
            System.out.println("  ");
        }
        for(int b=0;b<10;b++){
            numero=lista[b];
            imp=new Impar(numero);
            if(imp.darImpar()){
                numero=lista[pivote];
                lista[pivote]=lista[b];
                lista[b]=numero;
                pivote++;
            }
        }
        System.out.println("Lista ordenada de acuerdo al ejercicio");
        for(int c=0;c<10;c++){
            System.out.println(lista[c]);
        }
        
    }
}

class Impar{
    private int numero;
    private int contador=0;
    Impar(int numero){
        this.numero=numero;
    }
    public boolean darImpar(){
        for(int i=1;i<=this.numero;i++){
            if(this.numero%i==0){
                this.contador++;
            }
        }
         if(this.contador==2){
             return true;
         }
         else
             return false;
    }
}
