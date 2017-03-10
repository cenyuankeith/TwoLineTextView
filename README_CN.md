#TwoLineTextView[English](https://github.com/cenyuankeith/TwoLineTextView/blob/master/README.md)
TwoLineTextView是一个显示两行文本继承自TextView的控件

![p1](https://github.com/cenyuankeith/TwoLineTextView/blob/master/image.png)

#怎么用？
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
#自定义的属性说明
* firstLineText
  第一行的文本内容
* firstLineTextSize
  第一行文本内容的字体大小
* firstLineTextColor
  第一行文本内容的字体颜色
* secondLineText
  第二行的文本内容
* secondLineTextColor
  第二行文本内容的字体颜色
* secondLineTextSize
  第二行文本内容的字体大小

#Java 代码中设置文字内容
```java

twoLineTextView = (TwoLineTextView)findViewById(R.id.tv_four);
//twoLineTextView.setSecondLineText("BBBB");设置第二行文本内容
//twoLineTextView.setFirstLineText("AAAA");//设置第一行文本内容
twoLineTextView.setText("AAA", "BBBB");//设置第一行和第二行的文本内容

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