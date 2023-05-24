package isptec.pii.pp2.braingame;
import java.util.Scanner;
import java.util.ArrayList;

public class Administrador {
    private static ArrayList<TipoMultipla> matrizTipoMultipla = new ArrayList<>();
            
    public void ConfigurarPerguntas() {
        Administrador adim = new Administrador();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("\n\n-----[ TIPO DE PERGUNTA ]-----");
        System.out.println("[1] - MÚLTICA ESCOLHA");
        System.out.println("[2] - VERDADEIRA OU FALSA");
        System.out.println("[3] - PALAVRA UNICA");
        System.out.println("[0] - SAIR"); // CLOSED A PROGRAM
        System.out.print("\n[<-: ");
        String tipo = sc.nextLine();
        
        do{
            switch(tipo){
                case "1": Administrador.PerguntaDoTipoMulitpla(1); Administrador.PerguntaDoTipoMulitpla(2); break;
                case "2": adim.PerguntaDoTipoBooleano(); break;
                case "3": adim.PerguntaDoTipoResUnica(); break;
                case "0": Administrador.menuAdim(); break;
                default: System.out.print("Tipo inválido!"); break;
            }   
        }while(!tipo.equals("0"));
    }
  
    public static void PerguntaDoTipoMulitpla(int e){
        String res;
        //matrizTipoMultipla = new ArrayList<>();
        
        
        if(e != 2){
                
                // Adicionar dados inicias à matriz
                matrizTipoMultipla.add(new TipoMultipla(1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui", "respostaErradaAqui", "respostaErradaAqui"));
                matrizTipoMultipla.add(new TipoMultipla(1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui", "respostaErradaAqui", "respostaErradaAqui"));
                matrizTipoMultipla.add(new TipoMultipla(1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui", "respostaErradaAqui", "respostaErradaAqui"));
                matrizTipoMultipla.add(new TipoMultipla(1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui", "respostaErradaAqui", "respostaErradaAqui"));
      
        }else {
            // Receber novos dados do administrador
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Digite o tipo (inteiro de 1 à 3):");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite o nivel (inteiro de 1 à 6):");
                int nivel = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite a pergunta:");
                String pergunta = sc.nextLine();
                System.out.println("Digite a resposta certa:");
                String resposta1 = sc.nextLine();

                System.out.println("Digite a resposta certa:");
                String resposta2 = sc.nextLine();

                System.out.println("Digite a resposta certa:");
                String resposta3 = sc.nextLine();

                System.out.println("Digite a resposta certa:");
                String resposta4 = sc.nextLine();

                matrizTipoMultipla.add(new TipoMultipla(tipo, nivel, pergunta, resposta1, resposta2, resposta3, resposta4));
                System.out.print("\n---------------------------\n");
                System.out.print("Deseja continuar?(S/N): ");
                res = sc.next();
            }while(res.equalsIgnoreCase("s"));
            
            if(res.equalsIgnoreCase("n"))
                menuAdim();
        }
    }
    public static class TipoMultipla{
        private int tipo;
        private int nivel;
        private String pergunta;
        private String resposta1;
        private String resposta2;
        private String resposta3;
        private String resposta4;
        
        public TipoMultipla(int tipo, int nivel,String pergunta, String resposta1, String resposta2, String resposta3, String resposta4){
            this.tipo = tipo;
            this.nivel = nivel;
            this.pergunta = pergunta;
            this.resposta1 = resposta1;
            this.resposta1 = resposta2;
            this.resposta1 = resposta3;
            this.resposta1 = resposta4;
        }
        public int getTipo(){return tipo;}
        public int getNivel(){return nivel;}
        public String getPergunta(){return pergunta;}
        public String getResposta1(){return resposta1;}
        public String getResposta2(){return resposta2;}
        public String getResposta3(){return resposta3;}
        public String getResposta4(){return resposta4;}
    }
    
    public void PerguntaDoTipoBooleano(){
    //public class MatrizTipoBooleano {}
    }
    
    public void PerguntaDoTipoResUnica(){
    //public class MatrizTipoResUnica {}
    }
  
    public static void MostrarPerguntas(ArrayList<TipoMultipla> matrizTipoMultipla) {
        int totalPerguntas = matrizTipoMultipla.size();
        
        System.out.println("--- Perguntas Cadastradas ---");
        for(int i = 0; i < totalPerguntas; i++){
            TipoMultipla multipla = matrizTipoMultipla.get(i);
            System.out.println(multipla.getPergunta());
        }
    }
    
    
    public static void menuAdim() {
        Scanner sc = new Scanner(System.in);
        //manegarPergunta mp = new Administrador().new manegarPergunta();
        Administrador adim = new Administrador();
        int op;
        
        do{
            System.out.println("\n\n--- MENU ADMINISTRADOR ---");
            System.out.println("[1] - CONFIGURAR PERGUNTAS");
            System.out.println("[2] - IMPRIMIR PERGUNTAS CADASTRADAS");
            System.out.println("[0] - SAIR");
            System.out.print("\n[<-: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    adim.ConfigurarPerguntas();
                    break;
                case 2:
                    Administrador.PerguntaDoTipoMulitpla(1);
                    Administrador.MostrarPerguntas(matrizTipoMultipla);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    Menus.mostrarMenu(1);
                    break;
                default: System.out.println("Opção inválida!");
            }
        }while(op != 0);
    }
    
}