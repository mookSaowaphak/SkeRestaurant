package code;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a: ");
//		double a = sc.nextDouble();
//		System.out.print("Enter b: ");
//		double b = sc.nextDouble();
//		System.out.print("Enter c: ");
//		double c = sc.nextDouble();
//		System.out.print("Enter d: ");
//		double d = sc.nextDouble();
//		System.out.print("Enter the starting value of n: ");
//		double nstart = sc.nextDouble();
//		System.out.print("Enter the ending value of n: ");
//		double nend = sc.nextDouble();
//		double min = a*Math.pow(nstart, 3) + b*Math.pow(nstart, 2) + c*nstart + d;
//		double max = a*Math.pow(nstart, 3) + b*Math.pow(nstart, 2) + c*nstart + d;; 
//		double minP = nstart, maxP = nstart;
//		
//		
//		if(nend<nstart){
//			System.out.print("Invalid range!");
//		}else{
//			for(double n = nstart; n<=nend; n++){
//			double fn = a*Math.pow(n, 3) + b*Math.pow(n, 2) + c*n + d;
//			if(fn<min){
//				minP = n;
//			}
//			if(fn>max){
//				maxP = n;
//			}
//			min = Math.min(min, fn);
//			max = Math.max(max, fn);
//			}
//			
//			System.out.printf("Minimum of f(n)=%.0f at n=%.0f\n", min, minP);
//			System.out.printf("Maximum of f(n)=%.0f at n=%.0f", max, maxP);
//		} 
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter character: ");
//		String charac = sc.nextLine();
//		System.out.print("Enter size: ");
//		int size = sc.nextInt();
//		int n = 1;
//		for(int y = 1; y <= size; y++){
//			for(int x = 1; x<=y; x++){
//			System.out.printf(charac);
//			}
//			System.out.println("");
//		}		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input k: ");
//		int k = sc.nextInt();
//		int sum2 = 0;
//		int n;
//		for(n = 1 ; n <= k ; n++){
//		int sum = 1;
//		for(int fac = 1 ; fac <= n ; fac++){
//			sum = sum*fac;
//		}
//		System.out.printf("%d! = %d\n",n , sum);
//		sum2 += sum; 
//		}
//		
//		System.out.printf("Summation of factorial 1!-%d! = %d", n-1, sum2);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input n: ");
//		int n = sc.nextInt();
//		int sum = 1;
//		for(int fac = 1 ; fac <= n ; fac++){
//			sum = sum*fac;
//		}
//		System.out.printf("%d! = %d",n , sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input nap time: ");
//		int nap = sc.nextInt();
//		System.out.print("Input snooze time: ");
//		int snooze = sc.nextInt();
//		int min = 1;
//		System.out.println("Nap time starts.");
//		
//		for(min = 1; min<=nap; min++){
//			System.out.printf("%d min\n", min);
//		}
//			System.out.print("Alarm rings. Dismiss or Snooze: ");
//			String alarm = sc.next();
//			String alarm2 = "";
//			if(alarm.equals("Snooze")){
//			for(alarm2=alarm; alarm2.equals("Snooze");){
//				for(int y = 1; y<=snooze; y++){
//					System.out.printf("%d min\n", min);	
//					min++;
//				}
//				System.out.print("Alarm rings. Dismiss or Snooze: ");
//				alarm2 = sc.next();
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter amount of numbers: ");
//		double amount = sc.nextDouble();
//		
//		System.out.printf("Please input N1: ");
//	    double num = sc.nextDouble();
//	    double average = 0, min = 0, max = 0;
//	    min = num;
//	    max = num;
//	    average += num;
//	    
//	    int maxPos = 0;
//	    int minPos = 0; 
//	    
//	    min = Math.min(num, min);minPos = 1;
//	    max = Math.max(num, max);maxPos = 1;
//		
//	    for(int n = 2; n<=amount; n++){
//			System.out.printf("Please input N%d: ",n);
//		    num = sc.nextDouble();
//		    if(num>max){
//		    	maxPos = n;
//		    }
//		    if(num<min){
//		    	minPos = n;
//		    }
//		    average += num;
//		    min = Math.min(num, min);
//		    max = Math.max(num, max);
//			
//		}
//	    System.out.printf("Average is %.2f\n",average/amount);
//		System.out.printf("Minimum is N%d = %.2f\n", minPos, min);
//		System.out.printf("Maximum is N%d = %.2f\n", maxPos, max);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input N: ");
//		int n = sc.nextInt();
//	    for(n=n; n>0;){
//			for (int x = 1;x<=12;x++) {
//			 System.out.printf("%d x %d = %d\n", n, x, n*x);
//			 } 
//		System.out.print("Input N: ");
//		n = sc.nextInt();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input N: ");
//		int n = sc.nextInt();
//		if(n<0){
//			System.out.print("Program ends.");
//		}
//		else{
//	    for(n=n; n>0;){
//		System.out.printf("Factors of %d are ",n);
//		int sum = 0;
//		for(int x=1;x<=n;x++){
//			if(n%x==0){
//				System.out.print(x + " ");
//				sum = sum + x;
//			}
//		}
//		System.out.printf("\nSummation of factors is %d\n", sum);
//		if(sum == n + 1){
//			System.out.printf("%d is prime number.", n);
//		}
//		else{
//			System.out.printf("%d is not prime number.", n);
//		}
//		System.out.print("\nInput N: ");
//		n = sc.nextInt();
//		if(n<0){
//			System.out.print("Program ends.");
//		}
//	    }
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input n: ");
//		double n = sc.nextDouble();
//		double sum = 0;
//		for(int pow = 1; pow<=n; pow++){
//			sum = sum + Math.pow(n, pow);
//		}
//		double value = Math.sqrt(sum);
//		System.out.printf("The formula value is %.4f", value);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input N: ");
//		int num = sc.nextInt();
//		for (int x = 1;x<=12;x++) {
//		 System.out.printf("%d x %d = %d\n", num, x, num*x);
//		 } //ตารางสูตรคูณ
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input N: ");
//		int n = sc.nextInt();
//		System.out.printf("Factors of %d are ",n);
//		int sum = 0;
//		for(int x=1;x<=n;x++){
//			if(n%x==0){
//				System.out.print(x + " ");
//				sum = sum + x;
//			}
//		}
//		System.out.printf("\nSummation of factors is %d\n", sum);
//		if(sum == n + 1){
//			System.out.printf("%d is prime number.", n);
//		}
//		else{
//			System.out.printf("%d is not prime number.", n);
//		}

		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input N: ");
//		double num = sc.nextDouble();
//		double amount = 1, average = 0;
//		double min = 0, max = 0;
//		min = num;
//		max = num;
//		average = average + num;
//		
//		min = Math.min(num, min);
//		max = Math.max(num, max);
//		
//		if(num==-1){
//			System.out.println("Amount of numbers is 0");
//			System.out.println("Average is NaN");
//			System.out.println("Minimum is 0.00");
//			System.out.println("Maximum is 0.00");
//		}
//		else{
//		while(num!=-1){
//			System.out.print("Please input N: ");
//			num = sc.nextDouble();
//			if(num!=-1){
//				amount++;
//				average = average + num;
//				min = Math.min(num, min);
//				max = Math.max(num, max);
//			}
//		}
//		System.out.printf("Amount of numbers is %.0f\n",amount);
//		System.out.printf("Average is %.2f\n",average/amount);
//		System.out.printf("Minimum is %.2f\n", min);
//		System.out.printf("Maximum is %.2f\n", max);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		String num = sc.nextLine();
//	    int num2 = num.length();
//		int re = num2-1;
//		System.out.print("Reversed number is ");
//		while(re>=0){
//			System.out.print(num.charAt(re));
//			re--;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input number: ");
//		String num = sc.nextLine();
//	    int num2 = Integer.parseInt(num);
//	    System.out.printf("%s = ", num);
//	    int x = 0;
//	    int pow = 0;
//	    while(num2 != 0){
//	    	num2 = num2/10;
//	    	x++;
//	    }
//	    while(x>0){
//	    	System.out.print(num.charAt(x-1) + "x10^" + pow);
//	    	if(x>1){
//	    		System.out.print(" + ");
//	    	}
//	    	x--;
//	    	pow++;
//	    }
		

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number : ");
//		String num = sc.nextLine();
//		int num2 = Integer.parseInt(num);
//		int x = 0;
//		while(num2 != 0){
//			num2 = num2/10;
//			x++;
//		}
//		System.out.printf("There are %d digits in %s.", x, num);
		
//		System.out.print("Please input X: ");
//		int x = sc.nextInt();
//		System.out.print("Please input Y: ");
//		int y = sc.nextInt();
//		while(x<=y){
//			if((x%2)!=0){
//				System.out.println(x);
//			}
//			x++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input N : ");
//		int n = sc.nextInt();
//		int x =1;
//		while(x<=n){
//			System.out.println(x);
//			x++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String pass = "";
//		while(!pass.equals("ABC")){
//			System.out.print("Input your password : ");
//			pass = sc.nextLine();
//			
//		}
//		System.out.println("password correct");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter value of n : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		while(n>=0){
//			sum = sum+n;
//			n--;
//		}
//		System.out.print("Sum : " + sum);
	 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter value of n: ");
//		int n = sc.nextInt();
//		int x = 0;
//		int sum = 0;
//		while(x<=n){
//			sum = sum+x;
//			x++;
//			
//		}
//		System.out.print("sum : " + sum);

		
//		Scanner sc = new Scanner(System.in);
//		int total = 0;
//		System.out.print("Enter hour1: ");
//		String shr = sc.nextLine();
//		int hr = Integer.parseInt(shr);
//		
//		System.out.print("Enter minute1: ");
//		String smin = sc.nextLine();
//		int min = Integer.parseInt(smin);
//		
//		System.out.print("Enter hour2: ");
//		String shr2 = sc.nextLine();
//		int hr2 = Integer.parseInt(shr2);
//		
//		System.out.print("Enter minute2: ");
//		String smin2 = sc.nextLine(); 
//		int min2 = Integer.parseInt(smin2);
//		
//		if(hr==hr2){
//			if(min>min2){
//			    total = 24*60 + (min2-min);
//			}else if(min2>min){
//				total = min2-min;
//			}
//		}else if(hr>hr2){
//			total = (((hr2+24)-hr) * 60) + (min2-min);
//		}else if(hr2>hr){
//			total = ((hr2-hr)*60) + (min2-min);
//		}
//		System.out.printf("(%s:%s to %s:%s) Time passes %s minutes.",shr ,smin ,shr2, smin2, total);
//        }
		
//		Scanner sc = new Scanner(System.in);
//		 System.out.print("Enter change: ");
//		 int ch = sc.nextInt();
//		 if(ch>=1000){
//			 System.out.printf("1000 notes: %.0f\n", Math.ceil(ch/1000));
//			 ch = ch%1000;
//		 }
//		 if(ch>=500){
//			 System.out.printf("500 notes: %.0f\n", Math.ceil(ch/500));
//			 ch = ch%500;
//		 }
//		 if(ch>=100){
//			 System.out.printf("100 notes: %.0f\n", Math.ceil(ch/100));
//			 ch = ch%100;
//		 }
//		 if(ch>=50){
//			 System.out.printf("50 notes: %.0f\n", Math.ceil(ch/50));
//			 ch = ch%50;
//		 }
//		 if(ch>=20){
//			 System.out.printf("20 notes: %.0f\n", Math.ceil(ch/20));
//			 ch = ch%20;
//		 }
//		 if(ch>=10){
//			 System.out.printf("10 coins: %.0f\n", Math.ceil(ch/10));
//			 ch = ch%10;
//		 }
//		 if(ch>=5){
//			 System.out.printf("5 coins: %.0f\n", Math.ceil(ch/5));
//			 ch = ch%5;
//		 }
//		 if(ch>=2){
//			 System.out.printf("2 coins: %.0f\n", Math.ceil(ch/2));
//			 ch = ch%2;
//		 }
//		 if(ch>=1){
//			 System.out.printf("1 coins: %.0f\n", Math.ceil(ch/1));
//		 }
		
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("Day: ");
//		 int d = sc.nextInt();
//		 System.out.print("Month: ");
//		 int m = sc.nextInt();
//		 System.out.print("Year: ");
//		 int y = sc.nextInt();
//		 String sl = "/";
//		 System.out.println("The date is " + d + sl + m + sl + y);
//		 if (y%4==0 && y%100!=0 || y%400==00) {
//	     System.out.println(y + " is leap year.");
//		 }else{
//		 System.out.println(y + " is normal year.");
//		 }
//		 switch(m){
//		 case 1:
//		 case 3:
//		 case 5:
//		 case 7:
//		 case 8:
//		 case 10:
//		 case 12:
//			 System.out.println(31-d + " days left until next month.");
//			 break;
//		 case 2:
//			 System.out.println(29-d + " days left until next month.");
//			 break;
//		 case 4:
//		 case 6:
//		 case 9:
//		 case 11:
//			 System.out.println(30-d + " days left until next month.");
//			 break;
//		 }
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter hour1: ");
//		String shr = sc.nextLine();
//		int hr = Integer.parseInt(shr);
//		
//		System.out.print("Enter minute1: ");
//		String smin = sc.nextLine();
//		int min = Integer.parseInt(smin);
//		
//		System.out.print("Enter hour2:");
//		String shr2 = sc.nextLine();
//		int hr2 = Integer.parseInt(shr2);
//		
//		System.out.print("Enter minute2: ");
//		String smin2 = sc.nextLine(); 
//		int min2 = Integer.parseInt(smin2);
//		
//		
//		int total = 
//		System.out.print(total);
		
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your grade? ");
//        char grade = scanner.next().charAt(0);
//        switch (grade) {
//        case 'a':
//        case 'A':
//        	System.out.print("Congratulations!");
//        	break;
//        case 'b':
//        case 'B':
//        	System.out.print("Very good!");
//        	break;
//        case 'c':
//        case 'C':
//        	System.out.print("Do better next time.");
//            break;
//        case 'd':
//        case 'D':
//        	System.out.print("Study harder!");
//        	break;
//        case 'f':
//        case 'F':
//        	System.out.print("FAIL :(");
//        	break;
//        default:
//        	System.out.print("What grade is that o_O?");
//       
//        }
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input X: ");
//		int x = sc.nextInt();
//		System.out.print("Please input Y: ");
//		int y = sc.nextInt();
//		if(x>0 && y>0){
//			System.out.print("The point is in Q1.");
//		}else if(x<0 && y>0){
//			System.out.print("The point is in Q2.");
//		}else if(x<0 && y<0){
//			System.out.print("The point is in Q3.");
//		}else if(x>0 && y<0){
//			System.out.print("The point is in Q4.");
//		}else if(x==0 && (y>0 || y<0) ){
//			System.out.print("The point is on the Y axis.");
//		}else if(y==0 && (x>0 || x<0)){
//			System.out.print("The point is on the X axis.");
//		}else if(x==0 && y==0){
//			System.out.print("The point is at the origin.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input your status: ");
//		String st = sc.nextLine();
//		System.out.print("How many hour? ");
//		int hr = sc.nextInt();
//		int price = 0;
//		if(st.equals("Staff")){
//			price = hr*10;
//		}else if(st.equals("Student")){
//			price = hr*20;
//		}else if(st.equals("Parent")){
//			price = hr*30;
//		}else{
//			price = hr*50;
//		}
//		System.out.print("You have to pay " + price + " Baht.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input change: ");
		double money = sc.nextDouble();
		double ts = Math.floor(money/1000);
		System.out.printf("1000-baht banknotes = %.0f\n",ts);
		money = money%1000;
		double five = Math.floor(money/500);
		System.out.printf("500-baht banknotes = %.0f\n",five);
		money = money%500;
		double h = Math.floor(money/100);
		System.out.printf("100-baht banknotes = %.0f\n",h);
		money = money%100;
		double ft = Math.floor(money/50);
		System.out.printf("50-baht banknotes = %.0f\n",ft);
		money = money%50;
		double twt = Math.floor(money/20);
		System.out.printf("20-baht banknotes = %.0f\n",twt);
		money = money%20;
		double ten = Math.floor(money/10);
		System.out.printf("10-baht coins = %.0f\n",ten);
		money = money%10;
		double f = Math.floor(money/5);
		System.out.printf("5-baht coins = %.0f\n",f);
		money = money%5;
		double one = Math.floor(money/1);
		System.out.printf("1-baht coins = %.0f\n",one);
		money = money%1;
		money = money - Math.floor(money);
		double ftst = Math.floor(money/0.5);
		System.out.printf("50-satang coins = %.0f\n",ftst);
		money = money%0.5;
		money = money - Math.floor(money);
		double twfst = Math.floor(money/0.25);
		System.out.printf("25-satang coins = %.0f\n",twfst);
		double tt = ts+five+h+ft+twt+ten+f+one+ftst+twfst;
		System.out.printf("Total number of banknotes and coins = %.0f",tt);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input x1: ");
//		double x1 = sc.nextDouble();
//		System.out.print("Input y1: ");
//		double y1 = sc.nextDouble();
//		System.out.print("Input x2: ");
//		double x2 = sc.nextDouble();
//		System.out.print("Input y2: ");
//		double y2 = sc.nextDouble();
//		double pi = Math.PI;
//		double p = pi/180;
//		double vx1 = x1 * p;
//		double vx2 = x2 * p;
//		double vy1 = y1 * p;
//		double vy2 = y2 * p;
//		double yy = vy1 - vy2;
//		double d = 6371 * Math.acos((Math.sin(vx1) * Math.sin(vx2)) + (Math.cos(vx1) * Math.cos(vx2) * Math.cos(yy)));
//		System.out.printf("Great circle distance between (%.3f,%.3f) and (%.3f,%.3f) = %.3f kilometers.",x1 ,y1 ,x2, y2, d);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter R: ");
//		int r = sc.nextInt();
//		System.out.print("Enter G: ");
//		int g = sc.nextInt();
//		System.out.print("Enter B: ");
//		int b = sc.nextInt();
//		double rr = r/255;
//		double gg = g/255;
//		double bb = b/255;
//		double w = Math.max(Math.max(rr, gg), bb);
//		double c = ((w-rr)/w);
//		double m = ((w-gg)/w);
//		double y = ((w-bb)/w);
//		double k = 1-w;
//		System.out.printf("Conversion result: C = %.2f, M = %.2f, Y = %.2f, K = %.2f",c ,m ,y ,k);
	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input your hero stats: ");
//		System.out.print("Strength: ");
//		double s = sc.nextDouble();
//		System.out.print("Agility: ");
//		double a = sc.nextDouble();
//		System.out.print("Intelligence: ");
//		double i = sc.nextDouble();
//		double ss = (Math.pow(s, 2) + (a/Math.sqrt(3)) + Math.sqrt(i));
//		double v = Math.pow(s, 3) * (a/i) ;
//		System.out.printf("Hero's damage = %.2f\n",ss );
//		System.out.printf("Hero's hp = %.0f\n",Math.ceil(v));
//		System.out.println("Input your monster stats: ");
//		System.out.print("Strength: ");
//		double sm = sc.nextDouble();
//		System.out.print("Agility: ");
//		double am = sc.nextDouble();
//		System.out.print("Intelligence: ");
//		double im = sc.nextDouble();
//		double ssm = ((am*im) + Math.cbrt(2*sm));
//		System.out.printf("Monster's damage = %.2f\n",ssm );
//		double vm = (Math.pow(sm, 3) * (am/im) );
//		System.out.printf("Monster's hp = %.0f",Math.ceil(vm));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input a: ");
//		double a = sc.nextDouble();
//		System.out.print("Input b: ");
//		double b = sc.nextDouble();
//		System.out.print("Input c: ");
//		double c = sc.nextDouble();
//		double uu = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) );
//		double aa = a/uu;
//		double bb = b/uu;
//		double cc = c/uu;
//		System.out.printf("Unit vector of (%.2fi, %.2fj, %.2fk) = ", a, b, c);
//		System.out.printf("(%.2fi, %.2fj, %.2fk)", aa, bb, cc);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("input: ");
//		int n = sc.nextInt();
//		System.out.print("output: ");
//		int m = sc.nextInt();
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter text: ");
//		String t = sc.nextLine();
//		System.out.print("Enter n: ");
//		int n = sc.nextInt();
//		System.out.print("Enter m: ");
//		int m = sc.nextInt();
//	    String b = t.charAt(n) + "";
//	    String c = t.charAt(m) + "";
//	    if(b.equalsIgnoreCase(c)){
//	    	System.out.print("true");
//	    }else{
//	    	System.out.print("false");
//	    }
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter word: ");
//		String w = sc.nextLine();
//        int b = w.length();
//		System.out.print("Enter n: ");
//		int n = sc.nextInt();
//		for(int count = 1; count<=b ; count++){
//			if(count%n==0){
//				String big = w.toUpperCase();
//				System.out.print(big.charAt(count-1));
//			}else{
//				System.out.print(w.charAt(count-1));
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter n : ");
//		int n = sc.nextInt();
//		for (int count = 1; count<=n; count ++){
//		     if(count%2!=0){
//		    	 System.out.print("#");
//		     }else{
//		    	 System.out.print(count);
//		     }
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter name: ");
//		String m = sc.nextLine();
//		System.out.print("Enter n: ");
//		int n = sc.nextInt();
//		for (int count = 0; count <n; count ++ ){
//			System.out.println(m.charAt(count));
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Month: ");
//		int m = sc.nextInt();
//		switch(m){
//		case 1 :
//		case 3 :
//		case 5 :
//		case 7 :
//		case 8 :
//		case 10 :
//		case 12 :
//			System.out.print("31");
//		    break;
//		case 2 :
//			System.out.print("28");
//			break;
//		case 4 :
//		case 6 :
//		case 9 :
//		case 11 :
//			System.out.print("30");
//			break;
//		default :
//			System.out.print("invalid");
//			break;
//		}
		
		// char grade = args[0].charAt(0);
//	      char grade = 'C';
//
//	      switch(grade) {
//	         case 'A' :
//	            System.out.println("Excellent!"); 
//	            break;
//	         case 'B' :
//	         case 'C' :
//	            System.out.println("Well done");
//	            break;
//	         case 'D' :
//	            System.out.println("You passed");
//	         case 'F' :
//	            System.out.println("Better try again");
//	            break;
//	         default :
//	            System.out.println("Invalid grade");
//	      }
//	      System.out.println("Your grade is " + grade);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Your status: ");
//		String st = sc.nextLine();
//		String x = "Price";
//		switch(st){
//		case "Student" :
//			System.out.print(x + " 25 Baht");
//			break;
//		case "Adult" :
//			System.out.print(x + " 30 Baht");
//			break;
//		case "Senior" :
//			System.out.print(x + " 22 Baht");
//			break;
//		default :
//			System.out.print(x + " 0 Baht");
//		}
		  
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter word: ");
//		String w = sc.nextLine();
//		System.out.print("Enter n: ");
//		int n = sc.nextInt();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input N: ");
//		int n = sc.nextInt();
//		for(int count = n; count >=1; count--){
//			System.out.println(count);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Base = ");
//		double b = sc.nextDouble();
//		System.out.print("Exponent = ");
//		double e = sc.nextDouble();
//		double a = Math.pow(b, e);
//		System.out.print("Answer = " + (int)a);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input number : ");
//		int n = sc.nextInt();
//		for(int p = 1; p<=n; p++){
//			System.out.print(p);
//		}
//		System.out.println();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("x: ");
//		int x = sc.nextInt();
//		System.out.print("y: ");
//		int y = sc.nextInt();
//		for(int h = 1; h<=y; h++){
//		for(int w = 1; w<=x ; w++){
//			System.out.print("*");
//		}
//		System.out.println();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("a : ");
//		double a = sc.nextDouble();
//		System.out.print("b : ");
//		double b = sc.nextDouble();
//		System.out.print("c : ");
//		double c = sc.nextDouble();
//		double b2 = Math.pow(b, 2);
//		double d = (b2)-(4*a*c);
//		double e = Math.sqrt(d);
//		double f = (-b + e)/(2*a);
//		double g = (-b - e)/(2*a);
//	    System.out.printf("ans : %.2f", f);
//	    System.out.printf(" , %.2f", g);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("a   : ");
//		long a = sc.nextLong();
//		System.out.print("b   : ");
//		long b = sc.nextLong();
//		System.out.print("a+b : " + ( a + b ));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter A : ");
//		double a = sc.nextDouble();
//		System.out.print("Enter B : ");
//		double b = sc.nextDouble();
//		double a1 = Math.pow(a, 2);
//		double b1 = Math.pow(b, 2);
//		double c = a1 + b1;
//		double c1 = Math.sqrt(c);
//		System.out.printf("C : %.1f", c1);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("m : ");
//		int m = sc.nextInt();
//		System.out.print("n : ");
//		int n = sc.nextInt();
//		double a = Math.log(m);
//		double b = Math.log(n);
//		System.out.printf("%.2f",a/b);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter n : ");
//		int n = sc.nextInt();
//		for(int ans = 0 ; )
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter name: ");
//		String s = sc.nextLine();
//		System.out.print("Enter n: ");
//		int n = sc.nextInt();
//		for(int n = 0 ; n ;  ){
//			
//		}
		
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("");
//	    String n = sc.nextLine();
//	    System.out.print("");
//	    int x = sc.nextInt();
//	    System.out.print("");
//	    int y = sc.nextInt();
//	    String sub = n.substring(x,y+1);
//	    System.out.print(sub);
		
//		String s = "I'm in SOS camp 15th.";
//		String sub = s.substring(7,10);
//		System.out.print(sub);
		
//		String s = "SOS camp 15th";
//		String sub = s.substring(4);
//		System.out.println(sub);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter text: ");
//		String s = sc.nextLine();
//		int l = s.length();
//		System.out.print("Enter n: ");
//		int n = sc.nextInt();
//		System.out.print("Enter m: ");
//		int m = sc.nextInt();
//		System.out.print(n+m);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter name : ");
//		String s = sc.nextLine();
//		System.out.print("Enter gender : ");
//		String g = sc.nextLine();
//		int l = s.length();
//		char c = s.charAt(0);
//		char b = s.charAt(l-1);
//		System.out.print("Call : " + c + b + g);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input Name: ");
//		String s = sc.nextLine();
//		String m = s.toUpperCase();
//		int l = m.length();
//		char c = m.charAt(l-1);
//		System.out.println("Bye bye, Agent " + c);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input some text : ");
//		String s = sc.nextLine();
//		System.out.print("Input n : ");
//	    int n = sc.nextInt();
//		System.out.println(s.charAt(n));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input Name: ");
//		String s = sc.nextLine();
//		String m = s.toUpperCase();
//		char c = m.charAt(0);
//		System.out.println("Hello, Agent " + c);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter name : ");
//		String s = sc.nextLine();
//		System.out.print("Call : " + s.charAt(0));
		
//		Scanner sc = new Scanner(System.in);
//		String s =  "We love coding so much";
//		char c = s.charAt(13);
//		System.out.print(c);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input word: ");
//		String s = sc.nextLine();
//		System.out.println("Lower case: " + s.toLowerCase());
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter 1st word: ");
//		String f = sc.nextLine();
//		System.out.print("Enter 2nd word: ");
//		String s = sc.nextLine();
//		System.out.print(f.equalsIgnoreCase(s));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input first name : ");
//		String f = sc.nextLine();
//		System.out.print("Input second name : ");
//		String s = sc.nextLine();
//		System.out.println("New hero name is : " +f+s);
//		String l = f+s;
//		System.out.println("New length is : " + l.length());
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter building : ");
//		String bu = sc.nextLine();
//		System.out.print("Hours parked : ");
//		int m = sc.nextInt();
//		int price = 0;
//		if (bu.equalsIgnoreCase("a")){
//		    if (m>=2 && m<=4){
//		    	price = (m-1)*10;
//		    }else if(m>=5 &&m<=8){
//		    	price = ((m-4)*15)+30;
//		    }else if(m>8){
//		    	price = ((m-8)*20)+90;
//		    }
//		}else if(bu.equalsIgnoreCase("b")){
//			if (m>=2 && m<=3){
//				price = (m-1)*15;
//			}else if (m>=4 && m<=6){
//				price = ((m-3)*5)+30;
//			}else if (m>6){
//				price = ((m-6)*20)+45;
//			}
//		}
//		
//		System.out.print("Total price : " + price);

	}

}
