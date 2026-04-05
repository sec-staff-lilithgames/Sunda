package a2;

import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.p f3437a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f3438b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f3439c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3440d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3441e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3442f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3443g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3444h;

    public a4(kv.p getMatrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(getMatrix, "getMatrix");
        this.f3437a = getMatrix;
        this.f3442f = true;
        this.f3443g = true;
        this.f3444h = true;
    }

    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m3calculateInverseMatrixbWbORWo(Object obj) {
        float[] fArrM4732constructorimpl$default = this.f3441e;
        if (fArrM4732constructorimpl$default == null) {
            fArrM4732constructorimpl$default = j1.e1.m4732constructorimpl$default(null, 1, null);
            this.f3441e = fArrM4732constructorimpl$default;
        }
        if (this.f3443g) {
            this.f3444h = y3.m63invertToJiSxe2E(m4calculateMatrixGrdbGEg(obj), fArrM4732constructorimpl$default);
            this.f3443g = false;
        }
        if (this.f3444h) {
            return fArrM4732constructorimpl$default;
        }
        return null;
    }

    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m4calculateMatrixGrdbGEg(Object obj) {
        float[] fArrM4732constructorimpl$default = this.f3440d;
        if (fArrM4732constructorimpl$default == null) {
            fArrM4732constructorimpl$default = j1.e1.m4732constructorimpl$default(null, 1, null);
            this.f3440d = fArrM4732constructorimpl$default;
        }
        if (!this.f3442f) {
            return fArrM4732constructorimpl$default;
        }
        Matrix matrix = this.f3438b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f3438b = matrix;
        }
        this.f3437a.invoke(obj, matrix);
        Matrix matrix2 = this.f3439c;
        if (matrix2 == null || !kotlin.jvm.internal.e0.areEqual(matrix, matrix2)) {
            j1.h.m4760setFromtUYjHk(fArrM4732constructorimpl$default, matrix);
            this.f3438b = matrix2;
            this.f3439c = matrix;
        }
        this.f3442f = false;
        return fArrM4732constructorimpl$default;
    }

    public final void invalidate() {
        this.f3442f = true;
        this.f3443g = true;
    }
}
