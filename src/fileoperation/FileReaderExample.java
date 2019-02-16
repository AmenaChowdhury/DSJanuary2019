package fileoperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String path = "/Users/peoplentech/develop/SeleniumJanuary2019/amazon.txt";
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String st = "";
		try {
			while((st = br.readLine())!= null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				fr = null;
			}
			if(br != null) {
				br = null;
			}
		}
		
	}

}
