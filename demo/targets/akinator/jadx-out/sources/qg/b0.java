package qg;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b0 implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f83110a;

    public b0(TimeInterpolator timeInterpolator) {
        this.f83110a = timeInterpolator;
    }

    public static TimeInterpolator of(boolean z10, TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new b0(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f83110a.getInterpolation(f10);
    }
}
