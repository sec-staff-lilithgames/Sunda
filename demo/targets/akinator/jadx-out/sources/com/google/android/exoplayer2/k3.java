package com.google.android.exoplayer2;

import android.os.Bundle;
import cf.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k3 implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final String f27591j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f27592k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f27593l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27594m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f27595n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: b, reason: collision with root package name */
    public Object f27596b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27597c;

    /* renamed from: e, reason: collision with root package name */
    public int f27598e;

    /* renamed from: f, reason: collision with root package name */
    public long f27599f;

    /* renamed from: g, reason: collision with root package name */
    public long f27600g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27601h;

    /* renamed from: i, reason: collision with root package name */
    public cf.b f27602i = cf.b.f12271i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k3.class.equals(obj.getClass())) {
            k3 k3Var = (k3) obj;
            if (com.google.android.exoplayer2.util.n1.areEqual(this.f27596b, k3Var.f27596b) && com.google.android.exoplayer2.util.n1.areEqual(this.f27597c, k3Var.f27597c) && this.f27598e == k3Var.f27598e && this.f27599f == k3Var.f27599f && this.f27600g == k3Var.f27600g && this.f27601h == k3Var.f27601h && com.google.android.exoplayer2.util.n1.areEqual(this.f27602i, k3Var.f27602i)) {
                return true;
            }
        }
        return false;
    }

    public int getAdCountInAdGroup(int i10) {
        return this.f27602i.getAdGroup(i10).f12294c;
    }

    public long getAdDurationUs(int i10, int i11) {
        b.a adGroup = this.f27602i.getAdGroup(i10);
        return adGroup.f12294c != -1 ? adGroup.f12298h[i11] : C.TIME_UNSET;
    }

    public int getAdGroupCount() {
        return this.f27602i.f12279c;
    }

    public int getAdGroupIndexAfterPositionUs(long j10) {
        return this.f27602i.getAdGroupIndexAfterPositionUs(j10, this.f27599f);
    }

    public int getAdGroupIndexForPositionUs(long j10) {
        return this.f27602i.getAdGroupIndexForPositionUs(j10, this.f27599f);
    }

    public long getAdGroupTimeUs(int i10) {
        return this.f27602i.getAdGroup(i10).f12293b;
    }

    public long getAdResumePositionUs() {
        return this.f27602i.f12280e;
    }

    public int getAdState(int i10, int i11) {
        b.a adGroup = this.f27602i.getAdGroup(i10);
        if (adGroup.f12294c != -1) {
            return adGroup.f12297g[i11];
        }
        return 0;
    }

    public Object getAdsId() {
        return this.f27602i.f12278b;
    }

    public long getContentResumeOffsetUs(int i10) {
        return this.f27602i.getAdGroup(i10).f12299i;
    }

    public long getDurationMs() {
        return com.google.android.exoplayer2.util.n1.usToMs(this.f27599f);
    }

    public long getDurationUs() {
        return this.f27599f;
    }

    public int getFirstAdIndexToPlay(int i10) {
        return this.f27602i.getAdGroup(i10).getFirstAdIndexToPlay();
    }

    public int getNextAdIndexToPlay(int i10, int i11) {
        return this.f27602i.getAdGroup(i10).getNextAdIndexToPlay(i11);
    }

    public long getPositionInWindowMs() {
        return com.google.android.exoplayer2.util.n1.usToMs(this.f27600g);
    }

    public long getPositionInWindowUs() {
        return this.f27600g;
    }

    public int getRemovedAdGroupCount() {
        return this.f27602i.f12282g;
    }

    public boolean hasPlayedAdGroup(int i10) {
        return !this.f27602i.getAdGroup(i10).hasUnplayedAds();
    }

    public int hashCode() {
        Object obj = this.f27596b;
        int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f27597c;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f27598e) * 31;
        long j10 = this.f27599f;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f27600g;
        return this.f27602i.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f27601h ? 1 : 0)) * 31);
    }

    public boolean isLivePostrollPlaceholder(int i10) {
        return i10 == getAdGroupCount() - 1 && this.f27602i.isLivePostrollPlaceholder(i10);
    }

    public boolean isServerSideInsertedAdGroup(int i10) {
        return this.f27602i.getAdGroup(i10).f12300j;
    }

    public k3 set(Object obj, Object obj2, int i10, long j10, long j11) {
        return set(obj, obj2, i10, j10, j11, cf.b.f12271i, false);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f27598e;
        if (i10 != 0) {
            bundle.putInt(f27591j, i10);
        }
        long j10 = this.f27599f;
        if (j10 != C.TIME_UNSET) {
            bundle.putLong(f27592k, j10);
        }
        long j11 = this.f27600g;
        if (j11 != 0) {
            bundle.putLong(f27593l, j11);
        }
        boolean z10 = this.f27601h;
        if (z10) {
            bundle.putBoolean(f27594m, z10);
        }
        if (!this.f27602i.equals(cf.b.f12271i)) {
            bundle.putBundle(f27595n, this.f27602i.toBundle());
        }
        return bundle;
    }

    public k3 set(Object obj, Object obj2, int i10, long j10, long j11, cf.b bVar, boolean z10) {
        this.f27596b = obj;
        this.f27597c = obj2;
        this.f27598e = i10;
        this.f27599f = j10;
        this.f27600g = j11;
        this.f27602i = bVar;
        this.f27601h = z10;
        return this;
    }
}
