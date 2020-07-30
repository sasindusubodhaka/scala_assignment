object Bank extends App{
    var r1=new Account("1234",1,-1500.00)
    var r2=new Account("12345",2,1700.00)
    var r3=new Account("123456",3,-500.00)
    var r4=new Account("1234567",4,7500.00)
    var bank:List[Account]=List(r1,r2,r3,r4) //set an object array

    bank.foreach(i=>println(i))   //print current balances

    var bal_list:List[Double]=List();//define a balance list
    
    bal_list=bank.map(x=>x.balance) //map acount balance to a list 
    
    val fun_p=(x:Double)=>x>=0; //positive filtering  function
    val fun_n=(x:Double)=>x<0;  //negative  fltering function
   
    var sum:Account=r1+r2+r3+r4  //take the sum of balances
    println("Sum of account balances :"+sum.balance)
    
    
    val p_list=bal_list.filter(fun_p) //postitive balance list
    val n_list=bal_list.filter(fun_n) //negative balnce 
  
    for(x<-0 until p_list.size){
            for(y<-0 until bank.size){
                        if(p_list(x)==bank(y).balance)   bank(y).deposit(bank(y).balance*(0.05)) //interset
                        if(n_list(x)==bank(y).balance)   bank(y).withdraw(bank(y).balance*(-0.1)) //overdraft interest
                }
        }

    bank.foreach(j=>println(j)) //print new balances
    
}
class Account(id:String,n:Int,b:Double){
        
        val nic:String=id
        val accnumber:Int=n
        var balance:Double=b

        override def toString="["+nic+":"+accnumber+":"+balance+"]"

        def withdraw(a:Double)= this.balance=this.balance-a

        def deposit(a:Double)=this.balance=this.balance+a

        def +(r:Account)=new Account(nic,accnumber,this.balance+r.balance)

        def transfer(a:Account,b:Double)={
                this.deposit(b)
                a.withdraw(b)
        }
}
