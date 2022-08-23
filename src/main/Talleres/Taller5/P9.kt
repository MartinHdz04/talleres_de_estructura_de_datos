package Taller5

fun distancia(x:Double, y:Double)=Math.sqrt((x*x)+(y*y))

fun cuadrante(x:Double, y:Double):Int{
    if (x>0.0 && y>0.0){
        return 1
    }else if(x<0.0 && y>0.0){
        return(2)
    }else if(x<0.0 && y<0.0){
        return(3)
    }else if(x>0.0 && y<0.0){
        return(4)
    }
    return 0
}

