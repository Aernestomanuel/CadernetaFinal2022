package com.aliernestomanuel.projectopoo;

import java.util.Scanner;

public class CadernetaDigital {

	public static void main(String[] args) {
		
		String lista[] = new String[50];
		String nome;
		int opcao;
		int i;
		int numero = 0;
		int y;
		String professor;
		String disciplina;
		float teste1[] = new float [50];
		float teste2[] = new float [50];
		float media[] = new float [50];
		String resultado[] = new String[50];
		boolean r = true;
		
		Scanner aem = new Scanner(System.in);
		
		System.out.println("Digite o nome do Professor: ");
		professor = aem.nextLine();
		System.out.println("Insira o nome da Disciplina que o senhor professor "+professor+" lecciona");
		disciplina = aem.nextLine();
		
		
		
		System.out.println("Olá professor "+professor+" da disciplina de "+disciplina);
		System.out.println("Sinta-se a vontade nesta CADERNETA DIGITAL e diga o que pretende fazer");
		System.out.println( "-----------------------------------------------------------------------");
		
		while (r) {
			System.out.println ("1. Adicionar nome do aluno ");
			System.out.println ("2. Exibir lista dos alunos");
			System.out.println ("3. Remover aluno");
			System.out.println ("4. Inserir notas/Achar Média");
			System.out.println ("5. Extrair Resultados Finais");
			System.out.println ("0. Sair");
			System.out.println ("-----------------------------");
			System.out.println ("Escolhe uma das opções");
			opcao = aem.nextInt();
			
			switch (opcao)
			
			{
			case 1: {
			System.out.println ("Digite o nome do aluno:  ");
			nome = aem.nextLine();
			
			for (i = 0; i < 50; i++)
			{
				if (lista[i] == "")
					lista[i] = nome;
				break;
			}
			System.out.println("Nome adicionado com sucesso");
				break;
		
			}
			case 2:{
				System.out.println ("=====Lista de Alunos=====");
				for (i=0; i<50; i++)
				{
					if (lista[i] != "")
					{
						System.out.println(i+ "-"+lista[i]);
						
					}
				}
				System.out.println("======Fim da Lista=====");
				
				break;
			}
			
			case 3:{
				System.out.println ("=====Lista de Alunos=====");
				
				for (i = 0; i<50; i++)
				{
					if (lista[i] != "")
					{
						System.out.println(i+ "-"+lista[i]);
					}
				}
				System.out.println("Escolha o número do aluno a remover: ");
				numero = aem.nextInt();
				lista[numero] = "";
				System.out.println("Aluno removido com sucesso");
								
				break;
			
			}
			case 4:{
				if (lista[numero] != "")
				{
					System.out.println ("=====Lista de Alunos=====");
					
					for (i = 0; i<50; i++)
					{
						if (lista[i] != "")
						{
							System.out.println(i+ "-"+lista[i]);
						}	
				    }
				
				System.out.println("Escolha o número do aluno");
				numero = aem.nextInt();
				
				System.out.println("Nota do teste 1");
				teste1[numero] = aem.nextFloat();
				
				System.out.println("Nota do teste 2");
				teste2[numero] = aem.nextFloat();
				
				media[numero] = (teste1[numero]+teste2[numero])/2;
				System.out.println("A média do aluno "+lista[numero]+ " é " +media[numero]);
				System.out.println("----------------------------------");
				} else {
					System.out.println("A lista está vazia ou nenhum aluno tem notas de testes");
					System.out.println("-----------------------------------------------------");
					
				}
				break;
			}
				
			case 5: {
				System.out.println("Professor: "+professor+"            Disciplina: "+disciplina);
				System.out.println("-----------------------------------------------------------");
				System.out.println("                 RESULTADO FINAL                          ");
				
				if (lista[numero] != "") {
					System.out.println("Quer resultado de quantos alunos? ");
					y = aem.nextInt();
					
					for (numero=0; numero<=y; numero++)
						{
						if (media[numero]>=10) {resultado[numero] = "Aprovado(a)";}
						else {resultado[numero] = "Reprovado";}
												
					System.out.println(lista[numero]+ "......"+media[numero]+"......"+resultado[numero]);
					System.out.println("_______________");
						}
				}else {System.out.println("A lista está vazia ou não tem notas");   }
				
				break;
			
			}
			case 0:{
				r = false;
			break;
			}
			default:
				System.out.println("Opção inválida");
				
			}
			
			
				
		
		} 
		System.out.println("Fim da operação");
			
		
		
		
		
		
	}
	
		
}
