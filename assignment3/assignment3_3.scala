object assignment3_3{
	var value=0;
	def main(args:Array[String]){
		println(" ");
		println("................Addition of numbers from one to given number(n)................");
		println(" ");
		println(" ");
		print("Enter a positive integer: ");
		var c=scala.io.StdIn.readInt();
		
		if(c>=0)
			println("sum : "+sum(c));
		else
			println("invalid input");
		
	}
	def sum(c:Int):Int={
		if(c<1){
			return value;
		}
		value+=c;
		
		return sum(c-1);
	}


}
