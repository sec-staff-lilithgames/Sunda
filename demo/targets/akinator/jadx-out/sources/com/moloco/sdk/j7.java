package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.ConfigsOuterClass$Configs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j7 extends GeneratedMessageLite.Builder implements q7 {
    public j7 clearAndroidConfig() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).clearAndroidConfig();
        return this;
    }

    public j7 clearClientConfigs() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).clearClientConfigs();
        return this;
    }

    public j7 clearCommonConfigs() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).clearCommonConfigs();
        return this;
    }

    public j7 clearIosConfig() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).clearIosConfig();
        return this;
    }

    @Override // com.moloco.sdk.q7
    public ConfigsOuterClass$Configs.AndroidConfigs getAndroidConfig() {
        return ((ConfigsOuterClass$Configs) this.instance).getAndroidConfig();
    }

    @Override // com.moloco.sdk.q7
    public k7 getClientConfigsCase() {
        return ((ConfigsOuterClass$Configs) this.instance).getClientConfigsCase();
    }

    @Override // com.moloco.sdk.q7
    public ConfigsOuterClass$Configs.CommonConfigs getCommonConfigs() {
        return ((ConfigsOuterClass$Configs) this.instance).getCommonConfigs();
    }

    @Override // com.moloco.sdk.q7
    public ConfigsOuterClass$Configs.IOSConfigs getIosConfig() {
        return ((ConfigsOuterClass$Configs) this.instance).getIosConfig();
    }

    @Override // com.moloco.sdk.q7
    public boolean hasAndroidConfig() {
        return ((ConfigsOuterClass$Configs) this.instance).hasAndroidConfig();
    }

    @Override // com.moloco.sdk.q7
    public boolean hasCommonConfigs() {
        return ((ConfigsOuterClass$Configs) this.instance).hasCommonConfigs();
    }

    @Override // com.moloco.sdk.q7
    public boolean hasIosConfig() {
        return ((ConfigsOuterClass$Configs) this.instance).hasIosConfig();
    }

    public j7 mergeAndroidConfig(ConfigsOuterClass$Configs.AndroidConfigs androidConfigs) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).mergeAndroidConfig(androidConfigs);
        return this;
    }

    public j7 mergeCommonConfigs(ConfigsOuterClass$Configs.CommonConfigs commonConfigs) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).mergeCommonConfigs(commonConfigs);
        return this;
    }

    public j7 mergeIosConfig(ConfigsOuterClass$Configs.IOSConfigs iOSConfigs) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).mergeIosConfig(iOSConfigs);
        return this;
    }

    public j7 setAndroidConfig(ConfigsOuterClass$Configs.AndroidConfigs androidConfigs) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).setAndroidConfig(androidConfigs);
        return this;
    }

    public j7 setCommonConfigs(ConfigsOuterClass$Configs.CommonConfigs commonConfigs) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).setCommonConfigs(commonConfigs);
        return this;
    }

    public j7 setIosConfig(ConfigsOuterClass$Configs.IOSConfigs iOSConfigs) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).setIosConfig(iOSConfigs);
        return this;
    }

    public j7 setAndroidConfig(i7 i7Var) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).setAndroidConfig((ConfigsOuterClass$Configs.AndroidConfigs) i7Var.build());
        return this;
    }

    public j7 setCommonConfigs(l7 l7Var) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).setCommonConfigs((ConfigsOuterClass$Configs.CommonConfigs) l7Var.build());
        return this;
    }

    public j7 setIosConfig(p7 p7Var) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs) this.instance).setIosConfig((ConfigsOuterClass$Configs.IOSConfigs) p7Var.build());
        return this;
    }
}
