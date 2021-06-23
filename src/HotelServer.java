import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HotelServer extends UnicastRemoteObject implements RoomManager {

	private static final long serialVersionUID = 1L;

	protected HotelServer() throws RemoteException {
	}

	@Override
	public double calculaReserva(double preco, int qtdDias) {
		return preco * qtdDias;
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		LocateRegistry.createRegistry(2335);
		HotelServer h = new HotelServer();
		Naming.rebind("//localhost:2335/room", h);
		System.out.println("\n Servidor Hotel está pronto!");

	}

}
