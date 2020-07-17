import scala.collection.mutable.ListBuffer
object chiper{

	def main(args:Array[String]){

	println("..............Caesar Cipher Method..............")
			print("Enter the string: ");
			var s=scala.io.StdIn.readLine();
			print("Enter the the number:");
			var x=scala.io.StdIn.readInt();
			
			var list=encript(s,x);
			print("Encripted String is: ")
			list.foreach(j=>print(j))
			println("");
			var n=list.mkString
			var declist=decript(n,x);
			print("Decripted String is: ")
			declist.foreach(k=>print(k))

	}
	def encript(s:String,x:Int):ListBuffer[Char]={
		var i=0;
		var l= new ListBuffer[Char]()
		while(i<s.size){
			var n=s.charAt(i);
			var j=n+x;
			var c=0;
			if(n.isUpper){
					//print("n");
					if(j>90) {
						 c=j-90+64;
					}
					else{
						 c=j;
					}
					l+=c.toChar
				}
			else{
					//print("s");
					if(j>122) {
						 c=j-122+96;
					}
					else{
						 c=j;
					}
					l+=c.toChar
			}
			i=i+1;

		}
		l
		
	}
	def decript(s:String,x:Int):ListBuffer[Char]={
		var i=0;
		var l= new ListBuffer[Char]()
		while(i<s.size){
			var n=s.charAt(i);
			var j=n-x;
			var c=0;
			if(n.isUpper){
					//print("n");
					if(j<65) {
						var m=64-j
						 c=90-m;
					}
					else{
						 c=j;
					}
					l+=c.toChar
				}
			else{
					//print("s");
					if(j<97) {
						var m=96-j
						 c=122-m;
					}
					else{
						 c=j;
					}
					l+=c.toChar
			}
			i=i+1;

		}
		l
		

	}


}