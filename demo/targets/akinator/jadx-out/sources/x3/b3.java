package x3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f91545a;

    /* renamed from: b, reason: collision with root package name */
    public float f91546b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f91547c;

    /* renamed from: d, reason: collision with root package name */
    public final long f91548d;

    /* renamed from: e, reason: collision with root package name */
    public float f91549e = 1.0f;

    public b3(int i10, Interpolator interpolator, long j10) {
        this.f91545a = i10;
        this.f91547c = interpolator;
        this.f91548d = j10;
    }

    public float getAlpha() {
        return this.f91549e;
    }

    public long getDurationMillis() {
        return this.f91548d;
    }

    public float getFraction() {
        return this.f91546b;
    }

    public float getInterpolatedFraction() {
        Interpolator interpolator = this.f91547c;
        return interpolator != null ? interpolator.getInterpolation(this.f91546b) : this.f91546b;
    }

    public Interpolator getInterpolator() {
        return this.f91547c;
    }

    public int getTypeMask() {
        return this.f91545a;
    }

    public void setAlpha(float f10) {
        this.f91549e = f10;
    }

    public void setFraction(float f10) {
        this.f91546b = f10;
    }
}
