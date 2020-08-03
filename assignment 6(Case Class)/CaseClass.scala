object CaseClass extends App{
    var p1= Point(3,0) //point p1
    var p2= Point(0,4) //point p2

    println("p1="+p1)
    println("p2="+p2)  
    println(" ")
    println("Sum of p1 and p2 : "+p1.add(p2)) 
    println("Moved p1 by 2,4 distance : "+p1.move(2,4)) 
    println("Swithed x and y coordinates of p1 : "+p1.invert())  
    println("Distance between p1 and p2 : "+p1.distance(p2)) 

}
 case class Point(x:Int,y:Int){

    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)  //move method
    def add(p:Point)=Point(this.x+p.x,this.y+p.y)         //add method
    def invert():Point={                                //invert method
        var inx=x
        var iny=y
        var temp=inx

        inx=iny
        iny=temp
        var p= Point(inx,iny) 
        p
    }
    def distance(p:Point):Double={                      //distance method
        var x1=math.pow(math.pow((this.x-p.x),2)+math.pow((this.y-p.y),2),0.5)

        x1
     }
    
    

    override def toString="("+x+","+y+")"
}