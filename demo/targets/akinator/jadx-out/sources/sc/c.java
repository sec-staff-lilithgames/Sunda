package sc;

import dd.c0;
import dd.i;
import java.lang.reflect.Method;
import sc.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f85592d;

    /* renamed from: e, reason: collision with root package name */
    public static final RuntimeException f85593e;

    /* renamed from: a, reason: collision with root package name */
    public final Method f85594a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f85595b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f85596c;

    static {
        c cVar = null;
        try {
            e = null;
            cVar = new c();
        } catch (RuntimeException e10) {
            e = e10;
        }
        f85592d = cVar;
        f85593e = e;
    }

    public c() throws ClassNotFoundException {
        try {
            this.f85594a = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f85595b = cls.getMethod("getName", null);
            this.f85596c = cls.getMethod("getType", null);
        } catch (Exception e10) {
            throw new RuntimeException(a.b.m("Failed to access Methods needed to support `java.lang.Record`: (", e10.getClass().getName(), ") ", e10.getMessage()), e10);
        }
    }

    public static c instance() {
        RuntimeException runtimeException = f85593e;
        if (runtimeException == null) {
            return f85592d;
        }
        throw runtimeException;
    }

    public final Object[] a(Class cls) {
        try {
            return (Object[]) this.f85594a.invoke(cls, null);
        } catch (Exception e10) {
            if (c0.isUnsupportedFeatureError(e10)) {
                return null;
            }
            throw new IllegalArgumentException("Failed to access RecordComponents of type " + i.nameOf((Class<?>) cls));
        }
    }

    public String[] getRecordFieldNames(Class<?> cls) throws IllegalArgumentException {
        Object[] objArrA = a(cls);
        if (objArrA == null) {
            return null;
        }
        String[] strArr = new String[objArrA.length];
        for (int i10 = 0; i10 < objArrA.length; i10++) {
            try {
                strArr[i10] = (String) this.f85595b.invoke(objArrA[i10], null);
            } catch (Exception e10) {
                throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(objArrA.length), i.nameOf(cls)), e10);
            }
        }
        return strArr;
    }

    public b.a[] getRecordFields(Class<?> cls) throws IllegalArgumentException {
        Object[] objArrA = a(cls);
        if (objArrA == null) {
            return null;
        }
        b.a[] aVarArr = new b.a[objArrA.length];
        for (int i10 = 0; i10 < objArrA.length; i10++) {
            try {
                try {
                    aVarArr[i10] = new b.a((Class) this.f85596c.invoke(objArrA[i10], null), (String) this.f85595b.invoke(objArrA[i10], null));
                } catch (Exception e10) {
                    throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(objArrA.length), i.nameOf(cls)), e10);
                }
            } catch (Exception e11) {
                throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(objArrA.length), i.nameOf(cls)), e11);
            }
        }
        return aVarArr;
    }
}
