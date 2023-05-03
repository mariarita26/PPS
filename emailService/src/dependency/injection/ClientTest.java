package dependency.injection;

public class ClientTest {

    public static void main(String[] args) {
        ServicoMessageIntf  injector = null;
        Consumer app = null;


        injector = new ServicoEmail();
        app = injector.getConsumer();

        app.processMessage("'Olá, Alex'", "'alex@ifpb.edu.br'");

        injector = new ServicoSMS();
        app = injector.getConsumer();
        app.processMessage("'Olá, Alex'", "'(83)98562-8563'");
    }
}
