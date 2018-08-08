Android Emulator Detector For Android Studio 
=========================

[![Release](https://jitpack.io/v/coleflowers/android-emulator-detector-android-studio.svg)](https://jitpack.io/#coleflowers/android-emulator-detector-android-studio)

Code base on [gingo/android-emulator-detector][1] 
用于沙箱检测

Usage
-----

Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
    compile 'com.github.coleflowers:android-emulator-detector-android-studio:1.0.2'
}
```

and:
```java
 import net.skoumal.emulatordetector.EmulatorDetector;
```
```java
if (EmulatorDetector.isEmulator()){
    // do something
} else {
    // do something
}
```

  [1]: https://github.com/gingo/android-emulator-detector