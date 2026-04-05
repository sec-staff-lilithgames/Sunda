package com.ironsource.mediationsdk.config;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ConfigFile {
    private static ConfigFile mInstance;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mPluginVersion;
    private String[] mSupportedPlugins = {"AdobeAir", "Cocos2dx", "Cordova", "Corona", "Defold", "Flutter", "ReactNative", "Unity", "Unreal", "MAUI", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        try {
            if (mInstance == null) {
                mInstance = new ConfigFile();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mInstance;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getPluginVersion() {
        return this.mPluginVersion;
    }

    public void setPluginData(String str, String str2, String str3) {
        this.mPluginType = null;
        if (str != null) {
            String[] strArr = this.mSupportedPlugins;
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String str4 = strArr[i10];
                if (str.equalsIgnoreCase(str4)) {
                    this.mPluginType = str4;
                    break;
                }
                i10++;
            }
        }
        if (str2 != null) {
            this.mPluginVersion = str2;
        }
        if (str3 != null) {
            this.mPluginFrameworkVersion = str3;
        }
    }
}
