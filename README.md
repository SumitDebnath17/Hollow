public class Main
{
	public static void main(String[] args) {
		int n=5;
		int j;
		 
		for(int i=1;i<=n;i++){
		    System.out.print("* ");             
		    for (j=2;j<=i ;j++ ) {
		        if (j==i) {
		         System.out.print("* ");   
		        }else{
		            System.out.print("  ");  
		        }
		    }
		    for ( j=1;j<=(n-i)*2 ;j++ ) {
		        System.out.print("  ");       
		    }
		    if (i>=2) {
		    System.out.print("* ");           
		    }
		    for (j=1;j<=i-2 ;j++ ) {          
		        if (j==i) {
		         System.out.print("* ");     
		        }else{
		            System.out.print("  ");      
		        }
		    }
		    System.out.print("* ");   
		    System.out.println();
		}
		
		
		
		for(int i=n;i>=1;i--){
		    System.out.print("* ");
		    for (j=2;j<=i ;j++ ) {
		        if (j==i) {
		         System.out.print("* ");   
		        }else{
		            System.out.print("  ");
		        }
		    }
		    for ( j=1;j<=(n-i)*2 ;j++ ) {
		        System.out.print("  ");
		    }
		    if (i>=2) {
		    System.out.print("* ");
		    }
		    for (j=1;j<=i-2 ;j++ ) {
		        if (j==i) {
		         System.out.print("* ");   
		        }else{
		            System.out.print("  ");
		        }
		    }
		    System.out.print("* ");
		    System.out.println();             
		}
	}
}

