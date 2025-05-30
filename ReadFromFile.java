package xyz;
import java.io.*;
public class ReadFromFile {
	public static void main(String[]args) {
		try {
			FileReader reader=new FileReader("C:\\Users\\pushp\\OneDrive\\Desktop");
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
			reaader.close();
		}
			catch(IOException e) {
				System.out.println("Error:"+e.getmessage())
			}
		}
	}

}
