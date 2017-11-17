
package Cashier;
import java.io.PrintStream;
import java.util.Scanner;

public class Skerestaurant {
	static Scanner sc = new Scanner(System.in);
	static int[] price = { 250, 120, 45 };
	static String[] menu = { "pizza", "Chickens", "coke" };
	static int[] quantity = { 0, 0, 0 };

	
	// public static int cash() {
	// int cash = sc.nextInt();
	// return cash;
	// }

	public static void change() {

		System.out.print("Cash : ");
		int csh = sc.nextInt();
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

	public static double vat(){
		int sum = 0;
		for (int i = 0; i < quantity.length; i++) {
			sum = sum + quantity[i]*price[i]*7/100;
		}
		return sum;
		
	}
	public static double Totalvat(){
		double totalvat1 = 0;
		double sum=0;
		for (int i = 0; i < quantity.length; i++) {
			sum = sum + quantity[i]*price[i]*7/100;
		totalvat1 = sum+totalSum();
		}
		return totalvat1;
		
	}
	public static void blank(int total, int csh) {
		double money = csh - Totalvat();
		double ts = Math.floor(money / 1000);
		System.out.printf("1000-baht banknotes = %.0f\n", ts);
		money = money % 1000;
		double fh = Math.floor(money / 500);
		System.out.printf("500-baht banknotes = %.0f\n", fh);
		money = money % 500;
		double h = Math.floor(money / 100);
		System.out.printf("100-baht banknotes = %.0f\n", h);
		money = money % 100;
		double ft = Math.floor(money / 50);
		System.out.printf("50-baht banknotes = %.0f\n", ft);
		money = money % 50;
		double tw = Math.floor(money / 20);
		System.out.printf("20-baht banknotes = %.0f\n", tw);
		money = money % 20;
		double t = Math.floor(money / 10);
		System.out.printf("10-baht coins = %.0f\n", t);
		money = money % 10;
		double f = Math.floor(money / 5);
		System.out.printf("5-baht coins = %.0f\n", f);
		money = money % 5;
		double o = Math.floor(money / 1);
		System.out.printf("1-baht coins = %.0f\n", o);
		double totalbnk = ts + fh + h + ft + tw;
		double totalco = t + f + o;
		System.out.printf("Total number of banknotes =%.0f \nTotal number of coins = %.0f", totalbnk, totalco);

	}
	public static void total() {
		
		System.out.print(" +----------------------------------------+\n");
		System.out.println(" |            SKE RESTAURANT              | ");
		System.out.print(" +------ Menu -----+-- Qty --+-- Price ---+\n ");
		for (int i = 0; i < menu.length; i++) {
			if (quantity[i] > 0) {
				System.out.printf("|%-8s\t   |    %5d|       %5d|\n ", menu[i], quantity[i], quantity[i] * price[i]);
			}
		}

		System.out.print("+---------------------------+------------+\n");

		System.out.printf(" |Total\t\t\t     |      %.2f|\n ", totalSum());
		System.out.print("+---------------------------+------------+\n");
		System.out.println();
		
		System.out.print(" +---------------------------+------------+\n");
		System.out.println(" |           VAT RECEIPT SUMMARY          | ");
		System.out.print(" +------ Net ------+- Vat ---+-- Total ---+\n ");
		System.out.printf("|%.2f           |    %.2f|      %.2f|\n ",totalSum(),vat(),Totalvat()); 
		System.out.print("+---------------------------+------------+\n");
	}

	public static void main(String[] args) {
		System.out.println("-------Welcome to SKE Restaurant --------");
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("(%d.) %s    %d Bath.\n", i + 1, menu[i], price[i]);
		}

		System.out.printf("%d.) Total ", menu.length + 1);
		System.out.printf("%d.) Cash ", menu.length + 2);
		System.out.printf("%d.) Exit  ", menu.length + 3);
		int choi = -1;

		int csh = 0;
		int total = 0;

		while (true) {
			System.out.printf("\nEnter your Choice:");
			choi = sc.nextInt();
			if (choi == 5) {

				System.out.print("Cash : ");
				csh = sc.nextInt();


				System.out.print(" +----------------------------------------+\n");
				System.out.println(" |            SKE RESTAURANT              | ");
				System.out.print(" +------ Menu -----+-- Qty --+-- Price ---+\n ");
				for (int i = 0; i < menu.length; i++) {
					if (quantity[i] > 0) {
						System.out.printf("|%-8s\t   |    %5d|       %5d|\n ", menu[i], quantity[i],
								quantity[i] * price[i]);
					}
				}

				System.out.print("+---------------------------+------------+\n");
				System.out.printf(" |Total\t\t\t     |      %.2f|\n ", totalSum());

				System.out.print("+---------------------------+------------+\n");
				System.out.println(" |           VAT RECEIPT SUMMARY          | ");
				System.out.print(" +------ Net ------+- Vat ---+-- Total ---+\n ");
				System.out.printf("|%.2f           |    %.2f|      %.2f|\n ",totalSum(),vat(),Totalvat());  
				System.out.print("+---------------------------+------------+\n");
				
				System.out.printf(" |Total\t\t\t     |      %.2f|\n ",Totalvat());
				double change = csh - Totalvat();
				System.out.printf("|Cash\t\t             |        %d|\n ", csh);
				System.out.printf("|Change\t\t     |      %.2f|\n ", change);
				System.out.print("+---------------------------+------------+\n ");
                System.out.println("|                           |            | ");
				System.out.print(" +---------------------------+------------+\n");
				blank(total, csh);

			}

			else if (choi == 4) {
				total();
			}

			else if (choi == 6) {
				System.out.println("====Thank You====");
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





	
	
	
	

    	
     
   


