public class Envio {

    private EnvioState envioState;
    private boolean hasProblema = false;

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
        if (this.envioState == EnvioStateEnum.FINALIZADO) {
            verificarFinalizado();
        }
    }

    public void verificarFinalizado(){
        if (hasProblema) {
            System.out.println("Houve um problema com o recebimento do produto");
            this.setProblema(false);
            this.envioState = EnvioStateEnum.PREPARACAO;
        }
//        else {
//            System.out.println("Envio concluído");
//        }
    }

    public boolean hasProblema(){
        return hasProblema();
    }

    public void setProblema(boolean problema){
        hasProblema = problema;
    }
}
