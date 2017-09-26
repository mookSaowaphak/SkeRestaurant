package exam;
import java.io.PrintStream;
import java.util.Scanner;

public class exam {
	public static void blank(int total, int csh){
		int money = csh - total;
        double ts = Math.floor(money/1000);
        System.out.printf("1000-baht banknotes = %.0f\n",ts);
        money = money%1000;
        double fh = Math.floor(money/500);
        System.out.printf("500-baht banknotes = %.0f\n",fh);
        money = money%500;
        double h = Math.floor(money/100);
        System.out.printf("100-baht banknotes = %.0f\n",h);
        money = money%100;
        double ft = Math.floor(money/50);
        System.out.printf("50-baht banknotes = %.0f\n",ft);
        money = money%50;
        double tw = Math.floor(money/20);
        System.out.printf("20-baht banknotes = %.0f\n",tw);
        money = money%20;
        double t = Math.floor(money/10);
        System.out.printf("10-baht coins = %.0f\n",t);
        money = money%10;
        double f = Math.floor(money/5);
        System.out.printf("5-baht coins = %.0f\n",f);
        money = money%5;
        double o = Math.floor(money/1);
        System.out.printf("1-baht coins = %.0f\n",o);
        double totalCh = ts+fh+h+ft+tw+t+f+o;
        System.out.printf("Total number of banknotes and coins = %.0f",totalCh);
}

	
	
	public static void total(int pizza,int coke,int chick,int total){
		int piz = pizza*250;
		int chi = chick*120;
		int co  = coke*45;
		
		
		
		  System.out.print(" +------ Menu ------+-- Qty --+-- Price --+\n");
		if(pizza>0){
			System.out.printf(" |Pizza\t\t   |    %5d|       %5d|\n ",pizza,piz);
		}
	    if(chick>0 ){
	    	System.out.printf(" |Chicken\t   |    %5d|       %5d|\n ",chick,chi);
	    }
	    if(coke>0){
	    	System.out.printf("|Coke\t \t   |    %5d|       %5d|\n ",coke,co);
	    }
	    System.out.print("+---------------------------+------------+\n");
	    total = piz+chi+co;
	    System.out.printf(" |total\t\t\t     |    %8d|\n ",total);
	    System.out.print("+---------------------------+------------+\n");
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("-------Welcome to SKE Restuarant --------");
    System.out.println("1.) Pizza     250 Bath.");
    System.out.println("2.) Chickens  120 Bath.");
    System.out.println("3.) Coke      45  Bath.");
    System.out.println("4.) Total ");
    System.out.println("5.) Cash ");
    System.out.println("6.) Exit  ");
    int choi = -1;
    int pizza =0;
    int chick =0;
    int coke =0;
    int csh = 0;
    int total = 0;
    
    while(true){
			System.out.printf("\nEnter your Choice:");
			choi = sc.nextInt();
			if (choi == 5) {
				System.out.println("Cash : ");
				csh = sc.nextInt();
				System.out.print("Change : ");
				blank(total, csh);

			}

			else if (choi == 4) {
				total(pizza, coke, chick, total);
			}

			else if (choi == 6) {
				System.out.println("====Thank You====");
				break;
			}

			else {
				System.out.print("Enter Quantity:");

				int quan = sc.nextInt();
				if (choi == 1) {
				}
				if (choi == 2) {
					chick = chick + quan;

				} else if (choi == 3) {
					coke = coke + quan;

				}

			}
		}
    

	}	
	
}







	
	
	
	

    	
     
   


