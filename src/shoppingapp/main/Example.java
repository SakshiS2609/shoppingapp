package shoppingapp.main;



	
	 class SuperStudy 
	{
		public void X()
		{ 
			System.out.println("I am in SuperStudy.X()");
			}

		public static void main(String[] args) 
		{ 
			SuperStudy ssc = new SuperStudy();
			ssc.X(); 
		}
	}

	class SuperStudyChild extends SuperStudy
	{
		public void X()
		{ 
			super.X();
			System.out.println("I am in SuperStudyChild.X()"); 
		}
	}


