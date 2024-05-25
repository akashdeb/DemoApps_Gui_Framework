package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleData {
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] arr = new Object[3][3];
		
		arr[0][0] = "Nandlal";
		arr[1][0] = "Vaishali";
		arr[2][0] = "Khushi";
		
		arr[0][1] = "Plane";
		arr[1][1] = "Balushai";
		arr[2][1] = "Purse";
	
        arr[0][2] = 7;
        arr[1][2] = 4;
        arr[2][2] = 5;

        return arr;
	}
	
	@Test(dataProvider = "data")
	public void test(String user, String product, int qty) {
		System.out.println(""+user+" wants "+qty+" no of "+product+"");
	}
	
	
	

}
