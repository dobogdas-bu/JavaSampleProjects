package cs520.hw6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {

		StringBuffer data = new StringBuffer();
		InputStreamReader inputStream = null;
		BufferedReader reader = null;

		try{
			String page = "http://norvig.com/big.txt";
			URL urlObject = new URL(page);
			String inputLine;
			inputStream =new InputStreamReader(urlObject.openStream());
			reader = new BufferedReader(inputStream);

			while((inputLine = reader.readLine()) != null){
				data.append(inputLine.toLowerCase());
			}
			System.out.println("Input data length "+ data.length());

			SharedResults sharedResults = new SharedResults();
			char letter = 'a';

			LongTask[] longTasks = new LongTask[26];

			for(int i =0;i<=longTasks.length;i++){
				LongTask longTask = new LongTask(sharedResults,data,letter);
				longTask.start();
				System.out.println(longTask.getName()+" is running");
				longTask.join();
				letter++;
			}
			System.out.println("Character Count: "+sharedResults.getResult());

		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if (inputStream!=null){
					inputStream.close();;
				}
				if (reader!=null){
					reader.close();
				}
			} catch (Exception e2){
				e2.printStackTrace();
			}


		}



	}

}
