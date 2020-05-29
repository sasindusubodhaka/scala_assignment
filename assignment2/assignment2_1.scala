object assignment2_1{
	def main(args:Array[String]){
		
		var nh = 40;
		
		var oh = 20;
		
		var c = income(nh,oh);//calculate the income;
		//println(c);
		var t =  tax(c);//calculate the tax;
		//println(t);
		var ths= take_home_salary(c,t);
		println("Take home salary is : "+ths);
		
		
	}
	def income(nh:Int , oh:Int): Double={
		return wage(nh)+ot(oh);
	}
	def wage(nh:Int):Double={
		return nh*150.00;
	}
	def ot(oh:Int): Double={
		return oh*75.00;
	}
	def tax(c: Double): Double={
	
		return c*0.1;
	}
	def take_home_salary(c: Double, t: Double):Double={
	
		return c-t;
		
	}
}