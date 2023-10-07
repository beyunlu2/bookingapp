
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {
	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	static DateFormat timeFormat = new SimpleDateFormat("HH:mm");
	
	public static int listFlights(String a, String[][] data){
		
		List<Flight> FlightList = new ArrayList<>();
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightdatabase", "root", "");
		
			String query = "SELECT * FROM flight where ";
			if (a == "") query = "SELECT * FROM flight";
			query = query.concat(a);
			System.out.println(query);
			
			PreparedStatement preparedStatement = con.prepareStatement(query, 1);
			ResultSet rs = preparedStatement.executeQuery();
			
			
			while(rs.next()) {
				
				Flight flight = new Flight(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getTime(8), rs.getDate(9), rs.getTime(10), rs.getInt(11), rs.getString(12));
				
				FlightList.add(flight);
				//System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getDate(7)+" "+rs.getTime(8)+" "+rs.getDate(9)+" "+rs.getTime(10)+" "+rs.getInt(11)+" "+rs.getString(12));
				
			}
		
		}
		catch(Exception ex){
			System.out.println("Error: " + ex);
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0;
		
		if(FlightList.isEmpty()) {
			
			stringBuilder.append("There is no flight with these cridentials");
		}
		else {
			for(Flight flight: FlightList) {
				
					data[i][0] = Integer.toString(flight.getFlightNumber());
					data[i][1] = flight.getFirmName();
					data[i][2] = flight.getDeparturePlace();
					data[i][3] = flight.getDepartureAirport();
					data[i][4] = flight.getArrivalPlace();
					data[i][5] = flight.getArrivalAirport();
					data[i][6] = dateFormat.format(flight.getDepartureDate());
					data[i][7] = timeFormat.format(flight.getDepartureTime());
					data[i][8] = dateFormat.format(flight.getArrivalDate());
					data[i][9] = timeFormat.format(flight.getArrivalTime());
					data[i][10] = Integer.toString(flight.getPrice());
					data[i][11] = flight.getConnectingFlight();
					i++;
				
				/*
				 * stringBuilder.append(number) .append(". ") .append(flight.getFlightNumber())
				 * .append(" | ") .append(flight.getFirmName()) .append(" | ")
				 * .append(flight.getDeparturePlace()) .append(" | ")
				 * .append(flight.getDepartureAirport()) .append(" | ")
				 * .append(flight.getArrivalPlace()) .append(" | ")
				 * .append(flight.getArrivalAirport()) .append(" | ")
				 * .append(flight.getDepartureDate()) .append(" | ")
				 * .append(flight.getDepartureTime()) .append(" | ")
				 * .append(flight.getArrivalDate()) .append(" | ")
				 * .append(flight.getArrivalTime()) .append(" | ") .append(flight.getPrice())
				 * .append(" | ") .append(flight.getConnectingFlight()) .append(" \n"); number
				 * += 1;
				 */
					
			
		}
		
		
		
		
		
	}
	
	return i;
	}
}
