package testexercise;
import java.util.Scanner;
import java.time.LocalDate; // import the LocalDate class

public class Testexercise {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
				
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_CYAN = "\u001B[36m";
        
        
        System.out.print("Залание 1 \n" );       
        Scanner myObj = new Scanner(System.in);

        System.out.println("Описание, Статус:");      
        String description = myObj.nextLine();
        String status = myObj.nextLine();
        //int age = myObj.nextInt();
        //double salary = myObj.nextDouble();


        
        System.out.print("Статус Проект с нулевой стоимостью  \n" );
        System.out.print("Введите стоимость: " );        
        Scanner console = new Scanner(System.in);
        
        
        
        int sum = 0;
        for (int i = 1; console.hasNext(); i++ ){
        	
        	 
        	 System.out.print(ANSI_CYAN + "===============================" + ANSI_RESET);
            
            
             sum += console.nextInt();
             
             
             
             LocalDate myObj2 = LocalDate.now(); // Create a date object
             System.out.println("\nДата: " + myObj2); // Display the current date
             System.out.println("Задание:" +  i + ANSI_RESET);             
             System.out.println("Описание: " + description);
             System.out.println("Статус: " + status);
             System.out.print(ANSI_GREEN +"Стоимость: " +  sum + ANSI_RESET + "\n");
             System.out.print(ANSI_CYAN + "===============================" + ANSI_RESET+ "\n");             
             System.out.println("Введите стоимость: " );
             

        }
        
	}

}
