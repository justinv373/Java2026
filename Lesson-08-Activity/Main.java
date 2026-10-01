class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String message){
    	System.out.println(message);
}

	double FtoC(double fahrenheit){
		double result = (fahrenheit-32)*(5.0/9.0);
		return result;
}

	double sphereVolume(double radius){
    	double result = (4.0 / 3.0) * 3.14159 * (Math.pow(radius,3));
    	return result;
}

	double coneVolume(double radiuscone, double height){
    	double result = (1.0 / 3.0) * 3.14159 * (Math.pow(radiuscone,2)) * height;
    	return result;
}

	double distance(double x1, double y1, double x2, double y2){
    	double result = Math.sqrt(Math.pow(x2-x1,2.0)+Math.pow(y2-y1,2.0));
    	return result;
}


void init(){

	String message = "Hello World! The print function works.";
		System.out.println(message);

	System.out.println("Enter the temperature: ");
		double t = Input.readDouble();

	double tem = FtoC(t);
		System.out.println("Temperature in celsius is " + tem);

	System.out.println("Enter the radius of the sphere: ");
    	double r = Input.readDouble();

    double volume = sphereVolume(r);
    	System.out.println("The volume of the sphere is " + volume);

	System.out.println("Enter the radius of the cone: ");
    	double r1 = Input.readDouble();

    System.out.println("Enter the height of the cone: ");
    	double h = Input.readDouble();

    double volume1 = coneVolume(r1, h);
    	System.out.println("The volume of the cone is " + volume1);

	System.out.println("Enter x1: ");
    	double x1 = Input.readDouble();
    
    System.out.println("Enter y1: ");
    	double y1 = Input.readDouble();
    
    System.out.println("Enter x2: ");
    	double x2 = Input.readDouble();
    
    System.out.println("Enter y2: ");
    	double y2 = Input.readDouble();

    double d = distance(x1, y1, x2, y2);
    	System.out.println("The distance between the points is " + d);
}

}

