object assignment3_6{
	
	def main(args:Array[String]){
		var i = 0;
		
		println(" ");
		println("................Print first n fibonacci numbers for given n................");
		println(" ");
		println(" ");
		
		print("Enter the number :");
		var z=scala.io.StdIn.readInt();
		
		while(i<z){
			print(fibo(i)+" ");
			i=i+1;		
		}
		
	}
	def fibo(y:Int):Int={
		if((y==1)||(y==0)){
			return(y);
		}
		else{
			return (fibo(y-1)+fibo(y-2));
		}
			

		
	}


}