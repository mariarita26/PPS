public class Loader {

    public static void main(String[] args) {

        Envio envio = new Envio();

//        PREPARAÇÃO
        envio.atualizarStatus();
        envio.enviarPedido();

//        RECEBIDO PELA TRANSPORTADORA
        envio.atualizarStatus();
        envio.enviarPedido();

//        NÃO ENTREGUE AO CLIENTE
        System.out.println("\n\tverificando");
        envio.setProblema(true);
        envio.enviarPedido();

//        ENVIADO PRA PREPARAÇÃO NOVAMENTE
        envio.atualizarStatus();
        envio.enviarPedido();

//        TRANSPORTADORA
        envio.atualizarStatus();
        envio.enviarPedido();

        envio.atualizarStatus();
        envio.enviarPedido();

        envio.atualizarStatus();
        envio.enviarPedido();
    }

}
