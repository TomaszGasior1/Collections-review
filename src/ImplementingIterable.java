import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

class UrlLibrary implements Iterable<String>{
	private LinkedList<String> urls = new LinkedList<>();
	
	private class UrlIterator implements Iterator<String>{
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			
			return index < urls.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				
				String line = null;
				while((line = br.readLine()) != null){
					sb.append(line);
					sb.append("\n");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}
		public void remove(){
			urls.remove(index);
		}
		
	}
	
	public UrlLibrary(){
		urls.add("http://www.google.com");
		urls.add("http://www.onet.pl");
		urls.add("http://www.wp.pl");
	}

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}

	
	/*
	@Override
	public Iterator<String> iterator() {
		
		return urls.iterator();
	}
	*/
}

public class ImplementingIterable {
	
	

	public static void main(String[] args) {
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String html:urlLibrary){
			System.out.println(html.length());
			System.out.println(html);
		}
		

	}

}
