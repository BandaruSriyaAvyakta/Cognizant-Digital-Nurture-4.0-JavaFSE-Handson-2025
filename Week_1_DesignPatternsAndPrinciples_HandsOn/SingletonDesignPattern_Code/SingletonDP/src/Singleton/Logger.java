package Singleton;

public class Logger {

	private static Logger instance = new Logger();
	
	private Logger()
	{}
	
	public static Logger getinstance()
	{
			return instance;			
	}
	
	public void ShowMessageLog()
	{
		System.out.println("Hello! From Singleton class...");
	}
	
	public static void main(String args[])
	{
	
		Logger l1 = Logger.getinstance();
		l1.ShowMessageLog();
		
		Logger l2 = Logger.getinstance();
		l2.ShowMessageLog();
		
		if(l1 == l2)
		{
			System.out.println("Test Case Passed : Only one instance is created");
			System.out.println("It follows Singleton Pattern.");
		}
		else
		{
			System.out.println("Test Case Failed : Multiple instances exist");
			System.out.println("It does not follow Singleton Pattern.");
		}
	}	
}
