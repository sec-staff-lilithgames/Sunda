package e6;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 extends j1 {
    @Override // e6.d1
    public float getTransitionAlpha(View view) {
        return view.getTransitionAlpha();
    }

    @Override // e6.f1, e6.d1
    public void setAnimationMatrix(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // e6.h1, e6.d1
    public void setLeftTopRightBottom(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // e6.d1
    public void setTransitionAlpha(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // e6.j1, e6.d1
    public void setTransitionVisibility(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // e6.f1, e6.d1
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // e6.f1, e6.d1
    public void transformMatrixToLocal(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
