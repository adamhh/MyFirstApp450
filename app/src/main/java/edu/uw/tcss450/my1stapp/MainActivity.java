package edu.uw.tcss450.my1stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import edu.uw.tcss450.my1stapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "edu.tcss450.my1stapp.MESSAGE";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, binding.editText.getText().toString());
        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Debug", "Debug");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("info", "info");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.w("warning", "warning");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("Verbose", "Verbose");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("error", "error");
    }
}