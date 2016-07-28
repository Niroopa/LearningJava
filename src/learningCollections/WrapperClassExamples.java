package learningCollections;

public class WrapperClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Boxing:The process of wrapping up the primitive data types into an object is called Boxing
		
		 */
		byte b = 10;             //Primitive byte data
        Byte B = new Byte(b);   //Wrapping primitive byte data into Byte Object
 
        short s = 15;              //Primitive short data
        Short S = new Short(s);   //Wrapping of primitive short data into Short Object
 
        int i = 20;                   //Primitive int Data
        Integer I = new Integer(i);   //Wrapping of primitive int data into Integer Object
 
        long l = 25;            //Primitive long data
        Long L = new Long(l);   //Wrapping primitive long data into Long Object
 
        float f = 12;            //Primitive float data
        Float F = new Float(f);  //Wrapping primitive float data into Float Object
 
        double d = 18.58;           //Primitive double data
        Double D = new Double(d);   //Wrapping primitive double data into Double Object
 
        boolean bln = true;               //Primitive boolean data
        Boolean BLN = new Boolean(bln);   //Wrapping primitive boolean data into Boolean Object
 
        char c = 'C';                     //Primitive char data
        Character C = new Character(c);   //Wrapping primitive char data into Character Object
        System.out.println("Boxing Concept");
        System.out.println("*****************************");
        System.out.println("Byte:"+B+" "+"Float:"+F+"Double:"+D+"Char:"+C+"Boolean:"+BLN+"Short:"+S+"Integer:"+I+"Long:"+L);
 
	
	
	/*AutoBoxing: 
	 * From JDK 1.5 onwards, Auto-Boxing is introduced. 
	 * According to this feature, you need not to explicitly wrap the 
	 * primitive content into an object. Just assign primiive data to corresponding 
	 * wrapper class reference variable, 
	 * java automatically wraps primitive data into corresponding wrapper object.
	 * 
	 */
        
        byte b1 = 10;    //Primitive byte data
        Byte B1 = b1;    //Auto-Boxing of byte data
 
        short s1 = 15;     //Primitive short data
        Short S1 = s1;     //Auto-Boxing of short data
 
        int i1 = 20;       //Primitive int Data
        Integer I1= i1;    //Auto-Boxing of int data
 
        long l1 = 25;    //Primitive long data
        Long L1 = l1;     //Auto-Boxing of long data
 
        float f1 = 12;     //Primitive float data
        Float F1 = f1;     //Auto-Boxing of float data
 
        double d1 = 18.58;     //Primitive double data
        Double D1 = d1;        //Auto-Boxing of double data
 
        boolean bln1 = true;    //Primitive boolean data
        Boolean BLN1 = bln1;     //Auto-Boxing of boolean data
 
        char c1 = 'C';          //Primitive char data
        Character C1 = c1;     //Auto-Boxing of char data
        System.out.println("  ");
        System.out.println("Autoboxing Concept");
        System.out.println("*****************************");
        System.out.println("Byte:"+B1+" "+"Float:"+F1+"Double:"+D1+"Char:"+C1+"Boolean:"+BLN1+"Short:"+S1+"Integer:"+I1+"Long:"+L1);        
	
        
        /*Unboxing
         * All wrapper classes have methods to unwrap the object to 
         * corresponding primitive data. Go through the following example,
         *  it shows unboxing i.e unwrapping wrapper object
         *   into corresponding primitive data.
         * 
         * 
         */
	
        Byte B2 = new Byte((byte) 10);   //Byte Object
        byte b2 = B2.byteValue();         //Unwrapping Byte object to byte data
 
        Short S2 = new Short((short) 20);   //Short Object
        short s2 = S2.shortValue();          //Unwrapping Short object to short data
 
        Integer I2 = new Integer(15);    //Integer Object
        int i2 = I2.intValue();           //Unwrapping Integer object to int data
 
        Long L2 = new Long(50);     //Long Object
        long l2= L2.longValue();    //Unwrapping Long object to long data
 
        Float F2 = new Float(20);      //Float Object
        float f2 = F2.floatValue();    //Unwrapping Float object to float data
 
        Double D2 = new Double(20.5);   //Double Object
        double d2 = D2.doubleValue();    //Unwrapping Double object to double data
 
        Boolean BLN2 = new Boolean(true);      //Boolean Object
        boolean bln2 = BLN2.booleanValue();    //Unwrapping Boolean object to boolean data
 
        Character C2 = new Character('C');    //Character Object
        char c2 = C2.charValue();              //Unwrapping Character object to char data}
        System.out.println("  ");
        System.out.println("UnBoxing Concept");
        System.out.println("*****************************");
        System.out.println("Byte:"+b2+" "+"Float:"+f2+"Double:"+d2+"Char:"+c2+"Boolean:"+bln2+"Short:"+s2+"Integer:"+i2+"Long:"+l2);    

		
        
        /*Auto-Unboxing
         * 
         */
        Byte B3 = new Byte((byte) 10);   //Byte Object
        byte b3 = B3;                    //Auto-Unboxing of Byte Object
 
        Short S3 = new Short((short) 20);   //Short Object
        short s3 = S3;                      //Auto-Unboxing of Short Object
 
        Integer I3 = new Integer(15);    //Integer Object
        int i3 = I3;                     //Auto-Unboxing of Integer Object
 
        Long L3 = new Long(50);     //Long Object
        long l3 = L3;               //Auto-Unboxing of Long Object
 
        Float F3 = new Float(20);      //Float Object
        float f3 = F3;                 //Auto-Unboxing of Float Object
 
        Double D3 = new Double(20.5);   //Double Object
        double d3 = D3;                 //Auto-Unboxing of Double Object
 
        Boolean BLN3 = new Boolean(true);      //Boolean Object
        boolean bln3 = BLN3;                   //Auto-Unboxing of Boolean Object
 
        Character C3 = new Character('C');    //Character Object
        char c3 = C3;                         //Auto-Unboxing of Character Object
        System.out.println("  ");
        System.out.println("Auto Un-Boxing Concept");
        System.out.println("*****************************");
        System.out.println("Byte:"+b3+" "+"Float:"+f3+"Double:"+d3+"Char:"+c3+"Boolean:"+bln3+"Short:"+s3+"Integer:"+i3+"Long:"+l3);    
	
	}
	}


