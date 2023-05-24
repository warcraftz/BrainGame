package isptec.pii.pp2.braingame;



// Imports
import java.util.Scanner;
import java.util.ArrayList;

class Jogador {
    private String username;
    private String datanasc;
    
    public Jogador (String username, String datanasc){
        this.username = username;
        this.datanasc = datanasc;
    }
    
    // functions
    public String getUsername(){return username;}
    public String getDataNasc(){return datanasc;}
    
    // server jodadores registrados [!]
    public static void arrayListLocalSevedPlayer () {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList <Jogador> ListaDeJogador = new ArrayList<>();
            System.out.println("[Message] Digite 'sair' para parar\n\n");

            while(true){
                System.out.print("\nDigite seu nome de usuário: ");
                String username = sc.next();

                // Interupção do cadastro.
                if(username.equalsIgnoreCase("sair")){
                    Menus.mostrarMenu(1);
                }

                System.out.println("Digite a data de nascimento no formato dd-mm-aaaa: ");
                String datanasc = sc.nextLine();
                
                ListaDeJogador.add(new Jogador(username, datanasc));
            }
        }
    }
}
