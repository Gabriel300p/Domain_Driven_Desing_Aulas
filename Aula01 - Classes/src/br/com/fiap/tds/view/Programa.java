package br.com.fiap.tds.view;

public class Programa {
	
	public static void main(String[] args) {
		
		//Declara��o de duas vari�veis
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x + y;
		
		//Exibir o resultado da soma
		System.out.println(soma);
		
		//Realizar a subtra��o
		int subtracao = x - y;
		
		//Exibir o resultado da subtra��o
		System.out.println("A sua subtra��o �: " + subtracao);
		
		//Realizar a multiplica��o
		int multiplicacao = x * y;
		
		//Exeibir o resultado da multiplica��o
		System.out.println("A sua multiplica��o �: " + multiplicacao);
		
		//Realizar a divis�o
		int divisao = x / y;
		
		//Exibir o resultado da divis�o
		System.out.println("A sua divis�o �: " + divisao);
		
		//Obter o resto da divis�o
		int resto = x % y;
		
		//Exibir o resto da divis�o
		System.out.println("O resto �: " + resto);
		
		//Incremento
		x++; //incrementar em 1 unidade -> x = x + 1;
		System.out.println("Incremento: " + x);
		
		//Decremento
		x--; //retira 1 unidade -> x = x - 1:
		System.out.println("Decremento: " + x);
		
		//Adi��o aditiva
		x += 2; // x = x + 2
		System.out.println("Adi��o aditiva: " + x);
		
		//Adi��o subtrativa
		x -= 2; // x = x - 2
		System.out.println("Adi��o Subtrativa: " + x);
		
		//Atribui��o multiplicativa
		x *= y;
		System.out.println("Atribui��o multiplicativa: "+ x);
		
		//Atribui��o de resto
		x /= y;
		System.out.println("Atribui��o de divis�o:" + x);
		
		//Atribui��o de resto
		x %= y; // x = x % 2;
		System.out.println("Atribui��o de resto: " + x);
		
	}

}
