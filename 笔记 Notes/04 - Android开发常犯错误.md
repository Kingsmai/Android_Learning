# Android 开发常犯错误

## 基础

### Toast

`Toast`的语法：

```java
// 例子：
Toast.makeText(Demo10GridViewActivity.this, "Long Click pos: " + i, Toast.LENGTH_SHORT).show();
// 分析
Toast.makeText(/*理解为，在哪里显示*/, /*要显示的文本*/, /*时间*/).show();
```

**注意：**一定一定一定要写上`.show()`，就是显示这个Toast，如果没有的话，不会报错，但是不会显示提示框