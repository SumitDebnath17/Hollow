public class Main
{
	public static void main(String[] args) {
		int n=5;
		int j;
		//upper part 
		for(int i=1;i<=n;i++){
		    System.out.print("* ");             // print first * of each line
		    for (j=2;j<=i ;j++ ) {
		        if (j==i) {
		         System.out.print("* ");   // print * line from second line as inclined position and print gap from 2nd line
		        }else{
		            System.out.print("  ");  //print gap before first inclined * line
		        }
		    }
		    for ( j=1;j<=(n-i)*2 ;j++ ) {
		        System.out.print("  ");       //print gap upto next inclined line of *
		    }
		    if (i>=2) {
		    System.out.print("* ");           //print * for next inclined line started from 1st line
		    }
		    for (j=1;j<=i-2 ;j++ ) {          //this loop work from 3rd row
		        if (j==i) {
		         System.out.print("* ");     // print * for last column from 2nd row
		        }else{
		            System.out.print("  ");      //print gap upto 2nd last column 
		        }
		    }
		    System.out.print("* ");   //print last *  each line
		    System.out.println();
		}
		
		//lower case is 180 dergree rotate of upper part
		
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
