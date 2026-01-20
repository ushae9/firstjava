                                                         /*  OBJECT ORIENTED PROGRAMM WITH JAVA
                                                               (JAVA OOPS  V.V.IMPORTANT)

             1.Oops is faster easier to execute.
             2.oops provide clear structure.
             3.don't repeat yourself(dry).
             4.oops makes it possible to create full reusable application with less code and shorter development time.
              * java is object based programming.
              * c is function based programming.
              * java,python,c++is supported oops.


                pillars of oops:
                1.class
                2.object
                3.encapsulation
                4.polymorphism
                5.inheritation
                6.data abstraction

           1.class:A class is  a blue print of an opject(logical
             * no memory is located when class declared
             * a group of similar objects.
             *can declared once

          class: syntax:
                 class Name
                 {
                   data member;
                   method;
                   constructor;
                   }

           2. object:a physical entity
              * memory is allocated when class declared
              * object can declared many times.

               object syntax:
                  Boy obj=new boy();
                   obj meanse (object reference 0r name)
                  new Boy is constructor.

                    java oops(java oriented programming) concepts
                     java oops concept refers to programming languages that use objects 
                  pillars of java:
                 1. class
                 2.object
                 3.encapsulation
                 4.polymorphism
                 5.inheritation
                 6.data abstraction

               1.java class:             
                  A class defines a blueprint of objects.
                 1. A constructor is used to initialize an object when it is created.
                 2. methods define behaviors or actions associated with the class.
                  
                modifiers: A class can be public or have default access (refer to this for 
               class name: The class name should begin with the initial letter capitalized 
                    body: The class body is surrounded by braces,{}
              1.Data (fields/Attributes):
                 objects contains data in the form of variables, also called fields or 
              2.Behavior:(methods)
                 objects also have method, which are functions that define what the object
               for example:in real life,a car is an object.The car has attributes, success

             Syntax:
 
                  public class ClassName { 
                  // fields (variables)
                    type field name;

                  // constructor
                    public ClassName() {
                    // initialization code
                    }
                     //mthods(behaviors)
                     public void methodName() {
                      }
                         }

          2.Java object:
              an object is an instance of the class 
             memory is allocated as soon as an object is created.
             an object is a real world entity such as a book,car extra.
             objects can be created many times as per requirement.
             Syntax:
              className objectName = new className();*/

                               /* programme:
              class Student {
                int id;
                String n;}
                 public class Main{
                 public static void main(String[] args) {
                  Student s1 = new Student();
                  System.out.println(s1.id);
                  System.out.println(s1.n);
                   }
                      }
                          }*/

          class Student{
           int rollno;//data members
           String name;//data members antaru
           void insertRecord(int r, String n)//method defination
           {
             rollno=r;
              name=n;
            }
            void displayInformation()     
            {         
             System.out.println(rollno+ " " +name);
             }
              }
               public class Main{
               public static void main(String args[])
               {
                 Student s1=new Student();
                 Student s2=new Student();
                 s1.insertRecord(111,"Abhi"); 
                 s2.insertRecord(222,"Pythonlife");
                 s1.displayInformation();
                 s2.displayInformation();
                }
                }
                   
           
 


































                 
             
 
         