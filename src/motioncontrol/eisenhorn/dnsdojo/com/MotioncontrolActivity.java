package motioncontrol.eisenhorn.dnsdojo.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MotioncontrolActivity extends Activity {
    /** Called when the activity is first created. */

	Button	httpPOST;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        httpPOST = (Button) findViewById(R.id.bCam1on);
        httpPOST.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Create a new HttpClient and Post Header
			    HttpClient httpclient = new DefaultHttpClient();
			    HttpGet httppost = new HttpGet("http://192.168.0.170:44500/1/detection/start");
			
			    try {
			    	HttpResponse response = httpclient.execute(httppost);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			/*    try {
			        // Add your data
			       // List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
			       // nameValuePairs.add(new BasicNameValuePair("id", "12345"));
			        //nameValuePairs.add(new BasicNameValuePair("stringdata", "AndDev is Cool!"));
			       // httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			        // Execute HTTP Post Request
			     //   HttpResponse response = httpclient.execute(httppost);
			        
			    } catch (ClientProtocolException e) {
			        // TODO Auto-generated catch block
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			    }
			    */
			}
		});
     
        httpPOST = (Button) findViewById(R.id.bCam1off);
        httpPOST.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Create a new HttpClient and Post Header
			    HttpClient httpclient = new DefaultHttpClient();
			    HttpGet httppost = new HttpGet("http://192.168.0.170:44500/1/detection/pause");
			
			    try {
			    	HttpResponse response = httpclient.execute(httppost);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			/*    try {
			        // Add your data
			       // List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
			       // nameValuePairs.add(new BasicNameValuePair("id", "12345"));
			        //nameValuePairs.add(new BasicNameValuePair("stringdata", "AndDev is Cool!"));
			       // httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			        // Execute HTTP Post Request
			     //   HttpResponse response = httpclient.execute(httppost);
			        
			    } catch (ClientProtocolException e) {
			        // TODO Auto-generated catch block
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			    }
			    */
			}
		});
        
        
        httpPOST = (Button) findViewById(R.id.bCam2on);
        httpPOST.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Create a new HttpClient and Post Header
			    HttpClient httpclient = new DefaultHttpClient();
			    HttpGet httppost = new HttpGet("http://192.168.0.170:44500/2/detection/start");
			
			    try {
			    	HttpResponse response = httpclient.execute(httppost);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			/*    try {
			        // Add your data
			       // List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
			       // nameValuePairs.add(new BasicNameValuePair("id", "12345"));
			        //nameValuePairs.add(new BasicNameValuePair("stringdata", "AndDev is Cool!"));
			       // httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			        // Execute HTTP Post Request
			     //   HttpResponse response = httpclient.execute(httppost);
			        
			    } catch (ClientProtocolException e) {
			        // TODO Auto-generated catch block
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			    }
			    */
			}
		});
        
        httpPOST = (Button) findViewById(R.id.bCam2off);
        httpPOST.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Create a new HttpClient and Post Header
			    HttpClient httpclient = new DefaultHttpClient();
			    HttpGet httppost = new HttpGet("http://192.168.0.170:44500/2/detection/pause");
			
			    try {
			    	HttpResponse response = httpclient.execute(httppost);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			/*    try {
			        // Add your data
			       // List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
			       // nameValuePairs.add(new BasicNameValuePair("id", "12345"));
			        //nameValuePairs.add(new BasicNameValuePair("stringdata", "AndDev is Cool!"));
			       // httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			        // Execute HTTP Post Request
			     //   HttpResponse response = httpclient.execute(httppost);
			        
			    } catch (ClientProtocolException e) {
			        // TODO Auto-generated catch block
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			    }
			    */
			}
		});
    }
    
}