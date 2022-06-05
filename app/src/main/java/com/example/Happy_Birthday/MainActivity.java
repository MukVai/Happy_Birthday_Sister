package com.example.Happy_Birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(getApplicationContext(), R.raw.happybirthday);
        mp.start();

        TypeWriter tw = findViewById(R.id.textView);
        AnimationDrawable animationDrawable = (AnimationDrawable) tw.getBackground();
        animationDrawable.setEnterFadeDuration(1500);
        animationDrawable.setExitFadeDuration(1500);
        animationDrawable.start();
        tw.setText("");
        tw.setCharacterDelay(50);
        tw.animateText("Sister, Happy Birthday!! On this special day we celebrate another year of your life. I love you a lot and I'm very proud to have you as a sister. I couldn’t ask for a better one, that's for sure. You are such a special person in my life and the dearest sibling I could’ve ever wished for. \\n Your support, wisdom, and guidance over the years have all meant the world to me. Thank you for all that you’ve done for me, and I’m wishing you the happiest of birthdays today, my lovely sister. You are so meaningful to me and no matter how old you become, I will forever have a little sister to love and adore.");
    }
}