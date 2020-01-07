import java.util.Scanner;

public class SijFinal{

	public static void main(String[] args){
		Turtle fred=new Turtle();
		fred.speed(0);
		fred.hide();
		fred.up();
		Scanner sc=new Scanner(System.in);
		System.out.println("You want this to be cool or nah (ye or nah)? ");
		String cool=sc.next();
		double[] old=new double[2];
		double[] New=new double[2];
		int count=0;
		double numberz = 0;
		if(cool.equalsIgnoreCase("ye")){
			System.out.print("Enter in a number less than 1: ");
			numberz = sc.nextDouble();
			for(double x=-5;x<5;x+=.01)
			{
				for(double y=-5;y<5;y+=.01)
				{
					old[0]=x;
					old[1]=y;
					for(int k=0;k<100;k++){
						New[0]= Math.exp(old[0])*Math.cos(old[1]);
						New[1]=Math.exp(old[0])*Math.sin(old[1]);
						old[0]=New[0];
						old[1]=New[1];
						if((Math.pow(old[0],2)+Math.pow(old[1],2))<numberz){
							fred.setPosition(-100*x,-100*y);
							fred.dot("black",1);
						}
					}
				}
			}
		}
		System.out.print("Choose function 1(e^z) or function 2(e^iz): ");
		int number=sc.nextInt();
		if(number==1 && cool.equalsIgnoreCase("nah")){
			for(double x=-5;x<5;x+=.01)
			{
				for(double y=-5;y<5;y+=.01)
				{
					count=0;
					old[0]=x;
					old[1]=y;
					for(int k=0;k<100;k++){
						New[0]= Math.exp(old[0])*Math.cos(old[1]);
						New[1]=Math.exp(old[0])*Math.sin(old[1]);
						old[0]=New[0];
						old[1]=New[1];
						if((Math.pow(old[0],2)+Math.pow(old[1],2))<40000000){
							count++;
						} else {
							break;
						}
					}
					fred.setPosition(-100*x,-100*y);
					count%=10;
					if(count==0) {
						fred.dot("pink",1);
					}else
					if (count<=1){
						fred.dot("cyan",1);
						}
						else if (count<=2){
						fred.dot("blue",1);
						}
						else if (count<=3){
						fred.dot("blue-green",1);
						}
						else if (count<=4){
						fred.dot("green",1);
						}
						else if (count<=5){
						fred.dot("yellow-green",1);
						}
						else if (count<=6){
						fred.dot("yellow",1);
						}
						else if (count<=7){
						fred.dot("orange",1);
						}
						else if (count<=8){
						fred.dot("red-orange",1);
						}
						else if (count<=9){
						fred.dot("red",1);
						}
						else if (count<=10){
						fred.dot("black",1);
						}
				}
			}
		}
		else if(number==2 && cool.equalsIgnoreCase("nah")){
			for(double x=-10;x<0;x+=.01)
			{
				for(double y=-10;y<0;y+=.01)
				{
					count = 0;
					old[0]=x;
					old[1]=y;
					for(int k=0;k<100;k++){
						New[0]= Math.exp(-old[1])*Math.cos(old[0]);
						New[1]=Math.exp(-old[1])*Math.sin(old[0]);
						old[0]=New[0];
						old[1]=New[1];
						if((Math.pow(old[0],2)+Math.pow(old[1],2))<400000000){
							count++;
						} else {
							break;
						}
					}
						fred.setPosition(-100*x-100,-100*y-100);
						count%=10;
						if (count==0){
							fred.dot("pink",1);
						}
						else if (count<=1){
						fred.dot("cyan",1);
						}
						else if (count<=2){
						fred.dot("blue",1);
						}
						else if (count<=3){
						fred.dot("blue-green",1);
						}
						else if (count<=4){
						fred.dot("green",1);
						}
						else if (count<=5){
						fred.dot("yellow-green",1);
						}
						else if (count<=6){
						fred.dot("yellow",1);
						}
						else if (count<=7){
						fred.dot("orange",1);
						}
						else if (count<=8){
						fred.dot("red-orange",1);
						}
						else if (count<=9){
						fred.dot("red",1);
						}
						else if (count<=10){
						fred.dot("black",1);
						}
				}
			}
		}
		
		else{
			System.out.println("Please enter 1 or 2 for the chosen function.");
		}
		System.out.println("FInishedklajfdlskfja");
	}
}




