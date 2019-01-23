package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * @Author bqi1
 * @Version 1.1
 * @see 1.0
 * @see Tweet2
 * @see Tweet
 * @see Happy
 * @see Sad
 * @see Neutral
 * @see importantTweet
 * @see Activity
 */
// Activity must implement onCreate
public class LonelyTwitterActivity extends Activity {
	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<Tweet2> tweetList = new ArrayList<Tweet2>(); // <type of object>
	private ArrayAdapter<Tweet2> adapter;
	
	/** Called when the activity is first created.
	 * Creates buttons (clear and save) , tweet list
	 * @param savedInstanceState must be a Bundle Object
	 * */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);


		saveButton.setOnClickListener(new View.OnClickListener() {

			/**
			 * reacts on what happens when save button is clicked
			 * @param v must be a View object
			 */
			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				Tweet2 tweet = new Tweet2(text); // NEW
                tweetList.add(tweet);
				adapter.notifyDataSetChanged();
				//saveInFile(text, new Date(System.currentTimeMillis()));
				//finish();
				saveInFile();

			}
		});
		clearButton.setOnClickListener(new View.OnClickListener() {
			/**
			 * Reacts on what happens when clear button is clicked
			 * Clears tweetlist
			 * @param v must be a View object
			 */
			public void onClick(View v) {
				setResult(RESULT_OK);
				tweetList.clear();
				adapter.notifyDataSetChanged();
				//saveInFile(text, new Datecd D(System.currentTimeMillis()));
				//finish();
				saveInFile();

			}
		});
	/*
		Tweet firsttweet;
        firsttweet = new Tweet(); // We have declared a tweet object
		System.out.println("print message");
        String temp;
		firsttweet.setMessage("first tweet of this application");
        temp = firsttweet.getMessage();
		System.out.println(temp);

		Tweet secondTweet = new Tweet();
		secondTweet.setMessage("second tweet");
		temp = secondTweet.getMessage();
		System.out.println(temp);

		Tweet thirdTweet = new Tweet();
		thirdTweet.setMessage("First message", "Second message");

		importantTweet fourthMessage = new importantTweet();
		fourthMessage.setMessage("hello","world");
		System.out.println(fourthMessage.getMessage());


		System.out.println("This is the Sad emotion");
		Sad emotionTweet;
		emotionTweet = new Sad();
		System.out.println(emotionTweet.getDate());
		System.out.println(emotionTweet.getMood());

		System.out.println("This is the Happy emotion");
		Happy emotionTweet2;
		emotionTweet2 = new Happy("This is a new date");
		System.out.println(emotionTweet2.getDate());
		System.out.println(emotionTweet2.getMood());
		*/
	}

	/**
	 * Called when app starts
	 * Creates ArrayAdapter for Tweet2 objects
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();

		adapter = new ArrayAdapter<Tweet2>(this,
				R.layout.list_item, tweetList);

		oldTweetsList.setAdapter(adapter);
	}

	/**
	 * Loads from file, catches exceptions
	 * Creates a list of tweets
	 */
	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Tweet2>>(){}.getType();
			//String line = in.readLine();
            tweetList = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Writes tweets into tweetList
	 * Catches any exceptions with IO or File finding
	 */
	private void saveInFile() {
		try {
			//FileOutputStream fos = openFileOutput(FILENAME,
			//		Context.MODE_APPEND);
            FileWriter out = new FileWriter(FILENAME);
			//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
            Gson gson = new Gson();
            gson.toJson(tweetList,out);
			//fos.write(new String(date.toString() + " | " + text)
			//		.getBytes());
			//
            // fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}