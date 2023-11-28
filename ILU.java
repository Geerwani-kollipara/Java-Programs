class ILU 
{
	public static void main(String[] args) 
	{
      //I code.....

      for(int i=1;i<=6;i++){
		  System.out.print("    ");
			for(int j=1;j<=7;j++){
				if(i==1 || i==6)
					System.out.print("*");
				else if(j==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println(" ");

		//Heart Code.........
		int star=8,space=0;
		for (int i=1;i<4 ;i++ )
		{
			
			for(int j=1;j<=7 ;j++)
			{
		    if(i==1 &&(j>1 && j< 4 || j>4 && j<7))
				System.out.print(" *");
			if(i==2 || i==3)
				System.out.print(" *");
			 else
				 System.out.print(" ");
			   
			 }
			   System.out.println();
				 
		 }	
		 for(int i=1;i<=4;i++){
			 star-=2;
			space+=2;
			
			 for(int k=1;k<=space;k++)
				{
				 System.out.print(" ");
				 
				}
				for(int k=1;k<star;k++){
				System.out.print(" *");
				}
               

				System.out.println();
		 }


		 //Code For U.............

		 for(int i=1;i<6;i++){
			for(int j=1;j<=6;j++){
				if(i<=5 &&(j==1 ||j==6))
					System.out.print("   *");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.print("     * * * ");
		 
	}
}
