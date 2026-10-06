public class Principla {

    public static void main(String[] args) {
        int repeticiones = 20; // Número de repeticiones por cada hebra

        // 1. Creación de las tareas con diferentes caracteres
        EscritorCaracteres tarea1 = new EscritorCaracteres('A', repeticiones);
        EscritorCaracteres tarea2 = new EscritorCaracteres('B', repeticiones);
        EscritorCaracteres tarea3 = new EscritorCaracteres('C', repeticiones);

        // 2. Creación de las 3 hebras
        Thread hebra1 = new Thread(tarea1, "Hebra-A");
        Thread hebra2 = new Thread(tarea2, "Hebra-B");
        Thread hebra3 = new Thread(tarea3, "Hebra-C");

        // 3. Inicio concurrente de las hebras
        hebra1.start();
        hebra2.start();
        hebra3.start();

        // 4. El hilo principal espera a que terminen las hebras antes de finalizar
        try {
            hebra1.join();
            hebra2.join();
            hebra3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}