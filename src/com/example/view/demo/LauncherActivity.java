package com.example.view.demo;

import com.example.view.demo.floatingaction.FloatingAction;
import com.example.view.demo.processbutton.ProcessButtonActivity;
import com.jeremyfeinstein.slidingmenu.example.ExampleListActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LauncherActivity extends Activity {
	private ListView listView;
	private String[] options = {"Flat Button","Process Button","Sliding Menu","Floating Button"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);
		getActionBar().setDisplayShowHomeEnabled(false);
		listView = (ListView)findViewById(R.id.listView);
		ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,long arg3) {
				switch (position){
					case 0:
						startActivity(new Intent(LauncherActivity.this, MainActivity.class));
						break;
					case 1:
						startActivity(new Intent(LauncherActivity.this, ProcessButtonActivity.class));
						break;
					case 2:
						startActivity(new Intent(LauncherActivity.this, ExampleListActivity.class));
						break;
					case 3:
						startActivity(new Intent(LauncherActivity.this, FloatingAction.class));
						break;
				}
				
				
			}
		});
	}

	
}
