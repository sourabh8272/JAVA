package Assignment_01;
/*
 * WAP in Java Program To Survey Four Different Car Models For Four
Different Cities:
Your job is to find out the total number of cars sold of each model in all
the cities.
 */
import java.util.Scanner ; 
public class Question_10 {

	public static void main(String[] args) {
		String city, model ; 
        double cm1=0, cz=0, cw=0, cm2=0, d  ; 
        int i ;
        Scanner sc = new Scanner(System.in) ; 
        for(i=0; i<4; i++) {
        	System.out.println("Enter the city, car model and number of car");
        	city = sc.nextLine() ; 
        	model = sc.nextLine() ; 
        	sc.nextLine(); 
        	d= sc.nextDouble() ; 
        	if(model.equals("Maruti-K10")) {
        		cm1 += d ; 
        	}
        	else if(model.equals("Zen-Astalo")) {
        		cz += d ; 
        	}
        	else if(model.equals("Wagnor")) {
        		cw += d ; 
        	}
        	else if(model.equals("Maruti-SX4")) {
        		cm2 += d ; 
        	}
        }
        System.out.println("Number of Maruti-K10 model car "+cm1);
        System.out.println("Number of Zen-Astalo model car "+cz);
        System.out.println("Number of Wagnor model car "+cw);
        System.out.println("Number of Maruti-SX4 model car "+cm2);
	}

}
