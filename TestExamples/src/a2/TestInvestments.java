package a2;

public class TestInvestments 
{
	public static void main(String[] args) 
	{
		Stock[] p = new Stock[] {new Stock(1000, 53.45, "GnMotr"),new Stock(100, 29.05, "GenElec"),new Stock(220, 44.08, "GenMills")};
		Advisor deweyCheethamAndHowe = new Advisor();
		Investor sucker = new Investor(p, deweyCheethamAndHowe);
		System.out.println(sucker.describePortfolio());
		sucker.askAdvice();
		System.out.println(sucker.describePortfolio());
	}
}
