             /* Arrays in java:
                               Arrays allows us to store multiple value of the same type in a single variable.
                 To define the variable and declare array by the [] square brackets.
            Defination:Arrays are fandamental structures in java that allow us to store multiple value of the same type in a single variable.
                       1.In java all arrays are dynamically allocated.
                       2.Arrays may be stored in contiguous memory.
                       3.Since arrays are objects in java, we can find their length using the object property length. this is different from
                          c/c++, where we find length using size of.
                       4.A java array variable can also be declared like other variables with [] after the data type. 
                       5.It is the simplest data structure where each data element can be accessed directly by only using its index number.
                       6.The variables in the array are ordered, and each has an index beginning with 0.
               i.Array declaration:
              Syntax:
               Method 1:Type var-name[];
               Method 2:Type[] var-name;                                 //0, 1 2 3
               type:the data type of the array elements(e.g., int,string)//33,3,4,5
                array name:the name of the array */ 
                  
          /* ii.create an Arrays:
                          0, 1,2,3
                 int a[]={33,3,4,5};//declartion,instantiation,and initialization.
          iii.Access an element of an array:                                                                                                                                                            
               public class ArraysEx{
              public static void main(String[] args)
               {
                 int a[]={33,3,4,5};//declaration,instantiation,and initialization.
                   System.out.println(a[3]);//acessing of an element.
               }
                 }*/

           /*iv.Change an array element:
                  To change an element,assign a new value to a specific index:
                   //changing the first element to 20
                     int a[]={33,3,4,5};
                      System.out.println("before" +a[0]);
                       a[0] =1222;
                      System.out.println("after" +a[0]);*/

               /* public class ArraysEx{
                  public static void main(String[] args)
                    {
                     int a[]={33,3,4,5};
                      System.out.println("before" +a[0]);
                       a[0] =1222;
                      System.out.println("after" +a[0]);
                     }
                        }*/ 

           /* v.Array length:
              we can get the length of an array using the lenth property:
               //getting the length of the array
                 int a[] ={33,3,4,5};
                 int length = a.length;
                   System.out.println("Length" =length);*/

             /* public class ArraysEx{
               public static void main(String[] args)
                {
                 int a[] ={33,3,4,5};
                  int length = a.length;
                    System.out.println("Length" +length);
                     }
                       }*/

       /* TYPES OF ARRAYS IN JAVA:
            i.Single dimensional arrays:
               These are the most comman type of arrays,where elements are stired in a linear order.
                 int[] singleDimArray = {1,2,3,4,5};*/

           /* public class ArraysEx{
              public static void main(String[] args){
                int[] arr;
                //allocating memory for 5 integers.
                 arr = new int [5];
                //initialize the elements of array.
                //first to last (fifth)element.
                  arr[0] = 10;
                  arr[1] = 20;
                  arr[2] = 30;
                  arr[3] = 40;
                  arr[4] = 50;//int[] arr={10,20,30,4o,50}:
                 //accessing the element of the specified array length=5
                  for(int i = 0;i<arr.length;i++)//i=0 0<5
                  System.out.println("Element at index"+i+":"+arr[i]);
                  }
                    }*/

          /* ii.Two dimensional arrays:
               code:
                  int[][] arr = new int [2][2];
                   //number of rows
                   System.out.println("Rows:"+arr.length);
                    //number of columns
                    System.out.println("Columns:" +arr[0].length);
                     //declaring and initializing 2d Array
                      int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
                       //printing 2d array
                         for(int i=0;i<3;i++){
                          for(int j=0; j<3; j++){
                           System.out.println(arr[i][j] +" ");
                            }
                            System.out.println();
                            }*/

              /* public class ArraysEx
                {
                public static void main(String[] args)
                 {
                 int[][] arr = new int[3][3];
                  System.out.println("Rows : " + arr.length);
                   System.out.println("Columns : " + arr[0].length);
                    int arrr[][] = { { 2, 1, 2 }, { 3, 6, 4 }, { 7, 4, 2} };
                     for(int i = 0; i < 3; i++){
                         for(int j = 0; j < 3; j++){
                             System.out.print(arrr[i][j] + " ");
                             }
                               System.out.println();
                              }
                                 }
                                 } */ 

       /* public class ArraysEx
         {
        public static void main(String[] args)
         {
           int[][] arr = new int[3][3];
            System.out.println("Rows : " + arr.length);
             System.out.println("Columns : " + arr[0].length);
              int arrr[][] = { { 5, 6, 7 }, { 8, 9, 5 }, { 4, 3, 2 } };
               for(int i = 0; i < 3; i++){
                 for(int j = 0; j < 3; j++){
                   System.out.print(arrr[i][j] + " ");
                     }
                      System.out.println();
                       }
                         }
                            }*/

                //LOOP THROUGH AN ARRAY:

             /*  ex:-   public class ArraysEx
                  {
                    public static void main(String[] args)
                     {
                      String[] cars = {"Royal enfield", "Bmw", "java", "Hero"};
                       for (int i = 0;i < cars.length; i++) {
                         System.out.println(cars[i]);
                           } 
                             }
                                }*/

        /*  ex:-   public class ArraysEx
              {
               public static void main(String[] args)
                {
                  String[] names = {"pramod", "usha", "abhi", "ruthvik"};
                    for (int i = 0; i < names.length; i++){
                      System.out.println(names[i]);
                       }
                         }
                           } */

       /* 2D ARRAY ACCESS ELEMENENT:
                int[][] myNumbers = { {1, 2, 3, 4 }, {5, 6, 7 } };
                  System.out.println(myNumbers[1][2]);*/

           /* public class ArraysEx
             {                                                                         
              public static void main(String[] args)                                
               {                                                                       
                 int[][] myNumbers = { {1, 2, 3, 4 }, { 5, 6, 7 } };                    
                   System.out.println(myNumbers[1][2]);
                 }
                   }*/


           /* 2D ARRAY CHANGE ELEMENTS:
                 int[][] myNumbers = { {1, 2, 3, 4 }, { 5, 6, 7} };
                   myNumbers[1][2] = 9;
                    System.out.println(myNumbers[1][2]);*/

           /* public class ArraysEx
             {
               public static void main(String[] args)
                {
                  int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
                   myNumbers[1][2] = 9;
                  System.out.println(myNumbers[1][2]);
                  }
                    }*/

            public class ArraysEx
              {
                public static void main(String[] args)
                 {
                  int[][] myNumbers = { {1, 2, 3, 4 }, { 5, 6, 7 } };
                    myNumbers[1][2] = 9;
                        System.out.println(myNumbers[1][2]);
                          for(int i = 0; i < 5; i++){
                            for(int j = 0; j < 4; j++){
                             System.out.print(myNumbers[i][j] + " ");
                              }
                                System.out.println(); 
                                }
                                  }
                                    }
                
     
                                                                      ---------









 
                









                
 
  
                 


      



