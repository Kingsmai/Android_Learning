**APP界面：**`app\src\main\res\layout`，此文件夹里的文件是界面设计，由XML语法构成一个Android应用的页面

**程序逻辑：**`app\src\main\java\com.example.helloworld`，此文件夹里存放程序的Java逻辑代码

**Android_Manifest：**`app\src\main\AndroidManifest.xml`，清单文件会向 Android 构建工具、Android 操作系统和 Google Play 描述应用的基本信息。



**程序字符串：**`app\src\main\res\values\strings.xml`，用于保存程序中所需要用到的文本字符串，里面定义的值调用方式`@string/定义的name/`

**图片文件：**`app\src\main\res\drawable`将图片文件放在这里面；如果图片需要适应不同屏幕分辨率的，就放在`mipmap-xxx`文件夹里（`xxx`是分辨率）