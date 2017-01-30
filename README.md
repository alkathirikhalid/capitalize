[![](https://jitpack.io/v/alkathirikhalid/capitalize.svg)](https://jitpack.io/#alkathirikhalid/capitalize)

# Capitalize
A pure java convenience utility class to format words, it can be used in any java/android project either using build script or adding jar file, a light weight util compared to WordUtils offerd by apache commons lang.

# Usage
<p>Provided the string is alphabetic, this utility class methods will return null for every null input:-</p>
<p>Capitalizes first letter of a string. Only the first character of a string is changed to uppercase.
<ul>
<li>Capitalize.firstLetter(null)          = null</li>
<li> Capitalize.firstLetter("")            = ""</li>
<li> Capitalize.firstLetter("khalid")      = "Khalid"</li>
<li> Capitalize.firstLetter("hello world") = "Hello world"</li>
</ul>
</p>
<p>Capitalizes first letters of a string. Only the first character of each word in the string is changed to uppercase.
<ul>
<li> Capitalize.allFirstLetters(null)          = null</li>
<li> Capitalize.allFirstLetters("")            = ""</li>
<li> Capitalize.allFirstLetters("khalid")      = "Khalid"</li>
<li> Capitalize.allFirstLetters("hello world") = "Hello World"</li>
</ul>
</p>

# Installation
### Gradle
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
dependencies {
	        compile 'com.github.alkathirikhalid:capitalize:v1.01'
	}
  ```
### Maven
  ```
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  ```
  <dependency>
	    <groupId>com.github.alkathirikhalid</groupId>
	    <artifactId>capitalize</artifactId>
	    <version>v1.01</version>
	</dependency>
  ```
  
# License

Copyright 2016 Al-Kathiri Khalid www.alkathirikhalid.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
