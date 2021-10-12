/**This program will prompt the user for a month and day and then prints the season, 
   as determined by this algorithm. It will yield
   the season (Spring, Summer, Fall, or Winter) for a given month and day.
   *@author: Michael A Shelton Jr.
   *@version: October 12,2021
   */
   import java.util.Scanner;
   
   public class SeasonOfTheYearCalculator
   {
      public static void main(String[] args){
      }
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Ex3.14 Seasons By Michael Shelton Jr. \n");
      System.out.print("Enter the Month: ");
      int month = in.nextInt();
      
      System.out.print("Enter the Day: ");
      int day = in.nextInt();
      
      String season ="";
      
      if(month == 1 || month == 2 || month ==3) //if month is 1,2, or 3 season is Winter
         {
      
         season = "Winter";
         //If month is divisible by 3 and day >= 21 is "Winter", season = "Spring"
         if ((month%3 == 0)&&(day>=21))//divisible by 3 and day >= 21
         }
         
         {
         season = "Spring";
         }
         
         
         
         
         
      
       //end of Winter condition 
      
      
      //All comparisons, Output of season
        System.out.println("The Season is: " + season); 
         
      
         
     
      }//end of main method
      
}//end of class 