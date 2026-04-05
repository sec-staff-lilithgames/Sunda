package qg;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a0 implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f83109a;

    public a0(Rect rect) {
        this.f83109a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i10 = rect.left + ((int) ((rect2.left - r0) * f10));
        int i11 = rect.top + ((int) ((rect2.top - r1) * f10));
        int i12 = rect.right + ((int) ((rect2.right - r2) * f10));
        int i13 = rect.bottom + ((int) ((rect2.bottom - r6) * f10));
        Rect rect3 = this.f83109a;
        rect3.set(i10, i11, i12, i13);
        return rect3;
    }
}
