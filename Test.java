// final method
 class Test {
	final void m1()
	// after using final() method then no one override this method
	{
		System.out.println("first class");
	}
}
	 class Test1 extends Test
	{
	
		void m2()
		{
			System.out.println("second class");
		}
		
		public static void main(String[] args)
		{
			Test t=new Test();
			t.m1();
			Test1 t1=new Test1();
			t1.m2();
	}

}
