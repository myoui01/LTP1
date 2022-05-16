package AAI_Mariana;
import java.util.Scanner; 

public class Questao5 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Digite uma lerta: ");
	String letra = input.nextLine();

	
	
	if (letra == "A" && letra =="E" && letra =="I" && letra =="O" && letra =="U") {
		System.out.println("Vogal");
	}
	
	System.out.println("Consoante");

	}

}