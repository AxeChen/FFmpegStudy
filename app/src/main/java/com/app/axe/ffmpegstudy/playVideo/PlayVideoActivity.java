package com.app.axe.ffmpegstudy.playVideo;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.app.axe.ffmpegstudy.R;

import java.io.File;

public class PlayVideoActivity extends AppCompatActivity {

    private VideoView videoView;
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        videoView = findViewById(R.id.videoView);
        button = findViewById(R.id.btnPlay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path  = new File(Environment.getExternalStorageDirectory(), "naruto.mp4").getAbsolutePath();
                Log.i("路径",path);
                videoView.play(path);
            }
        });
    }
}
