package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

/** Home screen: the XML tag is the matching index in all topic arrays. */
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLayout(R.layout.activity_main);
    }
    
}
