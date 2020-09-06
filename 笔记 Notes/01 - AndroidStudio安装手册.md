# Android Studio 操作办法

**系统配置**

Windows 10 Version 2004 (OS Build 19041.450)

## 下载 Android Studio

从官网下载Android Studio安装包，网址：

* 【官网】https://developer.android.com/studio
  * 目前版本号 `V 4.0.1`（2020年9月6日）
* 【大陆镜像】http://www.android-studio.org
  * 目前版本号 `V 3.5.2`（2020年9月6日）

安装过程是大同小异的，这边安装是基于 Android Studio `Version 4.0.1`

## 安装并配置JDK

从Oracle官网下载 JDK，推荐下载 JDK-11.0.8 

> JDK 1.8 （aka JDK 8）是 LTS 版本，JDK 11也是 LTS 版本，比较稳定，所以推荐这两个

* JDK 8 https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
* JDK 11 https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

> Windows用户：找到 Window x64 版本，点击右侧的exe链接进行下载。

---

双击运行，开始安装（建议安装目录全使用默认路径**且不要有汉字（非ASCII字符）**）

右键 This PC（此电脑） > Properties（属性） > Advanced system settings（高级系统设置） > Environment Variables（环境变量）

在 System Variables（环境变量）点击 New，

* Variable Name（变量名）: `JAVA_HOME`
* Variable Value（变量值）: `C:\Program Files\Java\jdk-11.0.8`（我这里展示的是默认 JDK 的安装路径）

再 New 一个：

* Variable Name（变量名）: `CLASSPATH`
* Variable Value（变量值）: `.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;`

接下来双击 `Path`，然后 new 两次，分别加入下面两个路径

* `%JAVA_HOME%\bin`

* `%JAVA_HOME%\jre\bin`

### 检测 JDK 环境

`Win键` + `R` 输入 `cmd` 回车 打开命令提示符

输入 `java -version`，如果没有报错的话，会显示（根据版本安装不同，会有不同的提示）：

```
java version "11.0.8" 2020-07-14 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.8+10-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.8+10-LTS, mixed mode)
```

到这里，JDK环境就安装完毕了

## 安装 Android Studio

双击安装包运行，点Next，然后出现一个复选框让你选择需要安装的组件：

- [x] Android Virtual Device —— 这是自带的虚拟机，如果电脑内存**4GB或以下，不推荐安装**（因为自带的虚拟机很耗内存，低配机就别安装了）

然后点击Next，这边会让你输入安装路径（推荐默认）**注意：千万不要出现非ASCII字符（不能有A-Z / 0-9之外字符）**

继续Next，等待安装，安装之后再Next，然后Finish

## 配置 Android Studio

然后就会出现Welcome界面，上面会显示Android Studio版本号。点击右下角的`Configure` > `SDK Manager`，然后会出现一个设置界面

**重要：**上面的路径需要手动调整（通常你们的文件夹的用户名会包含汉字，这里要替换成不包含汉字文件夹的目录），
修改目录路径如：`C:\Android\Sdk`，点击`Edit`就能修改

然后点击Next就会自动下载Sdk（我没试过，就是可能会重复下载Android SDK），那么旧的SDK你们得去找找然后删除【可选】

## Hello World项目

回到Welcome界面，点击`Start a new Android Studio project`，选择 `Empty Activity` 然后点 Next

Name这一项为你的项目起个名字：比如 Hello World，下边的Package Name（包名），Save Location（项目保存路径）会自动变动

Language改为 Java语言（也可以选择Kotlin，如果你理解Kotlin语法的话）

Minimum SDK：默认是 4.1（很久以前的稳定版本，覆盖率99.8%，（覆盖率是向下计算的，也就是说Android版本10也是包含在99.8%里））
推荐版本：

 

| 版本号            | API  | 程序覆盖设备率 | 版本发行量（该版本） |
| ----------------- | ---- | -------------- | -------------------- |
| 4.1 (Jelly Bean)  | 16   | 99.8%          | 1.2%                 |
| 5.1 (Lollipop)    | 22   | 92.3%          | 11.5%                |
| 6.0 (Marshmallow) | 23   | 84.9%          | 16.9%                |
| 8.1 (Oreo)        | 27   | 53.5%          | 15.4%                |

设置好了之后，点击Finish，项目就开始创建了，等待加载即可

## 创建虚拟机（内存8GB以上的电脑）

> 因为自带虚拟机很耗内存，所以4GB或以下的电脑就不用虚拟机了。搜一下怎么去链接外部模拟器

右上部分有一排控件，找到 AVD Manager，点击，出现一个界面。

点击中间的 `+ Create Virtual Device...`，随便选择一部手机。点击Next

System Image就是该手机安装的Android系统，可以选择任何一个（因为是向下兼容的，应该没什么大问题），点击Download，选择Accept，等待下载。

下载完毕之后，点击刚刚下载的系统版本，然后点击Next，对你刚刚创建的虚拟机起个名字（可以跳过）

完了之后，可以点击右上部分控件的Run 'app'，就会弹出虚拟机。等待Hello World界面出现。

## 额外：外部模拟器

推荐几个外部模拟器给你们：具体怎么关联模拟器和Android Studio，搜一下即可。

1. Bluestack - https://www.bluestacks.com/tw/index.html
2. 夜神模拟器 - https://www.yeshen.com/
3. NoxPlayer（夜神英文版） - https://www.bignox.com/