public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static void a(){
        System.out.println("Encontrou o método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b(){
        System.out.println("Encontrou o método b.");
        for(int i = 0; i <= 4;i++){
            System.out.println(i);
        }
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        
    }
}
