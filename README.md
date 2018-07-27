# CardviewFix 简书地址 [https://www.jianshu.com/p/8c8b2708bdb4]
#####原生的CardView虽然好，但是公司UI设计必须修改阴影颜色
这个库是基于google官方库，所以基本属性相同，增加三个属性，暂时只支持xml配置，分别是`startColor`，`endColor`，`topDelta`，意思是支持修改渐变颜色值，而`topDelta`是1.0.1版本加进来支持修改上下阴影比例的，取值范围是-1到1的浮点值，具体效果可以看截图

依赖方式
````
dependencies {
	        implementation 'com.github.bigmanLau:CardviewFix:1.0.1'
	}
````

效果图如下
![1.png](https://upload-images.jianshu.io/upload_images/12262980-a456f38c9faabf0d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

第一个item就是topDelta等于-1的效果，第二个item是topDelta等于0的效果，第三个item是topDelta等于1的效果

>*注意：这个偏移量和cardCornerRadius的值有关，最大值就是cardCornerRadius的值，其实就是设置cardCornerRadius的百分比*

##### 有些同学不喜欢我贴代码，那么直接上我的github地址去看

具体原理看代码 
github地址 [https://github.com/bigmanLau/CardviewFix]

>注意问题
>1. 如果出现黑边  需要修改主题为` <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">`
>2.其他属性用法和原生的一样


