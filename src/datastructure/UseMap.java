package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

              //for each
		Map<String,String > CountryNCity = new HashMap<String, String>();

		CountryNCity.put("USA","NY");
		CountryNCity.put("CANADA","MONTREAL");
		CountryNCity.put("BANGLADESH", "DHAKA");

		for(Map.Entry<String,String> state:CountryNCity.entrySet()){
			System.out.println(state.getKey()+ "----->" + state.getValue());
		}
	}

}
