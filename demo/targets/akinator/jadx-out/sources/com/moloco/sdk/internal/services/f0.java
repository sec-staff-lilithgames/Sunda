package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.moloco.sdk.internal.MolocoLogger;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47038a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f47039i;

        /* renamed from: k, reason: collision with root package name */
        public int f47041k;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47039i = obj;
            this.f47041k |= Integer.MIN_VALUE;
            return f0.this.a(0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47042i;

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f0.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47042i;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            do {
                f0 f0Var = f0.this;
                if (f0Var.a()) {
                    return bv.b.boxBoolean(true);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, f0.a(f0Var), "waiting because of no network connection", null, false, 12, null);
                this.f47042i = 1;
            } while (DelayKt.delay(100L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public f0(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47038a = context;
    }

    public static final /* synthetic */ String a(f0 f0Var) {
        f0Var.getClass();
        return "ConnectivityServiceImpl";
    }

    @Override // com.moloco.sdk.internal.services.e0
    public boolean b() {
        try {
            return s3.a.isActiveNetworkMetered(a(this.f47038a));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "isNetworkMetered", e10.toString(), e10, false, 8, null);
            return false;
        }
    }

    public final Context c() {
        return this.f47038a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r5, zu.d<? super java.lang.Boolean> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.moloco.sdk.internal.services.f0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.internal.services.f0$a r0 = (com.moloco.sdk.internal.services.f0.a) r0
            int r1 = r0.f47041k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47041k = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.f0$a r0 = new com.moloco.sdk.internal.services.f0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f47039i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47041k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r7)
            com.moloco.sdk.internal.services.f0$b r7 = new com.moloco.sdk.internal.services.f0$b
            r2 = 0
            r7.<init>(r2)
            r0.f47041k = r3
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L4c
            boolean r5 = r7.booleanValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.f0.a(long, zu.d):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.e0
    public boolean a() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f47038a.getSystemService("connectivity");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public final ConnectivityManager a(Context context) {
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
