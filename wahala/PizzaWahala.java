import java.util.Scanner;
public class PizzaWahala{
    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

String Menu = """

        ......Welcome to PizzaWahala......

           Pizzatype            Number of Slices    Price per box
    Enter 1 - Sapa Size                 4               2500
    Enter 2 - Small Money               6               2900
    Enter 3 - Big boys                  8               4000
    Enter 4 - Odogwu                    12              5200
    """;
System.out.println(Menu);
System.out.println("Enter prefered Pizza Package");
int option = inputCollector.nextInt();

switch (option){
    case 1: System.out.println("Sapa Size");
            System.out.println("Enter the number of people");
            int Totalpeople = inputCollector.nextInt();

            int add = 0;
            int box = 0;
            int leftover = 0;
            int slice = 4;
            

       if (Totalpeople % 4 != 0) {
        
            add = Totalpeople + 4;
        
            box = Totalpeople/slice;
        
           leftover = Totalpeople % slice;
            int payment = box * 2500;
        
System.out.println("The user will buy " + box + " boxes of Pizza");
        System.out.println("Slices left over: " + leftover );
        System.out.println("Customer will pay " + payment);
        break;

}

else if (Totalpeople % 4 == 0){
         int payment = box * 2500;
        box = Totalpeople / 4;
        
        System.out.println("The user will buy " + box + " boxes of Pizza");
        System.out.println("Slices left over: " + leftover );
        System.out.println("Customer will pay " + payment);
        break;
        
}        

case 2: System.out.println("Small Money");
            System.out.println("Enter the number of people");
            int totalpeople = inputCollector.nextInt();

            int adds = 0;
            int boxes = 0;
            int leftovers = 0;
            int slices = 6;
            

       if (totalpeople % 6 != 0) {
        
            adds = totalpeople + 6;
        
            boxes = totalpeople/slices;
        
           leftovers = totalpeople % slices;
            int payments = boxes * 2900;
        
System.out.println("The user will buy " + boxes + " boxes of Pizza");
        System.out.println("Slices left over: " + leftovers );
        System.out.println("Customer will pay " + payments);
        break;

}

else if (totalpeople % 4 == 0){
         int payments = boxes * 2900;
        boxes = totalpeople / 6;
        
        System.out.println("The user will buy " + boxes + " boxes of Pizza");
        System.out.println("Slices left over: " + leftovers );
        System.out.println("Customer will pay " + payments);
        break;
        
}

case 3: System.out.println("Sapa Size");
            System.out.println("Enter the number of people");
            int TotalBigBoys = inputCollector.nextInt();

            int addone = 0;
            int boxone = 0;
            int totalleftover = 0;
            int totalslice = 8;
            

       if (TotalBigBoys % 8 != 0) {
        
            addone = TotalBigBoys + 8;
        
            boxone = TotalBigBoys/8;
        
           totalleftover = TotalBigBoys % totalslice;
            int totalpayment = boxone * 4000;
        
System.out.println("The user will buy " + boxone + " boxes of Pizza");
        System.out.println("Slices left over: " + totalleftover );
        System.out.println("Customer will pay " + totalpayment);
        break;

}

else if (TotalBigBoys % 8 == 0){
         int totalpayment = boxone * 4000;
        box = TotalBigBoys / 8;
        
        System.out.println("The user will buy " + boxone + " boxes of Pizza");
        System.out.println("Slices left over: " + totalleftover );
        System.out.println("Customer will pay " + totalpayment);
        break;

}

case 4: System.out.println("Odogwu");
            System.out.println("Enter the number of people");
            int TotalOdogwu = inputCollector.nextInt();

            int add2 = 0;
            int allbox = 0;
            int allleftover = 0;
            int allslice = 12;
            

       if (TotalOdogwu % 12 != 0) {
        
            add2 = TotalOdogwu + 12;
        
            allbox = TotalOdogwu/12;
        
           allleftover = TotalOdogwu % allslice;
            int allpayment = allbox * 5200;
        
System.out.println("The user will buy " + allbox + " boxes of Pizza");
        System.out.println("Slices left over: " + allleftover );
        System.out.println("Customer will pay " + allpayment);
        break;

}

else if (TotalOdogwu % 12 == 0){
         int allpayment = allbox * 5200;
        allbox = TotalOdogwu / 12;
        
        System.out.println("The user will buy " + allbox + " boxes of Pizza");
        System.out.println("Slices left over: " + allleftover );
        System.out.println("Customer will pay " + allpayment);
        break;

}

default: {
        System.out.println("Invalid option");

}





    
    }










    }
}
