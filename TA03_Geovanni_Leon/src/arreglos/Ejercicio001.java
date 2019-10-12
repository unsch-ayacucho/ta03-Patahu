
package arreglos;

import javax.swing.JOptionPane;


public class Ejercicio001 {
    public static void main(String[] args) {
            int cambiar;
            int cambiado;
            int[ ] listaAleatorios=new int[100]; 
            for(int i=0;i<100;i++){
                listaAleatorios[i]=(int)(Math.random()*20+1);
            }
           cambiado=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero por cambiar"));
           cambiar=Integer.parseInt(JOptionPane.showInputDialog(null,"numero"));
           
           System.out.println("--------------------------------");
           for(int a=0;a<100;a++){

               if(listaAleatorios[a]==cambiado){
                    System.out.println("numero a cambiar : "+listaAleatorios[a]+" por "+cambiar);
                    listaAleatorios[a]=cambiar;
               }

            }
           String nums="";
            for(int b=0;b<100;b++){
                
                if(listaAleatorios[b]==cambiar){
                    nums+=" \" "+listaAleatorios[b]+" \"";

                }
                else
                    nums+=" "+listaAleatorios[b]+" ";
            }
            System.out.println(nums);
    }
    
}


