import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest {
	
  @Test
  public void f() throws IOException {

	  
	  String http_url = "http://192.168.99.101:8080/myapp/hello";
	 
	  URL url = new URL(http_url);
      HttpURLConnection httpCon = (HttpURLConnection) (url).openConnection();
      httpCon.setRequestMethod("GET");
      BufferedReader in = new BufferedReader(
		        new InputStreamReader(httpCon.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
	    Assert.assertEquals(response.toString(), "Hello, This is for testing pipeline_demoo");
  }
 

  
}