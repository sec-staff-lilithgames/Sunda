package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.ConfigsOuterClass$Configs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l7 extends GeneratedMessageLite.Builder implements o7 {
    public l7 clearMediaConfig() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs) this.instance).clearMediaConfig();
        return this;
    }

    @Override // com.moloco.sdk.o7
    public ConfigsOuterClass$Configs.CommonConfigs.MediaConfig getMediaConfig() {
        return ((ConfigsOuterClass$Configs.CommonConfigs) this.instance).getMediaConfig();
    }

    @Override // com.moloco.sdk.o7
    public boolean hasMediaConfig() {
        return ((ConfigsOuterClass$Configs.CommonConfigs) this.instance).hasMediaConfig();
    }

    public l7 mergeMediaConfig(ConfigsOuterClass$Configs.CommonConfigs.MediaConfig mediaConfig) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs) this.instance).mergeMediaConfig(mediaConfig);
        return this;
    }

    public l7 setMediaConfig(ConfigsOuterClass$Configs.CommonConfigs.MediaConfig mediaConfig) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs) this.instance).setMediaConfig(mediaConfig);
        return this;
    }

    public l7 setMediaConfig(m7 m7Var) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs) this.instance).setMediaConfig((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) m7Var.build());
        return this;
    }
}
