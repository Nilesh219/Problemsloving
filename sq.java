import java.util.Scanner;


public class stack_queue
{
	public static void main(String args[]){
	
		System.out.format("Enter the Number for\n 1. Stack \n 2.queue");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
 
		switch(choice){

	
		case 1: 
				int element;
				Stack s = new Stack();
				System.out.print("Enter the Element in Stack: ");
				element = sc.nextInt();

				s.push(element);
				System.out.println(s.pop() + "You pop Element");
		}	
	}
}


class Stack{
	static final int MAX = 1000;
	int top;
	int array[] = new int[MAX];

	Stack(){
		top = -1;
	}

	boolean push(int x){
		
		if(top = MAX-1){
			System.out.println("Stack is Overflow ");
			return false;
		}
		else
		{
			array[++top] = x;
			System.out.println("ELement Pushed in Stack");
			return true;
		}
		
	}
	
	int pop(){
		if(top < 0){
			System.out.println("Stack is Underflow");
			return -1;
		}
		else
		{
			int x = array[--top];
			return x;
			
		}
	}

	
}
