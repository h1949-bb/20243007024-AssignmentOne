package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/** Displays the three parallel resource arrays using the index supplied by MainActivity. */
public class DetailActivity extends BaseActivity {
    public static final String EXTRA_TOPIC_INDEX = "com.example.assignmentone.TOPIC_INDEX";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLayout(R.layout.activity_detail);
        
    }
}
