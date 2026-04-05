package g3;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3.g f57206a;

    public r(a3.g gVar) {
        this.f57206a = gVar;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) this.f57206a.get(f10);
    }
}
