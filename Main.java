package primeiroJava;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//-----------------------------------------------------------------------------------
		// Variáveis
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 5800.5;
		altura = 1.72;
		genero = 'F';
		nome = "Maria Silva";

		//-----------------------------------------------------------------------------------
		// Saída de dados
		System.out.println("Idade = " + idade);
		// Formatando pra sair com 2 casas decimais
		System.out.println("Salario = " + String.format("%.2f", salario));
		System.out.println("Altura = " + String.format("%.2f",altura));
		System.out.println("Genero = " + genero);
		System.out.println("Nome = " + nome);
		
		//-----------------------------------------------------------------------------------
		// Casting
		int a,b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double)a / b; // Necessário o (double) para a divisão ñ ser inteira
		System.out.println("Resultado é " + resultado);

		//-----------------------------------------------------------------------------------
		//Entrada de dados
		String nome1,nome2;
		double salario1,salario2;
		int idade1,idade2;
		char sexo1,sexo2;
		
		System.out.println("Digite o primeiro nome:");
		nome1 = sc.nextLine();
		System.out.println("Digite o primeiro salário:");
		salario1 = sc.nextDouble();
		System.out.println("Digite a primeira idade:");
		idade1 = sc.nextInt();
		System.out.println("Digite o primeiro sexo:");
		sexo1 = sc.next().charAt(0);
		
		System.out.println("Digite o segundo nome:");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.println("Digite o segundo salário:");
		salario2 = sc.nextDouble();
		System.out.println("Digite a segunda idade:");
		idade2 = sc.nextInt();
		System.out.println("Digite o segundo sexo:");
		sexo2 = sc.next().charAt(0);
		
		System.out.println(nome1 + ", sexo " + sexo1 + " idade " + idade1 +" tem o salário de " + String.format("%.2f",salario1));
		System.out.println(nome2 + ", sexo " + sexo2 + " idade " + idade2 +" tem o salário de " + String.format("%.2f",salario2));

		//-----------------------------------------------------------------------------------
		//Estruturas de Controle:
		
        int horaDigitada;
        System.out.println("Digite a hora: ");
        horaDigitada = sc.nextInt();
        
        System.out.println("");
        System.out.println("IF");
        if (horaDigitada == 1) {
            System.out.println("Boa noite!");
        }

        // IF ELSE
        System.out.println("");
        System.out.println("IF ELSE IF");
        if (horaDigitada < 6) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Bom dia!");
        }

        // IF ELSE IF
        System.out.println("");
        System.out.println("IF ELSE");
        if (horaDigitada >= 4 && horaDigitada <= 12) {
            System.out.println("Bom dia!");
        } else if (horaDigitada > 12 && horaDigitada < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        
     // WHILE
        System.out.println("");
        System.out.println("while");
        while (horaDigitada < 18) {
            System.out.println("Bom dia!");
            horaDigitada++;
        }

        // FOR
        System.out.println("");
        System.out.println("for");
        for (horaDigitada = 15; horaDigitada < 18; horaDigitada++) {
            System.out.println("Bom dia!");
        }

        // DO WHILE
        System.out.println("");
        System.out.println("do while");
        horaDigitada = 15;
        do {
            System.out.println("Bom dia!");
            horaDigitada++;
        } while (horaDigitada < 18);
        
        //-----------------------------------------------------------------------------------
        //Vetores
        int N;
        System.out.println("Quantos números vc vai digitar?!");
        N = sc.nextInt();
        
        double[] vet = new double[N]; //cria o vetor
        
        for (int i = 0; i < N; i++) {
        	System.out.println("Digite um número");
        	vet[i] = sc.nextDouble();
        }
        
        System.out.println("Números digitados:");
        for (int i = 0; i < N; i++) {
        	System.out.println(vet[i]);
        }
	}
}
