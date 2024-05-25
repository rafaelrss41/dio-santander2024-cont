import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu 1º número positivo:");
        int n1 = sc.nextInt();


        System.out.println("Digite seu 1º número positivo:");
         int n2 = sc.nextInt();

        System.out.println("Seus numeros: " + n1 + " e " + n2);

        try{
            analyseNumbers(n1, n2);
        }catch(NumberErrException e ){
            System.out.println("Seu primeiro numero não  pode ser maior que o segundo.");
        }

    }

   static void analyseNumbers( int n1, int n2) throws NumberErrException{


       if(n1 > n2){
            throw new NumberErrException("");
        }
       int cont = n2 - n1;
       System.out.println("Imprimindo iterações do primeiro até o segundo número");
       for(int i=0; i<cont; i++){

           System.out.println(n1 + i);
       }
    }

}