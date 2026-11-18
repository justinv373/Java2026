class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"George","Kris","Peter","Jabez","Camilo"};
    return friends;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }

  double[] Convert(double[] celsiusTemp){
    double[] fahrenheitTemp = new double[celsiusTemp.length];
    for(int x = 0; x <= celsiusTemp.length-1; x++){
      fahrenheitTemp[x] = celsiusToFarhenheit(celsiusTemp[x]);
    }
    return fahrenheitTemp;
  }

}

/*
Problem 1:

In the init function, create an array of friends.


Problem 2:

Write a function convert that accepts an array of temperatures in celsius and converts each temperature to farhenheit and returns a new array with the convert temperatures.

Use the CelsiusToFarhenheit function given to you.

NOTE: to test this function, create an array temperatues in celsius which you will pass to test your new function.
*/