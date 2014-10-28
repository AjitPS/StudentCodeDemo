package pkgStud;

import pkgStud.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        int studentCount= getNumberOfStudents();

        ArrayList<Student> studentList= new ArrayList<Student>();

        Scanner sc= new Scanner(System.in);
        System.out.println("Adding new Students' details.");
        for(int i=1; i<=studentCount; i++) {
            System.out.println("Enter Student Name: ");
            String name= sc.next();
            System.out.println("Enter Student's Age: ");
            int age= sc.nextInt();
            System.out.println("Enter Student's Marks: ");
            double marks= sc.nextDouble();
            System.out.println("Personal Record: Enter Student's Home Address: ");
            String addr= sc.next();

            studentList.add(new Student(name, age, marks, addr)); // Creating the new Objects.
           }

        int ch;
        do {
         System.out.println("Press 1 to Display details, 2 to Update [any other number to exit]: ");
         ch= sc.nextInt();
         switch(ch)
               {
                case 1: // Display details.
                        displayDetails(studentList);
                        break;

                case 2: // Update details.
                        System.out.println("Enter ID to update [from 0 onwards]: ");
                        int id= sc.nextInt();
                        updateDetails(studentList, id);
                        break;
               }
        }while(ch==1 || ch==2);

     System.out.println("Exiting System... Printing final records: \n");
     displayUsingObj(studentList);
    }
    
    private static int getNumberOfStudents() {
     System.out.println("Enter no. of Students (integer value) to store in the system: ");
     Scanner sc= new Scanner(System.in);
     int s= sc.nextInt();
     return s;
    }

    private static void displayDetails(ArrayList<Student> students) {
     String n, ad;
     int a;
     double m;
     for(int i=0; i<students.size(); i++) {
         n= students.get(i).getName();
         a= students.get(i).getAge();
         m= students.get(i).getMarks();
         ad= students.get(i).getAddress();
         System.out.println("Details: \t Name: "+ n +" ; Age: "+ a +" ; Marks: "+ m +" ; Personal Record: Address: "+ ad);
        }
    }

    private static void updateDetails(ArrayList<Student> stu, int id) {
     boolean matchFound= false;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter updated name: ");
     String uName= sc.next();
     System.out.println("Enter new Age: ");
     int uAge= sc.nextInt();
     System.out.println("Enter updated Marks: ");
     double uMarks= sc.nextDouble();
     System.out.println("Enter updated Address for PersonalRecord: ");
     String uAddr= sc.next();
     for(int i=0; i<stu.size(); i++) {
         if(id == i) {
            matchFound= true;
            stu.get(i).setName(uName);
            stu.get(i).setAge(uAge);
            stu.get(i).setMarks(uMarks);
            stu.get(i).setAddress(uAddr);
            System.out.println("Details updated. \n");
           }
        }
     if(!(matchFound)) {
        System.out.println("Cannot update Details... ID not found ! \n");
       }
    }

    private static void displayUsingObj(ArrayList<Student> studObj) {
     String n, ad;
     int a;
     double m;
     for(Student st : studObj) {
         n= st.getName();
         a= st.getAge();
         m= st.getMarks();
         ad= st.getAddress();
         System.out.println("Details: \t Name: "+ n +" ; Age: "+ a +" ; Marks: "+ m +" ; Personal Record: Address: "+ ad);
        }
    }
}
