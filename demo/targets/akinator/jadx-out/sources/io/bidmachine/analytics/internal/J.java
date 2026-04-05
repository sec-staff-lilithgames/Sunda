package io.bidmachine.analytics.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    private static final a f59906d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f59907a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f59908b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f59909c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public J(int i10) {
        this.f59907a = i10;
        this.f59908b = new LinkedHashMap();
        this.f59909c = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f59909c
            monitor-enter(r0)
            r1 = 0
            int r2 = tu.z.f87419c     // Catch: java.lang.Throwable -> L17
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L17
            java.util.Map r3 = r4.f59908b     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = r3.remove(r5)     // Catch: java.lang.Throwable -> L17
            io.bidmachine.analytics.internal.L r5 = (io.bidmachine.analytics.internal.L) r5     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L19
            byte[] r5 = io.bidmachine.analytics.internal.M.a(r5)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r5 = move-exception
            goto L22
        L19:
            r5 = r1
        L1a:
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = tu.z.m7131constructorimpl(r2)     // Catch: java.lang.Throwable -> L17
            goto L2c
        L22:
            int r2 = tu.z.f87419c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = tu.a0.createFailure(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = tu.z.m7131constructorimpl(r5)     // Catch: java.lang.Throwable -> L38
        L2c:
            monitor-exit(r0)
            boolean r0 = tu.z.m7136isFailureimpl(r5)
            if (r0 == 0) goto L34
            goto L35
        L34:
            r1 = r5
        L35:
            java.io.InputStream r1 = (java.io.InputStream) r1
            return r1
        L38:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.J.a(java.lang.String):java.io.InputStream");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f59909c
            monitor-enter(r0)
            r1 = 0
            int r2 = tu.z.f87419c     // Catch: java.lang.Throwable -> L1b
            java.util.Map r2 = r3.f59908b     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L1b
            io.bidmachine.analytics.internal.L r4 = (io.bidmachine.analytics.internal.L) r4     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L1d
            java.lang.Long r4 = r4.a()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L1d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r4 = move-exception
            goto L23
        L1d:
            r4 = r1
        L1e:
            java.lang.Object r4 = tu.z.m7131constructorimpl(r4)     // Catch: java.lang.Throwable -> L1b
            goto L2d
        L23:
            int r2 = tu.z.f87419c     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = tu.a0.createFailure(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = tu.z.m7131constructorimpl(r4)     // Catch: java.lang.Throwable -> L39
        L2d:
            monitor-exit(r0)
            boolean r0 = tu.z.m7136isFailureimpl(r4)
            if (r0 == 0) goto L35
            goto L36
        L35:
            r1 = r4
        L36:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L39:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.J.b(java.lang.String):java.lang.String");
    }

    public /* synthetic */ J(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 2097152 : i10);
    }

    public final void a(String str, String str2) {
        synchronized (this.f59909c) {
            try {
                int i10 = tu.z.f87419c;
                Map map = this.f59908b;
                Object objA = map.get(str);
                if (objA == null) {
                    objA = a();
                    map.put(str, objA);
                }
                ((L) objA).a(str2);
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
    }

    private final L a() {
        int i10 = this.f59907a;
        return new L(i10 / 2, i10);
    }
}
