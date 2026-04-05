package e6;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f53784b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Method f53785c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f53786d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f53787e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f53788f;

    /* renamed from: a, reason: collision with root package name */
    public float[] f53789a;

    public float getTransitionAlpha(View view) {
        if (f53784b) {
            try {
                return c1.a(view);
            } catch (NoSuchMethodError unused) {
                f53784b = false;
            }
        }
        return view.getAlpha();
    }

    public void setAnimationMatrix(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f53789a;
        if (fArr == null) {
            fArr = new float[9];
            this.f53789a = fArr;
        }
        matrix.getValues(fArr);
        float f10 = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f10, fSqrt));
        float f11 = fArr[0] / fSqrt;
        float f12 = fArr[4] / fSqrt;
        float f13 = fArr[2];
        float f14 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f13);
        view.setTranslationY(f14);
        view.setRotation(degrees);
        view.setScaleX(f11);
        view.setScaleY(f12);
    }

    public void setLeftTopRightBottom(View view, int i10, int i11, int i12, int i13) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!f53786d) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f53785c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e10);
            }
            f53786d = true;
        }
        Method method = f53785c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void setTransitionAlpha(View view, float f10) {
        if (f53784b) {
            try {
                c1.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f53784b = false;
            }
        }
        view.setAlpha(f10);
    }

    public void setTransitionVisibility(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f53788f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f53787e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f53788f = true;
        }
        Field field = f53787e;
        if (field != null) {
            try {
                f53787e.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void transformMatrixToGlobal(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToGlobal((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void transformMatrixToLocal(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToLocal((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void clearNonTransitionAlpha(View view) {
    }

    public void saveNonTransitionAlpha(View view) {
    }
}
