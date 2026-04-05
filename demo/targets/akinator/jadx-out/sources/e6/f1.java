package e6;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f1 extends d1 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f53801g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f53802h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f53803i = true;

    @Override // e6.d1
    public void setAnimationMatrix(View view, Matrix matrix) {
        if (f53801g) {
            try {
                e1.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f53801g = false;
            }
        }
    }

    @Override // e6.d1
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        if (f53802h) {
            try {
                e1.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f53802h = false;
            }
        }
    }

    @Override // e6.d1
    public void transformMatrixToLocal(View view, Matrix matrix) {
        if (f53803i) {
            try {
                e1.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f53803i = false;
            }
        }
    }
}
