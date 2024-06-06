import java.util.*;
 class SimpleCalculator{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        
        while(true){
            try{
                System.out.println("Choose an operation:" + "\n1. Addition" + "\n2. Subtraction" +"\n3. Multiplication" + "\n4. Division" + "\n5. Exit");
                int op = sc.nextInt();
                if(op == 5){
                    System.out.println("Exiting the calculator...");
                    break;
                }
                if(op<1 || op>5){
                    System.out.println("Select the proper choice!");
                    continue;
                }
                System.out.print("Enter the first number:");
                double a = sc.nextDouble();
                System.out.print("Enter the second number:");
                double b = sc.nextDouble();
                
                switch(op){
                    case 1:
                        System.out.println("Addition: " + add(a,b));
                        break;
                    case 2:
                        System.out.println("Subtraction: " + subtract(a,b));
                        break;
                    case 3:
                        System.out.println("Multiplication: " + multiply(a,b));
                        break;
                    case 4:
                        if(b==0)
                            System.out.println("Error: Division by zero.");
                        else
                            System.out.println("Division: " + divide(a, b));
                        break;
                    default:
                        break;
                }
            }     
            catch(InputMismatchException e){
                 System.out.println("Invalid input! Please enter numeric values.");
                 sc.next();
            }  
            
            System.out.println();
        }   
    } 

    public static double add(double a,double b){
        return a + b;
    } 

    public  static double subtract(double a,double b){
        return a - b;
    }

    public  static double multiply(double a,double b){
        return a * b;
    }

    public  static double divide(double a,double b){
        return a / b;
    }    

    
}