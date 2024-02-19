package project;

import java.util.*;
  
import javax.swing.JOptionPane;

public class main {

	private static final String[] String = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * System.out.println("Hello Celestin, Welcome to our College");
		 * System.out.println("We are glad for joining us  ");
		 * System.out.println("I love Programming");
		 */

		/* 2. Variables */

		/*
		 * 
		 * String snt = "Celestin";
		 * String tch ="Apollo";
		 * String temp;
		 * 
		 * temp=tch; tch=snt; snt=temp;
		 * 
		 * System.out.println(snt); System.out.println(tch);
		 */

		/* 2. Scanner */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("What is your name?"); String name =scanner.nextLine();
		 * 
		 * System.out.println("Hello " +name);
		 * 
		 * System.out.print("How old are you?"); int age = scanner.nextInt();
		 * System.out.println(" Your age is  " +age+" Years old" );
		 */

		/* 3. Expressions */

		/*
		 * int students= 15; System.out.println(students); students = students+1;
		 * System.out.println(students); students = students-1;
		 * System.out.println(students); students = students%3;
		 * System.out.println(students); students = students+=8;
		 * System.out.println(students); students--; System.out.println(students);
		 */

		/* 4. GUI-Graphic User Interface */

		/*
		 * String course = JOptionPane.showInputDialog("What's your favourite course");
		 * JOptionPane.showMessageDialog(null, "Your favourite course is " +course);
		 * 
		 * int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you ?"));
		 * JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		 */
		// Methods of tHE Math class

		/*
		 * double a = 3.142; double b = -10; double z = Math.max(a,b); double t =
		 * Math.max(a,b); System.out.println(z); System.out.println(t);
		 */

		/*
		 * Random random = new Random(); int rand = random.nextInt(6)+1;
		 * System.out.println(rand);
		 */

		/*
		 * int age = 40; if ((age >= 18) && (age <= 35)) {
		 * System.out.println("Your Are a Youth"); } if (age >= 35) {
		 * System.out.println("Your Are an Adult"); } else {
		 * System.out.println("Your Are a child"); }
		 * 
		 * }
		 */

		// 6. Switch

		
		  /*int day = 4;
		  switch (day) 
		  {
		   case 1: 
		   System.out.println("Monday");
		    break; 
		    case 2:
		  System.out.println("Tuesday");
		   break; 
		   case 3:
		  System.out.println("Wednesday");
		   break;
		   case 4:
		  System.out.println("Thursday");
		  break; 
		  case 5: 
		  System.out.println("Friday");
		  break;
		  case 6:
		   System.out.println("Saturday"); 
		   break;
		   case 7:
		  System.out.println("Sunday"); 
		  break; 
		  }*/
		 

		// 5. if else
		/*
		 * int score =46;
		 * 
		 * if ((score > 0) && (score <= 45)) { System.out.println("Your score is  D"); }
		 * else if ((score > 45) && (score <= 65)) {
		 * System.out.println("Your score is  C"); } else if ((score > 65) && (score <=
		 * 85)) { System.out.println("Your score is  B"); } else if ((score > 85) &&
		 * (score <= 100)) { System.out.println("Your score is  A"); }
		 * 
		 * else { System.out.println("Your score is invalid"); }
		 */

		// 7. Logical operators &&, ||, !

		/* Scanner scanner =new Scanner (System.in); */

		/*
		 * System.out.println("You are playing the game, press p or q to exit: ");
		 * String response =scanner.nextLine(); if (response.equals("p")&&
		 * !response.equals("q")) {
		 * System.out.println("You are still playing the game "); }
		 * 
		 * else { System.out.println("You have exited the game "); }
		 */

		// 8. do While Loops

		/*
		 * String name =""; do {
		 * 
		 * System.out.println("Enter your name: "); name =scanner.nextLine(); } while
		 * (name.isEmpty()); System.out.println("Hello " +name );
		 */

		// 9. For Loop

		/*
		 * Scanner scanner =new Scanner (System.in); for (int i = 0; i <=10; i--) {
		 * System.out.println(i); }
		 * 
		 * System.out.println("Have a nice day");
		 * 
		 */

		// 10. Nested

		/*
		 * Scanner scanner =new Scanner (System.in);
		 * 
		 * int rows; int columns; String symbol;
		 * System.out.println("Enter the number of rows:"); rows=scanner.nextInt();
		 * System.out.println("Enter the number of columns:");
		 * columns=scanner.nextInt();
		 * 
		 * System.out.println("Enter the symbole to use :"); symbol=scanner.next(); for
		 * (int i=1; i<=rows; i++) { System.out.println();
		 * 
		 * for (int j=1; j<=columns; j++) { System.out.println(symbol);
		 * 
		 * }
		 */

		// 11. Arrays

		/*
		 * String[] cars = new String[4]; cars[0] = "Volvo"; cars[1] = "BMW"; cars[2] =
		 * "Ford"; cars[3] = "Mazda";
		 * 
		 * System.out.println(cars[3]);
		 * 
		 * 
		 * for(int i =0;i<cars.length;i++) { System.out.println(cars[i]); }
		 */

		// 12. 2D Arrays - is Array of Arrays

		// 1. first Method

		/*
		 * String[][] cars = new String[3][3]; cars[0][0] = "Volvo"; cars[0][1] = "BMW";
		 * cars[0][2] = "Mazda";
		 * 
		 * cars[1][0] = "Suzuki"; cars[1][1] = "BMW"; cars[1][2] = "Hihland";
		 * 
		 * cars[2][0] = "Bugatti"; cars[2][1] = "Volvo1"; cars[2][2] = "BMW2";
		 * System.out.println(cars[2][1]);
		 * 
		 */

		// 2. second method

		/*
		 * String[][] cars = { {"volvo","BMW","MAZDA"}, {"suzuki","BMW1","Highland"},
		 * {"Bugatti","Volvo","BMW2"} };
		 * 
		 * System.out.println(cars[2][1]);
		 * 
		 * for(int i=0; i<cars.length; i++)
		 * 
		 * { System.out.println();
		 * 
		 * 
		 * for(int j=0; j<cars[i].length; j++)
		 * 
		 * { System.out.println(cars[i][j] +"");
		 * 
		 * } }
		 */

		// 12. String Mehods

		/*
		 * String name = "Apollo"; String name2 = ""; Boolean result =
		 * name.equalsIgnoreCase("Apollo");
		 * 
		 * int result2 = name.length(); char result3 = name.charAt(3); String result4 =
		 * name.toUpperCase(); String result5 = name.toLowerCase(); String result6 =
		 * name.replace('A', 'O'); Boolean result7 = name2.isEmpty();
		 * 
		 * System.out.println(result); System.out.println(result2);
		 * System.out.println(result3); System.out.println(result4);
		 * System.out.println(result5); System.out.println(result6);
		 * System.out.println(result7);
		 */
		
		
		
		
		
		
		//13. Wrapper class -provides a way to use primitive data types as reference data types 
		                   //reference data types contain useful methods
							// can be used with a collection of ArrayList
							// primitive    Reference /wrapper
							// int -  Integer
							// boolean   Boolean
							// double  -Double
							// char   Character 
							// string    String
		/*
		 * Boolean a =true; Integer b =41; Double c = 3.142; Character d ='@'; if
		 * (a==true) { System.out.println("This is true"); }
		 */
		
		
		
		
		
		
		
		
		// 14. ArrayList- is resized array 
		/*
		 * ArrayList<String> cars = new ArrayList<String>();
		 * 
		 * cars.add("porse"); cars.add("Maybach"); cars.add("Tesla");
		 * cars.add("Lamborghini");
		 * 
		 * 
		 * //cars.set(0, "Rolls Royce"); cars.add("Maybach"); //cars.remove(1);
		 * //cars.clear();
		 * 
		 * for (int i=0;i<cars.size();i++) { System.out.println(cars.get(i)); }
		 */
		
		
		
	
		//15. 2D ArrayList- is resized array 
		
		
		
		/*
		 * ArrayList<ArrayList<String>> Africa = new ArrayList();
		 * 
		 * ArrayList<String> eastAfrica = new ArrayList<String>();
		 * 
		 * eastAfrica.add("Burundi"); eastAfrica.add("Rwanda");
		 * eastAfrica.add("Tanzania"); eastAfrica .add("Kenya"); ArrayList<String>
		 * westAfrica = new ArrayList<String>();
		 * 
		 * westAfrica.add("Egypt"); westAfrica.add("Tunisia");
		 * westAfrica.add("Morocco"); westAfrica.add("Libya3");
		 * 
		 * ArrayList<String> northAfrica = new ArrayList<String>();
		 * 
		 * northAfrica.add("Burundi3"); northAfrica.add("Rwanda3");
		 * northAfrica.add("Tanzania3"); northAfrica.add("Kenya3"); ArrayList<String>
		 * southAfrica = new ArrayList<String>();
		 * 
		 * northAfrica.add("Burundi5"); northAfrica.add("Rwanda5");
		 * northAfrica.add("Tanzania5"); northAfrica.add("Kenya5");
		 * 
		 * 
		 * System.out.println(Africa);
		 * 
		 * Africa.add(eastAfrica); Africa.add(westAfrica); Africa.add(northAfrica);
		 * Africa.add(southAfrica);
		 * 
		 * 
		 * System.out.println(Africa.get(2).get(3));
		 */
		
		
		
		// 16. for -each Loop
		
		
		/*
		 * String[] Courses = {"Cloud Computing","Cyber security","Networking",
		 * "Programming","Machine Learni8ng","Data science"};
		 * 
		 * 
		 * for (String i:Courses) { System.out.println(i); }
		 */
		
		
		
		//	17. Methods-it is a block that get executed whenever it is called upon 
		
		
		/*
		 * String name ="Celestin"; int age =30; greet (name,age);
		 * 
		 * }
		 * 
		 * private static void greet(String name, int age) { // 
		 * method stub System.out.println("Hello" +name); System.out.println("Hello"
		 * +age); }
		 */
			
		/*
		 * int a =8; int b =7;
		 * 
		 * 
		 * System.out.println(add(a,b)); } static int add(int a,int b) { return a+b; }
		 */
			
		
			
			//18. overloaded methods --> These are methods that share the same name but have different parameters
			//Method name + parameters = Method signature
		
		
		/*double a,b,c,d;
			int x=2;
			int y=3;
			int z=add(x,y);
			
			System.out.println("The sum is "+z);
		}

		
		 static int add(int a, int b) { System.out.println("this is method #1");
		  return a+b; }
		 
		static int add(int a, int b, int c) {
			System.out.println("this is method #2");
			return a+b+c;
		}
		static int add(int a, int b, int c, int d) {
			System.out.println("this is method #3");
			return a+b+c+d;
		}
		static double add(double a, double b) {
			System.out.println("this is method #4");
			return a+b;
		}
		static double add(double a, double b, double c) {
			System.out.println("this is method #5");
			return a+b+c;
		}
		static double add(double a, double b, double c, double d) {
			System.out.println("this is method #6");
			return a+b+c+d;
		*/
		
		
		
		//19. Printf method ---> is an optional method to control, format and display text to the consol window
		  // takes 2 arguments = format string + variable/value/object
		//[flags] [Precision][width][conversion-character]
		
		
		/*
		 * boolean myBoolean = true;
		 *  int myInteger = 1000; 
		 *  char myCharacater ='$';
		 * String myString ="Apollo"; 
		 * double myDouble = 10000;
		 */
		
		//System.out.printf("%b", myBoolean);
		
		//System.out.printf("%15b", myBoolean);
		
		//System.out.printf("20%f", myDouble);
		// System.out.printf("%c", myCharacater);
		 
		 
		
		// 20. final
		
		/*
		 * final double PI = 3.142;
		 * 
		 * System.out.println(PI);
		 */
		
		
		//21. OOP
		
	/*	car mycar = new car();
		
		System.out.println( mycar.color);
		System.out.println( mycar.make);
		System.out.println( mycar.model);
		System.out.println( mycar.price);
		System.out.println( mycar.year);
		
		mycar.drive();
		mycar.stop();
		}*/
	
	
		//22. Constructors-
	
		/*
		 * Students students1 = new Students("Vivian",'F',22, "Networking");
		 *  Students students2 = new Students("John",'M',27, "Cybersecurity"); 
		 *  Students students3 = new Students("Celestin",'M',25, "Programming");
		 * 
		 * System.out.println( students1.name);
		 *  System.out.println( students2.course);
		 * 
		 * students1.Networking();
		 * students2.Cybersecurity();
		 * students3.Programming();
		 */
		/* Dice dice = new Dice(); */
		
		
		//23. overloaded constructors
		
		
		
		
		
		
		// 24. toString
		
		
		/*
		 * Programming skills =new Programming();
		 * System.out.println("Your skills are:");
		 * System.out.println(" ");
		 * System.out.println(skills.toString());
		 */
		
		
		
		//25. Array objects
		
		
		/*
		 * Team[] arsenal = new Team[3]; Team captain = new Team("Odegaad"); Team coach
		 * = new Team("Arteta"); Team stadium = new Team("Emirates");
		 * 
		 * arsenal[0]=captain; arsenal[1]=coach; arsenal[2]=stadium;
		 * System.out.println(arsenal[2].team);
		 */
			
			
			
			// 26.
			
			/*
			 * Team arsenal = new Team(); Player gkeeper =new Player("Joseph"); Player
			 * defender =new Player("John"); Player striker =new Player("Andrew");
			 * arsenal.play(gkeeper); arsenal.play(defender); arsenal.play(striker);
			 * 
			 * System.out.println( );
			 */
		
		
			// 27. Static modifier --> creates  a single copy of a variable | can be applied to a variable/ method 
			//the class 'owns' the static number
			
			/*
			 * City myCity =new City("Nairobi"); City myCity2 =new City("Mombasa"); City
			 * myCity3 =new City("Nakuru"); City myCity4 =new City("Kisumu");
			 * 
			 * //System.out.println(City.ourCities); City.citi();
			 */
			
		
		
			// 28. inheritance ---> the process where 1 class acquires the attributes 
			
			/*
			 * Country nchi = new Country(); City mji = new City();
			 * 
			 * 
			 * mji.cities(); nchi.countries();
			 * 
			 * System.out.println(mji.Governor);
			 *  System.out.println(nchi.President);
			 */
			
			// 29. Method  overriding --> Declaring a method in subclass which is always present
			// 
			
			/*
			 * Player2 player =new Player2(); Football ball =new Football();
			 * 
			 * player.play();
			 * 
			 * System.out.println();
			 * 
			 * ball.play();
			 */


		// 30 /loop

		int i;
		for (i=0 ; i<=10; i++){
			System.out.println("I am Celestin");
			i++;
		}
		}
		
}
