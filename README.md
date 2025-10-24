# WaveGenerator
WaveGenerator is a water wave generator for Java on Android.

# Parameters
- wAmplitude: Determines the wave height (the maximum vertical displacement of the wave) (default: 1f).
- wLength: Defines the distance between two consecutive wave peaks (the wavelength) (default: 8f).
- wVelocity: Controls the horizontal speed at which the wave pattern moves (default: 0.5f).
- wColor: Sets the color used to draw the wave on the canvas (default: Blue).
- wRight: Determines the direction of the wave movement. 
  When set to the true, the wave moves to the right.
  When set to the false (default) the wave moves to the left.

# How to Use
### build.gradle (:app)
```implementation 'com.github.baycpp:WaveGenerator:1.0'```

### settings.gradle 
```maven { url 'https://jitpack.io' }```

### xml
```xml
<com.baycpp.wavegenerator.Wave
        android:id="@+id/waveGenerator"
        android:layout_width="match_parent"
        android:layout_height="400dp"/>
```

### xml with parameters
```xml
 <com.baycpp.wavegenerator.Wave
        android:id="@+id/waveGenerator"
        android:layout_width="match_parent"
        android:layout_height="400dp"
        app:wAmplitude="0.5"
        app:wLength="8"
        app:wRight="true" 
        app:wVelocity="0.3"
        app:wColor="@color/blue"/>
```

# Console
<img src="https://github.com/user-attachments/assets/d221f2c3-538f-4195-a402-59d8c86b25aa" width="300" height="600">
