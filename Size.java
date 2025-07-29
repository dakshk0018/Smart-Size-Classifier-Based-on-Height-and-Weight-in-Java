import java.util.Scanner;

class Size                                                 /* make a class according which your code will run*/
{
	int weight;                                            /* take height and weight as int and size as a string to execute*/
	int height;
	String size;
	
	Size(int weight, int height)                           /*alot the input to execute the code*/
	{
		this.weight=weight;
		this.height=height;
		findSize();
	}
	
	void findSize(){                                       /*write the logic of code on which whole program will run*/
	if (height<=160 && weight<=60){
		size= "Small";
		}else if (height <= 160 && weight <= 80) {
            size = "Medium";
        } else if (height <= 160 && weight >= 100) {
            size = "Large";
        } else if (height <= 170 && weight <= 70) {
            size = "Small";
        } else if (height <= 170 && weight <= 90) {
            size = "Medium";
        } else if (height <= 170 && weight >= 110) {
            size = "Large";
        } else if (height <= 180 && weight <= 80) {
            size = "Medium";
        } else if (height <= 180 && weight <= 100) {
            size = "Large";
        } else if (height <= 180 && weight >= 100) {
            size = "XLarge";
        } else {
            size = "Unknown";
        }
	}
	void show(){                                                    /* To print the output*/
	
	System.out.println("HEIGHT:"+height);
	System.out.println("WEIGHT:"+weight);
	System.out.println("SIZE:"+ size);
}

	public static void main(String[] args){
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter height: ");
		int height = scanner.nextInt();
		
		System.out.print("Enter Weight: ");
		int weight = scanner.nextInt();
		
		Size s= new Size(weight,height);
		s.show();
	}
}
	