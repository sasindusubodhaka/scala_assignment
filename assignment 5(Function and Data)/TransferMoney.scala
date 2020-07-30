object TransferMoney extends App{
    
    var r1=new Account("1234",1,1500.00)  //define objects
    var r2=new Account("12345",2,1500.00)

    r1.transfer(r2,500.00)              //transfer 500.00 from r1  account to r2 account
    
    println(r1)  //print details of r1 account
    println(r2)  //print details of r1 account

}
class Account(id:String,n:Int,b:Double){
        
        val nic:String=id
        val acnumber:Int=n
        var balance:Double=b

        override def toString="["+nic+":"+acnumber+":"+balance+"]"

        def withdraw(a:Double)= this.balance=this.balance-a

        def deposit(a:Double)=this.balance=this.balance+a

        def transfer(a:Account,b:Double)={              //transer method
                this.deposit(b)
                a.withdraw(b)
        }
}
