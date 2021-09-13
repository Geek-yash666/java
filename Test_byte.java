class Test_byte {
	public static void main(String args[]) {
		byte b=-128; //bytes 8 bit -> -128 to 127
		
		//short 16 bits in size -32768 to 3267
		
		float f1=1;	 // 32 bit e-45 to e38
		float f2=1.2f;	 // If not f then it consider it as an error and return double can't assign to float
		float f3=1.2323f;
		float f4=987654321.1234567f; //convert it into E power , if we use double then there is no loss in value.
		float f5=6.123456789f; //prints upto 7 digits
		
		double d=1.2; //or 1.2d
		
		boolean bo=true;
		
		System.out.println("double:  "+d);
		System.out.println("boolean: "+bo);
		System.out.println("byte:   "+b);
		System.out.println("float:   "+f1);
		System.out.println("float:   "+f2);
		System.out.println("float:   "+f3);
		System.out.println("float:   "+f4);
		System.out.println("float:   "+f5);
		
	}

}

//Difference between print and println:

//	Implementation:	print method is implemented as it prints the text on the console and the cursor remains at the end of the text at the console.	
//On the other hand, println method is implemented as prints the text on the console and the cursor remains at the start of the next line at the console and the next printing takes place from next line.
//	Nature	The prints method simply print text on the console and does not add any new line.	While println adds new line after print text on console.
//	Arguments	print method works only with input parameter passed otherwise in case no argument is passed it throws syntax exception.	println method works both with and without parameter and do not throw any type of exception.
