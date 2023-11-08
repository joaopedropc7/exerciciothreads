public class Main {
    public static void main(String[] args) {
        Runnable tarefaDaThread1 = () -> {
            System.out.println("-------------- INICIANDO THREAD 1 --------------");
            for (int i = 0; i < 10; i++) {
                System.out.println("Simulado Thread1 - Valor: " + i);
            }
            System.out.println("-------------- FINALIZANDO THREAD 1 --------------");
        };

        Runnable tarefaDaThread2 = () -> {
            System.out.println("-------------- INICIANDO THREAD 2 --------------");
            for (int i = 0; i < 10; i++) {
                System.out.println("Simulado Thread2 - Valor: " + i);
            }
            System.out.println("-------------- FINALIZANDO THREAD 2 --------------");
        };

        Thread thread1 = new Thread(tarefaDaThread1);
        Thread thread2 = new Thread(tarefaDaThread2);



        thread1.run();
        thread2.run();

    }

}
