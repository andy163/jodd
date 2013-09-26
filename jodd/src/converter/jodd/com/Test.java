package converter.jodd.com;

import jodd.typeconverter.Convert;
import jodd.typeconverter.TypeConverter;
import jodd.typeconverter.TypeConverterManager;


public class Test {

	public static void main(String[] args) {
		TypeConverter tc = TypeConverterManager.lookup(String.class);
		System.out.println(Integer.valueOf("1"));
	}
	
}
