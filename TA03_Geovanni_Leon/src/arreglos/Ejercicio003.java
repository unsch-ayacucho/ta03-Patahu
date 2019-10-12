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
public class Ejercicio003 {
    public static void main(String[] args) {
        int maximo=0;
        int minimo=0;
        int numero=0;
        String resaltado;
        int[ ] listaAleatorios=new int[500]; 
        for(int i=0;i<500;i++){
            numero=(int)(Math.random()*100+1);
            listaAleatorios[i]=numero;
            if(maximo==0 && minimo==0){
                maximo=numero;
                minimo=numero;
            }
            else if(maximo <= numero){
                maximo=numero;
            }
            else if(minimo>=numero){
                minimo=numero;
            }
        }
        System.out.println("Maximo :"+maximo+" Minimo: "+minimo);
        resaltado=JOptionPane.showInputDialog(null,"desea resaltar el maximo y minimo ?? si/no");
        String mostra="";
        if(resaltado.equals("si")){
             for(int a=0;a<500;a++){

                 if(listaAleatorios[a]==maximo || listaAleatorios[a]==minimo ){
                     mostra+="xx"+listaAleatorios[a]+"xx";
                 }
                 else
                    mostra+=" "+listaAleatorios[a]+" ";
             }
        }
        System.out.println(mostra);
   }
    
}
