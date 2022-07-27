import java.util.logging.Level;
import java.util.logging.Logger;
public class Test 
{
//	executing logging object
	public static void main(String[] args) 
	{
		Logger logger=Logger.getLogger(Test.class.getName());
		logger.log(Level.INFO, "This is info message");
		logger.log(Level.WARNING, "This is a simple warning message");
	}

}
