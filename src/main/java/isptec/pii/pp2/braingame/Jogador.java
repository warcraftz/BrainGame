package isptec.pii.pp2.braingame;

// Imports
import java.util.ArrayList;
import java.util.Scanner;

// Registro Jogador
class Jogador {
    // Propriedades do Jogador
    private String username;
    private String datanasc;
    
    public Jogador (String username, String datanasc){
        this.username = username;
        this.datanasc = datanasc; 
    }
    
    // functions
    public String getUsername(){return username;}
    public String getDataNasc(){return datanasc;}
    
    public static void registroDeJogador(){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Jogador> listaDeJogadores;
        listaDeJogadores = new ArrayList<>();
        
        String res = "";
        System.out.print("\n----------[ REGISTRAR JOGADORES ]----------");
        while(true){
            if(!(res).equalsIgnoreCase("não")){
                System.out.print("\nDigite um nome de usuário: ");
                String username = sc.next();

                System.out.print("Digite a data de nascimento no formato dd-mm-aaaa: ");
                String datanasc = sc.next();

                System.out.println("\n\n[!][Message][!]\nDeseja registrar outro jogador? [Sim | Não]");
                System.out.print("[<-: ");
                res = sc.next();
                
                if(res.equalsIgnoreCase("não")){
                    System.out.println("\n\n[!][Message][!]\nDeseja registrar jogador a cima? [Sim | Não]");
                    System.out.print("[<-: ");
                    res = sc.next();
                    
                    if(res.equalsIgnoreCase("não")){
                        registroMessage(listaDeJogadores.size()); // Chamada do procedimento message
                        Menus.mostrarMenu();
                    }else{
                        listaDeJogadores.add(new Jogador(username, datanasc));
                        registroMessage(listaDeJogadores.size());  // Chamada do procedimento message
                        
                        Menus.mostrarMenu();
                    }
                }else{ listaDeJogadores.add(new Jogador(username, datanasc)); }
            }
            System.out.print("\n-------------------------------------------");
        }
    }
    
    public static void registroMessage(int numeroDeJogadores){
    
        // Verifica se à jogadores no sistema.
        if(numeroDeJogadores == 0){
            System.out.println("\n\n[!][Message][!]\nNenhum jogador registrado!");
        }else if(numeroDeJogadores > 1){
            System.out.println("\n\n[!][Message][!]\nJogadores registrados com sucesso!");
        }else {
            System.out.println("\n\n[!][Message][!]\nJogador registrado com sucesso!");
        }
        System.out.print("\n\n\n");
        
    }
    
    // Listar Jogadores 
}
