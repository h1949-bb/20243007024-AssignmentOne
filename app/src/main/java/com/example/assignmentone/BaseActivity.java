package com.example.assignmentone;

import android.app.Activity;
import android.view.View;

/** Keeps content inside system bars in both orientations, including edge-to-edge devices. */
public abstract class BaseActivity extends Activity {
    protected void showLayout(int layoutId) {
        setContentView(layoutId);
        View root = findViewById(R.id.root);
        root.setOnApplyWindowInsetsListener((view, insets) -> {
            view.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(),
                    insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
            return insets;
        });
        root.requestApplyInsets();
    }
}
