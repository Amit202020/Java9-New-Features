package pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

class TryDemo {
	static String  readdemo(String m){
	    Reader  ins = new StringReader(m);
	    BufferedReader  rd=new BufferedReader(ins);
             try(rd){
            
                return   rd.readLine();
             
             } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
             return null;
	}                            

	public static void main(String args[])throws IOException {
		
		System.out.println(readdemo("welcome TOOOOOOOOOOOO"));
		
	}
}