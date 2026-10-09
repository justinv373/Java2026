
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

void init(){
	System.out.println("What is your grade (1-100)?: ");
    	double grade = Input.readDouble(); 

    double g = gpa(grade);
    	System.out.println(g);

    System.out.println("What is your grade level (1-4)?: ");
    	int year = Input.readInt();

    System.out.println("How many credits do you have?: ");
    	double cred = Input.readDouble(); 

    boolean grad = isGraduating(year,cred);
    	System.out.println(grad);

	if(isGraduating(year, cred)) {
        System.out.println("Student is Graduating");
	} else{
        System.out.println("Student is NOT Graduating");
    }

    System.out.println("What is your weight in pounds?: ");
        double w = Input.readDouble(); 
    
    System.out.println("What is your height in inches?: ");
        double h = Input.readDouble();

    String b = BMI(w,h);
    	System.out.println(b);

    System.out.println("How much does your package weigh (lbs)?: ");
    	double pw = Input.readDouble(); 

    double sc = shippingCost(pw);
    	System.out.println(sc);

    System.out.println("What is the light frequency (THz)?: ");
    	double f = Input.readDouble(); 

    boolean fre = blueOrViolet(f);
    	System.out.println(fre);
   

  }

	double gpa(double GPA){
    if(GPA >= 90)
    	return GPA * 1.1;
    else
      	return GPA; 
   }  

	boolean isGraduating(int gradelvl, double credits){
	if((gradelvl == 4 && credits >= 44) || credits >= 44)
		return true;
	else 
		return false;
   }

    String BMI(double weight, double height){
        double bmi = (weight / (height * height)) * 703;
        if(bmi <= 18.4)
            return "Underweight";
        else if(bmi >= 18.5 && bmi <= 24.9)
            return "Normal";
        else if(bmi >= 25.0 && bmi <= 39.9) 
            return "Overweight";
        else 
            return "Obese";
    }

    double shippingCost(double packageweight){
        double extraWeight = packageweight - 25;
        if (packageweight <= 10) 
            return 0.00;
        else if(packageweight <= 15)
            return 5.00;
        else if(packageweight <= 25) 
            return 10.00;
        else
            return 10.00 + (extraWeight * 0.02);
    }

    boolean blueOrViolet(double frequency) {
        return (frequency >= 600 && frequency <= 670) || (frequency >= 700 && frequency <= 750);
    }
}

 
  

/*
Challenge 1:

Write a function "gpa" that takes in the GPA value and returns the calcuation : if it's over 90, return gpa*1.1, otherwise return the raw gpa.


Challenge 2:

Write a function "isGraduating" that accepts the grade level and number of credits earned that returns the boolean value TRUE if a student is a Senior and has 44 or more credits, otherwise return FALSE. 

In the init function:
Display to console "Student is Graduating" or "Student is NOT Graduating" depending on the value return by the function.
   
Challenge 3:
BMI
Write a function "BMI" that accepts a weight in pounds and 
height in inches. Calculate the BMI (google the formula) and 
return return the following:
    BMI 18.4 or less return Underweight
    BMI is 18.5 - 24.9	(inclusive) return Normal
    BMI is 25.0 - 39.9	(inclusive) return Overweight
    BMI is 40.0	or greater return  Obese  


Challenge 4:

Write a function "shippingCost" that accepts a weigth 
in units of pounds and returns:
      - 0.00, if 10 pounds or less,
      - 5.00, if more than 10 pounds but 15 pounds 
        or less,
      - 10.00, if more than 15 pounds but 25 pounds 
        or less,
      - 10.00 Plus 2 cents per pound over 25 pound, 
        if over 25 pounds.  


Challenge 5:

Write a function "blueOrViolet" that accepts a light frequency in THz units and returns true for either blue frequence (600-670 THz) or violet frquence (700-750 THz), otherwise return false
*/