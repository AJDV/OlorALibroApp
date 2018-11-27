package com.example.cep.oloralibroapp;

import android.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends AppCompatActivity
{
	private DrawerLayout drawerLayout;
	private ActionBarDrawerToggle toggle;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//--------------NAVIGATION MENU -----------
		drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);	//asocia el menu de navegacion a la propiedad drawerLayout
		toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.open, R.string.close); // crea el objeto de la barra de navegacion
		drawerLayout.addDrawerListener(toggle);//añade el botton toggle
		toggle.syncState();//este metodo sirve para que vaya actualizando el estado del simbolo, en el caso que este abierto será de una manera, y cerrado de otra
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//-----------------------------------------
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		boolean rslt;
		if(toggle.onOptionsItemSelected(item)){
			rslt = true;
		}
		else{
			rslt= super.onOptionsItemSelected(item);
		}
		return rslt;
	}
}
