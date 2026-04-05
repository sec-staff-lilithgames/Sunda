package xr;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class gb implements y6 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f92563b = Logger.getLogger(gb.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f92564c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f92565d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f92566e;

    /* renamed from: f, reason: collision with root package name */
    public static final RuntimeException f92567f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f92568g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f92569a;

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    static {
        /*
            java.lang.Class<xr.gb> r0 = xr.gb.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            xr.gb.f92563b = r0
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "add"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L42
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "sum"
            java.lang.reflect.Method r3 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch: java.lang.Throwable -> L3a
            int r4 = r1.length     // Catch: java.lang.Throwable -> L3a
            r5 = 0
        L2b:
            if (r5 >= r4) goto L3c
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L3a
            int r7 = r7.length     // Catch: java.lang.Throwable -> L3a
            if (r7 != 0) goto L37
            goto L3d
        L37:
            int r5 = r5 + 1
            goto L2b
        L3a:
            r1 = move-exception
            goto L45
        L3c:
            r6 = r0
        L3d:
            r1 = r0
            goto L4f
        L3f:
            r1 = move-exception
            r3 = r0
            goto L45
        L42:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L45:
            java.util.logging.Logger r4 = xr.gb.f92563b
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r4.log(r5, r6, r1)
            r6 = r0
        L4f:
            if (r1 != 0) goto L5c
            if (r6 == 0) goto L5c
            xr.gb.f92564c = r6
            xr.gb.f92565d = r2
            xr.gb.f92566e = r3
            xr.gb.f92567f = r0
            goto L69
        L5c:
            xr.gb.f92564c = r0
            xr.gb.f92565d = r0
            xr.gb.f92566e = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            xr.gb.f92567f = r0
        L69:
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            xr.gb.f92568g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.gb.<clinit>():void");
    }

    public gb() {
        RuntimeException runtimeException = f92567f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f92569a = f92564c.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // xr.y6
    public void add(long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            f92565d.invoke(this.f92569a, j10 == 1 ? f92568g : new Object[]{Long.valueOf(j10)});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // xr.y6
    public long value() {
        try {
            return ((Long) f92566e.invoke(this.f92569a, null)).longValue();
        } catch (IllegalAccessException unused) {
            throw new RuntimeException();
        } catch (InvocationTargetException unused2) {
            throw new RuntimeException();
        }
    }
}
