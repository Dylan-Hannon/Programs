import java.io.*;
import java.util.Scanner;

 class Person{
 	private String pc; //declaring pc variable 
 	private String processor;//declaring processor variable 
 	private int ram;//declaring ram variable 
 	private int harddrive;//declaring harddrive variable 
 	private int price;//declaring price variable 

 	//Constructors
 	public Person(String c,String pr, int r, int hd, int p){
 		pc = c;
 		ram = r;
 		processor = pr;
 		harddrive = hd;
 		price = p;
 	}
 	//Getter Methods
 	public void setPc(String pc1){
 		pc = pc1;
 	}
 	public void setProc(String processor1){
 		processor = processor1;
 	}
 	public void setRam(int ram1){
 		ram = ram1;
 	}
 	public void setHardrive(int hd1){
 		harddrive = hd1;
 	}
 	public void setPrice(int pr1){
 		price = pr1;
 	}
 	//End of Getter Methods

 	//Setter Methods
 	public String getPc(){
 		return pc;
 	}
 	public String getProc(){
 		return processor;
 	}
 	public int getRam(){
 		return ram;
 	}
 	public int getHardrive(){
 		return harddrive;
 	}
 	public int getPrice(){
 		return price;
 	}
 	//End of Setter Methods

 	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Person p1 = new Person(pc,processor,ram,harddrive,price);//default values

		System.out.println("Enter PC Name");
		pc = in.nextLine();
		p1.setPc(in); 
		/*
		p1.setProc("");
		p1.setRam(0);
		p1.setHardrive(0);
		p1.setPrice(0);
		*/
		p1.display();

	}
	public void display(){
		System.out.println("Type of PC: "+ pc);
		System.out.println("Size of RAM: "+ ram);
		System.out.println("Type of Processor "+ processor);
		System.out.println("Size of Hard Drive: "+ harddrive);
		System.out.println("Total price: "+ price);

	}

 }