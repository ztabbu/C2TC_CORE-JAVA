
public class Test {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0d;
		char c='a';
		boolean b2=true;
		//AUTOBOXING:converting primitives into objects
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character  charobj=c;
		Boolean boolobj=b2;
		System.out.println("PRINTING OBJECT VALUES");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("FLoat  object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Boolean  object:"+boolobj);
//UNBOXING:converting objects to primitive
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		System.out.println("PRINTING PRIMITIVE VALUES");
		System.out.println("byte object:"+bytevalue);
		System.out.println("short object:"+shortvalue);
		System.out.println("int object:"+intvalue);
		System.out.println("long object:"+longvalue);
		System.out.println("float object:"+floatvalue);
		System.out.println("double object:"+doublevalue);
		System.out.println("char object:"+charvalue);
		System.out.println("boolean object:"+boolvalue);
	}

}
