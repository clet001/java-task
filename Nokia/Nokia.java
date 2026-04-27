import java.util.Scanner;
public class Nokia{
    public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

    String menu = """
    
    ....WELCOME.....

Enter 1 - PhoneBook
Enter 2 - Messages
Enter 3 - Chats
Enter 4 - Call register
Enter 5 - Tones
Enter 6 - Settings
Enter 7 - Call cost
Enter 8 - Prepaid credit

""";

System.out.println(menu);
System.out.println("Enter Option");

int input = inputCollector.nextInt();

switch(input){

    case 1:
        String PhoneBook = """
    
    PHONE BOOK

Enter 1 - Search
Enter 2 - Service Nos
Enter 3 - Add name
Enter 4 - Erase
Enter 5 - Edit
Enter 6 - Assign tone
Enter 7 - Send b'card
Enter 8 - Options

""";
System.out.println(PhoneBook);
System.out.println("Enter Option");

int output = inputCollector.nextInt();
break;  
    
   case 2:
            String Search = """
                SEARCH
    """;
System.out.println(Search);
System.out.println("Search"); 
break;    

case 3:
            String ServiceNos = """
                SERVICE NOS
    """;
System.out.println(ServiceNos);
System.out.println("Enter Service NUmber");

break;        

case 4:
        
            String Erase = """
                ERASE
    """;
System.out.println(Erase);
System.out.println("Erase");
break;

case 5:

            String Edit = """
                EDIT
    """;
System.out.println(Edit);
System.out.println("Edit");
break;

case 6:

            String AssignTone = """
                ASSIGN TONE
    """;
System.out.println(AssignTone);
System.out.println("Assign a Tone");

break;


case 7:

            String Sendbcard = """
                SEND B CARD
    
System.out.println(Sendbcard);
System.out.println("Send b card");
""";
break;


}




    }




}
