package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f6578a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6579b = new HashMap();

    public static void a(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.e0.checkNotNull(objNewInstance);
            if (objNewInstance == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g1.b(java.lang.Class):int");
    }

    public static final String getAdapterName(String className) {
        kotlin.jvm.internal.e0.checkNotNullParameter(className, "className");
        return j1.o2.o(new StringBuilder(), sv.k0.replace$default(className, ".", "_", false, 4, (Object) null), "_LifecycleAdapter");
    }

    public static final v0 lifecycleEventObserver(Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.e0.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof v0;
        boolean z11 = object instanceof r;
        if (z10 && z11) {
            return new t((r) object, (v0) object);
        }
        if (z11) {
            return new t((r) object, null);
        }
        if (z10) {
            return (v0) object;
        }
        Class<?> cls = object.getClass();
        if (b(cls) != 2) {
            return new d2(object);
        }
        Object obj = f6579b.get(cls);
        kotlin.jvm.internal.e0.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            a((Constructor) list.get(0), object);
            return new a3(null);
        }
        int size = list.size();
        z[] zVarArr = new z[size];
        for (int i10 = 0; i10 < size; i10++) {
            a((Constructor) list.get(i10), object);
            zVarArr[i10] = null;
        }
        return new j(zVarArr);
    }
}
