public class Loader {

    public static void main(String[] args) {

        Envio envio = new Envio(EnvioStateEnum.values()[0]);

        envio.atualizarStatus();
        envio.enviarPedido();

        envio.atualizarStatus();
        envio.enviarPedido();

        envio.atualizarStatus();
        envio.enviarPedido();

        envio.atualizarStatus();
        envio.enviarPedido();

    }

}
