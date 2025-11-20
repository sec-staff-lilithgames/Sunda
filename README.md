# Sunda  

Sunda 是 Frida 的魔改项目。它集成了 Frida 的核心子模块 `frida-glib` 和 `frida17.4.1`，目前完成了多处指纹修改  

## 特性  

- 去掉常见线程名称 frida-xx，gmain，gum-js-loop等一众常见检测点  
- 目前只改了android arm64， 在pixel8a android 16上测试有效
- 当前针对的修改参照是某粉色视频网站app的通用检测手段

## 安装与使用  

下载并运行预编译二进制：
adb push frida-server /data/local/tmp && chmod 777 frida-server && ./frida-server

clone源码：  

```bash
git clone --recursive https://github.com/sec-staff-lilithgames/Sunda.git
cd Sunda
git submodule update --init --recursive
```  

根据目标平台编译或运行 `frida-glib` 和 `frida17.4.1`。详见 Frida 官方文档。  


