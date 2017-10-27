package com;
import java.util.Scanner;
public class Metodos {

    private static Scanner ler = new Scanner(System.in);
    private static int tot = 20;
    private static String options[] = new String[tot];
    private static int indice[] = new int[];

    public static void menu(){

    }

    public static void showOptions(){
        System.out.println("------Escolha uma opção------");
        for (int i = 0; i<indice.length; i++) {
            System.out.println(indice[i]+ " - " + options[i]);
        }
        System.out.println("-----------------------------");
    }

    public static void menuConfig(){
        int choice = 0;
        do{
            showOptionsConfig(); //vai mostrar as opções
            choice = ler.nextInt(); //vai ler a opção escolhida
            getChoiceConfig(choice); //vai executar a ação de acordo com a opção escolhida
        }while(!(""+choice).equals("9"));
    }

    public static void showOptionsConfig(){
        System.out.println("------Escolha uma opção------");
        System.out.println("1 - limite de campos --------");
        System.out.println("2 - Conexão com o servidor --");
        System.out.println("9 - Sair --------------------");
        System.out.println("-----------------------------");
    }

    public static void getChoiceConfig(int choice){
        switch (choice) {
            case 1 : limiteConf();
                break;
            case 2 :
                break;
            case 9 :
                break;
        }
    }

    public static void limiteConf(){
        System.out.println("O limite atual de campos é: " + tot);
        System.out.println("Deseja alterar? Y | N");
        String choice = ler.next();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Insira o novo limite");
            tot = ler.nextInt();
            System.out.print("Limite atualizado!");
            System.out.print("Novo limite: " + tot);
        }
    }

}
