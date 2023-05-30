package isptec.pii.pp2.braingame;

import java.util.Scanner;

public class Menus {
    public static Scanner sc = new Scanner(System.in);
    public static int op;
    
    public static void mostrarMenu(){
        do {
            System.out.println("-----[ BRAIN GAME ]-----");
            System.out.println("[1] - JOGADOR");
            System.out.println("[2] - ADMINISTRADOR");
            System.out.println("[3] - INICIAR JOGO");
            System.out.println("[0] - SAIR DO JOGO");
            System.out.println("------------------------");
            System.out.print("[<-: ");
            op = sc.nextInt();

            switch(op){
                case 1: Jogador.registroDeJogador(); break;
                case 2: Administrador.menuAdim(); break;
                case 3:

                    System.out.println("\n[1]- JOGAR");
                    System.out.println("[2]- AJUDA");
                    System.out.println("[3]- PONTUAÇÃO");
                    System.out.println("[4]- PÓDIO");
                    System.out.println("[0]- SAIR");
                    System.out.print("\n[<-: ");
                    op = sc.nextInt();

                    switch(op){
                        case 1: /*Jogar.iniciarJogo();*/ break; // call function iniciarJogo da class Jogar
                        case 2:
                            // Task to
                            break;
                        case 3:
                            // Task to
                            break;
                        case 4:
                            // Task to
                            break;
                        case 0: System.out.println("Saindo..."); Menus.mostrarMenu(); break;
                        default: System.out.println("\nOpção inválida!");break;
                    }
                    break;
                case 0: System.out.println(" [Brain Game]:  Aguardamos seu retorno. :)");
                default: System.out.println("\nOpção inválida!");
            }
        }while(op != 0);
    }
}
