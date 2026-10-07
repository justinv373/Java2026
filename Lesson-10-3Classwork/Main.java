class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println("How many Tickets would you like to buy?: ");
    	double tick = Input.readDouble(); 

    String t = groupSavings(tick);
    	System.out.println(t);

    System.out.println("How much did you spend?: ");
    	double spend = Input.readDouble();

    System.out.println("How many can of beans did you buy?: ");
    	double can = Input.readDouble(); 

    String s = groupDiscount(spend,can);
    	System.out.println(s);
        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */

   String groupSavings(double tickets){
    double tprice1 = tickets * 11;
    double tprice2 = tickets * 10.50;
    double tprice3 = tickets * 8.50;
    if(tickets >= 1 && tickets <= 8)
      return "Your total is $" + tprice1;
    else if(tickets >= 9 && tickets <= 16)
      return "Your total is $" + tprice2;
    else
      return "Your total is $" + tprice3; 
   }


  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */

   String groupDiscount(double spent, double cans){
    if(spent >= 100 && spent <= 200 && (cans >= 3))
      return "$10 Saved";
    else if(spent >= 200 && cans >= 4)
      return "$25 Saved";
    else
      return "$0 Saved"; 
   }



}