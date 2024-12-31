package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 //Getting size of row and column
		 int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		 int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		 //get specific element
		 String text=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[6]/td[1]")).getText();
		 System.out.print(text);

		 //read allthe row and column data
		 for(int i=2;i<=rows;i++) {
			 for(int j=1;j<=column;j++) {
				String value= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(value+"\t");
			 }System.out.println();
		 }
		 //getting authornames
		 for(int i=2;i<=rows;i++) {
			String values= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[2]")).getText();
			if(values.equals("Mukesh")) {
			String bookname=driver.findElement(By.xpath("//*[@id=\\\"HTML1\\\"]/div[1]/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(bookname);
			}
			
		 }
	}
	
}
