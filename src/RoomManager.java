import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RoomManager extends Remote {

	public double calculaReserva(double preco, int qtdDias) throws RemoteException;

}
