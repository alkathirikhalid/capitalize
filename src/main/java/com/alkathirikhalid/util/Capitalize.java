/*
 * Copyright 2016 Al-Kathiri Khalid www.alkathirikhalid.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alkathirikhalid.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * Word format utility.</p>
 *
 * <p>
 * Provided the string is alphabetic, this class methods will return
 * <code>null</code> for every <code>null</code> input.</p>
 *
 * @author alkathirikhalid
 * @version 1.01
 */
public class Capitalize {

    /**
     * <p>
     * <code>Capitalize</code> instances should NOT be created. The class should
     * be used as <code>Capitalize.firstLetter("hello world");</code>.</p>
     *
     * <p>
     * This constructor is public to permit Java Doc generation.</p>
     */
    public Capitalize() {
        super();
    }

    /**
     * <p>
     * Capitalizes first letter of a string. Only the first character of a
     * string is changed to uppercase.</p>
     *
     * <pre>
     * Capitalize.firstLetter(null)          = null
     * Capitalize.firstLetter("")            = ""
     * Capitalize.firstLetter("khalid")      = "Khalid"
     * Capitalize.firstLetter("hello world") = "Hello world"
     * </pre>
     *
     * @param string the String to capitalize first letter
     * @return string which has a capitalized first letter
     */
    public static String firstLetter(String string) {
        if (string == null || "".equals(string)) {
            return string;
        }
        return string.trim().substring(0, 1).toUpperCase() + string.trim().substring(1).toLowerCase();
    }

    /**
     * <p>
     * Capitalizes first letters of a string. Only the first character of each
     * word in the string is changed to uppercase.</p>
     *
     * <pre>
     * Capitalize.allFirstLetters(null)          = null
     * Capitalize.allFirstLetters("")            = ""
     * Capitalize.allFirstLetters("khalid")      = "Khalid"
     * Capitalize.allFirstLetters("hello world") = "Hello World"
     * </pre>
     *
     * @param string the String to capitalize first letters
     * @return string which has capitalized first letters of each word
     */
    public static String allFirstLetters(String string) {
        if (string == null || "".equals(string)) {
            return string;
        }
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(string.trim());
        int spaceCount = 0;
        while (matcher.find()) {
            spaceCount++;
        }
        List<String> myString = new ArrayList(Arrays.asList(string.trim().split(" ")));
        for (int i = 0; i <= spaceCount; i++) {
            myString.set(i, firstLetter(myString.get(i)));
        }
        return myString.toString().replace("[", "").replace("]", "").replace(",", "");
    }
}
