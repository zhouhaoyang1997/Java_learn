package Test;

public class _Point {
	double x;
	private double y;
	private double z;
	
	_Point(double _x, double _y,double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	double point_S(){
		return Math.sqrt(Math.pow(x, 2.0)+Math.pow(y, 2.0)+Math.pow(z, 2.0));
	}
	public static void main (String[] args){
		_Point A = new _Point(1,1,1);
		System.out.println(A.point_S());
	}
}
