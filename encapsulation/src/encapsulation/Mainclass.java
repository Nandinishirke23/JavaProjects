package encapsulation;

class Account
{
	private double bal;
	
	 public void setBal(double bal)
	 {
		 if(bal > 0)
		 {
			 this.bal=bal;
		 }
	 }
	 public double getBal()
	 {
		 return bal;
	 }
}

public class Mainclass {

	public static void main(String[] args) 
	{
		Account a1=new Account();
		a1.setBal(2000);
		double b1=a1.getBal();
		System.out.println(b1);
		a1.setBal(2000);
		b1=a1.getBal();
		System.out.println(b1);
	}

}
