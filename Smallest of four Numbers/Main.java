import java.util.*; 
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      	int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a<b&&a<c&&a<d)
            System.out.print(a);
        else if(b<c&&b<d)
            System.out.print(b);
        else if(c<d)
            System.out.print(c);
        else 
            System.out.print(d);
	}
}