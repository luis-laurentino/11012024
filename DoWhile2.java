import java.util.*;
public class DoWhile2 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int usersLimit = 2;
        Scanner scnInput = new Scanner(System.in);
        String usuario;
        int contUsers = 0;

        try {
            while (usersLogged.size() < usersLimit) {
                System.out.println(contUsers + " Usuario(s) Logado(s)");
                System.out.println("Digite um nome de usuario ou tecle enter para gerar um nome de usuario aleatorio");
                usuario = scnInput.nextLine();
                if (usuario != ""){
                    usersLogged.add(usuario);
                    System.out.println("O usuario "+ usersLogged.get(contUsers) + " está logado.");
                    contUsers++;
                    System.out.println("Numero atual de usuarios logado: "+ contUsers);

                } else {
                    usersLogged.add("user" + Math.ceil(Math.random()* 10));
                    System.out.println("O usuario "+ usersLogged.get(contUsers) + " está logado.");
                    contUsers++;
                    System.out.println("Numero atual de usuarios logado: "+ contUsers);
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usuarios atingido");
        } catch (Exception e) {
            System.out.println("Ops! ocorreu o erro " + e);
        }
        scnInput.close();


    }
}
