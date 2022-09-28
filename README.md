# Generic💎🔮⛏ Toast Library

## Hey there👋, I have designed this beautiful Generic💎🔮⛏ Toast Library for Java & Kotlin

![Generic Toast Dashboard](https://user-images.githubusercontent.com/30797411/174608282-8dd4e674-e23b-4d2b-b78c-468092c44328.svg)

### Demo📽

###### [Generic toast demo youtube link](https://youtu.be/jDFGACv8s2w)

![GenericToastDemo](https://user-images.githubusercontent.com/30797411/174627178-f3a14e18-5b8d-48a6-bed9-35f48623da05.gif)

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

	  implementation 'com.github.smdi:GenericToast:0.1.3'
}
```

### Implementation

```
GenericToast.showToast(activity,					//activity
			"Success",					//title
			"Connection established successfully!",		//message
                	GenericToast.LENGTH_SHORT, 			//duration
			GenericToast.SUCCESS, 				//type
			GenericToast.DARK, 				//mode
			R.font.abeezee_regular, 			//title font
			GenericToast.DEFAULT_FONT);			//message font
```

### Default font
```diff
- If you want you use system default font, pass GenericToast.DEFAULT_FONT as parameter

GenericToast.DEFAULT_FONT

```
### Five✋ types

```
GenericToast.SUCCESS
GenericToast.ERROR
GenericToast.WARNING
GenericToast.INFO
GenericToast.CUSTOM
```

### Two✌ modes

```
GenericToast.LITE
GenericToast.DARK
```

### Two✌ dedicated durations⏰

```
GenericToast.LENGTH_SHORT       //2 seconds
GenericToast.LENGTH_LONG        //4 seconds
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
