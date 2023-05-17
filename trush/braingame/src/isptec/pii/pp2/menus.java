package isptec.pii.pp2;
import isptec.pii.pp2.PlayersAdd;
import java.util.Scanner;

public class menus {
    public static Scanner sc = new Scanner(System.in);
    public static int op;

    
    public static void callMenus(int e){
        if(e == 1){
            /* 
            String[][] menuPrincipal = {
                {"***************************"},
                {"*                         *"},
                {"*       Brain: Game       *"},
                {"*                         *"},
                {"*                         *"},
                {"*      [1] - JOGADOR      *"},
                {"*                         *"},
                {"*   [2] - ADMINISTRADOR   *"},
                {"*                         *"},
                {"*    [3] - INICIAR JOGO   *"},
                {"*                         *"},
                {"***************************"}
            };
            */

            System.out.println("Brain Game");
            System.out.println("[1] - JOGADOR");
            System.out.println("[2] - ADMINISTRADOR");
            System.out.println("[3] - INICIAR JOGO");
            System.out.print("\n[<-: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    PlayersAdd.arrayListLocalSevedPlayer(); 
                    break;
            }
        }

        if(e == 2){
            /*
            String[][] menuSecundario = { 
                {"*********************************"},
                {"*                               *"},
                {"*            Brain: Game        *"},
                {"*                               *"},
                {"*                               *"},
                {"*            Iniciar Jogo       *"},
                {"*                               *"},
                {"*              Ajuda            *"},
                {"*                               *"},
                {"*           Pontuação           *"},
                {"*                               *"},
                {"*              Pódio            *"},
                {"*                               *"},
                {"*********************************"}
            };
            */
        }
    }
}