package isptec.pii.pp2.braingame;
import java.util.Scanner;

public class Administrador {
    
    
    class Pergunta {
        private String pergunta;
        private String resposta;
        
        public Pergunta(String pergunta, String resposta) {
            this.pergunta = pergunta;
            this.resposta = resposta;
        }
        
        public String getPergunta() { return pergunta; }
        public String getResposta() { return resposta;}
    }
    
    public class manegarPergunta{
        private int maximoDePerguntas = 60; // ussamos 60 pensando em dividir em 15 nivés para concluir a jogada cada nivel com 4perguntas
        private Pergunta[] perguntas;
        private int numPerguntas;
        
        public manegarPergunta() {
            perguntas = new Pergunta[maximoDePerguntas];
        }
        public int getMaximoDePergunta() { return maximoDePerguntas; }
        public int getNumPerguntas() { return numPerguntas; }
        
        public void configurarPergunta(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Configuando perguntas: ");

            while (numPerguntas < maximoDePerguntas){
                System.out.println("\nPergunta" + (numPerguntas + 1) + ":");

                System.out.print("Digite a pergunta: ");
                String pergunta = sc.nextLine();

                System.out.print("Digite a resposta: ");
                String resposta = sc.nextLine();

                perguntas[numPerguntas] = new Pergunta(pergunta, resposta);
                numPerguntas++;

                System.out.print("Deseja cadastrar mais perguntas? (S/N): ");
                String res = sc.nextLine();

                if(res.equalsIgnoreCase("N")){
                    break;
                }
            }
        }
        
        public void mostrarPeguntas() {
            System.out.println("\n--- Perguntas Cadastradas ---");
            
            for(int i = 0; i < numPerguntas; i++){
                System.out.println("\nPergunta" + (i + 1) + ":");
                System.out.println("\nPergunta" + perguntas[i].getPergunta());
                System.out.println("\nResposta" + perguntas[i].getResposta());
            }
        }
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        manegarPergunta mp = new Administrador().new manegarPergunta();
        int op;
        
        do{
            System.out.println("\n--- Menu ---");
            System.out.println("1. Configurar perguntas");
            System.out.println("2. Imprimir perguntas cadastradas");
            System.out.println("3. Sair");
            System.out.print("[<-: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    mp.configurarPergunta();
                    break;
                case 2:
                    mp.mostrarPeguntas();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default: System.out.println("Opção inválida!");
            }
        }while(op != 3);
    }
}
