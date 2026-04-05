package gn;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import gn.b;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r1 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f58103h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f58104i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f58105j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f58106k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f58107l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: a, reason: collision with root package name */
    public Object f58108a;

    /* renamed from: b, reason: collision with root package name */
    public Object f58109b;

    /* renamed from: c, reason: collision with root package name */
    public int f58110c;

    /* renamed from: d, reason: collision with root package name */
    public long f58111d;

    /* renamed from: e, reason: collision with root package name */
    public long f58112e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58113f;

    /* renamed from: g, reason: collision with root package name */
    public b f58114g = b.f57772g;

    public static r1 fromBundle(Bundle bundle) {
        int i10 = bundle.getInt(f58103h, 0);
        long j10 = bundle.getLong(f58104i, C.TIME_UNSET);
        long j11 = bundle.getLong(f58105j, 0L);
        boolean z10 = bundle.getBoolean(f58106k, false);
        Bundle bundle2 = bundle.getBundle(f58107l);
        b bVarFromBundle = bundle2 != null ? b.fromBundle(bundle2) : b.f57772g;
        r1 r1Var = new r1();
        r1Var.set(null, null, i10, j10, j11, bVarFromBundle, z10);
        return r1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class.equals(obj.getClass())) {
            r1 r1Var = (r1) obj;
            if (Objects.equals(this.f58108a, r1Var.f58108a) && Objects.equals(this.f58109b, r1Var.f58109b) && this.f58110c == r1Var.f58110c && this.f58111d == r1Var.f58111d && this.f58112e == r1Var.f58112e && this.f58113f == r1Var.f58113f && Objects.equals(this.f58114g, r1Var.f58114g)) {
                return true;
            }
        }
        return false;
    }

    public int getAdCountInAdGroup(int i10) {
        return this.f58114g.getAdGroup(i10).f57796b;
    }

    public long getAdDurationUs(int i10, int i11) {
        b.a adGroup = this.f58114g.getAdGroup(i10);
        return adGroup.f57796b != -1 ? adGroup.f57801g[i11] : C.TIME_UNSET;
    }

    public int getAdGroupCount() {
        return this.f58114g.f57779b;
    }

    public int getAdGroupIndexAfterPositionUs(long j10) {
        return this.f58114g.getAdGroupIndexAfterPositionUs(j10, this.f58111d);
    }

    public int getAdGroupIndexForPositionUs(long j10) {
        return this.f58114g.getAdGroupIndexForPositionUs(j10, this.f58111d);
    }

    public long getAdGroupTimeUs(int i10) {
        return this.f58114g.getAdGroup(i10).f57795a;
    }

    public long getAdResumePositionUs() {
        return this.f58114g.f57780c;
    }

    public int getAdState(int i10, int i11) {
        b.a adGroup = this.f58114g.getAdGroup(i10);
        if (adGroup.f57796b != -1) {
            return adGroup.f57800f[i11];
        }
        return 0;
    }

    public Object getAdsId() {
        return this.f58114g.f57778a;
    }

    public long getContentResumeOffsetUs(int i10) {
        return this.f58114g.getAdGroup(i10).f57803i;
    }

    public long getDurationMs() {
        return io.bidmachine.media3.common.util.a1.usToMs(this.f58111d);
    }

    public long getDurationUs() {
        return this.f58111d;
    }

    public int getFirstAdIndexToPlay(int i10) {
        return this.f58114g.getAdGroup(i10).getFirstAdIndexToPlay();
    }

    public int getNextAdIndexToPlay(int i10, int i11) {
        return this.f58114g.getAdGroup(i10).getNextAdIndexToPlay(i11);
    }

    public long getPositionInWindowMs() {
        return io.bidmachine.media3.common.util.a1.usToMs(this.f58112e);
    }

    public long getPositionInWindowUs() {
        return this.f58112e;
    }

    public int getRemovedAdGroupCount() {
        return this.f58114g.f57782e;
    }

    public boolean hasPlayedAdGroup(int i10) {
        return !this.f58114g.getAdGroup(i10).hasUnplayedAds();
    }

    public int hashCode() {
        Object obj = this.f58108a;
        int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f58109b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f58110c) * 31;
        long j10 = this.f58111d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f58112e;
        return this.f58114g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f58113f ? 1 : 0)) * 31);
    }

    public boolean isLivePostrollPlaceholder(int i10) {
        return i10 == getAdGroupCount() - 1 && this.f58114g.isLivePostrollPlaceholder(i10);
    }

    public boolean isServerSideInsertedAdGroup(int i10) {
        return this.f58114g.getAdGroup(i10).f57804j;
    }

    public r1 set(Object obj, Object obj2, int i10, long j10, long j11) {
        return set(obj, obj2, i10, j10, j11, b.f57772g, false);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f58110c;
        if (i10 != 0) {
            bundle.putInt(f58103h, i10);
        }
        long j10 = this.f58111d;
        if (j10 != C.TIME_UNSET) {
            bundle.putLong(f58104i, j10);
        }
        long j11 = this.f58112e;
        if (j11 != 0) {
            bundle.putLong(f58105j, j11);
        }
        boolean z10 = this.f58113f;
        if (z10) {
            bundle.putBoolean(f58106k, z10);
        }
        if (!this.f58114g.equals(b.f57772g)) {
            bundle.putBundle(f58107l, this.f58114g.toBundle());
        }
        return bundle;
    }

    public r1 set(Object obj, Object obj2, int i10, long j10, long j11, b bVar, boolean z10) {
        this.f58108a = obj;
        this.f58109b = obj2;
        this.f58110c = i10;
        this.f58111d = j10;
        this.f58112e = j11;
        this.f58114g = bVar;
        this.f58113f = z10;
        return this;
    }
}
