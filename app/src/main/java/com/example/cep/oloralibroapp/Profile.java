package com.example.cep.oloralibroapp;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.view.View.GONE;

public class Profile extends AppCompatActivity
{
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState)
	{
		super.onCreate(savedInstanceState, persistentState);
		setContentView(R.layout.activity_profile);

		/*Recibir con Intent el nombre de usuario
		* para despues buscar ese usuario en el JSON,
		* cargar sus datos y crear la opción de
		* cambiar la contraseña*/

		Button cambiarPass = (Button)findViewById(R.id.cambiarPass);
		final LinearLayout datos = (LinearLayout)findViewById(R.id.Datos);
		final LinearLayout cambiarPassView = (LinearLayout)findViewById(R.id.cambiarPassView);
		Button guardar = (Button)findViewById(R.id.Guardar);
		Button cancelar = (Button)findViewById(R.id.Cancelar);

		cambiarPass.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				datos.setVisibility(GONE);
				cambiarPassView.setVisibility(View.VISIBLE);
			}
		});

		guardar.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				datos.setVisibility(View.VISIBLE);
				cambiarPassView.setVisibility(View.GONE);
			}
		});

		cancelar.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				datos.setVisibility(View.VISIBLE);
				cambiarPassView.setVisibility(View.GONE);
			}
		});
	}

}
