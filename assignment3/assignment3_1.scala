object assignment3_1{
	var count=0;
	var i=1;
	def main(args:Array[String]){
		println(" ");
		println("................Check the given number is a prime or not................");
		println(" ");
		println(" ");
		
		print("Enter a postive number: ");
		var n = scala.io.StdIn.readInt();

		var c=prime(n,1);
		if(c==true)
			println(n+" is a prime number(function returned true)");
		else
			println(n+" not a prime number(function returned false)");
		
		
	}
	def prime(n: Int,i:Int):Boolean={
		
		if(n<=1){
			println("not a prime number");
			return false;
		}
		var a=n%i;
		if(a==0){
			count=count+1;
		}
		if(i>n){
			//println(count);
			if(count==2){
				return true;
			}
			else{
				return false;
			}
		}
		
		return prime(n,i+1);
	}

}