class Mythread extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}

public class MultiEx2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Mythread t = new Mythread();
        t.run();
    }
}
