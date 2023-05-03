package dependency.injection;

public class MyApplication implements Consumer{
    ServicoMessageIntf servicoMessageIntf;
    public MyApplication(ServicoMessageIntf servicoMessageIntf) {
        this.servicoMessageIntf = servicoMessageIntf;
    }
    @Override
    public void processMessage(String msg, String rec) {
        this.servicoMessageIntf.sendMessage(msg, rec);
    }
}
