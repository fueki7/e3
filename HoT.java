import java.util.Scanner;

class HoT{
    public static void main(String[] args){
	System.out.println("Who are you?");
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	System.out.println("Hello, "+str+"!");

	int head=0;
        int tail=0;
        System.out.println("Tossing a coin...");
        for(int i=1; i<=3; i++){
            int d=(int)(Math.random()*2);
            if(d==1){
                head++;
                System.out.println("Round "+i+": "+"Heads");
            }
            else if(d==0){
                tail++;
                System.out.println("Round "+i+": "+"Tails");
            }
        }
        System.out.println("Heads: "+head+", Tails: "+tail);
	if(head>tail){
	    System.out.println(str+" won!");
	}
	else{
	    System.out.println(str+" lost");
	}
    }
}
