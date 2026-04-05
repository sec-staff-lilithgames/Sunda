package f3;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends f0 {

    /* renamed from: k, reason: collision with root package name */
    public boolean f55336k;

    @Override // f3.f0
    public boolean setProperty(View view, float f10, long j10, a3.i iVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h0 h0Var;
        Method method;
        if (view instanceof g3.i0) {
            h0Var = this;
            ((g3.i0) view).setProgress(get(f10, j10, view, iVar));
        } else {
            h0Var = this;
            if (h0Var.f55336k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                h0Var.f55336k = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(h0Var.get(f10, j10, view, iVar)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e11);
                }
            }
        }
        return h0Var.f3952h;
    }
}
