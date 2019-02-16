import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {

    	final String minerals = "abcdefghijklmnopqrstuvwxyz";
    	
    	int gems = 0;
    	
    	// **** loop through the minerals ****
    	for (int i = 0; i < minerals.length(); i++) {
    		
  			// **** get the current mineral ****
			char mineral = minerals.charAt(i);
			
    		// **** loop through the rocks (arr) looking for this mineral ****
    		int mineralInRock = 0;
    		for (int j = 0; j < arr.length; j++) {
    			
    			// **** check if this mineral is in this rock ****
    			if (arr[j].indexOf(mineral) != -1)
    				mineralInRock++;
    		}
    		
    		// **** count this gem (if found in all rocks) ****
    		if (mineralInRock == arr.length)
    			gems++;
    	}    	

    	// **** total number of gems ****
    	return gems;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
