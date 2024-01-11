import java.util.*;
public class TryCatchFinalyThrow {
    public static void verificarIdade(short idade){
        if (idade >= 18){
            System.out.println("Acesso garantido");
        } else {
            throw new ArithmeticException("Idade não permitida");
        }
    }
    public static void main(String[] args) {
        boolean autorizado = false;
        try {
            Scanner scnInput = new Scanner(System.in);
            System.out.println("Digite sua idade");
            short idadeDigitada = scnInput.nextShort();
            verificarIdade(idadeDigitada);
            scnInput.close();
            autorizado = true;
        } catch (Exception e) {
            Scanner scnSair = new Scanner(System.in);
            // System.err.println("Ocorreu o erro");
            System.err.println("Digite enter para continuar");
            scnSair.nextLine();
            scnSair.close();

        } finally{
            if (autorizado == false) {
                System.err.println("Favor Reiniciar o sistema");
                
            } else {
                System.out.println("Bem vindo.");

            }
        }
    }
}
