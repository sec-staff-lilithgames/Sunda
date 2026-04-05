package com.fyber.inneractive.sdk.flow.nativead;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f23716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f23717d;

    public m(p pVar, i iVar, boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        this.f23717d = pVar;
        this.f23714a = iVar;
        this.f23715b = z10;
        this.f23716c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.fyber.inneractive.sdk.flow.nativead.p r0 = r7.f23717d
            com.fyber.inneractive.sdk.flow.nativead.i r1 = r7.f23714a
            boolean r2 = r7.f23715b
            com.fyber.inneractive.sdk.util.g r3 = r7.f23716c
            r0.getClass()
            java.lang.String r4 = r1.f23707a
            java.lang.String r5 = r1.f23708b
            boolean r6 = com.fyber.inneractive.sdk.util.v.a(r4)
            if (r6 == 0) goto L1b
            com.fyber.inneractive.sdk.flow.nativead.n r6 = new com.fyber.inneractive.sdk.flow.nativead.n
            r6.<init>(r0, r1, r5, r3)
            goto L27
        L1b:
            boolean r4 = com.fyber.inneractive.sdk.util.v.a(r5)
            if (r4 == 0) goto L33
            com.fyber.inneractive.sdk.flow.nativead.o r6 = new com.fyber.inneractive.sdk.flow.nativead.o
            r6.<init>(r0, r1, r3)
            r4 = r5
        L27:
            com.fyber.inneractive.sdk.flow.nativead.l r0 = r0.f23741a
            com.fyber.inneractive.sdk.flow.nativead.j r0 = (com.fyber.inneractive.sdk.flow.nativead.j) r0
            com.fyber.inneractive.sdk.flow.nativead.k r0 = r0.f23712b
            if (r0 == 0) goto L60
            r0.a(r4, r2, r3, r6)
            goto L60
        L33:
            com.fyber.inneractive.sdk.flow.nativead.l r0 = r0.f23741a
            com.fyber.inneractive.sdk.flow.nativead.j r0 = (com.fyber.inneractive.sdk.flow.nativead.j) r0
            com.fyber.inneractive.sdk.flow.nativead.i r2 = r0.f23711a
            if (r2 == 0) goto L55
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L42
            goto L55
        L42:
            com.fyber.inneractive.sdk.flow.nativead.p r1 = r0.f23713c
            com.fyber.inneractive.sdk.flow.nativead.i r0 = r0.f23711a
            r1.getClass()
            java.util.concurrent.ThreadPoolExecutor r2 = com.fyber.inneractive.sdk.util.r.f26803a
            com.fyber.inneractive.sdk.flow.nativead.m r4 = new com.fyber.inneractive.sdk.flow.nativead.m
            r5 = 1
            r4.<init>(r1, r0, r5, r3)
            r2.execute(r4)
            goto L60
        L55:
            java.lang.String r0 = com.fyber.inneractive.sdk.flow.nativead.j.f23710d
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            java.lang.String r1 = "%s : No valid link object, origin: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
        L60:
            com.fyber.inneractive.sdk.flow.nativead.p r0 = r7.f23717d
            com.fyber.inneractive.sdk.flow.nativead.i r1 = r7.f23714a
            r0.getClass()
            java.util.ArrayList r0 = r1.f23709c
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L6d
            com.fyber.inneractive.sdk.network.z0.b(r1)
            goto L6d
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.m.run():void");
    }
}
