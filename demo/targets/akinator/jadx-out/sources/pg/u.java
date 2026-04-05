package pg;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final FloatEvaluator f81251a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Float f11, Float f12) {
        float fFloatValue = this.f81251a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
