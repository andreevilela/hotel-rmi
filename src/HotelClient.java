import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class HotelClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		RoomManager roomManager;
		Scanner sc = new Scanner(System.in);

		Quarto quarto0 = new Quarto(0, "individual", 10, 55.0);
		Quarto quarto1 = new Quarto(1, "duplo", 20, 75.0);
		Quarto quarto2 = new Quarto(2, "duplo", 5, 80.0);
		Quarto quarto3 = new Quarto(3, "tripo", 3, 150.0);
		Quarto quarto4 = new Quarto(4, "quádrupo", 2, 230.0);

		while (true) {
			System.out.println("HOTEL ROOM RESERVATION SYSTEM");
			System.out.println("##############################################################");
			System.out.println("Quartos disponíveis:");
			System.out.println(quarto0);
			System.out.println(quarto1);
			System.out.println(quarto2);
			System.out.println(quarto3);
			System.out.println(quarto4);
			System.out.println("##############################################################");

			int tipo;
			do {
				System.out.println("Informe o TIPO do quarto:");
				tipo = sc.nextInt();
			} while (tipo < 0 || tipo > 4);

			int qtdDias;
			do {
				System.out.println("Informe a quantidade de dias: ");
				qtdDias = sc.nextInt();
			} while (qtdDias <= 0);

			double result;
			roomManager = (RoomManager) Naming.lookup("rmi://localhost:2335/room");

			switch (tipo) {
			case 0: {
				result = roomManager.calculaReserva(quarto0.getPreco(), qtdDias);
				quarto0.reservaQuarto();
				System.out.println("\n Valor a pagar: " + result + "\n\n");
				break;
			}
			case 1: {
				result = roomManager.calculaReserva(quarto1.getPreco(), qtdDias);
				quarto1.reservaQuarto();
				System.out.println("\n Valor a pagar: " + result + "\n\n");
				break;
			}
			case 2: {
				result = roomManager.calculaReserva(quarto2.getPreco(), qtdDias);
				quarto2.reservaQuarto();
				System.out.println("\n Valor a pagar: " + result + "\n\n");
				break;
			}
			case 3: {
				result = roomManager.calculaReserva(quarto3.getPreco(), qtdDias);
				quarto3.reservaQuarto();
				System.out.println("\n Valor a pagar: " + result + "\n\n");
				break;
			}
			case 4: {
				result = roomManager.calculaReserva(quarto4.getPreco(), qtdDias);
				quarto4.reservaQuarto();
				System.out.println("\n Valor a pagar: " + result + "\n\n");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + tipo);
			}

		}
	}

}
