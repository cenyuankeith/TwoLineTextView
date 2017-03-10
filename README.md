#TwoLineTextView [中文](https://github.com/cenyuankeith/TwoLineTextView/blob/master/README_CN.md)
TwoLineTextView is an display two line text View

#How to use ？
```XML
<com.cd.keith.twolinetextview.TwoLineTextView
        android:id="@+id/tv_first"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        app:firstLineText="合作商家订单"
        app:firstLineTextSize="30sp"
        app:firstLineTextColor="#999999"
        app:secondLineTextColor="#89d284"
        app:secondLineTextSize="16sp"
        app:secondLineText="100单" />
```
#Custome Attribute introduce
* firstLineText
* firstLineTextSize
* firstLineTextColor
* secondLineText
* secondLineTextColor
* secondLineTextSize

#Java
```java

twoLineTextView = (TwoLineTextView)findViewById(R.id.tv_four);
//twoLineTextView.setSecondLineText("BBBB");
//twoLineTextView.setFirstLineText("AAAA");
twoLineTextView.setText("AAA", "BBBB");

```
## License

    Copyright 2017 Keith Wang

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.