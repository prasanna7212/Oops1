
public class BankInfoOverRidding {
	public class AxisBankOverridding extends BankInfoOverRidding{
		public void deposit() {
			System.out.println("deposit"+"="+"5500000");
		

	public class AxisBankOverridding extends BankInfoOverRidding{
		public void deposit() {
			System.out.println("deposit"+"="+"5500");
		}
		public static void main(String[] args) {
			AxisBankOverridding bank= new AxisBankOverridding();
			bank.saving();
			bank.fixed();
			bank.deposit();
		}

	}

