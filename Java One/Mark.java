import java.util.Scanner;
public class Mark{
     public static void main(String[] args){
         Scanner input=new Scanner(System.in);

       while(true){
         System.out.print("Do You Want To Add New Student.? (Y/N) :");
         String yesno=input.next();
        
         switch(yesno){
             case"Y":
                 System.out.print("Enter Student Name :");
                 String name=input.next();
                 
                 System.out.println();
                 
                 System.out.print("Enter Student Address :");
                 String address=input.next();
                 
                 System.out.println();
                 
                 System.out.print("Enter Number Of Subjects :");
                 int subjects=input.nextInt();

                 System.out.println();
                       
                       int[] marks = new int[subjects];
                       for(int i=0;i<=subjects;i++){
                            System.out.print("Enter Subject " +(i+1)+ " Marks :");
                            marks[i]=input.nextInt();
                       }
                 System.out.println();
  
                 boolean flag=true;
                while(flag){
                  System.out.println("A.Show Student Details.");
                 System.out.println("B.Show All Marks.");
                 System.out.println("C.Show result.");
                 System.out.println("X.Exit.");

                 System.out.println();
                 
                
                 System.out.print("--->");
                 yesno=input.next();
                           
                
                
                 switch(yesno){
                      case"A":
                         System.out.println("Student Name :" + name);
 			 System.out.println("Student Address :" + address);	
                      break;
                      case"B":
                         System.out.println("Student All Marks :");
                         for(int i=0;i < marks.lenght;i++){
                           System.out.print(marks[i]);
                         }
                      break;
                      case"C":
                           int total=0;
                           for(int i=0;i<marks.length;i++){
                               total=total+marks[i];
                           }
                           double avg= (double)total/subjects;

                            System.out.print("Student Result :");
                            if(avg>=50){
                                 System.out.print("Pass........");
                            }else{
                                 System.out.print("Fail........");
                            }
                           
                      break;
                      case"X":
                          flag=false;
                      break;
                      default:
                       System.out.print("Invalid Entry.......");
                 }
}

                 
                      
                 
                      
             break;
             case"N":
                System.out.println("Good Bye........");
                return;
             default:
              System.out.print("Invalid Entry.......");
         
      }
              System.out.println();
     }
     }
}