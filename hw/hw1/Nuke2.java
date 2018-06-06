import java.io.*;

class Nuke2 {
    public static void main(String[] args) throws Exception{
	BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
	String keyLine = keybd.readLine();
	System.out.println(keyLine.charAt(0) + keyLine.substring(2));
    }
}
