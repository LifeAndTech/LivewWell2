package com.example.livewell;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class BaseActivity extends Activity 
{
	// Shared Preferences
	public static final String SETTINGS_PREFS = "SETTINGS PREFS";
	public static final String SETTINGS_PREFS_HEIGHT_FT = "WEIGHT IN FT";
	public static final String SETTINGS_PREFS_HEIGHT_IN = "WEIGHT IN IN";
	public static final String SETTINGS_PREFS_WEIGHT = "CURRENT WEIGHT";
	public static final String SETTINGS_PREFS_GOAL_WEIGHT = "GOAL WEIGHT";
	public static final String SETTINGS_PREFS_AGE = "AGE";
	public static final String SETTINGS_PREFS_GENDER = "GENDER";
	public static final String SETTINGS_PREFS_GENDER_ID = "GENDER ID";
	public static final String SETTINGS_PREFS_EXERCISE = "EXERCISE";
	public static final String SETTINGS_PREFS_EXERCISE_ID = "EXERCISE ID";
	public static final String SETTINGS_PREFS_DESERTS = "DESERTS";
	public static final String SETTINGS_PREFS_DESERTS_ID = "DESERTS ID";

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		super.onCreateOptionsMenu(menu); // ask super to create Option menu
		
		getMenuInflater().inflate(R.menu.main, menu); // use getMenuInflater to inflate the menu items
		
		menu.findItem(R.id.menuitem_home).setIntent(new Intent(this, MainActivity.class)); // find options in menu with Intent to open OptionsActivity
		
		return true;
	}

}
