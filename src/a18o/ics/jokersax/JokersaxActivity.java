package a18o.ics.jokersax;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;


public class JokersaxActivity extends Activity {
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.home:
			WebView myWebView = (WebView) findViewById(R.id.webView1);
	        myWebView.loadUrl("http://www.jokersax.com/");
			return true;
		case R.id.photon:
	        WebView myWebView1 = (WebView) findViewById(R.id.webView1);
	        myWebView1.loadUrl("http://www.jokersax.com/developer-pages/jokersax/cyanogenmod9-photon/");
			return true;
		case R.id.atrix:
	        WebView myWebView11 = (WebView) findViewById(R.id.webView1);
	        myWebView11.loadUrl("http://www.jokersax.com/developer-pages/jokersax/cyanogenmod-9-atrix/");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.loadUrl("http://www.jokersax.com/");
    }
}