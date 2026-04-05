package a2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3468a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3469b = new int[2];

    @Override // a2.a2
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo2calculateMatrixToWindowEL8BTi8(View view, float[] matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        Matrix matrix2 = this.f3468a;
        matrix2.reset();
        view.transformMatrixToGlobal(matrix2);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f3469b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i10, iArr[1] - i11);
        j1.h.m4760setFromtUYjHk(matrix, matrix2);
    }
}
