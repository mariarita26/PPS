package dependency.injection;

public class ServicoEmail implements ServicoMessageIntf{

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Mensagem de e-mail " + msg + " enviada para " + rec);
    }

    @Override
    public MyApplication getConsumer() {
        return new MyApplication(this);
    }
}
