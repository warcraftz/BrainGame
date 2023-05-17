package isptec.pii.pp2;
import java.util.ArrayList;
import java.util.Scanner;

class PlayersAdd {
    private String username;
    private int idade, mes, ano;

    public  PlayersAdd ( String username, int idade, int mes, int ano) {
        this.username = username; this.idade = idade; this.mes = mes; this.ano = ano;
    }

    public String getUsername(){ return username;}
    public int getIdade(){ return idade;}
    public int getMes(){ return mes;}
    public int getAno(){ return ano;}
    
    // server jodadores registrados [!]
    public static void arrayListLocalSevedPlayer () {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList <PlayersAdd> userList = new ArrayList<PlayersAdd>();
            System.out.println("[Message] Digite 'sair' para parar\n\n");

            while(true){
                System.out.print("\nDigite seu nome de usuário: ");
                String username = sc.next();

                // A linha abaixo interrope o cadastro.
                if(username.equalsIgnoreCase("sair")){
                    break;
                    // Chamada do menu principal
                }

                System.out.println("Digite a data de nascimento no formato dd-mm-aaaa: ");
                int idade = sc.nextInt();
                int mes = sc.nextInt();
                int ano = sc.nextInt();

                userList.add(new PlayersAdd(username, idade, mes, ano));
            }

            System.out.println("\nPessoas adicionadas:");
            for (PlayersAdd users : userList) {
                System.out.println("Nome: " + users.getUsername() + ", Data: " + users.getIdade() + " - " + users.getMes() + " - " + users.ano);
            }
        }
    }
}