package e6;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        return new Rect(rect.left + ((int) ((rect2.left - r0) * f10)), rect.top + ((int) ((rect2.top - r1) * f10)), rect.right + ((int) ((rect2.right - r2) * f10)), rect.bottom + ((int) ((rect2.bottom - r6) * f10)));
    }
}
