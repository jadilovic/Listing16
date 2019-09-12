package Collections;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class ImpIterable implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<>();
	
	private class urlIterator implements Iterator<String>{

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
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}	
		
		@Override
		public void remove(){
			urls.remove(index);
		}
	}
	
	public ImpIterable(){
		urls.add("https://caveofprogramming.com/");
		urls.add("https://www.klix.ba/");
		urls.add("https://www.bbc.com/news");
	}
/*
	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}
*/

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new urlIterator();
	}
}
