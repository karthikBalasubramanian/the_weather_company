package codingtest;

public class CheckTriangle {
		
	
	public boolean checkLength(int sideA,int sideB,int sideC){
		return sideA<0 || sideB<0 || sideC<0;
	}
	
	public boolean checkTraingleProperty(int sideA, int sideB, int sideC){
		return sideA>sideB+sideC || sideB>sideA+sideC || sideC>sideA+sideB;
	}
	
	public boolean checkIsoceles(int sideA,int sideB,int sideC){
		return sideA==sideB || sideB==sideC || sideA==sideC;
	}
	
	public boolean checkEquilateral(int sideA,int sideB,int sideC){
		return sideA==sideB && sideB==sideC;
	}
	
	public String getTriangleType(int sideA, int sideB, int sideC){
		if (!checkLength(sideA,sideB,sideC) && !checkTraingleProperty(sideA,sideB,sideC)){
			if (checkEquilateral(sideA,sideB,sideC)){
				return "Its an Equilateral Triangle";
			}else if(checkIsoceles(sideA,sideB,sideC)){
				return "Its an Isoceles Triangle";
				
			}else{
				return "Its a Scalene Triangle";
			}
			
		}else{
			return "Sorry this is not a valid triangle.";
		}
		
	}
}


