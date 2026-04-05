package ok;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends p {

    /* renamed from: i, reason: collision with root package name */
    public final Method f79499i = Class.class.getMethod("isRecord", null);

    /* renamed from: j, reason: collision with root package name */
    public final Method f79500j = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: k, reason: collision with root package name */
    public final Method f79501k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f79502l;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f79501k = cls.getMethod("getName", null);
        this.f79502l = cls.getMethod("getType", null);
    }

    @Override // kc.p
    public final boolean B(Class cls) {
        try {
            return ((Boolean) this.f79499i.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // kc.p
    public Method getAccessor(Class<?> cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // kc.p
    public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        try {
            Object[] objArr = (Object[]) this.f79500j.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f79502l.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override // kc.p
    public final String[] x(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f79500j.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f79501k.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
