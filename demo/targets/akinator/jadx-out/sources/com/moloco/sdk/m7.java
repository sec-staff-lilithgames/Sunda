package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.ConfigsOuterClass$Configs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m7 extends GeneratedMessageLite.Builder implements n7 {
    public m7 clearMinStreamingPlayableDurationOnTimeoutSecs() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).clearMinStreamingPlayableDurationOnTimeoutSecs();
        return this;
    }

    public m7 clearStreamingChunkSizeKilobytes() {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).clearStreamingChunkSizeKilobytes();
        return this;
    }

    @Override // com.moloco.sdk.n7
    public double getMinStreamingPlayableDurationOnTimeoutSecs() {
        return ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).getMinStreamingPlayableDurationOnTimeoutSecs();
    }

    @Override // com.moloco.sdk.n7
    public long getStreamingChunkSizeKilobytes() {
        return ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).getStreamingChunkSizeKilobytes();
    }

    @Override // com.moloco.sdk.n7
    public boolean hasMinStreamingPlayableDurationOnTimeoutSecs() {
        return ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).hasMinStreamingPlayableDurationOnTimeoutSecs();
    }

    @Override // com.moloco.sdk.n7
    public boolean hasStreamingChunkSizeKilobytes() {
        return ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).hasStreamingChunkSizeKilobytes();
    }

    public m7 setMinStreamingPlayableDurationOnTimeoutSecs(double d10) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).setMinStreamingPlayableDurationOnTimeoutSecs(d10);
        return this;
    }

    public m7 setStreamingChunkSizeKilobytes(long j10) {
        copyOnWrite();
        ((ConfigsOuterClass$Configs.CommonConfigs.MediaConfig) this.instance).setStreamingChunkSizeKilobytes(j10);
        return this;
    }
}
