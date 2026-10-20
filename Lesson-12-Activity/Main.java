class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

String creditCardType(String cardnum){
  if(cardnum.substring(0,1).equals("4"))
    return "Visa";
  else if(cardnum.substring(0,2).equals("34") || cardnum.substring(0,2).equals("37"))
    return "American Express";
  else if(cardnum.substring(0,1).equals("36"))
    return "Diner Club";
  else if(cardnum.substring(0,2).equals("51") || cardnum.substring(0,2).equals("55"))
    return "Mastercard";
  else if(cardnum.substring(0,4).equals("6011") || cardnum.substring(0,2).equals("65"))
    return "Discovery";
  else
    return "Unknown Card Type";
}

String pigLatin(String word){
  String firstletter = word.substring(0,1);
  String afterfirst = word.substring(1);
  String result = afterfirst + firstletter + "ay";
  return result;
}

String nycLocate(String zipCode) {
  String prefix = zipCode.substring(0, 3);

  if(prefix.equals("100") || prefix.equals("101") || prefix.equals("102"))
    return "Manhattan";
  else if(prefix.equals("103"))
    return "Staten Island";
  else if(prefix.equals("104"))
    return "Bronx";
  else if(prefix.equals("112"))
    return "Brooklyn";
  else if(prefix.equals("111") || prefix.equals("113") || prefix.equals("114")) 
    return "Queens";
  else 
    return "Unknown Borough";
}

String getMonth(String date){
  String monthNum = date.substring(0, 2);

  if(monthNum.equals("01"))
    return "January";
  else if(monthNum.equals("02"))
    return "February";
  else if(monthNum.equals("03"))
    return "March";
  else if(monthNum.equals("04"))
    return "April";
  else if(monthNum.equals("05"))
    return "May";
  else if(monthNum.equals("06"))
    return "June";
  else if(monthNum.equals("07"))
    return "July";
  else if(monthNum.equals("08"))
    return "August";
  else if(monthNum.equals("09"))
    return "September";
  else if(monthNum.equals("10"))
    return "October";
  else if(monthNum.equals("11"))
    return "November";
  else if(monthNum.equals("12"))
    return "December";
  else 
    return "Invalid Month";
}

boolean validatePswd(String password){
  if(password.length() < 5 || password.length() > 8)
    return false;
  else if(password.contains("^"))
    return false;
  else if(password.contains("*"))
    return false;
  else if(password.contains("("))
    return false;
  else if(password.contains(")"))
    return false;
  else
    return true;
  }
}
  
  
}

/*
Challenge 1:
Write a function creditCardType that accepts the a credit card number (as a string) and returns back the type of credit card that is determined by the starting numbers:
Starts with:
4 - Visa
34 or 37 - America Express
36 - Diner Club
51 or 55 - Mastercard
6011 or 65 - Discovery

Challenge 2:
Write a function pigLatin which accepts a word and return a new word made up by switch the fist letter to the end of the word and adding a "ay" after. Example: "pig"==> "igpay" Challenge 2:

Challenge 3:

Write a function nycLocate that accepts a zip code (as a string) and returns where in NYC the zip code is by examing the first three numbers of the zip code:

Manhattan starting with :100,101, 102
Staten Island  : 103
Bronx : 104
Brooklyn : 112
Queens : 113, 114, 111



Challenge 4:
Create a function getMonth that accepts a date in the form MM/DD/YYYY and returns the month: Example 07/21/2023 ==> "July"

Challenge 5:

Create a function validatePswd that accepts a password. The password must have 5 to 8 characters that are letters, numbers or any symbol except ^, *, (, ) 

Return true if it's valid, otherwise return false.
*/