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
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] images = getResources().getStringArray(R.array.string_array_images);
        String[] labels = getResources().getStringArray(R.array.topic_labels);

        // Clamp unexpected extras without branching; a missing extra selects Facilities.
        int index = Math.max(0, Math.min(titles.length - 1,
                getIntent().getIntExtra(EXTRA_TOPIC_INDEX, 0)));
        ((TextView) findViewById(R.id.topic_label)).setText(labels[index]);
        ((TextView) findViewById(R.id.detail_title)).setText(titles[index].trim());
        ((TextView) findViewById(R.id.detail_content)).setText(contents[index].trim());

        // Names come from the supplied XML. Trim its surrounding whitespace before lookup.
        int imageId = getResources().getIdentifier(images[index].trim(), "drawable", getPackageName());
        ((ImageView) findViewById(R.id.topic_image)).setImageResource(imageId);
    }
}
