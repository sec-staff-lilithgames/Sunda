package j1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f68870a = new h0();

    /* renamed from: b, reason: collision with root package name */
    public static Method f68871b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f68872c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f68873d;

    public final void enableZ(Canvas canvas, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            i0.f68881a.enableZ(canvas, z10);
            return;
        }
        if (!f68873d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f68871b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f68872c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f68871b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f68872c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f68871b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f68872c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f68873d = true;
        }
        if (z10) {
            try {
                Method method4 = f68871b;
                if (method4 != null) {
                    kotlin.jvm.internal.e0.checkNotNull(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f68872c) == null) {
            return;
        }
        kotlin.jvm.internal.e0.checkNotNull(method);
        method.invoke(canvas, null);
    }
}
