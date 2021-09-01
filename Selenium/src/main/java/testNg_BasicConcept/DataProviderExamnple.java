package testNg_BasicConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExamnple {
	
	@Test(dataProvider = "LoginDataProvider") // if your dataprovider is in different class , so you hava add one more parameter and we have to write as 
		//@Test(dataProvider = "LoginDataProvider", dataproviderclass=Classname.class) // here classname will be the one where you kept dataprovider
	public void loginTest(String email , String pwd)
	{
		System.out.println(email+ " "+pwd);
		
	}
	
	@DataProvider(name = "LoginDataProvider")
	public Object[][] getdata()
	{
		Object[][] data = {{"abc@gmail.com", "abc"},{"ccac@gmail.com", "111"},{"rakshit@gmail.com", "sdshugasu"}};
		
		return data;
		
	}
	
	@DataProvider(name = "RealtoNickName")
	public Object[][] getData(){
		
		Object[][]  daata = {{"rameshjaiswal","Chotu"},{"SakshamSaluja","Sheenu"},{"Rajat","sonu"},{"Rahul","Prince"}};
		return daata;
	}

	@Test(dataProvider = "RealtoNickName")
	public void RealVsnickName(String real,String nickn) {
		System.out.println(real+" "+nickn);
	}
	
}
