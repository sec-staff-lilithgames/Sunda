package e8;

import android.graphics.Matrix;
import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l {
    public static void apply3DRotations(Matrix matrix, float f10, float f11, float f12, float f13, float f14) {
        if (f12 != 0.0f) {
            matrix.preRotate(f12);
        }
        if (f11 != 0.0f) {
            matrix.preScale(f14, 1.0f);
        }
        if (f10 != 0.0f) {
            matrix.preScale(1.0f, f13);
        }
    }

    public static void applyTransform(Matrix matrix, PointF pointF, PointF pointF2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        matrix.reset();
        if (pointF2 != null) {
            float f17 = pointF2.x;
            if (f17 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f17, pointF2.y);
            }
        }
        if (f14 != 0.0f) {
            matrix.preRotate(f14);
        }
        if (f13 != 0.0f) {
            matrix.preScale(f16, 1.0f);
        }
        if (f12 != 0.0f) {
            matrix.preScale(1.0f, f15);
        }
        if (f10 != 1.0f || f11 != 1.0f) {
            matrix.preScale(f10, f11);
        }
        if (pointF != null) {
            float f18 = pointF.x;
            if (f18 == 0.0f && pointF.y == 0.0f) {
                return;
            }
            matrix.preTranslate(-f18, -pointF.y);
        }
    }

    public static boolean has3DRotation(Float f10, Float f11, Float f12) {
        if (f10 != null && f10.floatValue() != 0.0f) {
            return true;
        }
        if (f11 == null || f11.floatValue() == 0.0f) {
            return (f12 == null || f12.floatValue() == 0.0f) ? false : true;
        }
        return true;
    }
}
