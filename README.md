# Sunda

Sunda 是 Frida 的魔改项目。仓库直接包含 `frida-glib` 和 `frida17.4.1` 的源码目录，不再依赖顶层子模块指针。

## 特性

- 去掉常见线程名称 frida-xx，gmain，gum-js-loop 等一众常见检测点
- 目前只改了 Android ARM64，在 Pixel 8a Android 16 上测试有效
- 当前针对的修改参照是某粉色视频网站 app 的通用检测手段

## 获取源码

```bash
git clone https://github.com/sec-staff-lilithgames/Sunda.git
cd Sunda
```

## 构建

源码主目录：

- `frida-glib/`
- `frida17.4.1/`

按目标平台进入对应目录构建即可。Android ARM64 相关产物通常从 `frida17.4.1/` 开始配置和编译，具体流程可参考 Frida 官方文档与目录内构建脚本。

## 运行

下载并运行预编译二进制：

```bash
adb push frida-server /data/local/tmp
chmod 777 /data/local/tmp/frida-server
/data/local/tmp/frida-server
```

