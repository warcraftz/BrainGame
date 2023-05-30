package isptec.pii.pp2.braingame;

//imports
import java.util.Scanner;

public class Ajuda {
    public static void adiquirirAjuda(int saldo){
        Scanner sc = new  Scanner(System.in);
        if(saldo >= 5){
            System.out.println("--------[ AJUDA ]--------");
            System.out.println("[1]- Dica com 25% [5P]");
            System.out.println("[2]- Dica com 50% [25P]");
            System.out.println("[3]- Dica com 100% [50P]");
            System.out.print("\n[<-: ");
            int op = sc.nextInt();
            
            do{
                switch(op){
                    case 1: break;
                    case 2: break;
                    case 3: break;
                }
            }while((op == 1) || (op == 2) || op == 3);
        }else {
            System.out.print("\n[msg]: Você não possui saldo(pontos) para comprar a dica!\n");
        }
    }
}
