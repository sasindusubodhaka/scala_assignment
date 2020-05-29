object assignment3_2{
	var count=0;
	var i=1;
	var x:Int=0;
	def main(args:Array[String]){
		println(" ");
		println("................Print all prime numbers less than the given number ................");
		println(" ");
		println(" ");
		print("Enter a postive number: ");
		var k= scala.io.StdIn.readInt();
		
		x=k;
		primenumbers(k);
		
	}
	def primenumbers(m:Int):Int={
		
		
		if(m<1){
			return 0;
		}
	
		
		if(prime(m,1)==true){
			
			if(m==x){
				
			}
			else{
				println(m);
			}
			
		}
		else{
			
		}
		

		
		return primenumbers(m-1);
	}
	def prime(n: Int,i:Int):Boolean={
		
		if(n<=1){
			return false;
		}
		var a=n%i;
		if(a==0){
			count=count+1;
			
		}
		if(i>n){
			if(count==2){
				count=0;
				return true;
			}
			else{
				count=0;
				return false;
				
			}
		}
		
		return prime(n,i+1);
	}

}