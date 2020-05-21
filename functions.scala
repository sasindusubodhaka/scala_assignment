object functions{
	//function of converting celsius to fahrenheit
	def ctof(x:Double):Double={ 
		return x*1.8000 + 32.0000;
	}
	//function of calculating the volume of sphere
	def volume(y:Double):Double={
		var pi=22f/7;
		var r=y*y*y;
		return (4f/3)*pi*r;
		
	}
	//function of  calculating the cost of given books
	def cost(z:Double):Double={
		var discounted_cost=(1-0.4)*24.95*z;
		var shiping_cost=0.00;
		if(0<=z && z<=50){
			shiping_cost=3*z;
		}
		else{
			shiping_cost=(z-50)*0.75 + 50*3; 
		}
		
		return discounted_cost+shiping_cost;
		
	}
	def main(args:Array[String]){
			println("Farenhite of 35C is : " + ctof(35));
			println("Volume of sphere is : " + volume(5));
			println("Cost of 60 copies : " + cost(60));
	}


	
}