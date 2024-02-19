package project;
import java.util.*;

public class Dice {
	Random random;
	int num =0;
   
  Dice(){
	  
	   random = new Random();
	  num = random.nextInt();
	  roll( );
	  
  }
  void roll( ) {
	  num = random.nextInt(6)+1;
	  System.out.println(num);
  }
  
}
