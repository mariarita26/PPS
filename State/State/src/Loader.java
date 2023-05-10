import java.util.Scanner;

public class Loader {

    public static void main(String[] args) throws InterruptedException {

        Envio envio = new Envio();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Gostaria de realizar um pedido? (sim / nao)");
        String resposta = teclado.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            // PREPARAÇÃO
            envio.atualizarStatus();
            Thread.sleep(1000);
            envio.enviarPedido();
            Thread.sleep(1000);

            // RECEBIDO PELA TRANSPORTADORA
            envio.atualizarStatus();
            Thread.sleep(1000);
            envio.enviarPedido();
            Thread.sleep(1000);

            System.out.println("\nVocê recebeu seu produto? (sim / nao)");
            String recebido = teclado.nextLine();

            // NÃO ENTREGUE AO CLIENTE
            if (!recebido.equalsIgnoreCase("sim")) {
                do {
                    envio.setProblema(true);
                    Thread.sleep(1000);
                    envio.enviarPedido();
                    Thread.sleep(1000);

                    //  ENVIADO PRA PREPARAÇÃO NOVAMENTE
                    envio.atualizarStatus();
                    Thread.sleep(1000);
                    envio.enviarPedido();
                    Thread.sleep(1000);

                    // TRANSPORTADORA
                    envio.atualizarStatus();
                    Thread.sleep(1000);
                    envio.enviarPedido();
                    Thread.sleep(1000);

                    System.out.println("\nVocê recebeu seu produto? (sim / nao)");
                    recebido = teclado.nextLine();

                } while (!recebido.equalsIgnoreCase("sim"));
            }

            // RECEBIDO
            envio.atualizarStatus();
            Thread.sleep(1000);
            envio.enviarPedido();
            Thread.sleep(1000);

            envio.atualizarStatus();
            envio.enviarPedido();
        } else {
            System.out.println(" OK ");
        }
    }
}
