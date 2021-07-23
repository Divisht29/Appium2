package pac.practice;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.Properties;

	import org.testng.annotations.Test;

	public class ReadDataFromPropertyFile { 
		@Test
		public void readDataTest() throws Throwable {
			//Read the Data From Properties File
			FileInputStream fis=new FileInputStream("data.properties");
			
			Properties pObject=new Properties();
			pObject.load(fis);
			String URL=pObject.getProperty("url");
			System.out.println(URL);
			

}
}