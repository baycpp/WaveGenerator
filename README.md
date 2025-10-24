# WaveGenerator
WaveGenerator is a water wave generator for Java on Android.

# Parameters
- wAmplitude: Determines the wave height (the maximum vertical displacement of the wave) (default: 1f).
- wLength: Defines the distance between two consecutive wave peaks (the wavelength) (default: 8f).
- wVelocity: Controls the horizontal speed at which the wave pattern moves (default: 0.5f).
- wColor: Sets the color used to draw the wave on the canvas (default: Blue).

# How to Use
### build.gradle 
- Implement this dependency to your build.gradle

### xml
```xml
<com.baycpp.wavegenerator.Wave
        android:id="@+id/waveGenerator"
        android:layout_width="match_parent"
        android:layout_height="400dp"/>
```

# Console
<img src="https://github.com/user-attachments/assets/c1b37403-98fd-4aea-b879-6a5a0457a8b0" width="250" height="500">
