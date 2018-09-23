package cmps390;
import java.io.*;
import java.util.ArrayList;
public class outliners {
	public static void main(String[] args) throws Exception {
		ArrayList<Double> lines = new ArrayList<Double>();
		double average=0;
		try {
			File file = new File("outliners.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				Double doubleObject = new Double(line);
				lines.add(doubleObject);
			}
			double sum=0;   
			
			int n=0;
			for(Double app:lines) {
				sum += app;
				n++;
			}
			average= (sum/(n-1));
			System.out.println(average);
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		outlinerOrNot(lines,average);
	}

	private static void outlinerOrNot(ArrayList<Double> lines,double average) {
		// TODO Auto-generated method stub
		for(int i=0;i<lines.size();i++) {
			if(Math.abs(lines.get(i)-average)>3) {
				System.out.println(lines.get(i));
			}
		}
	}
}


