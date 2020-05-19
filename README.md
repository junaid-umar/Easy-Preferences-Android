# Easy-Preferences-Android
Library to make preferences easy

[![](https://jitpack.io/v/junaid-umar/Easy-Preferences-Android.svg)](https://jitpack.io/#junaid-umar/Easy-Preferences-Android)


How to use
        
        // to initilize
        EasyPreferences.init(this)
        
        // Param1 = Key, Param2 = value
        
        // Put String 
        EasyPreferences.putValue("string", "john")
        // Put Int 
        EasyPreferences.putValue("int", 1)
        // Put Long 
        EasyPreferences.putValue("long", 0L)
        // Put Boolean 
        EasyPreferences.putValue("boolean", true)
        // Put Float 
        EasyPreferences.putValue("float", 0.0f)
        
        // Param1 = Key, Param2 = default value

        // Get String 
        EasyPreferences.getValue("string", "default")
        // Get Int 
        EasyPreferences.getValue("int", 3)
        // Get Long 
        EasyPreferences.getValue("long", 2L)
        // Get boolean 
        EasyPreferences.getValue("boolean", false)
        // Get float 
        EasyPreferences.getValue("float", 0.4f)
        
        // remove all prefs
        EasyPreferences.removeAll()



To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.junaid-umar:Easy-Preferences-Android:1.0.0-alpha'
	}
