package isptec.pii.pp2.braingame;
// Imports
import java.util.Scanner;

public class Menus {
    public static Scanner sc = new Scanner(System.in);
    public static int op;
    
    public static void showMenu(int e){
        switch(e){
            case 1: // Menu Principal
                System.out.println("Brain Game");
                System.out.println("[1] - JOGADOR");
                System.out.println("[2] - ADMINISTRADOR");
                System.out.println("[3] - INICIAR JOGO");
                System.out.print("\n[<-: ");
                op = sc.nextInt();
                switch(op){
                    case 1:
                        Jogador.arrayListLocalSevedPlayer();
                        break;
                    case 2:
                        Administrador.main();
                        break;
                }
                break;
                
            /* ====================== [DIVIDER] ====================== */
                
            case 2: // Menu Secundario
                System.out.println("[1] - INICIAR JOGO");
                System.out.println("[2] - AJUDA");
                System.out.println("[3] - PONTUAÇÃO");
                System.out.println("[4] - PÓDIO");
                System.out.print("\n[<-: ");
                op = sc.nextInt();
                break;
        }
    }
}
