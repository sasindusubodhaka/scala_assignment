object assignment3_5{
	var count=0;
	var b=0;
	def main(args:Array[String]){
				println(" ");
				println("................Get the addition of all even numbers less than given number................");
				println(" ");
				println(" ");
		
				print("Enter a number: ");
				var c=scala.io.StdIn.readInt();
				b=c;
				println(addeven(c));

	}
	def addeven(e:Int):Int={
			if(e==0){
				if(check(b)==0)
					return count-b;
				else
					return count;
			}
			if(check(e)==0){
				count+=e;
				
			}
			return addeven(e-1);
		
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