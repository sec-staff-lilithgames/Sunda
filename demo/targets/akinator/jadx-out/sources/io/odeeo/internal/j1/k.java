package io.odeeo.internal.j1;

import io.odeeo.sdk.OdeeoSDK;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f64399a = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getSdkRequestRetriesTTL();

    /* renamed from: b, reason: collision with root package name */
    public int f64400b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.network.RetryManager", f = "RetryManager.kt", i = {0}, l = {45}, m = "retryFetch$odeeoSdk_release", n = {"this"}, s = {"L$0"})
    public static final class a extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f64401a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f64402b;

        /* renamed from: d, reason: collision with root package name */
        public int f64404d;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f64402b = obj;
            this.f64404d |= Integer.MIN_VALUE;
            return k.this.retryFetch$odeeoSdk_release(null, null, null, this);
        }
    }

    public final int getMaxRetries$odeeoSdk_release() {
        return this.f64399a;
    }

    public final int getNextRetryDelay$odeeoSdk_release() {
        int retryDelay$odeeoSdk_release = getRetryDelay$odeeoSdk_release();
        this.f64400b++;
        return retryDelay$odeeoSdk_release;
    }

    public final int getRetryAmount$odeeoSdk_release() {
        return this.f64400b;
    }

    public final int getRetryDelay$odeeoSdk_release() {
        int i10 = this.f64400b;
        if (i10 == 0) {
            return 5;
        }
        if (i10 != 1) {
            return i10 != 2 ? 60 : 30;
        }
        return 10;
    }

    public final void resetRetryAmount$odeeoSdk_release() {
        this.f64400b = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryFetch$odeeoSdk_release(io.odeeo.internal.a.a<? extends java.lang.Throwable> r6, java.lang.String r7, kv.a r8, zu.d<? super tu.x0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.odeeo.internal.j1.k.a
            if (r0 == 0) goto L13
            r0 = r9
            io.odeeo.internal.j1.k$a r0 = (io.odeeo.internal.j1.k.a) r0
            int r1 = r0.f64404d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64404d = r1
            goto L18
        L13:
            io.odeeo.internal.j1.k$a r0 = new io.odeeo.internal.j1.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f64402b
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f64404d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f64401a
            io.odeeo.internal.j1.k r6 = (io.odeeo.internal.j1.k) r6
            tu.a0.throwOnFailure(r9)
            goto L9c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r9)
            int r9 = r5.getRetryAmount$odeeoSdk_release()
            int r2 = r5.getMaxRetries$odeeoSdk_release()
            r4 = 0
            if (r9 < r2) goto L6d
            java.lang.String r9 = "Error while fetching "
            if (r6 == 0) goto L60
            java.lang.Object r0 = r6.getError()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r0.printStackTrace()
            java.lang.Object r6 = r6.getError()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.String r7 = kotlin.jvm.internal.e0.stringPlus(r9, r7)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            io.odeeo.internal.b2.a.w(r6, r7, r9)
            goto L69
        L60:
            java.lang.String r6 = kotlin.jvm.internal.e0.stringPlus(r9, r7)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            io.odeeo.internal.b2.a.w(r6, r7)
        L69:
            r8.invoke()
            goto L9b
        L6d:
            int r6 = r5.getRetryDelay$odeeoSdk_release()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Retrying to fetch request "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = ": "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r4]
            io.odeeo.internal.b2.a.w(r7, r8)
            long r6 = (long) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r0.f64401a = r5
            r0.f64404d = r3
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r6 != r1) goto L9b
            return r1
        L9b:
            r6 = r5
        L9c:
            int r7 = r6.getRetryAmount$odeeoSdk_release()
            int r7 = r7 + r3
            r6.setRetryAmount$odeeoSdk_release(r7)
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.j1.k.retryFetch$odeeoSdk_release(io.odeeo.internal.a.a, java.lang.String, kv.a, zu.d):java.lang.Object");
    }

    public final void setMaxRetries$odeeoSdk_release(int i10) {
        this.f64399a = i10;
    }

    public final void setRetryAmount$odeeoSdk_release(int i10) {
        this.f64400b = i10;
    }
}
