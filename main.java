import java.util.Scanner;
public class Shrimp
{
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
//Basic Variables
int age = 0;
int health = 0;
int maxHealth = 0;
int food = 0;
int maxFood = 0;
int water = 0;
int maxWater = 0;
int money = 0;
int multiplier = 1;
int discount = 1;
int num = 0;
int sickDays = 0;
int salary = 0;
boolean medical = false;
boolean eng = false;
boolean sci = false;
boolean phd = false;
String title = "";
String job = "none";

String [] Forage = new String[] {"Gigaplastic", "boulder", "shiny rock", "shinier rock", "shiniest rock", "forklift", "jawbone"};
   int [] ForageValue = new int[] {50, 30, 60, 70, 80, 100, 50};
   
   String [] JUV_HUNT = new String[] {"anchovy", "goldfish", "anenome", "crab", "lobster"};
   int [] JUV_HUNT_DAMAGE = new int[] {1, 1, 1, 2, 2};
   int [] JUV_HUNT_VALUE = new int[] {15, 15, 10, 30, 50};
   
   String [] HUNT = new String[] {"trout", "bass", "carp", "sabertooth salmon", "batman", "jellyfish", "lionfish", "tuna", "clownfish"};
   int [] HUNT_DAMAGE = new int[] {1, 2, 1, 3, 4, 2, 2, 1, 1};
   int [] HUNT_VALUE = new int[] {80, 90, 80, 130, 250, 100, 120, 200, 80};
   
   String [] JOBS_SCI = new String[] {"Computer Scientist", "Research Fellow"};
   
while (true)
{
   if (age == 0)
   {
       System.out.println("You were born as a Shrimp!");
       age++;
       maxHealth = 5;
       maxFood = 5;
       maxWater = 5;
       health = 5;
       food = 5;
       water = 5;
       title = "Baby ";
       continue;
   }
   else if (age == 5)
   {
       age++;
       maxHealth = 10;
       maxFood = 10;
       maxWater = 10;
       food++;
       water++;
       title = "Juvenile ";
       continue;
   }
   else if (age == 15)
   {
       age++;
       food++;
       water++;
       maxHealth = 20;
       maxWater = 20;
       maxFood = 20;
       title = "Adult ";
       continue;
   }
   else if (phd == true)
       title = "Dr. ";

   //death
   if (health == 0)
       {
           System.out.println("You lived " + age + " Years.");
           break;
       }
   
   
   //display
   System.out.println(title + "Shrimp");
   System.out.println("Health: " + health + "/" + maxHealth);
   System.out.println("Food: " + food + "/" + maxFood);
   System.out.println("Water: " + water + "/" + maxWater);
   System.out.println("Money: " + money);

           
   //age limited stuff
   System.out.println("What would you like to do?");
   System.out.println("1. Shop");
   System.out.println("2. Forage");


   if (age >= 5)
   {
       System.out.println("3. Hunt");
   }
   if (age >= 15)
   {
       System.out.println("4. Learn");
       if (job.equals("None"))
       {
           System.out.println("5. Get a job");
       }
                else
                {
                    System.out.println("5. Work");
                    System.out.println("6. Quit your Job");
                }
   }

   int action = reader.nextInt();
   if (action == 1)
   {
       System.out.println("What would you like to buy?");
       System.out.println("1. Shrimp Food - $" + 5 * discount);
       System.out.println("2. Shrimp Water - $" + 5 * discount);
       System.out.println("3. Bandages - $ " + 15 * discount);
       if (age >= 5)
       {
           System.out.println("4. Shrimp Meal - $" + 10 * discount);
           System.out.println("5. The Moon - $" + 1000000 * discount);
       }

       action = reader.nextInt();
       if (action == 1)
       {
           if (money >= 5 * discount)
           {
               food += 5;
               money -= 5 * discount;
               
               
           }
       }
       if (action == 2)
       {
           if (money >= 5 * discount)
           {
               water += 5;
               money -= 5 * discount;
           }
       }
       if (action == 3)
       {
           if (money >= 25 * discount)
           {
               health += 5;
               money -= 25 * discount;
               if (health > maxHealth)
                   health = maxHealth;
           }
       }
       if (action == 4 && age >= 5)
       {
           if (money >= 10 * discount)
           {
               food += 7;
               water += 7;
               money -= 10 * discount;
           }
       }
       if (action == 5 && age >= 5)
       {
           if (money >= 1000000 * discount)
           {
               System.out.println("You have purchased the moon.");
               System.out.println("Congrats, you win.");
               break;
           }
       }
       action = 1;
   }
   if (action == 2 && age < 5)
   {
   num = (int)(Math.random() * 3);
       if (num == 0)
       {
           System.out.println("You found a pebble! +$" + (3 * multiplier));
           money += 3 * multiplier;
       }
    if (num == 1)
       {
           System.out.println("You found a bone! +$" + (10 * multiplier));
           money += 10 * multiplier;
       }
       if (num == 2)
       {
           System.out.println("You found a microplastic! +$" + (5 * multiplier));
           money += 5 * multiplier;
       }
   }
   else if (action == 2 && age < 15)
   {
   num = (int)(Math.random() * 3);
       if (num == 0)
       {
           System.out.println("You found a rock! +$" + (7 * multiplier));
           money += 7 * multiplier;
       }
    if (num == 1)
       {
           System.out.println("You found a rib! +$" + (25 * multiplier));
           money += 25 * multiplier;
       }
       if (num == 2)
       {
           System.out.println("You found a macroplastic! +$" + (15 * multiplier));
           money += 15 * multiplier;
       }
   }
   else if (action == 2)
   {
       num = (int)(Math.random() * 7);
       System.out.println("You found a " + Forage[num] + " +$" + ForageValue[num]);
       money += ForageValue[num] * multiplier;
   }
   if (action == 3)
   {
       if (age >= 5)
       {
           if (age < 15)
           {
               num = (int)(Math.random() * 5);
               System.out.println("You caught and sold a " + JUV_HUNT[num] + " for $" + JUV_HUNT_VALUE[num] + "!");
               System.out.println("You took " + JUV_HUNT_DAMAGE[num] + " damage!");
               health -= JUV_HUNT_DAMAGE[num];
               money += JUV_HUNT_VALUE[num] * multiplier;
           }
           else
           {
               num = (int)(Math.random() * 9);
               System.out.println("You caught and sold a " + HUNT[num] + " for $" + HUNT_VALUE[num] + "1");
               System.out.println("You took " + HUNT_DAMAGE[num] + " damage!");
               health -= HUNT_DAMAGE[num];
               money += HUNT_VALUE[num] * multiplier;
           }
       }
   }
   if (action == 4)
   {
       if (age >= 15)
       {
           System.out.println("1. Science Degree - $" + 1000);
           System.out.println("2. Medical School - $" + 5000);
           System.out.println("3. Engineering Degree - $" + 1000);
           System.out.println("4. Grad School - $" + 50000);
           System.out.println("5. Law School - $" + 50000);
       }
       action = reader.nextInt();
       if (action == 1)
       {
           if (money >= 1000)
           {
               sci = true;
               money -= 1000;
           }
           else
           {
               System.out.println("You don't have enough money!");
           }
       }
       if (action == 2)
       {
           if (money >= 5000)
           {
               medical = true;
               money -= 5000;
           }
           else
           {
               System.out.println("You don't have enough money!");
           }
       }
       if (action == 3)
       {
           if (money >= 1000)
           {
               eng = true;
               money -= 1000;
           }
           else
           {
               System.out.println("You don't have enough money!");
           }
       }
       if (action == 4)
       {
           if (money >= 50000)
           {
               phd = true;
               money -= 50000;
           }
           else
           {
               System.out.println("You don't have enough money!");
           }
       }
   }
   if (action == 5)
   {
       if (job.equals("none"))
       {
           System.out.println("Available jobs: ");
           System.out.println("Cashier - $100 per Year");
           System.out.println("Cook - $150 per Year");
           if (medical)
               System.out.println("Doctor - $1000 per Year");
           if (sci)
               System.out.println("Data Analyst - $300 per Year");
           if (eng)
               System.out.println("Engineer - $400 per Year");
           if (phd)
               System.out.println("Scientist - $10000 per Year");
           reader.nextLine();
           String jobAction = reader.nextLine();
           if (jobAction.equals("Cashier"))
            {
                salary = 100;
                job = "Cashier";
            }
           if (jobAction.equals("Cook"))
           {
               job = "Cook";
               salary = 150;
           }
           if (jobAction.equals("Doctor"))
           {
               job = "Cook";
               salary = 150;
           }
           if (jobAction.equals("Engineer"))
           {
               job = "Engineer";
               salary = 400;
           }
           if (jobAction.equals("Data Analyst"))
           {
               job = "Data Analyst";
               salary = 300;
           }
           if (jobAction.equals("Scientist"))
           {
               job = "Scientist";
               salary = 10000;
           }
       }
       if (job.equals("Cook"))
       {
           num = (int)(Math.random() * 10);
           {
               if (num == 0)
               {
                   System.out.println("You got burned!");
                   health -= 3;
               }
               if (num > 7)
               {
                   System.out.println("You got a $10 raise!");
                   salary += 10;
               }
               System.out.println("You earned $" + salary + "!");
               money += salary;
           }
       }
       if (job.equals("Cashier"))
       {
           num = (int)(Math.random() * 10);
           {
               if (num > 7)
               {
                   System.out.println("You got a $10 raise!");
                   salary += 10;
               }
               System.out.println("You earned $" + salary + "!");
               money += salary;
           }
       }
       if (job.equals("Doctor"))
       {
           num = (int)(Math.random() * 10);
           if (num == 1)
            {
                System.out.println("You got sick!");
                health -= 5;
            }
           if (num > 7)
               {
                   System.out.println("You got a $50 raise!");
                   salary += 50;
               }
               System.out.println("You earned $" + salary + "!");
               money += salary;
       }
       if (job.equals("Engineer"))
       {
           num = (int)(Math.random() * 10);
           if (num == 1)
            {
                System.out.println("You got sick!");
                health -= 5;
            }
           if (num > 7)
               {
                   System.out.println("You got a $50 raise!");
                   salary += 50;
               }
               System.out.println("You earned $" + salary + "!");
               money += salary;
       }
       if (job.equals("Data Analyst"))
       {
           num = (int)(Math.random() * 10);
           if (num == 1)
            {
                System.out.println("Your structure collapsed!");
                health -= 5;
            }
           if (num > 7)
               {
                   System.out.println("You got a $100 raise!");
                   salary += 100;
               }
               System.out.println("You earned $" + salary + "!");
               money += salary;
       }
       if (job.equals("Scientist"))
       {
           num = (int)(Math.random() * 100);
           if (num == 50)
            {
                System.out.println("You won a Nobel Prize!");
                money += 50 * salary;
            }
            if (num < 20)
            {
                System.out.println("You published a paper!");
                money += salary * 5;
            }
           if (num > 80)
               {
                   System.out.println("You got a $1000 raise!");
                   salary += 1000;
               }
               System.out.println("You earned $" + salary + "!");
               money += salary;
       }
   }
   if (action == 6)
   {
       System.out.println("You quit your job!");
       job = "none";
   }
      //basic decay

   if (food == 0 || water == 0)
       health--;
   if (food == maxFood)
       health++;
   if (water == maxWater)
       health++;
       
   if (health > maxHealth)
   {
       health = maxHealth;
   }
   if (food > maxFood + 1)
   {
       food = maxFood + 1;
   }
   if (water > maxWater + 1)
   {
       water = maxWater + 1;
   }
   if (water > 0)
   water--;
   if (food > 0)
       food--;
       
       
   num = (int)(Math.random()*1000);
   if (num == 473)
   {
       System.out.println("The sun exploded.");
       health = 0;
   }
   age++;
}
}
}