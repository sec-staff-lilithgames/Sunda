package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z.t1 f6452a = new z.t1();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        z.t1 t1Var = f6452a;
        z.t1 t1Var2 = (z.t1) t1Var.get(classLoader);
        if (t1Var2 == null) {
            t1Var2 = new z.t1();
            t1Var.put(classLoader, t1Var2);
        }
        Class cls = (Class) t1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        t1Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> loadFragmentClass(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.a(a.b.l("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.a(a.b.l("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public Fragment instantiate(ClassLoader classLoader, String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new Fragment.a(a.b.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new Fragment.a(a.b.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.a(a.b.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.a(a.b.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
