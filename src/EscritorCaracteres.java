public class EscritorCaracteres implements Runnable {

    private final char caracter;
    private final int repeticiones;

    public EscritorCaracteres (char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
    }
}
