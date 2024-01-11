public class TryCatch3 {
    public static void verificarTempo(int tempo){
        if (tempo <= 2){
            System.out.println("Você ainda pode assistir no teste gratuito");
        } else {
            throw new ArithmeticException("O periodo de teste acabou. Ative seu plano para continuar");
        }
    }
    public static void main(String[] args) {
        int tempoTotal = 2;
        int minutoContado = 0;
        int segundoContado = 0;

        while (minutoContado <= tempoTotal) {
            try{
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minutos e "+ segundoContado + " segundos.");
                Thread.sleep(100);
                segundoContado++;
                if (segundoContado == 60) {
                    minutoContado++;
                    segundoContado = 0;                  
                    verificarTempo(minutoContado);
                }
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Filme Encerrado.");

    }
}