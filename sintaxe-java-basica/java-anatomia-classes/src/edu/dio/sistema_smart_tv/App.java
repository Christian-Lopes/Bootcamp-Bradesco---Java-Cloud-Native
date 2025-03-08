package edu.dio.sistema_smart_tv;

public class App {
    public static void main(String[] agrs) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual? " + smartTV.canal);
        System.out.println("Volume atual? " + smartTV.volume);


        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.mudarCanal(39);

        
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual? " + smartTV.canal);
        System.out.println("Volume atual? " + smartTV.volume);
    }
}
