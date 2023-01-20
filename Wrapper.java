public class Wrapper {

	public static void main(String[] args) {
		Integer integer=new Integer(100);
		//int num=100
		//latest 
		Integer integer1=Integer.valueOf(100);//boxing
			byte byte1=integer1.byteValue();//deboxing
		System.out.println(byte1);	
		
		Integer integer2=200;//autoboxing
		int num2=integer2;//auto-de-boxing
		
		Integer intFirst=Integer.valueOf(200);
		Integer intSecond=Integer.valueOf(500);
		
		System.out.println(intFirst+intSecond);
		
		double dvalue=integer2.doubleValue();
			Integer strInteger=Integer.getInteger("anand");
			System.out.println(strInteger);
			
			boolean b=Boolean.parseBoolean("HELLO");
			System.out.println(b);
			
			//parseXXX(String)
			//parseInt("100")//100
			//parseDouble("234");//234.00
			//parseFloat()
			//
			 
		//converts the primitive type 100 to object type--boxing
			/*Integer integer1=Integer.valueOf(100);
			System.out.println(integer1);
			Integer integer1=500;//autoboxing 
			
			int num2=integer1;//auto-de-boxing -object to primitive
			int num3 =integer1.intValue();*/
			
			System.out.println(Integer.MAX_VALUE +" "+Integer.MIN_VALUE );
			System.out.println(Integer.BYTES);
			
			//int value to byte value
			byte bvalue=integer1.byteValue();
			System.out.println("bvalue"+bvalue);
					
			//int to double
			//double dvalue=integer1.doubleValue();
			
			//"1234" to int
			
			int strtoint=Integer.parseInt("1234");
			
			//string to boolean type
			
			boolean boolvalue=Boolean.parseBoolean("true");
			
			//primitive to object
			//object to primitive
			//convertion of different datatypes
			
			//valueOf()--primitive to object
			//parseDouble()--String object --double primitive
			
			long lvalue=987652;
			Long lobject=Long.valueOf(lvalue);
			long llvalue=lobject.longValue();
			
			
			short svalue=23;
			
			Short sobject=Short.valueOf(svalue);//p to o
			short ssvalue=sobject.shortValue();//o to p
			
			//short to int value
			int snvalue=sobject.intValue();
			
			int value=Integer.max(456, 78);
			
			System.out.println(value);
			
		//System.out.println(Integer.parseInt("Edubridge"));//"97398"
			
			
			double d=Double.parseDouble("67.89");
			System.out.println(d);
	}

}

