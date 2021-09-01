package bankstandard;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;



/*
 * public class Config {
 * 
 * 
 * private static final String setConfigFilePath =
 * System.getProperty("user.dir")+ "/src/main/resource/set.properties"; private
 * static final Properties getProperties;
 * 
 * public final static HashMap<String, String> dynamicConfigs = new
 * HashMap<String, String>();
 * 
 * //get // try { InputStream is = null; getProperties = new Properties(); is =
 * ClassLoader.class.getResourceAsStream("/Get.properties");
 * getProperties.load(is); //}catch(IOException e) //{ // throw new
 * RuntimeException("unable to load properties file"); // }
 * 
 * 
 * public static String getValue(String key) { return
 * getProperties.getProperty(key); } //set and get into hashmap public static
 * void setDynamicValue(String key, String Value) { dynamicConfigs.put(key,
 * Value); }
 * 
 * public static String getDynamicValue(String Key) { return
 * dynamicConfigs.get(Key); }
 * 
 * public static void main(String[] args) {
 * 
 * 
 * Response response = rest(log).config(RestAssured.con)
 * 
 * }
 * 
 * }
 */
