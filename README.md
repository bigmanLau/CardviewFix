# CardviewFix 简书地址 https://www.jianshu.com/p/8c8b2708bdb4
#####原生的CardView虽然好，但是公司UI设计必须修改阴影颜色
效果图如下
*![jietu.jpg](https://upload-images.jianshu.io/upload_images/12262980-2d7ae0b5444b9361.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


>基本操作 看代码
````xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    >

    <com.bigman.wmzx.customcardview.library.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="11dp"
        android:layout_marginLeft="12dp"
        android:layout_marginRight="12dp"
        app:startColor="@color/cardview_shadow_start_color"
        app:endColor="@color/cardview_shadow_end_color"
        app:cardCornerRadius="4dp"
        app:cardElevation="10dp"
        >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:orientation="vertical">

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp">

                <TextView
                    android:id="@+id/tv_course_type1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_alignParentLeft="true"
                    android:layout_marginLeft="16dp"
                    android:text="策略班"
                    android:textColor="@color/color3C3C3C"
                    android:textSize="14dp" />

                <TextView
                    android:layout_width="20dp"
                    android:layout_height="20dp"
                    android:layout_marginLeft="40dp"
                    android:layout_toRightOf="@id/tv_course_type1"
                    android:background="@drawable/green_bg"
                    android:gravity="center"
                    android:text="复"
                    android:textColor="@color/white"
                    android:textSize="14dp" />

                <TextView
                    android:layout_width="65dp"
                    android:layout_height="20dp"
                    android:layout_alignParentRight="true"
                    android:layout_marginRight="18dp"
                    android:background="@drawable/shape_round_orange_bg"
                    android:gravity="center"
                    android:text="@string/label_class_modify"
                    android:textColor="@color/white"
                    android:textSize="12dp" />
            </RelativeLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="4dp"
                android:text="待开始"
                android:textColor="@color/colorFF6602"
                android:textSize="12dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="14dp"
                android:text="讲师：李骁恒"
                android:textColor="@color/color3C3C3C"
                android:textSize="13dp" />

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="5dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="16dp"
                    android:text="时间：2018.6.21—2018.6.23"
                    android:textColor="@color/color3C3C3C"
                    android:textSize="13dp"

                    />

                <ImageView
                    android:layout_width="15dp"
                    android:layout_height="15dp"
                    android:layout_alignParentRight="true"
                    android:layout_marginRight="15dp"
                    android:src="@mipmap/icon_arrow_black" />
            </RelativeLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="15dp"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="7dp"
                android:text="上课地址   深圳市福田区中康路卓越城一期一栋205"
                android:textColor="@color/color3C3C3C"
                android:textSize="12dp" />
        </LinearLayout>

    </com.bigman.wmzx.customcardview.library.CardView>
    <com.bigman.wmzx.customcardview.library.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="11dp"
        android:layout_marginLeft="12dp"
        android:layout_marginRight="12dp"
        app:startColor="@color/colorFF6602"
        app:endColor="@color/cardview_shadow_end_color"
        app:cardCornerRadius="4dp"
        app:cardElevation="10dp"
        >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:orientation="vertical">

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp">

                <TextView
                    android:id="@+id/tv_course_type2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_alignParentLeft="true"
                    android:layout_marginLeft="16dp"
                    android:text="策略班"
                    android:textColor="@color/color3C3C3C"
                    android:textSize="14dp" />

                <TextView
                    android:layout_width="20dp"
                    android:layout_height="20dp"
                    android:layout_marginLeft="40dp"
                    android:layout_toRightOf="@id/tv_course_type2"
                    android:background="@drawable/green_bg"
                    android:gravity="center"
                    android:text="复"
                    android:textColor="@color/white"
                    android:textSize="14dp" />

                <TextView
                    android:layout_width="65dp"
                    android:layout_height="20dp"
                    android:layout_alignParentRight="true"
                    android:layout_marginRight="18dp"
                    android:background="@drawable/shape_round_orange_bg"
                    android:gravity="center"
                    android:text="@string/label_class_modify"
                    android:textColor="@color/white"
                    android:textSize="12dp" />
            </RelativeLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="4dp"
                android:text="待开始"
                android:textColor="@color/colorFF6602"
                android:textSize="12dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="14dp"
                android:text="讲师：李骁恒"
                android:textColor="@color/color3C3C3C"
                android:textSize="13dp" />

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="5dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="16dp"
                    android:text="时间：2018.6.21—2018.6.23"
                    android:textColor="@color/color3C3C3C"
                    android:textSize="13dp"

                    />

                <ImageView
                    android:layout_width="15dp"
                    android:layout_height="15dp"
                    android:layout_alignParentRight="true"
                    android:layout_marginRight="15dp"
                    android:src="@mipmap/icon_arrow_black" />
            </RelativeLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="15dp"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="7dp"
                android:text="上课地址   深圳市福田区中康路卓越城一期一栋205"
                android:textColor="@color/color3C3C3C"
                android:textSize="12dp" />
        </LinearLayout>

    </com.bigman.wmzx.customcardview.library.CardView>
    <com.bigman.wmzx.customcardview.library.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="11dp"
        android:layout_marginLeft="12dp"
        android:layout_marginRight="12dp"
        app:startColor="@color/color008FEB"
        app:endColor="@color/cardview_shadow_end_color"
        app:cardCornerRadius="4dp"
        app:cardElevation="10dp"
        >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/white"
            android:orientation="vertical">

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp">

                <TextView
                    android:id="@+id/tv_course_type"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_alignParentLeft="true"
                    android:layout_marginLeft="16dp"
                    android:text="策略班"
                    android:textColor="@color/color3C3C3C"
                    android:textSize="14dp" />

                <TextView
                    android:layout_width="20dp"
                    android:layout_height="20dp"
                    android:layout_marginLeft="40dp"
                    android:layout_toRightOf="@id/tv_course_type"
                    android:background="@drawable/green_bg"
                    android:gravity="center"
                    android:text="复"
                    android:textColor="@color/white"
                    android:textSize="14dp" />

                <TextView
                    android:layout_width="65dp"
                    android:layout_height="20dp"
                    android:layout_alignParentRight="true"
                    android:layout_marginRight="18dp"
                    android:background="@drawable/shape_round_orange_bg"
                    android:gravity="center"
                    android:text="@string/label_class_modify"
                    android:textColor="@color/white"
                    android:textSize="12dp" />
            </RelativeLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="4dp"
                android:text="待开始"
                android:textColor="@color/colorFF6602"
                android:textSize="12dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="14dp"
                android:text="讲师：李骁恒"
                android:textColor="@color/color3C3C3C"
                android:textSize="13dp" />

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="5dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="16dp"
                    android:text="时间：2018.6.21—2018.6.23"
                    android:textColor="@color/color3C3C3C"
                    android:textSize="13dp"

                    />

                <ImageView
                    android:layout_width="15dp"
                    android:layout_height="15dp"
                    android:layout_alignParentRight="true"
                    android:layout_marginRight="15dp"
                    android:src="@mipmap/icon_arrow_black" />
            </RelativeLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="15dp"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="7dp"
                android:text="上课地址   深圳市福田区中康路卓越城一期一栋205"
                android:textColor="@color/color3C3C3C"
                android:textSize="12dp" />
        </LinearLayout>

    </com.bigman.wmzx.customcardview.library.CardView>
</LinearLayout>
````

主要是增加两个属性 一个`startColor`一个`endColor`,暂时只支持xml配置
````xml
        app:startColor="@color/cardview_shadow_start_color"
        app:endColor="@color/cardview_shadow_end_color"
````

>注意问题
1. 如果出现黑边  需要修改主题为` <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">`
2.其他属性用法和原生的一样

具体原理看代码 主要改了一个版本号判断
github地址 [https://github.com/bigmanLau/CardviewFix]
