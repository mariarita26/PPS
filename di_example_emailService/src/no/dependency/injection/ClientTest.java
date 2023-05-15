package no.dependency.injection;

public class ClientTest {
	public static void main(String[] args) {
		MyApplication app = new MyApplication();
		app.processMessages("Ola Alex! Mostra um exemplo de DI.", "alex@ifpb.edu.br");
	}
}
