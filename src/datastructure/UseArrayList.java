package datastructure;

import java.util.*;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		List<String> CityUsa = new ArrayList<String>();

		CityUsa.add("NY");
		CityUsa.add("NJ");
		CityUsa.add("CA");

		List<String> CityBD = new ArrayList<String>();

		CityBD.add("DHAKA");
		CityBD.add("CTG");
		CityBD.add("SLT");

		Map<String, List<String>> ListOfCon = new HashMap<String,List<String>>();

		ListOfCon.put("USA", CityUsa);
		ListOfCon.put("BD", CityBD);

		for (Map.Entry<String, List<String>> state:ListOfCon.entrySet()){

			if (ListOfCon.get("USA").contains("NY")){
				System.out.println(state.getKey()+"----->" + state.getValue());

			}

		}


		}
	}