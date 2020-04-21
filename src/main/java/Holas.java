import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean bandera=false;
        
        System.out.println("Detecta caracter 'x' ");
        System.out.print("Inserta palabra: ");
        String frase=sc.nextLine();
        
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) == 'x' || frase.charAt(i) == 'X'){
                bandera=true;
                break;
            }
            else{
                bandera=false;
                break;
            }
        }
        if(bandera==true){
            System.out.println("Palabra con 'x' encontrada: "+frase);
        }
        else{
            System.out.println("Palabra con 'x' no encontrada: "+frase);
        }       
    }
}