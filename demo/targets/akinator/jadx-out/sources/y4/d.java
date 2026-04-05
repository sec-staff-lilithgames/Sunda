package y4;

import android.view.animation.Interpolator;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f94069a;

    /* renamed from: b, reason: collision with root package name */
    public final float f94070b;

    public d(float[] fArr) {
        this.f94069a = fArr;
        this.f94070b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f94069a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f94070b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float f13 = fArr[iMin];
        return o2.a(fArr[iMin + 1], f13, f12, f13);
    }
}
