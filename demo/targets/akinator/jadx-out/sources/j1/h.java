package j1;

import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    /* renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m4759setFromEL8BTi8(Matrix setFrom, float[] matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setFrom, "$this$setFrom");
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        float f10 = matrix[2];
        if (f10 == 0.0f) {
            float f11 = matrix[6];
            if (f11 == 0.0f && matrix[10] == 1.0f && matrix[14] == 0.0f) {
                float f12 = matrix[8];
                if (f12 == 0.0f && matrix[9] == 0.0f && matrix[11] == 0.0f) {
                    float f13 = matrix[0];
                    float f14 = matrix[1];
                    float f15 = matrix[3];
                    float f16 = matrix[4];
                    float f17 = matrix[5];
                    float f18 = matrix[7];
                    float f19 = matrix[12];
                    float f20 = matrix[13];
                    float f21 = matrix[15];
                    matrix[0] = f13;
                    matrix[1] = f16;
                    matrix[2] = f19;
                    matrix[3] = f14;
                    matrix[4] = f17;
                    matrix[5] = f20;
                    matrix[6] = f15;
                    matrix[7] = f18;
                    matrix[8] = f21;
                    setFrom.setValues(matrix);
                    matrix[0] = f13;
                    matrix[1] = f14;
                    matrix[2] = f10;
                    matrix[3] = f15;
                    matrix[4] = f16;
                    matrix[5] = f17;
                    matrix[6] = f11;
                    matrix[7] = f18;
                    matrix[8] = f12;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms");
    }

    /* renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m4760setFromtUYjHk(float[] setFrom, Matrix matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setFrom, "$this$setFrom");
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(setFrom);
        float f10 = setFrom[0];
        float f11 = setFrom[1];
        float f12 = setFrom[2];
        float f13 = setFrom[3];
        float f14 = setFrom[4];
        float f15 = setFrom[5];
        float f16 = setFrom[6];
        float f17 = setFrom[7];
        float f18 = setFrom[8];
        setFrom[0] = f10;
        setFrom[1] = f13;
        setFrom[2] = 0.0f;
        setFrom[3] = f16;
        setFrom[4] = f11;
        setFrom[5] = f14;
        setFrom[6] = 0.0f;
        setFrom[7] = f17;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f12;
        setFrom[13] = f15;
        setFrom[14] = 0.0f;
        setFrom[15] = f18;
    }
}
