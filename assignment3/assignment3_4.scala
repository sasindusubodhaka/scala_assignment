object assignment3_4{
	
	def main(args:Array[String]){
		
				println(" ");
				println("................Check the given number is a Even or Odd................");
				println(" ");
				println(" ");
				print("Enter a number: ");
				var c=scala.io.StdIn.readInt();
			
				var x= check(c);
				if(x==0)
					println("Even number");
				else
					println("Odd number");
		
			
		
		
		
	}
	def check(c:Int):Int={
			
			if(c==0){
				return 0;
			}
			else if(c==1){
				return 1;
			}
			else{
				return check(c-2);
			}
		
	}


}