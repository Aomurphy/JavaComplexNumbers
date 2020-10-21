public class ComplexNum {
	private double real; // real part
	private double imag; //imaginary part
	private double tCoord;//theta
	private double rCoord;//r
	
	
	//default constructor.
	//set real = imag = 0;
	ComplexNum()
	{
		real = imag = tCoord = rCoord = 0;
	}
	
	//specific constructor
	//use this. keyword to set private variables
	ComplexNum(double real, double imag)
	{
		this.real = real; 
        this.imag = imag; 
        double inside = this.getReal()*this.getReal() + this.getImag()*this.getImag();
		rCoord = Math.sqrt(inside);
		tCoord = Math.atan(this.imag/this.real);
	}
	
	public double getReal() {
		return real; 
	}
	
	public double getImag() {
		return imag; 
	}
	
	public double getRCoord() {
		return rCoord;
	}
	
	//add a complex number to this
	//complex number. return a ComplexNum
	public ComplexNum plus(ComplexNum a)
	{	
		ComplexNum added = new ComplexNum(this.getReal() + a.getReal(), this.getImag() + a.getImag());
		return  added;
	}
	
	//subtract
	public ComplexNum minus(ComplexNum a)
	{
		ComplexNum Subtracted = new ComplexNum(this.getReal() - a.getReal(), this.getImag() - a.getImag());
		return  Subtracted;
	}
	
	public ComplexNum times (ComplexNum a)
	{
		ComplexNum multiplied = new ComplexNum(this.getReal() * a.getReal(), this.getImag() * a.getImag());
		return  multiplied;
	}
	
	// return the complex conjugate
	public ComplexNum conjugate()
	{
		this.imag = this.getImag() * -1;
		this.real = this.getReal() * -1;
		return this;
	}
	
	// return the rationalized version of this 
	// complex number.
	// 1/(a+bi) where a+bi is the current object
	public ComplexNum rationalize()
	{
		double a = this.getReal();
		double b = this.getImag();
		double NewReal= a/( (a*a) + (b*b));
		double NewImag= -b/( (a*a) + (b*b));
		ComplexNum Rat = new ComplexNum(NewReal,NewImag);
		return Rat;
	}
	
	public String polarize()	{
		double inside = this.getReal()*this.getReal() + this.getImag()*this.getImag();
		double r = Math.sqrt(inside);
		double theta = Math.atan(this.getImag()/this.getReal());
		String out = "" + r + "( cos(" + theta + ") + i sin(" + theta + ")";
		// return the polar form of this complex 
		// number. find the magnitude and angle 
		// in radians.
		// return a string in the form 
		// r(cos(theta) + i sin(theta))
		return out;
	}
	public String toString(){
		String out = " " + this.getReal() + " + " + this.getImag() + "i";
		// write code here to return a string
		// in the form a + bi
	//	System.out.println(this.getRCoord());
		return (out);
	}
	
	public Boolean equals(ComplexNum a)
	{
		double diff = this.getRCoord()-a.getRCoord();		
		if(Math.abs(diff)<.0001) {
			return true;
		}
		else
		return false;
	}
	
	
	public double compareTo(ComplexNum a){
	//public class ComplexNum implements Comparable ComplexNum(ComplexNum a){
		double diff = this.getRCoord()-a.getRCoord();		
		if(Math.abs(diff)<.0001) {
			return 0;
		}
		else if(this.getRCoord()>a.getRCoord()) {
			return 1;
	} 
		else
		return -1;
	}
	
	}
