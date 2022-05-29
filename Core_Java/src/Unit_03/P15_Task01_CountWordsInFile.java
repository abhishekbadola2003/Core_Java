package Unit_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P15_Task01_CountWordsInFile {

	public static void main(String[] args) throws IOException {
		Anm obj = new Anm();
		obj.count();
	}

}
class Anm {
	void count() throws IOException{
	
    int count=0;
     String s;
     String path="C:\\Users\\Ankita Singh\\git\\FirstJavaproject\\LearnJavaInDepth\\src\\Unit_03\\Task01.txt";
     File file1 = new File(path);
     
     @SuppressWarnings("resource")
	BufferedReader br= new BufferedReader(new FileReader(file1));
     
     while((s = br.readLine())!=null) {
    	 
    	 String word[]=s.split(" ");
    	 count+=word.length;
     }
     System.out.println("Total no. of words in a file ="+count);
     br.close();

}
}