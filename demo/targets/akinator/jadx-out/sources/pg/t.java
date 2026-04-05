package pg;

import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class t extends vf.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f81250d;

    public t(y yVar) {
        this.f81250d = yVar;
    }

    @Override // vf.g, android.animation.TypeEvaluator
    public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
        this.f81250d.f81267p = f10;
        return super.evaluate(f10, matrix, matrix2);
    }
}
