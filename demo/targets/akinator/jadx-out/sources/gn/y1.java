package gn;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y1 {

    /* renamed from: d, reason: collision with root package name */
    public static final y1 f58254d = new x1().build();

    /* renamed from: e, reason: collision with root package name */
    public static final String f58255e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f58256f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: g, reason: collision with root package name */
    public static final String f58257g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f58258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58260c;

    public y1(x1 x1Var) {
        this.f58258a = x1Var.f58248a;
        this.f58259b = x1Var.f58249b;
        this.f58260c = x1Var.f58250c;
    }

    public static y1 fromBundle(Bundle bundle) {
        x1 x1Var = new x1();
        y1 y1Var = f58254d;
        return x1Var.setAudioOffloadMode(bundle.getInt(f58255e, y1Var.f58258a)).setIsGaplessSupportRequired(bundle.getBoolean(f58256f, y1Var.f58259b)).setIsSpeedChangeSupportRequired(bundle.getBoolean(f58257g, y1Var.f58260c)).build();
    }

    public x1 buildUpon() {
        return new x1().setAudioOffloadMode(this.f58258a).setIsGaplessSupportRequired(this.f58259b).setIsSpeedChangeSupportRequired(this.f58260c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y1.class == obj.getClass()) {
            y1 y1Var = (y1) obj;
            if (this.f58258a == y1Var.f58258a && this.f58259b == y1Var.f58259b && this.f58260c == y1Var.f58260c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f58258a + 31) * 31) + (this.f58259b ? 1 : 0)) * 31) + (this.f58260c ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f58255e, this.f58258a);
        bundle.putBoolean(f58256f, this.f58259b);
        bundle.putBoolean(f58257g, this.f58260c);
        return bundle;
    }
}
