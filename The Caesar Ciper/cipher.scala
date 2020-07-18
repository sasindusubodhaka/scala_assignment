import scala.collection.mutable.ListBuffer
object cipher{
    var s:String="cipher"; 
    var x:Int=0;
	def main(args:Array[String]){

	println("..............Caesar Cipher Method..............")
	print("Enter the string: ");
	s=scala.io.StdIn.readLine();
	print("Enter the key:");
	x=scala.io.StdIn.readInt();
	if(x>26) x=x%26			//check shifting number is greater than 26
	ciper(encript,decript)		//passing the encript function to ciper function		

	}
    def ciper(e:(String,Int)=>ListBuffer[Char],d:(String,Int)=>ListBuffer[Char])={			
            var list=e(s,x)			//pass the inputed text and the key to encript function
            print("Encripted String : ")
	    list.foreach(j=>print(j));
	    println(" ");
            var n=list.mkString
	    var declist=d(n,x);
	    print("Decripted String : ")
	    declist.foreach(k=>print(k))
    }
	def encript(s:String,x:Int):ListBuffer[Char]={
		var i=0;
		var l= new ListBuffer[Char]() 	//create a list to store encripted characters
		while(i<s.size){
			var n=s.charAt(i);	//select characters one by one in the string
			var j=n+x;		//shifting the ASCII value of the character(encription)
			var c=0;
			if(n.isUpper){		//check the character is uppercase or not
				if(j>90) c=j-90+64 else c=j;	//check the limit of the shifted value
					
			}
			else{
				if(j>122) c=j-122+96 else c=j;   
										
			}
			l+=c.toChar			//store the encripted character in the list
			i=i+1;
		}
		l					//return the list
	}
	def decript(s:String,x:Int):ListBuffer[Char]={
		var i=0;
		var l= new ListBuffer[Char]()  //create a list to store decripted characters
		while(i<s.size){
			var n=s.charAt(i);			//select characters one by one in the string
			var j=n-x				//shifting the ASCII value of the character(decription)                        
			var c=0;
			if(n.isUpper){				//check the character is uppercase or not
				if(j<65) c=90-(64-j) else c=j;  //check the limit of the shifted value
			}
			else{
				if(j<97) c=122-(96-j) else c=j;				
			}
			l+=c.toChar				//store the decripted character in the list
			i=i+1;
		}
		l	      					//return the list					
	}
}