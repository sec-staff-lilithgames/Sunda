package f3;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: h, reason: collision with root package name */
    public boolean f55335h;

    @Override // f3.f
    public void setProperty(View view, float f10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (view instanceof g3.i0) {
            ((g3.i0) view).setProgress(get(f10));
            return;
        }
        if (this.f55335h) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f55335h = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(get(f10)));
            } catch (IllegalAccessException e10) {
                Log.e("ViewOscillator", "unable to setProgress", e10);
            } catch (InvocationTargetException e11) {
                Log.e("ViewOscillator", "unable to setProgress", e11);
            }
        }
    }
}
