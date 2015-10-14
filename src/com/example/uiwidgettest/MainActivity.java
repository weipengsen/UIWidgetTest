package com.example.uiwidgettest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{
	private Button button;
	private EditText editText;
	private ImageView imageView;
	private ProgressBar progressBar,progressBar2;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button);
		editText = (EditText) findViewById(R.id.edit_text);
		imageView = (ImageView) findViewById(R.id.image_view);
		progressBar = (ProgressBar) findViewById(R.id.progress_bar1);
		progressBar2 = (ProgressBar) findViewById(R.id.progress_bar2);
		button.setOnClickListener(this);
	}
	@Override
	public void onClick(View v){
		switch (v.getId()){
		case R.id.button:
			//String inputText = editText.getText().toString();
			//Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
			//imageView.setImageResource(R.drawable.bean);
			/*if(progressBar.getVisibility()==View.GONE){
				progressBar.setVisibility(View.VISIBLE);
			}else{
				progressBar.setVisibility(View.GONE);
			}*/
			/*int progress=progressBar2.getProgress();
			progress+=10;
			progressBar2.setProgress(progress);*/
			AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
			dialog.setTitle("This is Dialong");
			dialog.setMessage("Something Important");
			dialog.setCancelable(false);
			dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which){	
				}
			});
			dialog.show();
			break;
		default:
			break;
		}
	}
}
