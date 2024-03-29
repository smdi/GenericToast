# Generic💎🔮⛏ Toast Library

## Hey there👋, I have designed this beautiful Generic💎🔮⛏ Toast Library for Java & Kotlin

![GT_Title_Message](https://user-images.githubusercontent.com/30797411/204130238-94c9502d-7e15-40a7-8a28-cd4c1a13ee5c.svg)

![GT_Message](https://user-images.githubusercontent.com/30797411/204130231-b149bc17-0690-458d-a37c-dfca51517d41.svg)

### Demo📽

###### [Generic toast demo youtube link](https://www.youtube.com/watch?v=ceJnsqcNtJs)

https://user-images.githubusercontent.com/30797411/204130832-fa71614b-5b8c-4949-9423-c1759dc3d9df.mp4

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

### Implementation with title and message

```
GenericToast.showToast(activity,					//activity or context
			"Success",					//title
			"Connection established successfully!",		//message
                	GenericToast.LENGTH_SHORT, 			//duration
			GenericToast.SUCCESS, 				//type
			GenericToast.DARK, 				//mode
			R.font.abeezee_regular, 			//title font
			GenericToast.DEFAULT_FONT);			//message font
```

### Implementation with message

```
GenericToast.showToast(activity,					//activity or context			
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
