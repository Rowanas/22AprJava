package exercises;

public class Iterationexercises {

	public static void flowchart(){
		for (int A = 100; A <=200; A++) {
			System.out.println(A);
			if (A > 200) {
			System.out.println("End");
			}
	}
}
	
	public static void flowchart2(){
		for (int A = 100;A<=200 ; A++) {
			if (A%2==0) {
			System.out.println("-");
			}	else	{
				System.out.println("*");
			}
		}
	}
	
	public static void printNums() {
		for (int i=1; i<=10; i++) {
			for(int runs=1; runs<=10; runs++) {
				System.out.println(i);
			}
		}
	}
	
	public static void oneOnceTenTence() {
		for (int i=1; i<=10; i++) {
			for(int runs=1; runs<=i; runs++) {
				System.out.println(i);
			}
		}
	}

	
	public static void changeCoins(double initialAmount, double cost) {
		double biginitialAmount = initialAmount*100;
		double bigcost = cost*100;
		int totalChange = ((int) biginitialAmount - (int) bigcost);
		int num2000 = 0;
		int num1000 = 0;		
		int num500 = 0;	
		int num100 = 0;	
		int num50 = 0;
		int num20 = 0;
		int num10 = 0;
		int num5 = 0;
		int num2 = 0;
		int num1 = 0;
		while (totalChange >=1)	{
			System.out.println(totalChange);
			if (totalChange>=2000)	{
				totalChange -=2000;
				num2000++;
			}	else if	
					(totalChange>=1000)	{
					totalChange -=1000;
					num1000++;
					System.out.println(totalChange);
			}	else if
					(totalChange>=500)	{
					totalChange -=500;
					num500++;
					System.out.println(totalChange);
			}	else if
					(totalChange>=100)	{
					totalChange -=100;
					num100++;
					System.out.println(totalChange);
			}	else if
					(totalChange>=50)	{
					totalChange -=50;
					num50++;
					System.out.println(totalChange);
			}	else if
					(totalChange>=20)	{
					totalChange -=20;
					num20++;
					System.out.println(totalChange);
			}	else if
					(totalChange>=10)	{
					totalChange -=10;
					num10++;
					System.out.println(totalChange);
			}	else if 
					(totalChange>=5)	{
					totalChange -=5;
					num5++;
					System.out.println(totalChange);
			}	else if
					(totalChange>=2)	{
					totalChange -=2;
					num2++;
					System.out.println(totalChange);
			}	else if 
					(totalChange>=1)	{
					totalChange -=1;
					num1++;
					System.out.println(totalChange);
				}	else	{
							}
			} System.out.println("You paid £"+initialAmount+" for something worth £"+cost+". You were given "+num2000+" £20 notes, "+num1000+" £10 notes, "+num500+" £5 notes, "+num100+" £1 coins, "+num50+" 50p coins, "+num20+" 20p coins, "+num10+" 10p coins, "+num5+" 5p coins, "+num2+" 2p coins, and "+num1+" 1p coins");
	}
	
	
	
	public static void main(String[] args) {
		//flowchart();
		//flowchart2();
		//printNums();
		//oneOnceTenTence();
		changeCoins(40,4.56);
		
	}

}
