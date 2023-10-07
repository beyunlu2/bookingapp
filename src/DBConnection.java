
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
public class DBConnection {
	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 

	public static int execute(String strings[], List<String> queries, JDateChooser departureDateMin, String[][] data) {
		String temp = new String();
		String final_query = new String();
		int count;
		  int i = 0;
		  List<Integer> columns = new ArrayList<Integer>();
        for(String string: strings) {
      	  if (string != null) 
      		  columns.add(i);
      	  i++;
        }
      	  
      	  for(Integer index: columns) {
      		  queries.set(index, queries.get(index).replace("?", '"'+strings[index]+'"'));
      		  final_query = final_query.concat(queries.get(index));
      		  if (index != columns.get(columns.size() - 1)) {
      			  final_query = final_query.concat(" and ");
      		  }
      	  }
      	  System.out.println(final_query);
      	  count = DBConnector.listFlights(final_query, data);
      	  
      	for(Integer index: columns) {
    		  queries.set(index, queries.get(index).replace('"'+strings[index]+'"', "?"));
    		  final_query = final_query.concat(queries.get(index));
    		  if (index != columns.get(columns.size() - 1)) {
    			  final_query = final_query.concat(" and ");
    		  }
    	  }
        return count;
	}
}
