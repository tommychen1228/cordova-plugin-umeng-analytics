# cordova-plugin-umeng-analytics
cordova umeng 统计分析

#安装
cordova plugin add https://github.com/tommychen1228/cordova-plugin-umeng-analytics.git

#使用
##初始化
在页面js开始能执行的地方
```
UMengAnalytics.initApp('umeng android key', 'umeng ios key');
UMengAnalytics.resume();
```