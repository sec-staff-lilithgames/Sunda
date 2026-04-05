package com.unity3d.ads.gatewayclient;

import a.b;
import androidx.core.app.NotificationCompat;
import b0.e2;
import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i10, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16, boolean z10) {
        this.maxDuration = i10;
        this.retryMaxInterval = i11;
        this.retryWaitBase = i12;
        this.retryJitterPct = f10;
        this.retryScalingFactor = f11;
        this.connectTimeout = i13;
        this.readTimeout = i14;
        this.writeTimeout = i15;
        this.overallTimeout = i16;
        this.shouldStoreLocally = z10;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i10, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16, boolean z10, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = requestPolicy.maxDuration;
        }
        if ((i17 & 2) != 0) {
            i11 = requestPolicy.retryMaxInterval;
        }
        if ((i17 & 4) != 0) {
            i12 = requestPolicy.retryWaitBase;
        }
        if ((i17 & 8) != 0) {
            f10 = requestPolicy.retryJitterPct;
        }
        if ((i17 & 16) != 0) {
            f11 = requestPolicy.retryScalingFactor;
        }
        if ((i17 & 32) != 0) {
            i13 = requestPolicy.connectTimeout;
        }
        if ((i17 & 64) != 0) {
            i14 = requestPolicy.readTimeout;
        }
        if ((i17 & 128) != 0) {
            i15 = requestPolicy.writeTimeout;
        }
        if ((i17 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i16 = requestPolicy.overallTimeout;
        }
        if ((i17 & 512) != 0) {
            z10 = requestPolicy.shouldStoreLocally;
        }
        int i18 = i16;
        boolean z11 = z10;
        int i19 = i14;
        int i20 = i15;
        float f12 = f11;
        int i21 = i13;
        return requestPolicy.copy(i10, i11, i12, f10, f12, i21, i19, i20, i18, z11);
    }

    public final int component1() {
        return this.maxDuration;
    }

    public final boolean component10() {
        return this.shouldStoreLocally;
    }

    public final int component2() {
        return this.retryMaxInterval;
    }

    public final int component3() {
        return this.retryWaitBase;
    }

    public final float component4() {
        return this.retryJitterPct;
    }

    public final float component5() {
        return this.retryScalingFactor;
    }

    public final int component6() {
        return this.connectTimeout;
    }

    public final int component7() {
        return this.readTimeout;
    }

    public final int component8() {
        return this.writeTimeout;
    }

    public final int component9() {
        return this.overallTimeout;
    }

    public final RequestPolicy copy(int i10, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16, boolean z10) {
        return new RequestPolicy(i10, i11, i12, f10, f11, i13, i14, i15, i16, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) obj;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD = g.d(this.overallTimeout, g.d(this.writeTimeout, g.d(this.readTimeout, g.d(this.connectTimeout, e2.b(this.retryScalingFactor, e2.b(this.retryJitterPct, g.d(this.retryWaitBase, g.d(this.retryMaxInterval, Integer.hashCode(this.maxDuration) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        boolean z10 = this.shouldStoreLocally;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iD + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestPolicy(maxDuration=");
        sb2.append(this.maxDuration);
        sb2.append(", retryMaxInterval=");
        sb2.append(this.retryMaxInterval);
        sb2.append(", retryWaitBase=");
        sb2.append(this.retryWaitBase);
        sb2.append(", retryJitterPct=");
        sb2.append(this.retryJitterPct);
        sb2.append(", retryScalingFactor=");
        sb2.append(this.retryScalingFactor);
        sb2.append(", connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", writeTimeout=");
        sb2.append(this.writeTimeout);
        sb2.append(", overallTimeout=");
        sb2.append(this.overallTimeout);
        sb2.append(", shouldStoreLocally=");
        return b.p(sb2, this.shouldStoreLocally, ')');
    }
}
