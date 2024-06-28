class HoT{
    public static void main(String[] args){
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
	    System.out.println("You won");
	}
	else{
	    System.out.println("You lost");
	}
    }
}
