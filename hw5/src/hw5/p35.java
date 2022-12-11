package hw5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class p35 {
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("text1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("hello");
			pw.println("GoodBye");
			
			pw.close();
			System.out.println("資料已寫入檔案了");
		}
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
	}
}
