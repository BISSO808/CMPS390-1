package cmps390;

public class LoopEx {
public static void main(String[]args) {
System.out.println("sum using the for loop "+ExampleForLoop());	
System.out.println("sum using while loop "+ExampelWhileLoop());
SumOFNumbers();
}

public static int ExampelWhileLoop() {
	int i=0;
	int sum=0;
	while(i<=10) {
		sum+= i;
		i++;
	}
		return sum;
}

public static int ExampleForLoop(){
	int i;
	int sum=0;
	for(i=0;i<=10;i++) {
		sum+=i;
	}
	return sum;
	
}
public static void SumOFNumbers() {
LoopEx n=new LoopEx();
double p = n.ExampleForLoop();
double average=(p/10);
System.out.println("average "+average);

}
}
