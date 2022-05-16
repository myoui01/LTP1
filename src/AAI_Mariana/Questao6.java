package AAI_Mariana;
import java.util.Scanner; 

public class Questao6 {

	public static void main(String[] args) {
	int n1, n2, n3, media;
	Scanner input = new Scanner (System.in);
	System.out.println("Digite os valores das provas: ");
	n1 = input.nextInt();
	n2 = input.nextInt();
	n3 = input.nextInt();
	
	media =  (n1+n2+n3/3);
	System.out.println(media);
	
	if (n1 < 6) {
		System.out.println("Aluno 1 reprovado!");
	}
	
	if (n2 < 6) {
		System.out.println("Aluno 2 reprovado!");
	}
	
	if (n3 < 6) {
		System.out.println("Aluno 3 reprovado!");
	}


	}

}