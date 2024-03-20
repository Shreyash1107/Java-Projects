package org.Client;
import java.util.*;

import org.Service.Carservice;
import org.Service.Customerservice;
import org.Service.Mechanicservice;
import org.model.Cars;
import org.model.Customer;
import org.model.Mechanic;
public class CargarageApp 
{
    public static void main(String[] args) 
    {
        int choice,i;
        Scanner sc = new Scanner(System.in);
        Mechanicservice mservice=new Mechanicservice();
        Carservice cservice = new Carservice();
        Customerservice custservice = new Customerservice();
        do
        {
            System.out.println("1. Add mechanics in the garage.");
            System.out.println("2. View all the mechanics working in garage.");
            System.out.println("3. Add cars in the garage.");
            System.out.println("4. Display all cars in garage with their status.");
            System.out.println("5. Add Customers in Garage.");
            System.out.println("6. Count Cars with same Problem.");
            System.out.println("7. Search cars by their registration number.");
            System.out.println("8. Display all the cars with same Model.");
            System.out.println("9. Updating status of the car after repairing.");
            System.out.println("10. Removing the car from the garage after repairing.");
            System.out.println("\t\t\t\t\t\t\t*******WELCOME*********\t\t\t\t\t\t\t");
            System.out.println("Enter the choice:");
            choice = sc.nextInt();
           switch(choice)
           {
              case 1:
              int id;
              String name,Address,Contact,Speciality;
              System.out.println("Enter the Mechanic's Id:");
              id = sc.nextInt();
              System.out.println("Enter the Name of the Mechanic:");
              sc.nextLine();  //Consuming newline character
              name = sc.nextLine();
              System.out.println("Enter the Address of the Mechanic:");
              Address = sc.nextLine();
              System.out.println("Enter the Contact of the Mechanic:");
              Contact = sc.nextLine();
              System.out.println("Enter the Speciality of the Mechanic:");
              Speciality = sc.nextLine();
              Mechanic mech = new Mechanic(id, name, Address, Contact, Speciality);
              boolean b = mservice.ismechanicAdded(mech);
              if(b)
              {
                System.out.println("Mechanic has benn Added Successfully....");
              }
              else
              {
                System.out.println("There is some Problem....");
              }
              break;
              case 2:
              ArrayList al = mservice.getmechanic();
              if(al!=null)
              {
                System.out.println("Mechanics are present in Garage:");
                for(i=0;i<al.size();i++)
                {
                    Object ob = al.get(i);
                    Mechanic m = (Mechanic)ob;
                    System.out.println(m.getid() + " " + m.getname() + " " + m.getAddress() + " " + m.getContact() + " " + m.getSpeciality());
                }
              }
              else
              {
                System.out.println("No mechanics are Present in Garage");
              }
              break;
              case 3:
              String regno,model,Name,issue,ownername;
              sc.nextLine();  //Consuming newline character
              System.out.println("Enter the Registration Number of a Car:");
              regno = sc.nextLine();
              System.out.println("Enter the Car model:");
              model = sc.nextLine();
              System.out.println("Enter the Name of the Car:");
              Name = sc.nextLine();
              System.out.println("Enter the Problem in the Car:");
              issue = sc.nextLine();
              System.out.println("Enter the Car Owner's Name:");
              ownername = sc.nextLine();
              Cars c = new Cars(regno, model, Name, issue, ownername);
              boolean b1 = cservice.isCarAdded(c);
              if(b1)
              {
                System.out.println("Cars are Present in garage for repairing.....");
              }
              else
              {
                System.out.println("No Cars are there in Garage....");
              }
              break;
              case 4:
              al = cservice.getallCars();
              if(al!=null)
              {
                System.out.println("Cars are there in Garage....");
                for(i=0;i<al.size();i++)
                {
                  Object ob = al.get(i);
                  Cars c1 = (Cars)ob;
                  System.out.println(c1.getregno() + " " + c1.getmodel() + " " + c1.getname() + " " + c1.getissue() + " " + c1.getOwnername() + " " + c1.getstatus());
                }
              }
              else
              {
                System.out.println("There are no Cars in Garage........");
              }
              break;
              case 5:
              String custname,address,contact;
              sc.nextLine();   //Consuming newline Character
              System.out.println("Enter the Name of the Customer:");
              custname = sc.nextLine();
              System.out.println("Enter the Address of a Customer:");
              address = sc.nextLine();
              System.out.println("Enter the Contact of a Customer:");
              contact = sc.nextLine();
              Customer cust = new Customer(custname, address, contact);
              boolean b2 = custservice.isCustomerAdded(cust);
              if(b2)
              {
                System.out.println("Customer are there in Garage......");
              }
              else
              {
                System.out.println("No Customers are there in Garage.....");
              }
              break;
              case 6:
              int count;
              sc.nextLine();   //Consuming newline chatracer
              String defect;
              System.out.println("Enter the the Defect in car:");
              defect = sc.nextLine();
              al = cservice.getallCars();
              if(al==null)
              {
                System.out.println("No Cars are present in the Garage....");
              }
              else
              {
                boolean flag = false;
                for(i=0;i<al.size();i++)
                {
                    Cars c1 = (Cars)al.get(i);
                    if(c1.getissue().equalsIgnoreCase(defect))
                    {
                        if(!flag)
                        {
                            flag = true;
                            count = 1;
                            for(int j=i+1;j<al.size();j++)
                            {
                                if(c1.getissue().equalsIgnoreCase(defect))
                                {
                                    count++;
                                }
                            }
                            System.out.println("Cars with " + defect + " are " + count);
                        } 
                    }
                }
                if(!flag)
                {
                    System.out.println("There are no Cars of " + defect + "issue");
                }
              }
              break;
              case 7:
              sc.nextLine();//Consuming Newline Character
              boolean flag = false;
              String Regno;
              System.out.println("Enter the Registration Number to serach for:");
              Regno = sc.nextLine(); 
              al = cservice.getallCars();
              if(al==null)
              {
                System.out.println("Cars are not there in Garage......");
              }
              else
              {
                flag = false;
                for(Object ob:al)
                {
                    Cars c3 = (Cars) ob;
                    if(c3.getregno().equalsIgnoreCase(Regno))
                    {
                        flag = true;
                        System.out.println("Car with regno " + Regno + " present in the Garage");
                        break;
                    }
                }
                if(!flag)
                {
                    System.out.println("No car with regno " + Regno + " is present in the Garage");
                }
              }
              break;
              case 8:
              sc.nextLine();  //Consuming newline character
              flag = false;
              System.out.println("Enter the Model of car:");
              model = sc.nextLine();
              al = cservice.getallCars();
              if(al==null)
              {
                System.out.println("Cars are not presemt in garage");
              }
              else
              {
                flag=false;
                for(Object obj : al)
                {
                    Cars c3 = (Cars)obj;
                    if(c3.getmodel().equalsIgnoreCase(model))
                    {
                        flag = true;
                        System.out.println(c3.getregno() + " " + c3.getmodel() + " " + c3.getname() + " " + c3.getissue() + " " + c3.getOwnername());
                    }
                }
                if(!flag)
                {
                    System.out.println("Car with problem of " + model + " are not present in Garage");
                }
              }
              break;
              case 9:
              sc.nextLine(); //Consuming newline Character
              System.out.println("Enter the Registration Number of a Car:");
              Regno = sc.nextLine();
              System.out.println("Enter the updated Status of a Car:");
              String status = sc.nextLine();
              boolean updatestatus = cservice.updatecarstatus(Regno, status);
              if(updatestatus)
              {
                System.out.println("Car Status has been Updated Successfully.....");
              }
              else
              {
                System.out.println("THere is some issue.....");
              }
              break;
              case 10:
              sc.nextLine();  //Consuming newline character
              System.out.println("Enter the Status of a Car:");
              status = sc.nextLine();
              System.out.println("Enter the Registration Number of the Car:");
              Regno = sc.nextLine();
              al = cservice.getallCars();
              flag = false;
              for(i=0;i<al.size();i++)
              {
                  Cars c3 = (Cars)al.get(i);
                  if(c3.getregno().equalsIgnoreCase(Regno))
                  {
                      flag = true;
                      if(c3.getstatus().equalsIgnoreCase(status))
                      {
                          boolean delcar = cservice.delcarbyregno(Regno);
                          if(delcar)
                          {
                               System.out.println("Car with Registration Number:" + Regno + " has been removen From Garage....");
                          }
                          else
                          {
                              System.out.println("Car not removed from Garage due to some issue...");
                          }
                      }
                      else
                      {
                           System.out.println("Car with Registration Number " + Regno + " is not repaired so will not be removed from Garage.....");
                      }
                      break;
                  }
              }
              if(!flag)
              {
                  System.out.println("Car with Registration Number " + Regno + " is not present in Garage");
              }
              break;
              default:
              System.out.println("\t\t\t\t\t\t\t*******Thank you*********\t\t\t\t\t\t\t");
              break;
            }
        }while(true);
    }
}