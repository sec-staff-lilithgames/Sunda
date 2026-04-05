package rw;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: rw.a$a, reason: collision with other inner class name */
    public static class C0779a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final Object f85130a;

        public C0779a(Object obj) {
            this.f85130a = obj;
        }

        public Object getDelegate() {
            return this.f85130a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = this.f85130a;
            try {
                return a.dupeMethod(method, obj2.getClass().getClassLoader()).invoke(obj2, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    public static <T> T castToSuppLibClass(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean containsFeature(Collection<String> collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return collection.contains(sb2.toString());
    }

    public static InvocationHandler createInvocationHandlerFor(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0779a(obj);
    }

    public static InvocationHandler[] createInvocationHandlersForArray(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[length];
        for (int i10 = 0; i10 < length; i10++) {
            invocationHandlerArr[i10] = createInvocationHandlerFor(objArr[i10]);
        }
        return invocationHandlerArr;
    }

    public static Method dupeMethod(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static Object getDelegateFromInvocationHandler(InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C0779a) invocationHandler).getDelegate();
    }

    public static boolean instanceOfInOwnClassLoader(Object obj, String str) {
        try {
            return Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean containsFeature(String[] strArr, String str) {
        return containsFeature(Arrays.asList(strArr), str);
    }
}
