# Learning Java

* we have a class and we need main for things to work
* to print to console
```java
public class Compiling {
  public static void main(String[] args) {
    
    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.print("Java statements end with a semicolon.");
    System.out.print("Programming is... fun!");
    
  }
}

```

* to comment
```java
public class Compiling {
  public static void main(String[] args) {
    
    // System.out.println("Java is a class-based language.");
    // System.out.println("Java classes have a 'main' method.");
    // System.out.print("Java statements end with a semicolon.");
    // System.out.print("Programming is... fun!");
    
  }
}
```

* when you are done with a java file you compile it using javac
    * at the end of it you get a class
    * run the program with java
```ps1
javac Compiling.java
java Compiling
```


## Planting a Tree
```java
public class Tree{
  public static void main(String[] args){
    //initalize a tree for us
    System.out.println("Hey there, I’m Tyrone and I’m learning to code in Java!");
    System.out.println("I’m going to plant a tree for you.");
    System.out.println("  *  ");
    System.out.println(" *** ");
    System.out.println(" *** ");
    System.out.println("  *  ");
    System.out.println("  *  ");   

  }
}
```

## Indouction
* print vairables
```java
public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name );
    System.out.println(yearCreated);
    
	}
}
```

### Ints 
* The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive.
* whole ##S


```java
//This is the class declaration
public class CountComment {
  //This is the main method that runs when you compile
	public static void main(String[] args) {
    //This is where you will define your variable
    int numComments = 6;
    //This is where you will print your variable
    System.out.println(numComments);
	}
  
  //This is the end of the class
}

//This is outside the class
```


### Doubles
* for decimals and number larger than int
```java
public class MarketShare {
	public static void main(String[] args) {
    double androidShare = 81.7;
    System.out.println(androidShare);
	}
}
```

### Booleas
```java
public class Booleans {
	public static void main(String[] args) {    
    boolean intsCanHoldDecimals = false;
    System.out.println(intsCanHoldDecimals);
	}
}
```

### Chars
  * only have single quotes
```java
public class Char {
	public static void main(String[] args) {   
    char expectedGrade = 'A';
    System.out.println(expectedGrade);
	}
}
```

### Strings
```java
public class Song {
	public static void main(String[] args) {   
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
    System.out.println(openingLyrics);

	}
}
```

### Static Checking
* when you compile with javac you get type checking
* names cant start with numbers or .
```java

```

### Review
```java
public class MyProfile {
	public static void main(String[] args) {   
    String name ="MICHAEL ODUMOSU";
    int age= 9;
    double desiredSalary= 1000000.00;
    char gender ='b';
    boolean lookingForJob = false;
	}
}
```

## Java Vairables Mad Libs
```java
public class MadLibs {
  /*
  Your description here
  */
  	public static void main(String[] args){
      String name1 = "Tyrone";
      String name2 = "Malik";
      String adjective1 ="smart";
      String adjective2 ="clever";
      String adjective3 ="talented";
      String noun1 ="dog";
      String noun2 ="cat";
      String noun3 ="mouse";
      String noun4 ="house";
      String noun5 ="car";
      String noun6 ="tree";
      String place1 ="the house";
      String place2 ="the school";
      String verb1 ="ran";
      int number=2002;

      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
    }       
}

```

## Manipulating Variables
```java
public class GuessingGame {
	public static void main(String[] args) {   
		int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
    System.out.println(mystery2);
	}
}
```

### Addition and Subtraction
```java
public class PlusAndMinus {
	public static void main(String[] args) {   
		int zebrasInZoo = 8;
    int giraffesInZoo = 4;
    int animalsInZoo = giraffesInZoo + zebrasInZoo;
    System.out.println(animalsInZoo);
    int numZebrasAfterTrade = zebrasInZoo -2;
    System.out.println(numZebrasAfterTrade);
	}
}
```

### Multiplication and Division
```java
public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total= subtotal + (subtotal * tax);
    System.out.println(total);
    double perPerson = total / 4;
    System.out.println(perPerson);
	}

}
```

### Module
```java
public class Modulo {
	public static void main(String[] args) {   
		int students = 26;
    int leftOut =students % 3;
    System.out.println(leftOut);
	}
}
```

### Assignment Operators
  * here for signle slash we get int division
```java
public class BakeSale {
	public static void main(String[] args) {   
		int numCookies = 17;

    numCookies -= 3;
    numCookies /=2;
    // Add your code above
    System.out.println(numCookies);
	}
}
```

### Compaision
```java
public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    System.out.println(creditsEarned > creditsToGraduate);
    double creditsAfterSeminar  = creditsEarned + creditsOfSeminar;
    System.out.println(creditsAfterSeminar > creditsToGraduate);
	}
}
```

#### Equials
```java

public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;

    boolean sameNumberOfSongs =(songsA == songsB);
    System.out.println(sameNumberOfSongs);
	}
}
```

```java
public class GreaterThanEqualTo {
  	public static void main(String[] args){
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
      boolean isChallengeComplete  = yourWaterIntake <= totalRecommendedAmount;
      System.out.println(isChallengeComplete);
    }       
}

```


```java
public class Song {
  	public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      System.out.println(line1.equals(line2));
      System.out.println(line2.equals(line3));
    }       
}

```

### Concatenation
```java
public class Zoo {
  	public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
      String  zooDescription = "Our zoo has " + animals +" "+ species + "s!";
      System.out.println(zooDescription);
    }       
}

```

### final your ts const
```java
public class Final {
	public static void main(String[] args) { 
      final double pi = 3.14;
      System.out.println(pi);
      // pi = 3.15;
	}
}
```

### Review
```java

public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double  amountForEachFriend = updatedBalance / 3;
      boolean   canPurchaseTicket = amountForEachFriend > 250;
      System.out.println(canPurchaseTicket);
       System.out.println("I gave each friend " + amountForEachFriend+"..." );
    }       
}

```

### Math Magic

```java
public class Magic {
	public static void main(String[] args) {

		int myNumber = 10;
        int stepOne = myNumber * myNumber  ;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
	}
}

```


## Intro to Classes


```java
public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}
```

### Constructor method 
* same name as class
```java
public class Store {
  
  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
    
  }
}
```

### Instace fields
  * the var declartion in the Store
```java
public class Store {
  // declare instance fields here!
  
  
  // constructor method
  public Store() {
    String productType;
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Store lemonadeStand = new Store();
    
    System.out.println(lemonadeStand);
  }
}
```

### Classes: Constructor Parameters
```java
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    String productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    
    
  }
}
```

### Print out instaces vars
```java
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
    
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand =new Store("lemonade");
    System.out.println(lemonadeStand.productType);
    
  }
}
```

# Methods


```java
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance(){
    //Check balance:  
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);  
  }


  public void deposit(int amountToDeposit){
    balance += amountToDeposit;
  }

  public int withdraw(int amountToWithdraw){
    balance -= amountToWithdraw;
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    savings.checkBalance();
    
   savings.withdraw(300);
    
    savings.checkBalance();
    
    savings.deposit(600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}

```

### Calculator
```java

// a simple program that emulates a calcuator. add, subtract, multiply, divide and modulo with integers only
public class  Calculator{

  public Calculator(){

  }
  public static void main(String[] args){
    Calculator myCalculator =new Calculator();
    myCalculator.add(5,7);
    myCalculator.subtract(45,11);

  }

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }
}
```

### Droid
```java
public class Droid{
  
  int batteryLevel;
  String name;

  public Droid(String droidName){
    name =droidName;
  }

  public void energyReport(){
    System.out.println(name + " has " + batteryLevel + " percent battery left.");
  }

  public void energyTransfer(Droid target,Droid source){
    if(target.batteryLevel < 100){
      target.batteryLevel += 10;
      source.batteryLevel -= 10;
    }
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }
  public String toString(){
    return "I am " + name + " and I have " + batteryLevel + " percent battery left.";
  }
  public static void main(String[] args){
    Droid droid = new Droid("Codey");
    droid.performTask("make money");
    droid.performTask("code");
    droid.performTask("learn Java");
  }
}
```

# Control Flow
*  The order of evaluation is: the NOT operator (!) -> the AND operator (&&) -> the OR operator (||)
```java
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
  
  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
      if(couponCode.equals("ship50")) {
        return 0.85;
      } else {
        return 1.75;
      }

    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express", "ship50");
    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
    
    book.ship();
    chemistrySet.ship();
  }
}
```


```java
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    // Write conditional here
    if(!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else{
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

```java
// class that processes car loan for new user

public class CarLoan {



	public static void main(String[] args) {

    int carLoan  = 10000;
    int loanLength = 3;
    int intrestRate = 5;
    int downPayment = 2000;

    if(loanLength < 0 || intrestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if(downPayment > carLoan) {
      System.out.println("The car can be paid in full.");
    } else{
      double monthlyPayment;
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest  = (monthlyBalance*intrestRate)/100;
      monthlyPayment = monthlyBalance + interest;
      System.out.println("Monthly Payment: " + monthlyPayment);
    }
	}
}
```


```java
// app that deals with continetns
public class Continents {
	public static void main(String[] args) {

		
    int continent = 4;
    switch (continent) {
      case 1:
        System.out.println("North America: Mexico City, Mexico");
        break;
      case 2:
        System.out.println("South America: Sao Paulo, Brazil");
        break;
      case 3:
        System.out.println("Europe: Moscow, Russia");
        break;
      case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;
      case 5:
        System.out.println("Asia: Shanghai, China");
      case 6:
        System.out.println("Australia: Sydney, Australia");
      case 7:
        System.out.println("Antarctica: McMurdo, New Zealand");
        break;
      default:
        System.out.println("Unknown continent");
        break;
      
    }
	}
}
```

# Arrays
* if you try to print an  array you get an object address location instead
* Once you declare this size, it cannot be changed! This array will always be of size 5.
* arrays are really coool they look like this
  * see the bracket type but the brace literal
```java
int[] numbers = {1,2,3,4,5};
```

# Arraylist
```java
import java.util.ArrayList;

public class Playlist {

  public Playlist(){

  }
  
  public void add(ArrayList<String> playlist,String[] songs){

    for(String x: songs){
      playlist.add(x);
    }
    
  }

  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist  = new ArrayList<String>();
    desertIslandPlaylist.add("Desert Island");
    desertIslandPlaylist.add("The Last Song");
    desertIslandPlaylist.add("The Song Remains the Same");
    desertIslandPlaylist.add("Come As You Are");
    desertIslandPlaylist.add("Funeral");
    desertIslandPlaylist.add("The End");

    System.out.println(desertIslandPlaylist.toString());
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(2);

    //swap songs
    int a=desertIslandPlaylist.indexOf("Funeral");
    int b = desertIslandPlaylist.indexOf("The Last Song");
    desertIslandPlaylist.set(a, "The Last Song");
    desertIslandPlaylist.set(b, "Funeral");


  }
  
}
```
# Loops
* theres break and continue
```java
import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
    for(int i =0; i < lunchBox.size(); i++) {
      String item = lunchBox.get(i);
      if(item =="ant"){
        lunchBox.remove(item);
        i--;
      }
      
      
    }
    return lunchBox;
   

  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}
```


```java
import java.util.ArrayList;

public class FizzBuzz {
	public static void main(String[] args) {


    int i = 1;
    String[] myArray = new String[100];
    for(String x :myArray) {
      String val;
      if(i%3 == 0 && i%5 == 0) {
        val = "FizzBuzz";
      } else if(i%3 == 0) {
        val = "Fizz";
      }else if(i%5 == 0) {
        val = "Buzz";
      } else{
        System.out.println(i);
        i++;
        continue;
      }
      System.out.println(val);
      i++;
    }


  }
}

/*
For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz.
*/
```

```java
import java.util.ArrayList;
// Import statement:

class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int n) {
    // edge cases
    if (n < 2) {
      return false;
    }
    else if (n == 2) {
      return true;
    }
    // 
    int size = (n-1) -2;
    int[] myArray = new int[size];
    int i = 2;
    boolean ans = true;
    for(int x: myArray) {
      if(n % i == 0 ){
        ans = false;
        break;
      }
      i++;
    }
    return ans;
  }
  

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for(int x: numbers) {
      if(isPrime(x)) {
        primes.add(x);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    ArrayList<Integer> primes = pd.onlyPrimes(numbers);
    System.out.println(primes);

  }  

}



```


# String methods 
```java
// program that works with DNA

public class DNA {

  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna ;      
    int startCodon = dna1.indexOf("ATG");
    int stopCodon = dna1.indexOf("TGA");
    if(startCodon == -1 && stopCodon == -1) {
      System.out.println("No protein");
    } else if((stopCodon - stopCodon) % 3 ==0 ){
      String protein  = dna1.substring(startCodon, startCodon+3);
    }
    dna.charAt(0);
  }
 
}
```

# ACCESS, ENCAPSULATION, AND SCOPE
*  we still might want some other classes to have access private methods, we just don’t want those classes to know the exact variable name. To give other classes access to a private instance variable, we would write an accessor method
  * get accessor method
  * set mutator method
```java
public class CheckingAccount{
  private String name;
  private int balance;
  private String id;

  public int getBalance(){
      return balance;
  }

  public void setBalance(int newBalance){
      balance = newBalance;
  }

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  //Write new methods here:
  
}

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
  }

} 
```

* this keyword,
use when instance var name is same as parameter

### Math methods
```java
import static java.lang.Math.*; // import Math class
 
class Numbers {
  public static void main(String[] args) {
    // Call method by using method name and arguments
    int smallerNumber = min(3, 10);
    System.out.println(smallerNumber); // Prints: 3
  }
}
```

# STATIC VARIABLES AND METHODS
* static represent the tracker unique to the class , all class instances have access to the static data types, 
which are one source of truth
```java
public class ATM{
  public static int numATMs= 3;
  public static void printNumATMS(){
    System.out.println(ATM.numATMs);
  }
  public static void main(){
    
  }

}

```
* static staff cannot interact with non static stuff

# Inheritance
* to extend 
```java
class Trex extends Dino{}
```
* use protected only when you want the children class to access methods
* use final keyword if you dont want prop or method modified
```java
final public boolean myMethod(){

}
```

## Polymorphism
* use override annotation in the child class
```java
  @Override
  public void cook() {
    System.out.println("Grinding or scraping dough.");
    System.out.println("Boiling.");
    
    this.texture = "cooked";
    
  }  
  
```
* make a child the parent
```java
    // Add your code here:
    Noodle biangBiang =  new BiangBiang(); 
    .. 
```

```java
public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    
    public Language(String myName,int myNumSpeakers,String myRegionsSpoken,String myWordOrder){
        name = myName;
        numSpeakers = myNumSpeakers;
        regionsSpoken = myRegionsSpoken;
        wordOrder = myWordOrder;
    }
    public static void main(String[] args) {
        Language java = new Language("Java", 2, "USA, China", "Left to right");
        java.getInfo();
        Mayan chotai = new Mayan();
        chotai.getInfo();
        SinoTibetan s1 =new SinoTibetan();
        SinoTibetan s2 =new SinoTibetan();
        s2.getInfo();
    }

    public void getInfo() {
        System.out.println(name+ " is spoken by "+numSpeakers+" people and is spoken in "+regionsSpoken+".");
        System.out.println("It is written in "+wordOrder+".");
    }
}

public class Mayan extends Language {
    public Mayan() {
        super( "Mayan", 1, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(name+ " is spoken by "+numSpeakers+" people and is spoken in "+regionsSpoken+".");
        System.out.println("It is written in "+wordOrder+".");
        System.out.println("It is a very ancient language.");
    }    

}

public class SinoTibetan extends Language {
    public  SinoTibetan() {
        super("Mandarin Chinese", 20, "China, India, Japan", "subject-verb-object");
        if(!this.name.contains("Chinese")){
            this.wordOrder = "subject-object-verb";
        }
        
    }
}
```

# Debugging
* sample 
```java
public class Debug {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    
    try{
        int ratio = length / width;
    } catch (ArithmeticException e) {
        System.err.println( e.getMessage());
    }   

        
  }
  
}
```

# using 2d arrays image processing projedct
```java
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import javax.imageio.ImageIO;

public class ImageProcessing {
	public static void main(String[] args) {

    // The provided images are apple.jpg, flower.jpg, and kitten.jpg
		int[][] imageData = imgToTwoD("./apple.jpg");
		
    // Or load your own image using a URL!
		//int[][] imageData = imgToTwoD("https://content.codecademy.com/projects/project_thumbnails/phaser/bug-dodger.png");

		//viewImageData(imageData);

		int[][] trimmed = trimBorders(imageData, 60);

		twoDToImage(trimmed, "./trimmed_apple.jpg");
		

		int[][] negative = negativeColor(imageData);

		twoDToImage(negative, "./negative_apple.jpg");
		

		int[][] stretchedHImg = stretchHorizontally(imageData);

		twoDToImage(stretchedHImg, "./stretched_apple.jpg");
		

		int[][] shrankVImg = shrinkVertically(imageData);

		twoDToImage(shrankVImg, "./shrank_apple.jpg");
		

		int[][] invertedImg = invertImage(imageData);

		twoDToImage(invertedImg, "./inverted_apple.jpg");
		

		int[][] coloredImg = colorFilter(imageData, -75, 30, -30);

		twoDToImage(coloredImg, "./colored_apple.jpg");

		// int[][] allFilters = stretchHorizontally(shrinkVertically(colorFilter(negativeColor(trimBorders(invertImage(imageData), 50)), 200, 20, 40)));

		
		// Painting with pixels
		
		int[][] blankImg = new int[500][500];

		int[][] randomImg = paintRandomImage(blankImg);

		twoDToImage(randomImg, "./random_img.jpg");

		int[] rgba = { 255, 255, 0, 255 };

		int[][] rectangleImg = paintRectangle(randomImg, 200, 200, 100, 100, getColorIntValFromRGBA(rgba));

		twoDToImage(rectangleImg, "./rectangle.jpg");

		int[][] generatedRectangles = generateRectangles(randomImg, 1000);

		twoDToImage(generatedRectangles, "./generated_rect.jpg");
	}

	// Image Processing Methods

	public static int[][] trimBorders(int[][] imageTwoD, int pixelCount) {
		// Example Method
		if (imageTwoD.length > pixelCount * 2 && imageTwoD[0].length > pixelCount * 2) {
			int[][] trimmedImg = new int[imageTwoD.length - pixelCount * 2][imageTwoD[0].length - pixelCount * 2];
			for (int i = 0; i < trimmedImg.length; i++) {
				for (int j = 0; j < trimmedImg[i].length; j++) {
					trimmedImg[i][j] = imageTwoD[i + pixelCount][j + pixelCount];
				}
			}
			return trimmedImg;
		} else {
			System.out.println("Cannot trim that many pixels from the given image.");
			return imageTwoD;
		}
	}

	public static int[][] negativeColor(int[][] imageTwoD) {
		// TODO: Fill in the code for this method
		int[][] manipulatedImg = new int[imageTwoD.length][imageTwoD[0].length];
		for (int i = 0; i < imageTwoD.length; i++) {
			for (int j = 0; j < imageTwoD[i].length; j++) {
				int[] rgba = getRGBAFromPixel(imageTwoD[i][j]);
				rgba[0] = 255 - rgba[0];
				rgba[1] = 255 - rgba[1];
				rgba[2] = 255 - rgba[2];
				manipulatedImg[i][j] = getColorIntValFromRGBA(rgba);
			}
		}
		return manipulatedImg;
	}

	public static int[][] stretchHorizontally(int[][] imageTwoD) {
		// TODO: Fill in the code for this method
		int[][] manipulatedImg = new int[imageTwoD.length][imageTwoD[0].length * 2];
		int it = 0;
		for (int i = 0; i < imageTwoD.length; i++) {
			for (int j = 0; j < imageTwoD[i].length; j++) {
				it = j * 2;
				manipulatedImg[i][it] = imageTwoD[i][j];
				manipulatedImg[i][it + 1] = imageTwoD[i][j];
			}
		}
		return manipulatedImg;
	}

	public static int[][] shrinkVertically(int[][] imageTwoD) {
		// TODO: Fill in the code for this method
		int[][] manipulatedImg = new int[imageTwoD.length / 2][imageTwoD[0].length];
		int it = 0;
		for (int i = 0; i < imageTwoD[0].length; i++) {
			for (int j = 0; j < imageTwoD.length-1; j += 2) {
				manipulatedImg[j / 2][i] = imageTwoD[j][i];
			}
		}
		return manipulatedImg;
	}

	public static int[][] invertImage(int[][] imageTwoD) {
		// TODO: Fill in the code for this method
		int[][] invertedImg = new int[imageTwoD.length][imageTwoD[0].length];
		for (int i = 0; i < imageTwoD.length; i++) {
			for (int j = 0; j < imageTwoD[i].length; j++) {
				invertedImg[i][j] = imageTwoD[(imageTwoD.length - 1) - i][(imageTwoD[i].length - 1) - j];
			}
		}
		return invertedImg;
	}

	public static int[][] colorFilter(int[][] imageTwoD, int redChangeValue, int greenChangeValue,
			int blueChangeValue) {
		// TODO: Fill in the code for this method
		int[][] manipulatedImg = new int[imageTwoD.length][imageTwoD[0].length];
		for (int i = 0; i < imageTwoD.length; i++) {
			for (int j = 0; j < imageTwoD[i].length; j++) {
				int[] rgba = getRGBAFromPixel(imageTwoD[i][j]);

				int newRed = rgba[0] + redChangeValue;
				int newGreen = rgba[1] + greenChangeValue;
				int newBlue = rgba[2] + blueChangeValue;

				if (newRed > 255) {
					newRed = 255;
				} else if (newRed < 0) {
					newRed = 0;
				}

				if (newGreen > 255) {
					newGreen = 255;
				} else if (newGreen < 0) {
					newGreen = 0;
				}

				if (newBlue > 255) {
					newBlue = 255;
				} else if (newBlue < 0) {
					newBlue = 0;
				}

				rgba[0] = newRed;
				rgba[1] = newGreen;
				rgba[2] = newBlue;

				manipulatedImg[i][j] = getColorIntValFromRGBA(rgba);
			}
		}
		return manipulatedImg;
	}

	
	// Painting Methods

	public static int[][] paintRandomImage(int[][] canvas) {
		// TODO: Fill in the code for this method
		Random rand = new Random();
		for (int i = 0; i < canvas.length; i++) {
			for (int j = 0; j < canvas[i].length; j++) {
				int[] rgba = { rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255 };
				canvas[i][j] = getColorIntValFromRGBA(rgba);
			}
		}
		return canvas;
	}

	public static int[][] paintRectangle(int[][] canvas, int width, int height, int rowPosition, int colPosition,
			int color) {
		// TODO: Fill in the code for this method
		for (int i = 0; i < canvas.length; i++) {
			for (int j = 0; j < canvas[i].length; j++) {
				if (i >= rowPosition && i <= rowPosition + width) {
					if (j >= colPosition && j <= colPosition + height) {
						canvas[i][j] = color;
					}
				}
			}
		}
		return canvas;
	}

	public static int[][] generateRectangles(int[][] canvas, int numRectangles) {
		// TODO: Fill in the code for this method
		Random rand = new Random();
		for (int i = 0; i < numRectangles; i++) {
			int randomWidth = rand.nextInt(canvas[0].length);
			int randomHeight = rand.nextInt(canvas.length);
			int randomRowPos = rand.nextInt(canvas.length - randomHeight);
			int randomColPos = rand.nextInt(canvas[0].length - randomWidth);
			int[] rgba = { rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), 255 };
			int randomColor = getColorIntValFromRGBA(rgba);
			canvas = paintRectangle(canvas, randomWidth, randomHeight, randomRowPos, randomColPos, randomColor);
		}
		return canvas;
	}
	

	// Utility Methods

	public static int[][] imgToTwoD(String inputFileOrLink) {
		try {
			BufferedImage image = null;
			if (inputFileOrLink.substring(0, 4).toLowerCase().equals("http")) {
				URL imageUrl = new URL(inputFileOrLink);
				image = ImageIO.read(imageUrl);
				if (image == null) {
					System.out.println("Failed to get image from provided URL.");
				}
			} else {
				image = ImageIO.read(new File(inputFileOrLink));
			}

			int imgRows = image.getHeight();
			int imgCols = image.getWidth();
			int[][] pixelData = new int[imgRows][imgCols];

			for (int i = 0; i < imgRows; i++) {
				for (int j = 0; j < imgCols; j++) {
					pixelData[i][j] = image.getRGB(j, i);
				}
			}

			return pixelData;
		} catch (Exception e) {
			System.out.println("Failed to load image: " + e.getLocalizedMessage());
			return null;
		}
	}

	public static void twoDToImage(int[][] imgData, String fileName) {
		try {
			int imgRows = imgData.length;
			int imgCols = imgData[0].length;
			BufferedImage result = new BufferedImage(imgCols, imgRows, BufferedImage.TYPE_INT_RGB);

			for (int i = 0; i < imgRows; i++) {
				for (int j = 0; j < imgCols; j++) {
					result.setRGB(j, i, imgData[i][j]);
				}
			}

			File output = new File(fileName);
			ImageIO.write(result, "jpg", output);
		} catch (Exception e) {
			System.out.println("Failed to save image: " + e.getLocalizedMessage());
		}
	}

	public static int[] getRGBAFromPixel(int pixelColorValue) {
		Color pixelColor = new Color(pixelColorValue);
		return new int[] { pixelColor.getRed(), pixelColor.getGreen(), pixelColor.getBlue(), pixelColor.getAlpha() };
	}

	public static int getColorIntValFromRGBA(int[] colorData) {
		if (colorData.length == 4) {
			Color color = new Color(colorData[0], colorData[1], colorData[2], colorData[3]);
			return color.getRGB();
		} else {
			System.out.println("Incorrect number of elements in RGBA array.");
			return -1;
		}
	}

	public static void viewImageData(int[][] imageTwoD) {
		if (imageTwoD.length > 3 && imageTwoD[0].length > 3) {
			int[][] rawPixels = new int[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					rawPixels[i][j] = imageTwoD[i][j];
				}
			}
			System.out.println("Raw pixel data from the top left corner.");
			System.out.print(Arrays.deepToString(rawPixels).replace("],", "],\n") + "\n");

			int[][][] rgbPixels = new int[3][3][4];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					rgbPixels[i][j] = getRGBAFromPixel(imageTwoD[i][j]);
				}
			}
			System.out.println();
			System.out.println("Extracted RGBA pixel data from top the left corner.");

			for (int[][] row : rgbPixels) {
				System.out.print(Arrays.deepToString(row) + System.lineSeparator());
			}
		} else {
			System.out.println("The image is not large enough to extract 9 pixels from the top left corner");
		}
	}
}
```