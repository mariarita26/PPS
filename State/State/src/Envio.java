public class Envio {

    private EnvioState envioState;

    public Envio() {
        this.envioState = EnvioStateEnum.PREPARACAO;
    }

    public Envio(EnvioState envioState) {
        this.envioState = envioState;
    }

    public void atualizarStatus(){
        this.envioState = envioState.atualizarStatus();
    }

    public void enviarPedido(){
        this.envioState = envioState.enviarPedido();
    }

    public boolean hasProblem(){
        return hasProblem();
    }
}
