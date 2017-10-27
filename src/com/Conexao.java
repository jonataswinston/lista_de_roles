package com;
import java.sql.*;
public class Conexao {

    private static Connection connection;
    private static Statement statement;
    private static String driver = "com.mysql.jdbc.Driver";
    //parametros para conexão com o Banco De Dados;
    private static String ipdoservidor = "";//ip do servidor----------------- ipdoservidor
    private static String porta = "3306";//porta do banco | Padrão 3306 ----- porta
    private static String bdDados = "";//banco de dados --------------------- bdDados
    private static String usuario = "";//usuário do banco-------------------- usuario
    private static String senha = "";//senha do usuário---------------------- senha
    private static String tabela = "";//tabela a ser usada------------------- tabela
    private static String url = "jdbc:mysql://"+ipdoservidor+":"+porta+"/";3

    public static void setIpdoservidor (String ipdoservidor){
        ipdoservidor.this = ipdoservidor;
    }

    public static void setPorta (String porta){
        porta.this = porta;
    }

    public static void setBddados (String bdDados){
        bdDados.this = bdDados;
    }

    public static void setUsuario (String usuario){
        usuario.this = usuario;
    }

    public static void setSenha (String senha){
        senha.this = senha;
    }

    public static void setTabela (String tabela){
        tabela.this = tabela;
    }


    public static void openConnectionSQL(){
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url+bdDados,usuario,senha);
            statement = connection.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void closeConnectionSQL(){
        try{
            connection.close();
            statement.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void updateSQL() {
        try {
            PreparedStatement stmte = connection.prepareStatement("INSERT INTO " + tabela + " (cpf_cnpj,nm_customer," +
                    "is_active,vl_total) VALUES(?,?,?,?)");
            stmte.setString(1, );
            stmte.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
