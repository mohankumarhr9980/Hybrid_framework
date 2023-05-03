package Test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Featch_Data;
import Generic.Generic_class;
import pom.Pom;

public class Logun_Script extends Generic_class

{

	@Test
	public void test1()
	{
		String un=Featch_Data.get_data("Sheet1", 0, 0);
		String pwd=Featch_Data.get_data("Sheet1", 0, 1);
		Pom p=new Pom(driver);
		p.username(un);
		Assert.fail();
		p.password(pwd);
		p.login_btn();
	}

}

