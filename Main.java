public class Main {
    public static void main(String[] args) {

        //THREAD 1
        Thread th1 = new Thread(new Runnable() {
            public void run() {
          
                Ping p = new Ping();
                String resultado = p.ping("stdio.hax.tec.br", 2000); // Fornecer o IP e o número de bytes desejado
                System.out.println(resultado);
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
        });
        th1.start();

        //THREAD 2
        Thread th2 = new Thread(new Runnable() {
            public void run() {
       
                Ping p = new Ping();
                String resultado = p.ping("stdio.hax.tec.br", 2000); // Fornecer o IP e o número de bytes desejado
                System.out.println(resultado);
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
        });
        th2.start();

//        //THREAD 3
//        Thread th3 = new Thread(new Runnable() {
//            public void run() {
//    
//                Ping p = new Ping();
//                String resultado = p.ping("www.google.com", 32); // Fornecer o IP e o número de bytes desejado
//                System.out.println(resultado);
//                System.out.println("---------------------------------------------------------------------------------------------------------");
//            }
//        });
//        th3.start();








    }
}