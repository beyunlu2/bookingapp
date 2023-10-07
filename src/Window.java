import java.awt.EventQueue;

import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DateFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class Window extends JFrame {
	private JTextField flightID_input;
	private JTextField airlineInput;
	private JTextField departurePlaceInput;
	private JTextField departureAirportInput;
	private JTextField arrivalPlaceInput;
	private JTextField arrivalAirportInput;
	private JTextField textField;
	private JTextField textField_1;
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	DateFormat timeFormat = new SimpleDateFormat("HH:mm");
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setTitle("Booking App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1104, 451);
		getContentPane().setLayout(null);
		
		flightID_input = new JTextField();
		flightID_input.setBounds(34, 48, 40, 20);
		getContentPane().add(flightID_input);
		flightID_input.setColumns(10);
		String flightID_query = "FlightNumber = ?";
		
		JLabel lblNewLabel = new JLabel("Flight ID");
		lblNewLabel.setBounds(34, 23, 46, 14);
		getContentPane().add(lblNewLabel);
		
		airlineInput = new JTextField();
		airlineInput.setBounds(84, 48, 103, 20);
		getContentPane().add(airlineInput);
		airlineInput.setColumns(10);
		String airline_query = "FirmName = ?";
		
		departurePlaceInput = new JTextField();
		departurePlaceInput.setBounds(193, 48, 103, 20);
		getContentPane().add(departurePlaceInput);
		departurePlaceInput.setColumns(10);
		String depPlace_query = "DeparturePlace = ?";
		
		departureAirportInput = new JTextField();
		departureAirportInput.setBounds(306, 48, 103, 20);
		getContentPane().add(departureAirportInput);
		departureAirportInput.setColumns(10);
		String depAirport_query = "DepartureAirport = ?";
		
		arrivalPlaceInput = new JTextField();
		arrivalPlaceInput.setBounds(419, 48, 103, 20);
		getContentPane().add(arrivalPlaceInput);
		arrivalPlaceInput.setColumns(10);
		String arrPlace_query = "ArrivalPlace = ?";
		
		arrivalAirportInput = new JTextField();
		arrivalAirportInput.setBounds(532, 48, 103, 20);
		getContentPane().add(arrivalAirportInput);
		arrivalAirportInput.setColumns(10);
		String arrAirport_query = "ArrivalAirport = ?";
		
		JLabel lblNewLabel_1 = new JLabel("Airline");
		lblNewLabel_1.setBounds(115, 23, 51, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Departure Place");
		lblNewLabel_2.setBounds(193, 23, 98, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Departure Airport");
		lblNewLabel_3.setBounds(306, 23, 103, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Arrival Place");
		lblNewLabel_4.setBounds(421, 23, 101, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Arrival Airport");
		lblNewLabel_5.setBounds(534, 23, 101, 14);
		getContentPane().add(lblNewLabel_5);
		
		JButton queryButton = new JButton("Run Query");
		queryButton.setBounds(496, 86, 101, 23);
		getContentPane().add(queryButton);
		
		JDateChooser departureDateMin = new JDateChooser();
		departureDateMin.setBounds(643, 48, 101, 20);
		getContentPane().add(departureDateMin);
		Date bos = new Date(System.currentTimeMillis());
		departureDateMin.setDate(bos);
		departureDateMin.getJCalendar().setMinSelectableDate(bos);
		String departureDate_query = "DepartureDate = ?";
		Date bos2 = new Date(System.currentTimeMillis());
		String arrDate_query = "ArrivalDate = ?";
		
		
		String departureTime_query = "DepartureTime = ?";
		
		String arrTime_query = "ArrivalTime = ?";
		
		JTextField priceInput = new JTextField();
		priceInput.setBounds(754, 48, 46, 20);
		getContentPane().add(priceInput);
		priceInput.setColumns(10);
		String price_query = "Price = ?";
		
		JLabel lblNewLabel_6 = new JLabel("Departure Date");
		lblNewLabel_6.setBounds(645, 23, 101, 14);
		getContentPane().add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_10 = new JLabel("Price");
		lblNewLabel_10.setBounds(754, 23, 46, 14);
		getContentPane().add(lblNewLabel_10);
		
		JTextField connInput = new JTextField();
		connInput.setBounds(810, 48, 86, 20);
		getContentPane().add(connInput);
		connInput.setColumns(10);
		String conn_query = "ConnectingFlight = ?";
		
		JLabel lblNewLabel_7 = new JLabel("Connecting Flight");
		lblNewLabel_7.setBounds(810, 23, 98, 14);
		getContentPane().add(lblNewLabel_7);
		
		String data[][] = new String[15][12];   
		String column[]={"Flight Number", "Firm Name" ,"Departure Place", "Departure Airport", "Arrival Place", "Arrival Airport", "Departure Date", "Departure Time", "Arrival Date", "Arrival Time", "Price", "Connecting Flight"};         
		table = new JTable(data, column);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(table);
		table.setBounds(816, 252, 262, 650);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(6, 128, 1072, 273);
		getContentPane().add(scrollPane);
		
		JButton allButton = new JButton("List All");
		allButton.setBounds(653, 86, 89, 23);
		getContentPane().add(allButton);
		
		
		
		List<String> queries = new ArrayList<String>();
		queries.add(flightID_query);
		queries.add(airline_query);
		queries.add(depPlace_query);
		queries.add(depAirport_query);
		queries.add(arrPlace_query);
		queries.add(arrAirport_query);
		queries.add(departureDate_query);
		queries.add(departureTime_query);
		queries.add(arrDate_query);
		queries.add(arrTime_query);
		queries.add(price_query);
		queries.add(conn_query);
	
		
		queryButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	
				for(int j = 0 ; j <= 10 ; j++) {
									
					data[j][0] = null;
					data[j][1] = null;
					data[j][2] = null;
					data[j][3] = null;
					data[j][4] = null;
					data[j][5] = null;
					data[j][6] = null;
					data[j][7] = null;
					data[j][8] = null;
					data[j][9] = null;
					data[j][10] = null;
					data[j][11] = null;
					
					
				}
				table.repaint();
		    	
		    	JTextField[] inputs = {flightID_input, airlineInput, departurePlaceInput, departureAirportInput, arrivalPlaceInput, arrivalAirportInput};
				String[] strings = new String[12];
				
				for(int i = 0; i < 6; i++) {
					strings[i] = inputs[i].getText().isBlank() ? null : inputs[i].getText();
				}
				strings[6] = dateFormat.format(departureDateMin.getDate());
				strings[7] = null;
				strings[8] = null;
				strings[9] = null;
				strings[10] = priceInput.getText().isBlank() ? null : priceInput.getText();
				strings[11] = connInput.getText().isBlank() ? null : connInput.getText();
				
		    	int i = DBConnection.execute(strings, queries, departureDateMin, data);
		    	table.repaint();
		    	
		    	
		              
		    }  
		});
		
		allButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	JTextField[] inputs = {flightID_input, airlineInput, departurePlaceInput, departureAirportInput, arrivalPlaceInput, arrivalAirportInput};
				String[] strings = new String[12];
				
				int count = DBConnector.listFlights("", data);
		    	table.repaint();
		    	
		              
		    }  
		}); 
			
	}
}
