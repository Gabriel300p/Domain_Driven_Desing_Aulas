package br.com.fiap.tds.view;

public class Programa {
	
	public static void main(String[] args) {
		
		//Declaração de duas variáveis
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x + y;
		
		//Exibir o resultado da soma
		System.out.println(soma);
		
		//Realizar a subtração
		int subtracao = x - y;
		
		//Exibir o resultado da subtração
		System.out.println("A sua subtração é: " + subtracao);
		
		//Realizar a multiplicação
		int multiplicacao = x * y;
		
		//Exeibir o resultado da multiplicação
		System.out.println("A sua multiplicação é: " + multiplicacao);
		
		//Realizar a divisão
		int divisao = x / y;
		
		//Exibir o resultado da divisão
		System.out.println("A sua divisão é: " + divisao);
		
		//Obter o resto da divisão
		int resto = x % y;
		
		//Exibir o resto da divisão
		System.out.println("O resto é: " + resto);
		
		//Incremento
		x++; //incrementar em 1 unidade -> x = x + 1;
		System.out.println("Incremento: " + x);
		
		//Decremento
		x--; //retira 1 unidade -> x = x - 1:
		System.out.println("Decremento: " + x);
		
		//Adição aditiva
		x += 2; // x = x + 2
		System.out.println("Adição aditiva: " + x);
		
		//Adição subtrativa
		x -= 2; // x = x - 2
		System.out.println("Adição Subtrativa: " + x);
		
		//Atribuição multiplicativa
		x *= y;
		System.out.println("Atribuição multiplicativa: "+ x);
		
		//Atribuição de resto
		x /= y;
		System.out.println("Atribuição de divisão:" + x);
		
		//Atribuição de resto
		x %= y; // x = x % 2;
		System.out.println("Atribuição de resto: " + x);
		
	}

}
