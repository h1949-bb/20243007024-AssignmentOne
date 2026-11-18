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
    
    /** Every button has its own index; one listener avoids repeating navigation code. */
    public void onTopicClick(View view) {
        int topicIndex = Integer.parseInt(view.getTag().toString());
        String label = getResources().getStringArray(R.array.topic_labels)[topicIndex];
        Toast.makeText(this, getString(R.string.topic_clicked, label), Toast.LENGTH_SHORT).show();
        
    }

}
