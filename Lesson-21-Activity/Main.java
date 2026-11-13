class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);

  void allowance(){
    int target = 500;
    int days = 1;

    while(Math.pow(2, days - 1) < target){
      days++;
    }
  
    print("It takes " + days + " days to reach or surpass $5.");
}

  void addTwoNumbers(){
    int num1 = randInt(1, 100);
    int num2 = randInt(1, 100);
    int sum = num1 + num2;

    print("What is the sum of " + num1 + " and " + num2 + "?");
    int guess = Input.readInt();

    while(guess != sum){
      print("Incorrect, try again:");
      guess = Input.readInt();
  }
    print("Correct!");
}

  int GCF(int a, int b){
    while(b != 0){
      int factor = b;
      b = a%b;
      a = factor;
    }
    return a;
  }

  }

}

/*
Challenge 1:
Suppose you are given a choice between getting 5 dollars verse getting a penny on day one that doubles every day.  How many days will it take for the a penny double every day take to get to or surpass $5?

Write a function allowance that solves how many days it takes.

Challenge 2:
Write a function addTwoNumbers that generates two random integers, then ask the user what is the sum of these two numbers.  Allow the user to keep try until they get it correct.

Challenge 3:
Write a function GCF that accepts two integers, calculates and returns the GCF (greatest common facter) of the two integers.


Challenge 4:
Write a menu function called menu that allows a user to choose one of the three functions written above. Also include a choice to exit out.
Example:
Welcome Looney Tune's System
Select from the following choices:
1 - Allowance
2 - Addition game
3 - Calculate the GCF of two integers
4 - Exit Looney Tune System


Bonus Challenge:
We want to create a rock paper scissors game.  The game is the user agains the computer.  You'll ask the user to choose 1 for rock, 2 for paper and 3 for scissor. So there will be three possible outcomes: draw, win, lose.

The rules are has follow:
If the player and the computer choose the same, it's a draw and play again.
Rock beats scissors
Rock loses against paper
Paper loses against scissors


rock paper scissor
*/