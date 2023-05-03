package dependency.injection;

public interface ServicoMessageIntf{

    public void sendMessage(String msg, String rec);

    MyApplication getConsumer();

}
