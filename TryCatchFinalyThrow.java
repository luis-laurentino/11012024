public class TryCatch3 {
    
    public static void verificarTempo(int tempo){
    
        if (tempo < 2){

            System.out.println("\n \nVocê ainda pode assistir 1 minuto no periodo de teste.\n \n");
        } else {
            
            throw new ArithmeticException("\n \nO periodo de teste acabou. Ative seu plano para continuar.\n\n");
        }
    }
    public static void main(String[] args) {
        int minutoContado = 0;
        int tempoTotal = 2;
        int segundoContado = 0;

        while (minutoContado < tempoTotal) {
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
            } finally {
                if (minutoContado == 2){

                    System.out.println("\n \nVocê assistiu todo o Tempo disponivel para o periodo de teste\n \n");
                }
                    
                

            }
        }
        

    }
}
