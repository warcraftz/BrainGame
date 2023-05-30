package isptec.pii.pp2.braingame;

import java.util.ArrayList;
import java.util.Scanner;


public class Administrador {
    
    // vetor usando ArrayList
    private static ArrayList<TipoMult> vetorTipoMultipla = new ArrayList<>();
    private static ArrayList<TipoBool> vetorTipoBooleano = new ArrayList<>();
    private static ArrayList<TipoUnic> vetorTipoResUnica = new ArrayList<>();
    

    // Procedimento ConfigurarPerguntas()
    public void ConfigurarPerguntas(){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("\n\n-----[ TIPO DE PERGUNTA ]-----");
        System.out.println("[1] - MÚLTICA ESCOLHA");
        System.out.println("[2] - VERDADEIRA OU FALSA");
        System.out.println("[3] - PALAVRA UNICA");
        System.out.println("[0] - SAIR");
        System.out.println("------------------------------");
        System.out.print("[<-: ");
        String tipo = sc.next();
        
        do{
            switch(tipo){
                case "1": Administrador.TipoMultipla(); break;
                case "2": Administrador.TipoBooleano(); break;
                case "3": Administrador.TipoResUnica(); break;
                case "0": Administrador.menuAdim(); break;
                default: System.out.print("Tipo inválido!"); break;
            }   
        }while(!tipo.equals("0"));
    }
    
    
    public static void TipoMultipla(){
        // Perguntas inicializadas (Exemplo abaixo)
        //vetorTipoMultipla.add(new TipoMult(1, 1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui", "respostaErradaAqui", "respostaErradaAqui"));
        
        
        // Receber novos dados do administrador
        Scanner sc = new Scanner(System.in);
        String res;
        
        do{
            System.out.println("Digite o id (inteiro):");
            int id = sc.nextInt();
            
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

            System.out.println("Digite a resposta a primeira errada:");
            String resposta2 = sc.nextLine();

            System.out.println("Digite a segunda errada:");
            String resposta3 = sc.nextLine();

            System.out.println("Digite a terceira errada:");
            String resposta4 = sc.nextLine();

            vetorTipoMultipla.add(new TipoMult(id, tipo, nivel, pergunta, resposta1, resposta2, resposta3, resposta4));
            System.out.print("\n---------------------------\n");
            System.out.print("Deseja continuar?(S/N): ");
            res = sc.next();
        }while(res.equalsIgnoreCase("s"));
    }
    public static void TipoBooleano(){  
        // Perguntas inicializadas
        //vetorTipoMultipla.add(new TipoMult(1, 1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui"));
        
        
        
        // Receber novos dados do administrador
        Scanner sc = new Scanner(System.in);
        String res;
        
        do{
            System.out.println("Digite o id (inteiro):");
            int id = sc.nextInt();
            
            System.out.println("Digite o tipo (inteiro de 1 à 3):");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nivel (inteiro de 1 à 6):");
            int nivel = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a pergunta:");
            String pergunta = sc.nextLine();
            System.out.println("Digite a resposta verdadeira:");
            String respostaTrue = sc.nextLine();

            System.out.println("Digite a resposta falsa:");
            String respostaFalse = sc.nextLine();

            vetorTipoBooleano.add(new TipoBool(id, tipo, nivel, pergunta, respostaTrue, respostaFalse));
            System.out.print("\n---------------------------\n");
            System.out.print("Deseja continuar?(S/N): ");
            res = sc.next();
        }while(res.equalsIgnoreCase("s"));
    }
    public static void TipoResUnica(){
        // Perguntas inicializadas
        //vetorTipoMultipla.add(new TipoMult(1, 1, 1, "perguntaAqui?", "respostacertaAqui", "respostaErradaAqui", "respostaErradaAqui", "respostaErradaAqui"));
        
        
        
        // Receber novos dados do administrador
        Scanner sc = new Scanner(System.in);
        String res;
        
        do{
            System.out.println("Digite o id (inteiro):");
            int id = sc.nextInt();
            
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

            System.out.println("Digite a resposta a primeira errada:");
            String resposta2 = sc.nextLine();

            System.out.println("Digite a segunda errada:");
            String resposta3 = sc.nextLine();

            System.out.println("Digite a terceira errada:");
            String resposta4 = sc.nextLine();

            vetorTipoResUnica.add(new TipoUnic(id, tipo, nivel, pergunta, resposta1, resposta2, resposta3, resposta4));
            System.out.print("\n---------------------------\n");
            System.out.print("Deseja continuar?(S/N): ");
            res = sc.next();
        }while(res.equalsIgnoreCase("s"));
    }
    
    public static class TipoMult{
            private int id;
            private int tipo;
            private int nivel;
            private String pergunta;
            private String resposta1;
            private String resposta2;
            private String resposta3;
            private String resposta4;
        
            public TipoMult(int id, int tipo, int nivel, String pergunta, String resposta1, String resposta2, String resposta3, String resposta4){
                this.id = id;
                this.tipo = tipo;
                this.nivel = nivel;
                this.pergunta = pergunta;
                this.resposta1 = resposta1;
                this.resposta2 = resposta2;
                this.resposta3 = resposta3;
                this.resposta4 = resposta4;
            }

            public int getId(){return id;}
            public int getTipo(){return tipo;}
            public int getNivel(){return nivel;}
            public String getPergunta(){return pergunta;}
            public String getResposta1(){return resposta1;}
            public String getResposta2(){return resposta2;}
            public String getResposta3(){return resposta3;}
            public String getResposta4(){return resposta4;}
        }  // class TipoMultipla()
    public static class TipoBool{
            private int id;
            private int tipo;
            private int nivel;
            private String pergunta;
            private String respostaTrue;
            private String respostaFalse;
        
            public TipoBool(int id, int tipo, int nivel, String pergunta, String respostaTrue, String respostaFalse){
                this.id = id;
                this.tipo = tipo;
                this.nivel = nivel;
                this.pergunta = pergunta;
                this.respostaTrue = "Verdadeira";
                this.respostaFalse = "False";
            }

            public int getId(){return id;}
            public int getTipo(){return tipo;}
            public int getNivel(){return nivel;}
            public String getPergunta(){return pergunta;}
            public String getRespostaTrue(){return respostaTrue;}
            public String getRespostaFalse(){return respostaFalse;}
        }  // class TipoBooleano()
    public static class TipoUnic{
        private int id;
        private int tipo;
        private int nivel;
        private String pergunta;
        private String resposta1;
        private String resposta2;
        private String resposta3;
        private String resposta4;

        public TipoUnic(int id, int tipo, int nivel, String pergunta, String resposta1, String resposta2, String resposta3, String resposta4){
            this.id = id;
            this.tipo = tipo;
            this.nivel = nivel;
            this.pergunta = pergunta;
            this.resposta1 = resposta1;
            this.resposta2 = resposta2;
            this.resposta3 = resposta3;
            this.resposta4 = resposta4;
        }

        public int getId(){return id;}
        public int getTipo(){return tipo;}
        public int getNivel(){return nivel;}
        public String getPergunta(){return pergunta;}
        public String getResposta1(){return resposta1;}
        public String getResposta2(){return resposta2;}
        public String getResposta3(){return resposta3;}
        public String getResposta4(){return resposta4;}
    }  // class TipoResUnica()
    
    
  
    public static void MostrarPerguntas(ArrayList<TipoMult> vetorTipoMultipla, ArrayList<TipoBool> vetorTipoBooleano, ArrayList<TipoUnic> vetorTipoResUnica) {
        int totalPerguntasMult = vetorTipoMultipla.size();
        int totalPerguntasBool = vetorTipoBooleano.size();
        int totalPerguntasUnic = vetorTipoResUnica.size();
        
        System.out.println("--- Perguntas Cadastradas ---");
        for(int i = 0; i < totalPerguntasMult; i++){
            TipoMult multipla = vetorTipoMultipla.get(i);
            System.out.println(multipla.getPergunta());
        }
        for(int i = 0; i < totalPerguntasBool; i++){
            TipoBool booleano = vetorTipoBooleano.get(i);
            System.out.println(booleano.getPergunta());
        }
        for(int i = 0; i < totalPerguntasUnic; i++){
            TipoUnic resunica = vetorTipoResUnica.get(i);
            System.out.println(resunica.getPergunta());
        }
    }
    
    
    public static void menuAdim() {
        Scanner sc = new Scanner(System.in);
        //manegarPergunta mp = new Administrador().new manegarPergunta();
        Administrador adim = new Administrador();
        int op;
        
        do{
            System.out.println("\n\n------[ MENU ADMINISTRADOR ]------");
            System.out.println("[1] - CONFIGURAR PERGUNTAS");
            System.out.println("[2] - IMPRIMIR PERGUNTAS CADASTRADAS");
            System.out.println("[0] - SAIR");
            System.out.println("-----------------------------------");
            System.out.print("[<-: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    adim.ConfigurarPerguntas();
                    break;
                case 2:
                    //Administrador.PerguntaDoTipoMulitpla(1);
                    //Administrador.MostrarPerguntas(matrizTipoMultipla);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    Menus.mostrarMenu();
                    break;
                default: System.out.println("Opção inválida!");
            }
        }while(op != 0);
    }

}
