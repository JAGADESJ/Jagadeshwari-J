import java.util.Scanner;

public class MoneyManagement {

	public static void main(String[] args) {

		int income;
		double NEC;
		double FFA;
		double EDU;
		double LTSS;
		double PLAY;
		double GIVE;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your income this month:");
		income = in.nextInt();

		NEC = 55;
		FFA = 10;
		EDU = 10;
		LTSS = 10;
		PLAY = 10;
		GIVE = 5;

		double subaccountsNEC = (income * NEC / 100);

		System.out.println("NEC: " + subaccountsNEC);
		
		double subaccountsFFA = (income * FFA / 100);

		System.out.println("FFA: " + subaccountsFFA);
		
		double subaccountsEDU = (income * EDU / 100);

		System.out.println("EDU: " + subaccountsEDU);
		
		double subaccountsLTSS = (income * LTSS / 100);

		System.out.println("LTSS: " + subaccountsLTSS);
		
		double subaccountsPLAY = (income * PLAY / 100);

		System.out.println("PLAY: " + subaccountsPLAY);
		
		double subaccountsGIVE = (income * GIVE / 100);

		System.out.println("GIVE: " + subaccountsGIVE);

	}
}
