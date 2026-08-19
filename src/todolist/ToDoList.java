/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.Scanner;

public class ToDoList{
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        int opcao = 0;
        
        while(opcao != 5){
            
            System.out.println("\n=== LISTA DE TAREFA ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefa");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Excluir Tarefa");
            System.out.println("5 - Sair");
        
            System.out.print("\nDigite o numero corespondente a opcao desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                
                case 1 -> {
                    int posicaoLivre = -1;
                    
                    for(int i = 0; i < tarefas.length; i++){
                        if(tarefas[i] == null){
                            posicaoLivre = i;
                        }
                    }
                    if(posicaoLivre == -1){
                        System.out.println("A lista de tarefas está cheia");
                    }else{
                        System.out.println("Digite a tarefa: ");
                        tarefas[posicaoLivre] = scanner.nextLine();
                        concluidas[posicaoLivre] = false;
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                }
                    
                case 2 -> {
                    System.out.println("\n=== MINHAS TAREFAS QUERIDAS :3 ===");
                    
                    boolean existeTarefa = false;
                    
                    for(int i = 0; i < tarefas.length; i++){
                        if(tarefas[i] != null){
                            existeTarefa = true;
                            
                            if(concluidas[i] == true){
                                System.out.println((i + 1) + " - [x] " + tarefas[i]);
                            } else{
                                System.out.println((i + 1) + " - [ ] " + tarefas[i]);
                            }
                        }
                    }
                    if(existeTarefa == false){
                        System.out.println("Nenhuma tarefa existente sua anta");
                    }
                }
                    
                case 3 -> {
                    System.out.println("Digite o numero da tarefa que deseja concluir: ");
                    int concluirTarefa = scanner.nextInt();
                    
                    int indicieConcluir = concluirTarefa - 1;
                    
                    if(indicieConcluir >= 0 && indicieConcluir < tarefas.length && tarefas[indicieConcluir] != null){
                        
                        concluidas[indicieConcluir] = true;
                        
                        System.out.println("\nTarefa concluida com sucesso");
                        
                    }else{
                        System.out.println("\nTarefa invalida, pobre");
                    }
                }
                    
                case 4 -> {
                }
            }
        }
    }
}