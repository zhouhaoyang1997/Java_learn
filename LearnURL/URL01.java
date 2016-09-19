package LearnURL;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
public class URL01 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.zhihu.com");
		System.out.println(url.toString());
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\38410\\Desktop\\¸´ÖÆ1.html"));
		String str = null;
		while((str=br.readLine())!=null){
			System.out.println(br.readLine());
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		
		bw.close();
		br.close();
	}
}
