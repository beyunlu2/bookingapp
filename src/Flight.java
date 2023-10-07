
import java.sql.*;

public class Flight {
	
	private int FlightNumber, Price;
	private String FirmName;
	private String DeparturePlace, DepartureAirport, ArrivalPlace, ArrivalAirport;
	private Date DepartureDate, ArrivalDate;
	private Time DepartureTime, ArrivalTime;
	private String ConnectingFlight;
	
	
	public Flight(int FlightNumber, String FirmName, String DeparturePlace, String DepartureAirport, String ArrivalPlace, String ArrivalAirport, Date DepartureDate, Time DepartureTime, Date ArrivalDate, Time ArrivalTime, int Price, String ConnectingFlight) {
	
		this.FlightNumber = FlightNumber;
		this.FirmName = FirmName;
		this.DeparturePlace = DeparturePlace;
		this.DepartureAirport = DepartureAirport;
		this.ArrivalPlace = ArrivalPlace;
		this.ArrivalAirport = ArrivalAirport;
		this.DepartureDate = DepartureDate;
		this.DepartureTime = DepartureTime;
		this.ArrivalDate = ArrivalDate;
		this.ArrivalTime = ArrivalTime;
		this.Price = Price;
		this.ConnectingFlight = ConnectingFlight;
}


	public int getFlightNumber() {
		return FlightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		FlightNumber = flightNumber;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public String getFirmName() {
		return FirmName;
	}


	public void setFirmName(String firmName) {
		FirmName = firmName;
	}


	public String getDeparturePlace() {
		return DeparturePlace;
	}


	public void setDeparturePlace(String departurePlace) {
		DeparturePlace = departurePlace;
	}


	public String getDepartureAirport() {
		return DepartureAirport;
	}


	public void setDepartureAirport(String departureAirport) {
		DepartureAirport = departureAirport;
	}


	public String getArrivalPlace() {
		return ArrivalPlace;
	}


	public void setArrivalPlace(String arrivalPlace) {
		ArrivalPlace = arrivalPlace;
	}


	public String getArrivalAirport() {
		return ArrivalAirport;
	}


	public void setArrivalAirport(String arrivalAirport) {
		ArrivalAirport = arrivalAirport;
	}


	public Date getDepartureDate() {
		return DepartureDate;
	}


	public void setDepartureDate(Date departureDate) {
		DepartureDate = departureDate;
	}


	public Date getArrivalDate() {
		return ArrivalDate;
	}


	public void setArrivalDate(Date arrivalDate) {
		ArrivalDate = arrivalDate;
	}


	public Time getDepartureTime() {
		return DepartureTime;
	}


	public void setDepartureTime(Time departureTime) {
		DepartureTime = departureTime;
	}


	public Time getArrivalTime() {
		return ArrivalTime;
	}


	public void setArrivalTime(Time arrivalTime) {
		ArrivalTime = arrivalTime;
	}


	public String getConnectingFlight() {
		return ConnectingFlight;
	}


	public void setConnectingFlight(String connectingFlight) {
		ConnectingFlight = connectingFlight;
	}
	
}
