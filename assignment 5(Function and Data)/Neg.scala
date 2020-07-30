object Neg extends App{
     var r1= new Rational(4,8)
     println(r1.neg)
}

class Rational(n:Int,d:Int){
        require(d>0,"y must greater than 0" )    //check denominator is greater than 0
        def numer=n/gcd(Math.abs(n),d)
        def denom=d/gcd(Math.abs(n),d)
        def this(n:Int)=this(n,1)                //constructor

        private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b)

        def neg=new Rational(-this.numer,this.denom);     //negative function

        override def toString=numer+"/"+denom
}