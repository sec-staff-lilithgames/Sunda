package a2;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3457a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3458b = j1.e1.m4732constructorimpl$default(null, 1, null);

    public final void a(float[] fArr, float f10, float f11) {
        float[] fArr2 = this.f3458b;
        j1.e1.m4741resetimpl(fArr2);
        j1.e1.m4752translateimpl$default(this.f3458b, f10, f11, 0.0f, 4, null);
        v0.m61access$preTransformJiSxe2E(fArr, fArr2);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            b((View) parent, fArr);
            a(fArr, -view.getScrollX(), -view.getScrollY());
            a(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f3457a);
            a(fArr, -view.getScrollX(), -view.getScrollY());
            a(fArr, r0[0], r0[1]);
        }
        Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity()) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
        float[] fArr2 = this.f3458b;
        j1.h.m4760setFromtUYjHk(fArr2, viewMatrix);
        v0.m61access$preTransformJiSxe2E(fArr, fArr2);
    }

    @Override // a2.a2
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo2calculateMatrixToWindowEL8BTi8(View view, float[] matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        j1.e1.m4741resetimpl(matrix);
        b(view, matrix);
    }
}
