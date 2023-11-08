public class Main {
    public static void main(String[] args){
        new Thread(t1).start();
        new Thread(t2).start();
    }

    private static Runnable t1 = new Runnable() {
        public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 1: " + i);
            }
        }
    };

    private static Runnable t2 = new Runnable() {
        public void run(){
            for(int c = 0; c < 10; c++){
                System.out.println("Thread 2: " + c);
            }
        }
    };
}