package AAI_Mariana;
import java.util.Scanner; 

public class Questao9 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int caso = 0, n1, n2, aux;
        System.out.println("Digite dois números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        System.out.println("1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão, 5 - sair");
        caso = input.nextInt();

        switch (caso) {
  
            case 1:
            	aux = n1 + n2;
                System.out.println(aux);
                break; 
            
            case 2:
            	aux = n1 - n2;
                System.out.println(aux);
                break;

            case 3: 
            	aux = n1 * n2;
                System.out.println(aux);
                break;


            case 4: 
            	aux = n1/n2;
                System.out.println(aux);
                break;
                

            case 5: 
                System.out.println("Tchau");
                break;

            default: 
                System.out.println("Valor não encontrado no menu");

        }
    }
	}