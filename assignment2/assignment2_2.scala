object assignment2_2{
	def main(args:Array[String]){
		var a=10;
		var b=15;
		var c=20;
		
		
		var x = cost(a);
		println("cost of 10 : "+x);
		var pro_x = 10*attendees(a)-x;
		println("profit of 10 : "+pro_x);
		var y = cost(b);
		println("cost of 15 : "+y);
		var pro_y = 15*attendees(b)-y;
		println("profit of 15 : "+pro_y);
		var z = cost(c);
		println("cost of 20 : "+z);
		var pro_z = 20*attendees(c)-z;
		println("profit of 20 : "+pro_z);
		
		
		println(" ");
		println(" ");
		if(pro_x>pro_y){
			if(pro_x>pro_z){
				println("Highest profit is : "+pro_x );
				println(" So the best ticket prise is : 10.00");
			}
			else{
				println("Highest profit is : "+pro_y );
				println("So the best ticket prise is : 20.00");
			}
		}
		else{
			if(pro_y>pro_z){
				println("Highest profit is : "+pro_y );
				println("So the best ticket prise is : 15.00");
			}
			else{
				println("Highest profit is : "+pro_z );
				println("So the best ticket prise is : 20.00");
			}
		}
		
		
	}
	def cost(price:Int):Double={
		var no_spectators = attendees(price);
		var income =revenue(no_spectators,price);
		var total_cost=500 + 3*no_spectators;
		return total_cost;
	}
	def attendees(price : Int): Int={
		return 120+(15- price)/5*20;
	}
	def revenue(no_spectators:Int, price :Int): Double={
		return no_spectators*price;
	}



}