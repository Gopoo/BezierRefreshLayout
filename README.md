# BezierRefreshLayout
## How to use

[![Download](https://api.bintray.com/packages/group123/maven/bezierrefresh/images/download.svg)](https://bintray.com/group123/maven/bezierrefresh/_latestVersion)

If you want use this library, you only have to download BezierRefreshLayout project, import it into your workspace and add the project as a library in your android project settings.
If you prefer it, you can use the gradle dependency, you have to add these lines in your build.gradle file:

`compile 'com.flyingstudio:bezierrefresh:1.0.1'`

After this,you can use it in your project like this way:

```
<com.flyingstudio.BezierScrollLayout 
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:bezierHeight="300dp"
    android:id="@+id/bezier"
    app:bezierBackground="@color/colorAccent"
    app:refreshIcon="@drawable/refresh"
    tools:context="com.group.bezierdemo.MainActivity">
    <TextView
        android:gravity="center"
        android:textSize="17dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Only can hold one child view." />
</com.flyingstudio.BezierScrollLayout>
```
*There are three important attributes,named:bezierHeight,bezierBackground,refreshIcon*
```
//if users want to download something.
bezierRefreshLayout.setScrollListener(new OnScrollListener() {
   @Override
   public void onScroll() {
      //download something by Okhttp,Volley and so on.
   }
 });
//if u download successfully or unsuccessfully.
bezierRefreshLayout.setRefreshing(false);
```
*There are two important function,named:setScrollListener(OnScrollListener ,listener),setRefreshing(boolean refreshing)*

Then,you will see this picture if you swipe it:

![](http://opw9zb48a.bkt.clouddn.com/bezier.png)

## Attention
* Like SwipeRefreshLayout,only can hold one child view
* bezierBackground should be defined a color what you like
* bezierHeight should be defined between 200dp and 400dp

## License
```
Copyright 2017 Flying Studio & Gopoo

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
