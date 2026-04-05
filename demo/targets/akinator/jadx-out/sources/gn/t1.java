package gn;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t1 {

    /* renamed from: b, reason: collision with root package name */
    public Object f58176b;

    /* renamed from: d, reason: collision with root package name */
    public Object f58178d;

    /* renamed from: e, reason: collision with root package name */
    public long f58179e;

    /* renamed from: f, reason: collision with root package name */
    public long f58180f;

    /* renamed from: g, reason: collision with root package name */
    public long f58181g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f58182h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f58183i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f58184j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f58185k;

    /* renamed from: l, reason: collision with root package name */
    public long f58186l;

    /* renamed from: m, reason: collision with root package name */
    public long f58187m;

    /* renamed from: n, reason: collision with root package name */
    public int f58188n;

    /* renamed from: o, reason: collision with root package name */
    public int f58189o;

    /* renamed from: p, reason: collision with root package name */
    public long f58190p;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f58165q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f58166r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final p0 f58167s = new c0().setMediaId("io.bidmachine.media3.common.Timeline").setUri(Uri.EMPTY).build();

    /* renamed from: t, reason: collision with root package name */
    public static final String f58168t = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: u, reason: collision with root package name */
    public static final String f58169u = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: v, reason: collision with root package name */
    public static final String f58170v = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: w, reason: collision with root package name */
    public static final String f58171w = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: x, reason: collision with root package name */
    public static final String f58172x = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: y, reason: collision with root package name */
    public static final String f58173y = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

    /* renamed from: z, reason: collision with root package name */
    public static final String f58174z = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(7);
    public static final String A = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(8);
    public static final String B = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(9);
    public static final String C = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(10);
    public static final String D = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(11);
    public static final String E = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(12);
    public static final String F = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(13);

    /* renamed from: a, reason: collision with root package name */
    public Object f58175a = f58165q;

    /* renamed from: c, reason: collision with root package name */
    public p0 f58177c = f58167s;

    public static t1 fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f58168t);
        p0 p0VarFromBundle = bundle2 != null ? p0.fromBundle(bundle2) : p0.f58045g;
        long j10 = bundle.getLong(f58169u, C.TIME_UNSET);
        long j11 = bundle.getLong(f58170v, C.TIME_UNSET);
        long j12 = bundle.getLong(f58171w, C.TIME_UNSET);
        boolean z10 = bundle.getBoolean(f58172x, false);
        boolean z11 = bundle.getBoolean(f58173y, false);
        Bundle bundle3 = bundle.getBundle(f58174z);
        i0 i0VarFromBundle = bundle3 != null ? i0.fromBundle(bundle3) : null;
        boolean z12 = bundle.getBoolean(A, false);
        long j13 = bundle.getLong(B, 0L);
        long j14 = bundle.getLong(C, C.TIME_UNSET);
        int i10 = bundle.getInt(D, 0);
        int i11 = bundle.getInt(E, 0);
        long j15 = bundle.getLong(F, 0L);
        t1 t1Var = new t1();
        t1Var.set(f58166r, p0VarFromBundle, null, j10, j11, j12, z10, z11, i0VarFromBundle, j13, j14, i10, i11, j15);
        t1Var.f58185k = z12;
        return t1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t1.class.equals(obj.getClass())) {
            t1 t1Var = (t1) obj;
            if (Objects.equals(this.f58175a, t1Var.f58175a) && Objects.equals(this.f58177c, t1Var.f58177c) && Objects.equals(this.f58178d, t1Var.f58178d) && Objects.equals(this.f58184j, t1Var.f58184j) && this.f58179e == t1Var.f58179e && this.f58180f == t1Var.f58180f && this.f58181g == t1Var.f58181g && this.f58182h == t1Var.f58182h && this.f58183i == t1Var.f58183i && this.f58185k == t1Var.f58185k && this.f58186l == t1Var.f58186l && this.f58187m == t1Var.f58187m && this.f58188n == t1Var.f58188n && this.f58189o == t1Var.f58189o && this.f58190p == t1Var.f58190p) {
                return true;
            }
        }
        return false;
    }

    public long getCurrentUnixTimeMs() {
        return io.bidmachine.media3.common.util.a1.getNowUnixTimeMs(this.f58181g);
    }

    public long getDefaultPositionMs() {
        return io.bidmachine.media3.common.util.a1.usToMs(this.f58186l);
    }

    public long getDefaultPositionUs() {
        return this.f58186l;
    }

    public long getDurationMs() {
        return io.bidmachine.media3.common.util.a1.usToMs(this.f58187m);
    }

    public long getDurationUs() {
        return this.f58187m;
    }

    public long getPositionInFirstPeriodMs() {
        return io.bidmachine.media3.common.util.a1.usToMs(this.f58190p);
    }

    public long getPositionInFirstPeriodUs() {
        return this.f58190p;
    }

    public int hashCode() {
        int iHashCode = (this.f58177c.hashCode() + ((this.f58175a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.f58178d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        i0 i0Var = this.f58184j;
        int iHashCode3 = (iHashCode2 + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        long j10 = this.f58179e;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f58180f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f58181g;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f58182h ? 1 : 0)) * 31) + (this.f58183i ? 1 : 0)) * 31) + (this.f58185k ? 1 : 0)) * 31;
        long j13 = this.f58186l;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f58187m;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f58188n) * 31) + this.f58189o) * 31;
        long j15 = this.f58190p;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }

    public boolean isLive() {
        return this.f58184j != null;
    }

    public t1 set(Object obj, p0 p0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, i0 i0Var, long j13, long j14, int i10, int i11, long j15) {
        j0 j0Var;
        this.f58175a = obj;
        this.f58177c = p0Var != null ? p0Var : f58167s;
        this.f58176b = (p0Var == null || (j0Var = p0Var.f58053b) == null) ? null : j0Var.f57970h;
        this.f58178d = obj2;
        this.f58179e = j10;
        this.f58180f = j11;
        this.f58181g = j12;
        this.f58182h = z10;
        this.f58183i = z11;
        this.f58184j = i0Var;
        this.f58186l = j13;
        this.f58187m = j14;
        this.f58188n = i10;
        this.f58189o = i11;
        this.f58190p = j15;
        this.f58185k = false;
        return this;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (!p0.f58045g.equals(this.f58177c)) {
            bundle.putBundle(f58168t, this.f58177c.toBundle());
        }
        long j10 = this.f58179e;
        if (j10 != C.TIME_UNSET) {
            bundle.putLong(f58169u, j10);
        }
        long j11 = this.f58180f;
        if (j11 != C.TIME_UNSET) {
            bundle.putLong(f58170v, j11);
        }
        long j12 = this.f58181g;
        if (j12 != C.TIME_UNSET) {
            bundle.putLong(f58171w, j12);
        }
        boolean z10 = this.f58182h;
        if (z10) {
            bundle.putBoolean(f58172x, z10);
        }
        boolean z11 = this.f58183i;
        if (z11) {
            bundle.putBoolean(f58173y, z11);
        }
        i0 i0Var = this.f58184j;
        if (i0Var != null) {
            bundle.putBundle(f58174z, i0Var.toBundle());
        }
        boolean z12 = this.f58185k;
        if (z12) {
            bundle.putBoolean(A, z12);
        }
        long j13 = this.f58186l;
        if (j13 != 0) {
            bundle.putLong(B, j13);
        }
        long j14 = this.f58187m;
        if (j14 != C.TIME_UNSET) {
            bundle.putLong(C, j14);
        }
        int i10 = this.f58188n;
        if (i10 != 0) {
            bundle.putInt(D, i10);
        }
        int i11 = this.f58189o;
        if (i11 != 0) {
            bundle.putInt(E, i11);
        }
        long j15 = this.f58190p;
        if (j15 != 0) {
            bundle.putLong(F, j15);
        }
        return bundle;
    }
}
