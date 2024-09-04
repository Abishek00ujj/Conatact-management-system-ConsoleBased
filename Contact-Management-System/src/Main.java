import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Contact-Management-System");
        LinkedHashMap<String,Contact> data=new LinkedHashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.View");
        System.out.println("3.Update");
        System.out.println("4.Delete Contact");
        while (true)
        {
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Welcome to Contact Management System:\n");
                    System.out.println("Add contacts:\n");
                    //System.out.println("Format\nName\nPhone Number\nEmail");
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name=sc.nextLine();
                    System.out.println();
                    System.out.print("Phone Number: ");
                    String Phonenumber= sc.nextLine();
                    System.out.println();
                    System.out.print("Email: ");
                    String Email=sc.nextLine();
                    System.out.println();
                    Contact contact=new Contact(name,Phonenumber,Email);
                    data.put(Phonenumber,contact);
                    System.out.println("Data are Entered Succuessfully!\n");
                    break;
                }
                case 2:
                {
                    sc.nextLine();
                    System.out.println("1.All contacts");
                    System.out.println("2.View by Phonenumber");
                    int v=sc.nextInt();
                    switch (v)
                    {
                        case 1:
                        {
                            System.out.println("Showing all the data!");
                            System.out.println(data);
                            break;
                        }
                        case 2:
                        {
                            sc.nextLine();
                            System.out.println("Enter you contact");
                            String x=sc.nextLine();
                            System.out.println(data.get(x));
                            break;
                        }
                        default:
                            throw new IllegalStateException("Unexpected value: " + choice);
                    }
                    break;
                }
                case 3:
                {
                    sc.nextLine();
                    System.out.println("Enter you contact");
                    String number=sc.nextLine();
                    if(data.containsKey(number))
                    {
                        System.out.println("Which data are you want to update");
                        System.out.println("1.Name update");
                        System.out.println("2.Phone Number update");
                        System.out.println("3.Email update");
                        int x = sc.nextInt();
                        switch (x) {
                            case 1:
                            {
                                sc.nextLine();
                                System.out.println("Enter your new name:");
                                String name=sc.nextLine();
                                Contact contactNum=data.get(number);
                                String phoneNumber=contactNum.phoneNumber;
                                String Name=name;
                                String Email=contactNum.eMail;
                                Contact contact=new Contact(Name,phoneNumber,Email);
                                data.put(phoneNumber,contact);
                                System.out.println("Name is updated Succuessfully!");
                                break;
                            }
                            case 2:
                            {
                                sc.nextLine();
                                System.out.println("Enter your new Email:");
                                String Email=sc.nextLine();
                                Contact contactNum=data.get(number);
                                String phoneNumber=contactNum.phoneNumber;
                                String Name=contactNum.name;
                                Contact contact=new Contact(Name,phoneNumber,Email);
                                data.put(phoneNumber,contact);
                                System.out.println("Email is updated Succuessfully!");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Error!.No contact found");
                    }
                    break;
                }
                case 4:
                {
                    sc.nextLine();
                    System.out.println("Enter you contact");
                    String number=sc.nextLine();
                    if(data.containsKey(number))
                    {
                        data.remove(number);
                        System.out.println("Deleted Succuessfully!");
                    }
                    else{
                        System.out.println("Error!.No contact found");
                    }
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}