
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SKERestaurant {
	static Scanner sc = new Scanner(System.in);
	static double[] price = { 250.00, 120.00, 110.00 };
	static String[] menu = { "pizza", "Chickens", "coke" };
	static int[] quantity = { 0, 0, 0 };
	static protected DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
	static protected LocalDateTime now = LocalDateTime.now();
	private static RestaurantManager srm;

	public SKERestaurant(RestaurantManager rm){
		this.srm = rm;
	}
		public static void printMenuList() {
			menu = srm.getMenuItems();
			price = srm.getPrices();
			
			System.out.println("\n>> Menu Items List <<");
			for (int n = 0; n <= menu.length - 1; n++) {
				System.out.printf("\t%2d. ", n + 1);
				for (int k = n; k <= n; k++) {
					System.out.printf("%-27s %6.2f Baht.\n", menu[k], price[k]);
				}
	
			}	
		}
	
	public static void change() {

		System.out.print("Cash : ");
		double csh = sc.nextDouble();
		double change = csh - totalSum();
		double change1 = csh - totalSum();
		System.out.printf("Change : ", change1);

	}
	

	public static double totalSum() {
		double sum = 0;
		for (int i = 0; i < quantity.length; i++) {
			sum = sum + quantity[i] * price[i];
		}
		return sum;
	}

	public static double vat() {
		double sum = 0;
		for (int i = 0; i < quantity.length; i++) {
			sum = sum + quantity[i] * price[i] * 7 / 100;
		}
		return sum;

	}

	public static double Totalvat() {
		double totalvat1 = 0;
		double sum = 0;
		for (int i = 0; i < quantity.length; i++) {
			sum = sum + quantity[i] * price[i] * 7 / 100;
			totalvat1 = sum + totalSum();
		}
		return totalvat1;

	}

	public static double Discount() {
		double dis = Totalvat() - Totalvat() * 10 / 100;
		return dis;
	}

	public static double Totaldis() {
		double csh = 0;
		double tdis = csh - Discount();
		return tdis;
	}

	/**public static void printCommands(){
		System.out.printf("\nPress :\t[ o ] --> Start order");
		System.out.printf("\n\t[ p ] --> Print latest order");
		System.out.printf("\n\t[ e ] --> Edit \n");
		System.out.println("\t\t  (put ' - ' for reduce quantity)");
		System.out.printf("\t[ q ] --> Show reciept and Exit");
		System.out.printf("\n\t[ m ] --> Show menu list");
		System.out.printf("\n\t[ x ] --> Show commands\n");
	} **/
	
	public static void printCommandsAndMenu(){
		total();
	}
	
	public static void blank(double total, double csh) {
		System.out.print(" +---------------------------+----------------+\n ");
		System.out.println("|              CASH COUPON                   | ");
		System.out.print(" +------ Coupon -------------+---Amount-------+\n ");
		double money = csh - Discount();
		double ts = Math.floor(money / 1000);
		System.out.printf("|%-27s|%16.0f|\n ", "1000-baht", ts);
		money = money % 1000;
		double fh = Math.floor(money / 500);
		System.out.printf("|%-27s|%16.0f|\n ", "500-baht", fh);
		money = money % 500;
		double h = Math.floor(money / 100);
		System.out.printf("|%-27s|%16.0f|\n ", "100-baht", h);
		money = money % 100;
		double ft = Math.floor(money / 50);
		System.out.printf("|%-27s|%16.0f|\n ", "50-baht", ft);
		money = money % 50;
		double tw = Math.floor(money / 20);
		System.out.printf("|%-27s|%16.0f|\n ", "20-baht", tw);
		money = money % 20;
		double t = Math.floor(money / 10);
		System.out.printf("|%-27s|%16.0f|\n ", "10-baht", t);
		money = money % 10;
		double f = Math.floor(money / 5);
		System.out.printf("|%-27s|%16.0f|\n ", "5-baht", f);
		money = money % 5;
		double o = Math.floor(money / 1);
		System.out.printf("|%-27s|%16.0f|\n ", "1-baht", o);
		System.out.print("+---------------------------+----------------+\n ");
		double totalbnk = ts + fh + h + ft + tw + t + f + o;
		System.out.printf("|Total coupon               |               %.0f|\n ", totalbnk);
		System.out.print("+---------------------------+----------------+\n ");
	}

	public static void TotalDiscount() {

		System.out.print(" +--------------------------------------------+\n");
		System.out.println(" |                SKE RESTAURANT              | ");
		System.out.print(" +------ Menu -----+-- Qty --+---- Price -----+\n ");
		for (int i = 0; i < menu.length; i++) {
			if (quantity[i] > 0) {
				System.out.printf("|%-8s\t   |    %5d|    %.2f Baht.|\n ", menu[i], quantity[i],
						quantity[i] * price[i]);
			}
		}

		System.out.print("+---------------------------+----------------+\n");
		System.out.printf(" |Total\t\t\t     |    %.2f Baht.|\n ", totalSum());

		System.out.print("+---------------------------+----------------+\n");
		System.out.println(" |             VAT RECEIPT SUMMARY            | ");
		System.out.print(" +------ Net ------+- Vat ---+---- Total -----+\n ");
		System.out.printf("|%.2f           |   %.2f|     %.2f Baht.|\n ", totalSum(), vat(), Totalvat());
		System.out.print("+---------------------------+----------------+\n");

		System.out.print(" +---------------------------+----------------+\n ");
		System.out.println("|            MEMBER CARDS DISCOUNT           | ");
		System.out.print(" +---------------------------+----------------+\n");
		System.out.printf(" |Discount                   |    %.2f Baht.|\n ", Discount());
		System.out.print("+---------------------------+----------------+\n");

	}

	public static void total() {
		double csh = 0;
		System.out.print(" +--------------------------------------------+\n");
		System.out.println(" |              SKE RESTAURANT                | ");
		System.out.print(" +------ Menu -----+-- Qty --+---- Price -----+\n ");
		for (int i = 0; i < menu.length; i++) {
			if (quantity[i] > 0) {
				System.out.printf("|%-8s\t   |    %5d|    %.2f Baht.|\n ", menu[i], quantity[i],
						quantity[i] * price[i]);
			}
		}

		System.out.print("+---------------------------+----------------+\n");

		System.out.printf(" |Total\t\t\t     |    %.2f Baht.|\n ", totalSum());
		System.out.print("+---------------------------+----------------+\n");

		System.out.print(" +---------------------------+----------------+\n");
		System.out.println(" |             VAT RECEIPT SUMMARY            | ");
		System.out.print(" +------ Net ------+- Vat ---+---- Total -----+\n ");
		System.out.printf("|%.2f           |    %.2f|    %.2f Baht.|\n ", totalSum(), vat(), Totalvat());
		System.out.print("+---------------------------+----------------+\n");
		System.out.printf(" |Total\t\t\t     |    %.2f Baht.|\n ", Totalvat());

		System.out.print("+---------------------------+----------------+\n ");

	}
	public static void recordOrder(int orderNumber) {
	
		price = srm.getPrices();
		int[] quantity = new int[price.length];
		double[] result = new double[price.length];

		while (true) {
			System.out.print("\nEnter your Command: ");
			String inChoice = sc.next();
			if (inChoice.equals("p")) {
				menu = srm.getMenuItems();
			}
			if (inChoice.equals("e") || inChoice.equals("o")) {
				while (true) {
					System.out.print("\nEnter menu item / Command: ");
					if (sc.hasNextInt()) {
						orderNumber = sc.nextInt();
						if (orderNumber >= 1 && orderNumber <= price.length) {
							System.out.print("Enter Quantity: ");
							int quantities = sc.nextInt();
							for (int ch = 1; ch <= price.length; ch++) {
								if (orderNumber == ch) {
									quantity[ch - 1] = quantity[ch - 1] + quantities;
									if (quantity[ch - 1] < 0) {
										quantity[ch - 1] = 0;
									}
									result[ch - 1] = quantity[ch - 1] * price[ch - 1];
								}
							}
						}
					} else {
						inChoice = sc.next();
						if (inChoice.equals("p")) {
							menu = srm.getMenuItems();
							break;
						} else break;
					}
				}
			}
			if (inChoice.equals("m")) printMenuList();
			if (inChoice.equals("q")) {
				total();
				break;
			}
		}
	}		
	public static void main(String[] args) {
		
		System.out.println("---------Welcome to SKE Restaurant ------------");
		System.out.println("\t   " + dt.format(now));
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("(%d.) %s    %.2f Bath.\n", i + 1, menu[i], price[i]);
		}

		System.out.printf("%d.) Total ", menu.length + 1);
		System.out.printf("%d.) Cash ", menu.length + 2);
		System.out.printf("%d.) Exit  ", menu.length + 3);
		int choi = -1;
		double csh = 0;
		double total = 0;

		while (true) {
			System.out.printf("\nEnter your Choice:");
			choi = sc.nextInt();
			if (choi == 5) {

				System.out.print("Cash : ");
				csh = sc.nextDouble();

				System.out.print(" +--------------------------------------------+\n");
				System.out.println(" |              SKE RESTAURANT                | ");
				System.out.print(" +------ Menu -----+-- Qty --+---- Price -----+\n ");
				for (int i = 0; i < menu.length; i++) {
					if (quantity[i] > 0) {
						System.out.printf("|%-8s\t   |    %5d|    %.2f Baht.|\n ", menu[i], quantity[i],
								quantity[i] * price[i]);
					}
				}

				System.out.print("+---------------------------+----------------+\n");
				System.out.printf(" |Total\t\t\t     |    %.2f Baht.|\n ", totalSum());

				System.out.print("+---------------------------+----------------+\n");
				System.out.println(" |             VAT RECEIPT SUMMARY            | ");
				System.out.print(" +------ Net ------+- Vat ---+---- Total -----+\n ");
				System.out.printf("|%.2f           |   %.2f|     %.2f Baht.|\n ", totalSum(), vat(), Totalvat());
				System.out.print("+---------------------------+----------------+\n");

				System.out.printf(" |Total\t\t\t     |    %.2f Baht.|\n ", Totalvat());
				double change = csh - Totalvat();
				System.out.printf("|Cash\t\t             |   %.2f Baht.|\n ", csh);
				System.out.printf("|Change\t\t     |   %.2f Baht.|\n ", change);
				System.out.print("+---------------------------+----------------+\n ");

				System.out.print("Do yo have Member Cards?\n (yes/no) : ");
				String n = sc.nextLine();
				n = sc.next();
				if (n.equalsIgnoreCase("yes")) {
					TotalDiscount();
					double change1 = csh + Totaldis();
					System.out.printf(" |Cash\t\t             |   %.2f Baht.|\n ", csh);
					System.out.printf("|Total Discount             |    %.2f Baht.|\n ", Discount());

					System.out.printf("|Change\t\t     |   %.2f Baht.|\n ", change1);
					System.out.print("+---------------------------+----------------+\n");

					blank(total, csh);
					System.out.println();

				} else if (n.equalsIgnoreCase("no")) {
					total();

					double change2 = csh - Totalvat();
					System.out.printf("|Cash\t\t             |   %.2f baht.|\n ", csh);
					System.out.printf("|Change\t\t     |   %.2f Baht.|\n ", change2);
					System.out.print("+---------------------------+----------------+\n");

				}
			}

			else if (choi == 4) {
				total();
			}

			else if (choi == 6) {
				
				System.out.println();
				System.out.println("CASHIER NAME: SAOWAPHAK  ");
				System.out.println();

				System.out.println("=================THANK YOU===================");
				break;
			}

			else {
				System.out.print("Enter Quantity:");

				int quan = sc.nextInt();
				if (choi == 1) {
					quantity[0] = quantity[0] + quan;
				}
				if (choi == 2) {
					quantity[1] = quantity[1] + quan;

				} else if (choi == 3) {
					quantity[2] = quantity[2] + quan;

				}

			}
		}

	}

}
