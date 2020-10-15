package edu.uw.tcss450.my1stapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import edu.uw.tcss450.my1stapp.R;
import edu.uw.tcss450.my1stapp.databinding.ActivityDisplayMessageBinding;

public class DisplayMessageActivity extends AppCompatActivity {
    private ActivityDisplayMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDisplayMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = binding.textView;
        textView.setText(message);
    }
}