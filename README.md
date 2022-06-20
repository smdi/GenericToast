# Generic💎🔮⛏ Toast Library

## Hey there👋, I have designed this beautiful Generic💎🔮⛏ Toast Library for Java & Kotlin

![Group 294](https://user-images.githubusercontent.com/30797411/174608282-8dd4e674-e23b-4d2b-b78c-468092c44328.svg)

### Demo📽

https://user-images.githubusercontent.com/30797411/174112822-5d7f0077-0ad6-4023-b79c-6488c68a822c.mp4

### Project Dependency

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Module Dependency

```
dependencies {

	  implementation 'com.github.smdi:GenericToast:0.1.0'
}

```

### Implementation

```
HalloweenToast.showToast(mainActivity,                   //activity
                        "Sunrise",                        //title
                        "You've survived the demons",      //message
                        HalloweenToast.LENGTH_LONG,         //duration
                        HalloweenToast.SUCCESS,              //type
                        HalloweenToast.LITE,                  //mode
                        R.font.eater_regular,                  //font for title 
                        R.font.fontdinerswanky_regular);        //font for message
```

### Five✋ types

```
HalloweenToast.SUCCESS
HalloweenToast.ERROR
HalloweenToast.WARNING
HalloweenToast.INFO
HalloweenToast.CUSTOM
```

### Two✌ modes

```
HalloweenToast.LITE
HalloweenToast.DARK
```

### Two✌ dedicated durations⏰

```
HalloweenToast.LENGTH_SHORT       //2 seconds
HalloweenToast.LENGTH_LONG        //4 seconds
```

### [License](http://www.apache.org/licenses/LICENSE-2.0)

```
Copyright 2022 Mohammad Imran Shaik

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
