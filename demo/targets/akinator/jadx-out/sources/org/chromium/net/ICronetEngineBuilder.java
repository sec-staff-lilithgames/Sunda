package org.chromium.net;

import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z10, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i10, int i11);

    public abstract ExperimentalCronetEngine build();

    public abstract ICronetEngineBuilder enableHttp2(boolean z10);

    public abstract ICronetEngineBuilder enableHttpCache(int i10, long j10);

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z10);

    public abstract ICronetEngineBuilder enableQuic(boolean z10);

    public abstract ICronetEngineBuilder enableSdch(boolean z10);

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public abstract ICronetEngineBuilder setUserAgent(String str);

    public ICronetEngineBuilder enableBrotli(boolean z10) {
        return this;
    }

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z10) {
        return this;
    }

    public ICronetEngineBuilder setThreadPriority(int i10) {
        return this;
    }
}
