object Sub extends App{
     var r1= new Rational(1,2)
     var r2= new Rational(1,4)
     var r3= new Rational(1,8)
     println(r1-r2-r3)
     
}
class Rational(n:Int,d:Int){
        require(d>0,"y must greater than 0")   //check denominator is greater than 0
        def numer=n/gcd(Math.abs(n),d)          
        def denom=d/gcd(Math.abs(d),d)
        def this(n:Int)=this(n,1)               //constructor

        private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b) //gcd function
        def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom) //opertor overload
        def neg=new Rational(-this.numer,this.denom); //negative function
        def -(r:Rational)=this+r.neg

        override def toString=numer+"/"+denom   //overide print function
}