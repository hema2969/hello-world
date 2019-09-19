import org.junit.Test;
import org.testng.Assert;
//import org.testng.annotations.BeforeTest;


public class Test_Methods extends Find_String
{
	

@Test
public void String_input_test()
{
	String out = String_Present("The cow jumped over the moon");
	Assert.assertEquals(out, "The cow jumped over the moon");
	System.out.println("Test passed");
}

@Test
public void First_test_case()
{
	String output = Word_with_max_length("The cow jumped over the moon");
	Assert.assertEquals(output, "jumped");
	System.out.println("Test passed");
}

@Test
public void Second_test_case()
{
	int output1 = Max_Length("The cow jumped over the moon");
	Assert.assertEquals (output1, 6);
	System.out.println("Test passed");
	
}	
}
