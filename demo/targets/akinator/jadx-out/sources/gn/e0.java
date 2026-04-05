package gn;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final e0 f57857h = new d0().build();

    /* renamed from: i, reason: collision with root package name */
    public static final String f57858i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f57859j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57860k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f57861l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f57862m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: n, reason: collision with root package name */
    public static final String f57863n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: o, reason: collision with root package name */
    public static final String f57864o = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

    /* renamed from: a, reason: collision with root package name */
    public final long f57865a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57866b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57867c;

    /* renamed from: d, reason: collision with root package name */
    public final long f57868d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57869e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f57870f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f57871g;

    public e0(d0 d0Var) {
        this.f57865a = io.bidmachine.media3.common.util.a1.usToMs(d0Var.f57850a);
        this.f57867c = io.bidmachine.media3.common.util.a1.usToMs(d0Var.f57851b);
        this.f57866b = d0Var.f57850a;
        this.f57868d = d0Var.f57851b;
        this.f57869e = d0Var.f57852c;
        this.f57870f = d0Var.f57853d;
        this.f57871g = d0Var.f57854e;
    }

    public static f0 fromBundle(Bundle bundle) {
        d0 d0Var = new d0();
        e0 e0Var = f57857h;
        d0 startsAtKeyFrame = d0Var.setStartPositionMs(bundle.getLong(f57858i, e0Var.f57865a)).setEndPositionMs(bundle.getLong(f57859j, e0Var.f57867c)).setRelativeToLiveWindow(bundle.getBoolean(f57860k, e0Var.f57869e)).setRelativeToDefaultPosition(bundle.getBoolean(f57861l, e0Var.f57870f)).setStartsAtKeyFrame(bundle.getBoolean(f57862m, e0Var.f57871g));
        long j10 = bundle.getLong(f57863n, e0Var.f57866b);
        if (j10 != e0Var.f57866b) {
            startsAtKeyFrame.setStartPositionUs(j10);
        }
        long j11 = bundle.getLong(f57864o, e0Var.f57868d);
        if (j11 != e0Var.f57868d) {
            startsAtKeyFrame.setEndPositionUs(j11);
        }
        return startsAtKeyFrame.buildClippingProperties();
    }

    public d0 buildUpon() {
        d0 d0Var = new d0();
        d0Var.f57850a = this.f57866b;
        d0Var.f57851b = this.f57868d;
        d0Var.f57852c = this.f57869e;
        d0Var.f57853d = this.f57870f;
        d0Var.f57854e = this.f57871g;
        return d0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f57866b == e0Var.f57866b && this.f57868d == e0Var.f57868d && this.f57869e == e0Var.f57869e && this.f57870f == e0Var.f57870f && this.f57871g == e0Var.f57871g;
    }

    public int hashCode() {
        long j10 = this.f57866b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f57868d;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f57869e ? 1 : 0)) * 31) + (this.f57870f ? 1 : 0)) * 31) + (this.f57871g ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        e0 e0Var = f57857h;
        long j10 = e0Var.f57865a;
        long j11 = this.f57865a;
        if (j11 != j10) {
            bundle.putLong(f57858i, j11);
        }
        long j12 = e0Var.f57867c;
        long j13 = this.f57867c;
        if (j13 != j12) {
            bundle.putLong(f57859j, j13);
        }
        long j14 = e0Var.f57866b;
        long j15 = this.f57866b;
        if (j15 != j14) {
            bundle.putLong(f57863n, j15);
        }
        long j16 = e0Var.f57868d;
        long j17 = this.f57868d;
        if (j17 != j16) {
            bundle.putLong(f57864o, j17);
        }
        boolean z10 = e0Var.f57869e;
        boolean z11 = this.f57869e;
        if (z11 != z10) {
            bundle.putBoolean(f57860k, z11);
        }
        boolean z12 = e0Var.f57870f;
        boolean z13 = this.f57870f;
        if (z13 != z12) {
            bundle.putBoolean(f57861l, z13);
        }
        boolean z14 = e0Var.f57871g;
        boolean z15 = this.f57871g;
        if (z15 != z14) {
            bundle.putBoolean(f57862m, z15);
        }
        return bundle;
    }
}
