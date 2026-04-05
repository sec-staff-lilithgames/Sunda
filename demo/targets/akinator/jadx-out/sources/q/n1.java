package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f82179a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f82180b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f82181c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f82182d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f82179a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f82180b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f82181c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f82182d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
