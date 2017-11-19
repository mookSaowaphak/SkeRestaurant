import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantManager {
	static Scanner scan = new Scanner(System.in);
	static private String[] menu;
	static private double[] price;
	static final String menuFile = "data/menu.txt";
	static final String writeOrder = "data/writeOrder.txt";
	
	
	static void init(){
		ClassLoader loader = RestaurantManager.class.getClassLoader();
		ArrayList<String> menuItemsList = new ArrayList<>();
		ArrayList<Double> pricesList = new ArrayList<>();

		InputStream in = loader.getResourceAsStream(menuFile);
		if (in == null) {
			System.out.println("Could not access file " + menuFile);
			return;

	}


		Scanner scanfile = new Scanner(in);

		while (scanfile.hasNextLine()) {
			String line = scanfile.nextLine();
			if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
				continue;
			}

			String[] array = line.split("; ");
			menuItemsList.add(array[0]);
			pricesList.add(Double.parseDouble(array[1]));
		}
		
		menu = new String[menuItemsList.size()];
		menuItemsList.toArray(menu);
		
		price = new double[pricesList.size()];
		for(int n = 0; n < pricesList.size(); n++) price[n] = pricesList.get(n);
		
		scanfile.close();
	}
	static void writeToFile() throws IOException{
		  File output = new File(writeOrder);
		  FileOutputStream out;
		  try {
		      out = new FileOutputStream(output, true);
		  } catch (FileNotFoundException ex) {
		      System.out.println("Couldn't open output file " + output);
		      return;
		  }
		  out.close();
	}
		
	
	
		public static double[] getPrices() {
			return price;
		
		}
	
	public static String[] getMenuItems() {
			return menu;
		

	
	

}
}