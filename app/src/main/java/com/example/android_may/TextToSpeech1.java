package com.example.android_may;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Locale;
import android.speech.tts.TextToSpeech;

public class TextToSpeech1 extends AppCompatActivity {

    EditText Text;
    Button btnText;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text = findViewById(R.id.Text);
        btnText = findViewById(R.id.btnText);



        textToSpeech=new TextToSpeech(getApplicationContext()
                , new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
//SELECT YOUR LOCAL LANGUAGE
                    int lang = textToSpeech.setLanguage(Locale.ENGLISH);

                }
            }
        });
        // Adding OnClickListener
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(Text.getText().toString(), android.speech.tts.TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }
}