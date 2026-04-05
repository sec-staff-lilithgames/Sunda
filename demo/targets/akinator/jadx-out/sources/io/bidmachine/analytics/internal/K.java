package io.bidmachine.analytics.internal;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private Object f59910a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59912c;

    /* renamed from: d, reason: collision with root package name */
    private final String f59913d;

    /* renamed from: e, reason: collision with root package name */
    private final String f59914e;

    public K() {
        int i10 = tu.z.f87419c;
        this.f59910a = tu.z.m7131constructorimpl(tu.a0.createFailure(new NullPointerException()));
        this.f59911b = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
        this.f59912c = "c3RhcnQ=";
        this.f59913d = "Z2V0SW5wdXRTdHJlYW0=";
        this.f59914e = "ZGVzdHJveQ==";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream a(java.util.List r4) {
        /*
            r3 = this;
            r0 = 0
            int r1 = tu.z.f87419c     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r3.f59911b     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = io.bidmachine.analytics.internal.s0.a(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Constructor r2 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L36
            java.util.List r4 = uu.y0.toList(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r2.newInstance(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r3.f59912c     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = io.bidmachine.analytics.internal.s0.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r1.invoke(r4, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = tu.z.m7131constructorimpl(r4)     // Catch: java.lang.Throwable -> L36
            goto L41
        L36:
            r4 = move-exception
            int r1 = tu.z.f87419c
            java.lang.Object r4 = tu.a0.createFailure(r4)
            java.lang.Object r4 = tu.z.m7131constructorimpl(r4)
        L41:
            r3.f59910a = r4
            boolean r1 = tu.z.m7137isSuccessimpl(r4)
            if (r1 == 0) goto L70
            if (r4 == 0) goto L62
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r3.f59913d     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = io.bidmachine.analytics.internal.s0.a(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L62
            java.lang.Object r4 = r1.invoke(r4, r0)     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            r4 = move-exception
            goto L6a
        L62:
            r4 = r0
        L63:
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = tu.z.m7131constructorimpl(r4)     // Catch: java.lang.Throwable -> L60
            goto L74
        L6a:
            int r1 = tu.z.f87419c
            java.lang.Object r4 = tu.a0.createFailure(r4)
        L70:
            java.lang.Object r4 = tu.z.m7131constructorimpl(r4)
        L74:
            boolean r1 = tu.z.m7136isFailureimpl(r4)
            if (r1 == 0) goto L7b
            goto L7c
        L7b:
            r0 = r4
        L7c:
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.K.a(java.util.List):java.io.InputStream");
    }

    public final void a() {
        Object obj = this.f59910a;
        if (!tu.z.m7137isSuccessimpl(obj)) {
            tu.z.m7131constructorimpl(obj);
            return;
        }
        Object objInvoke = null;
        if (obj != null) {
            try {
                Method method = obj.getClass().getMethod(s0.a(this.f59914e), null);
                if (method != null) {
                    objInvoke = method.invoke(obj, null);
                }
            } catch (Throwable th2) {
                int i10 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                return;
            }
        }
        tu.z.m7131constructorimpl(objInvoke);
    }
}
