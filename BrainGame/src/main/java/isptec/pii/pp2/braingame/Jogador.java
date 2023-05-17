package isptec.pii.pp2.braingame;
// Imports
import java.util.Scanner;
import java.util.ArrayList;

class Jogador {
    private String username;
    private int day, mouth, year;
    
    public Jogador (String username, int day, int mouth, int year){
        this.username = username;
        this.day = day;
        this.mouth = mouth;
        this.year = year;
    }
    
    // functions
    public String getUsername(){return username;}
    public int getDay(){return day;}
    public int getMouth(){return mouth;}
    public int getYear(){return year;}
    
    // server jodadores registrados [!]
    public static void arrayListLocalSevedPlayer () {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList <Jogador> ListDeJogador = new ArrayList<>();
            System.out.println("[Message] Digite 'sair' para parar\n\n");

            while(true){
                System.out.print("\nDigite seu nome de usuário: ");
                String username = sc.next();

                // A linha abaixo interrope o cadastro.
                if(username.equalsIgnoreCase("sair")){
                    /*
                    // Remove the above code
                    System.out.println("\nPessoas adicionadas:");
                    for (Jogador jogadores : ListDeJogador) {
                        System.out.println("Nome: " + jogadores.getUsername() + "\nData: " + jogadores.getDay() + " - " + jogadores.getMouth() + " - " + jogadores.getYear());
                    }
                     */
                    Menus.showMenu(1);
                }

                System.out.println("Digite a data de nascimento no formato dd-mm-aaaa: ");
                int idade = sc.nextInt();
                int mes = sc.nextInt();
                int ano = sc.nextInt();

                ListDeJogador.add(new Jogador(username, idade, mes, ano));
            }
        }
    }
}
