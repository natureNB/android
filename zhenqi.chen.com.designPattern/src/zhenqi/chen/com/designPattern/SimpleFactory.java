package zhenqi.chen.com.designPattern;

import java.io.*;

public class SimpleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		String str = null;
		System.out.println("hello java.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			str = br.readLine();
			bw.write(str);
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
