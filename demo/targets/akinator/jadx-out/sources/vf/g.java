package vf;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class g implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f89249a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f89250b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f89251c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
        float[] fArr = this.f89249a;
        matrix.getValues(fArr);
        float[] fArr2 = this.f89250b;
        matrix2.getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr2[i10] = o2.a(f11, f12, f10, f12);
        }
        Matrix matrix3 = this.f89251c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
