

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
     
    public class BoltSpeed {
     
    	public static void main(String[] args) throws Exception {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		int T = Integer.parseInt(br.readLine().split(" ")[0]);
    		
    		for (int i = 0; i < T; i++) {
    			String[] data = br.readLine().split(" ");
    			int H = Integer.parseInt(data[0]);
    			int X = Integer.parseInt(data[1]);
    			int Z = Integer.parseInt(data[2]);
    			
    			double raj = Math.sqrt((2*H)/32);
    			double rahul = X / Z;
    			
    			if(rahul <= raj)
    				System.out.println("Rahul");
    			else
    				System.out.println("Raj");
    		}
    	}
    }

