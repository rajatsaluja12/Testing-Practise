package pojo;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class ProductTest {

	public static void main(String[] args) throws SerializeException, ParseException {
		
		//pojo to json : serialization 
		
		JsonSerializer jsonseralizer =	JsonSerializer.DEFAULT_READABLE;
		
		String seller[] = {"neon Enterprise","Jagdish IT","ABC software"};
		
		Product pro = new Product("Macbook",1000,"White",seller);
		
		String json = jsonseralizer.serialize(pro);
		System.out.println(json);
		
		
		//Pojo to xml : 
		
		XmlSerializer xmlserializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xml = xmlserializer.serialize(pro);
		System.out.println(xml);
		
		
		//Pojo to HTML :
		
		HtmlSerializer htmlseralizer = HtmlSerializer.DEFAULT_SQ_READABLE;
		String html = htmlseralizer.serialize(pro);
		System.out.println(html);
		
		//Deseralization : JSON to POJO 
		
		JsonParser jsonparser = JsonParser.DEFAULT;
		String jsonVal = "{\r\n"
				+ "	\"color\": \"White\",\r\n"
				+ "	\"name\": \"Macbook\",\r\n"
				+ "	\"price\": 1000,\r\n"
				+ "	\"sellerName\": [\r\n"
				+ "		\"neon Enterprise\",\r\n"
				+ "		\"Jagdish IT\",\r\n"
				+ "		\"ABC software\"\r\n"
				+ "	]\r\n"
				+ "}";
		
	Product product = 	jsonparser.parse(jsonVal, Product.class);
	System.out.println(product.getColor());
	System.out.println(product);
		
		
	}

}
