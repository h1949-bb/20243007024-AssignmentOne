# CampusLife — AssignmentOne

Java / XML Android application for COMPX202/Y05853 Assignment One. Minimum Android 7.0 (API 24).

## Open and run

Open this folder in Android Studio, select its embedded JDK (17 or newer), let Gradle sync,
and run the `app` configuration on an API 24+ emulator/device. This project uses the installed
AGP 9.4.1 / Gradle 9.6.0 / compile SDK 37 toolchain. Install that SDK if requested.
Android Studio creates `local.properties` for your own SDK location; it is not committed.

Windows command-line build: `gradlew.bat assembleDebug lintDebug`.

## Implementation

- A: Java activities, API 24 minimum, complete Gradle wrapper.
- B: XML weighted portrait layout: banner and 2 × 2 ImageButton grid.
- C: CampusLife app name, supplied logo launcher icons, #1B5E20 / #66BB6A selector.
- D: `layout-land/activity_main.xml` arranges buttons in a single row.
- E: XML `onClick` bindings and topic-specific Toast feedback on all four buttons.
- F: DetailActivity with weighted header and scrollable body.
- G: Explicit Intent carrying the selected topic index.
- H: Supplied arrays.xml drives image, title and full text without if/switch.
- I: Shared inset handling, documented resource-index mapping, descriptive IDs and strings.

All view dimensions use match_parent, wrap_content or weight-based 0dp. The only explicit
text size is the required 40sp banner heading. System inset padding is calculated at runtime.
Content and images are the assignment-provided resources, not live university information.

## Manual acceptance checks

1. Launch CampusLife; confirm icon, green buttons and banner.
2. Press each button; confirm light green pressed state, correct Toast and detail topic.
3. Check all four detail titles, images and complete scrollable bodies.
4. Back returns to home. Rotate home: 2 × 2 becomes 1 × 4. Rotate a detail page:
   selected topic remains the same; scroll position is restored by Android's view state.
5. Repeat on a tablet and small phone. Verify system bars do not cover content.

## Submission

The local history records actual implementation stages A–I. Remote pushes are pending until
the student supplies a public GitHub/GitLab repository named STUDENT_ID-AssignmentOne.
Push each stage individually if the repository is still empty; then verify the remote and
clone it to a fresh folder for a final build. This does not establish that Android Studio's
Git UI was used: complete that course-specific step in Android Studio and retain evidence.
Submit the verified repository URL through Canvas yourself.
