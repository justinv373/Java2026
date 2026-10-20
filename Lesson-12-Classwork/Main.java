class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
boolean collegeCredit(String course){
  if(course.length() >= 6 && (course.substring(5,6).equals("M") || course.substring(5,6).equals("E"))){
    return true;
  }else{
    return false;
  }
}

String getCounsoler(String officialClass){
  int mid = officialClass.length() / 2;
  String first = officialClass.substring(0, 1);
  String middle = officialClass.substring(mid, mid + 1);
  
  if(first.equals("B") || middle.equals("B")){
    return "Berrouet";
  else if(first.equals("C") || middle.equals("C"))
    return "Chu";
  else if(first.equals("D") || middle.equals("D"))
    return "Dinn";
  else if(first.equals("E") || middle.equals("E"))
    return "Eyzengart";
  else if(first.equals("F") || middle.equals("F"))
    return "Flores";
  else if(first.equals("G") || middle.equals("G"))
    return "Gibson";
  else if(first.equals("L") || middle.equals("L"))
    return "Shim Lee";
  else if(first.equals("M") || middle.equals("M"))
    return "Meltzer";
  else if(first.equals("P") || middle.equals("P"))
    return "Paccione";
  else if(first.equals("S") || middle.equals("S"))
    return "Fiore";
  else if(first.equals("T") || middle.equals("T"))
    return "Tsai";
  else if(first.equals("Z") || middle.equals("Z"))
    return "Zayes";
  else 
    return "Unknown Counselor";
                      
  }
}

String imageType(String fileName) {
  int period = fileName.indexOf(".");
  String ext = fileName.substring(period + 1);

  if (ext.equals("JPEG") || ext.equals("JPG"))
    return "Joint Photographic Experts Group";
  else if (ext.equals("PNG"))
    return "Portable Network Graphics";
  else if (ext.equals("GIF"))
    return "Graphics Interchange Format";
  else if (ext.equals("PDF"))
    return "Portable Document Format";
  else
    return "Unknown Type";
}

 
}

/*Problem 1
Write a function collegeCredit that accepts a course code and if a course is college credit return true otherwise return false. If the sixth letter of the course code is "E" or "M" then is a college credit course.




Problem 2:
Write a function getCounsoler that accepts a students official class and returns their guidance consulor based on the either the first or middle character of official class being:

B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
L-Shim Lee
M-Meltzer
P-Paccione
S-Fiore
T-Tsai
Z-Zayes


Problem 3:
Write a function imageType that accepts a image file name and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portalble Document Format*/