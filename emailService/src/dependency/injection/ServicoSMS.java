package dependency.injection;

public class ServicoSMS implements ServicoMessageIntf{


    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Mensagem de SMS " + msg + " enviada para " + rec);
    }

    @Override
    public MyApplication getConsumer() {
        return new MyApplication(this);
    }
}
