# Sunda  

Sunda 是 Lilith Games 发布的一个安全研究工具集，定位为 Frida 的兄弟项目。它集成了 Frida 的核心子模块 `frida-glib` 和 `frida17.4.1`，方便在多平台进行动态二进制插架、函数 Hook 和内存监控等任务。  

## 特性  

- 动态二进制插架，可在运行时注入 JavaScript 代码监视和修改应用行为。  
- 跨平台支持 Windows、macOS、Linux、Android、iOS 等。  
- 多语言系统系统，支持 Python、JavaScript 等接口。  

## 安装与使用  

克隆仓库并初始化子模块：  

```bash
git clone --recursive https://github.com/sec-staff-lilithgames/Sunda.git
cd Sunda
git submodule update --init --recursive
```  

根据目标平台编译或运行 `frida-glib` 和 `frida17.4.1`。详见 Frida 官方文档。  

## 场景  

Sunda 适合安全研究、移动应用逆向和漏洞分析，通过 Hook 关键函数来穿过检测、调试逻辑或提取数据。  

## 贡献  

欢迎提交 issue 与 Pull Request。
