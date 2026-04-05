package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q0;
import kotlin.reflect.KProperty;
import uu.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UrlGetRequestWorker extends CoroutineWorker {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f50266b = {c1.property0(new q0(UrlGetRequestWorker.class, "url", "<v#0>", 0))};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public UrlGetRequestWorker f50267i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f50268j;

        /* renamed from: l, reason: collision with root package name */
        public int f50270l;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f50268j = obj;
            this.f50270l |= Integer.MIN_VALUE;
            return UrlGetRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlGetRequestWorker(Context context, WorkerParameters params) {
        super(com.moloco.sdk.internal.android_context.b.a(context), params);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(params, "params");
    }

    public static final String a(Map<String, Object> map) {
        e0.checkNotNull(map);
        return (String) n1.getOrImplicitDefaultNullable(map, f50266b[0].getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(zu.d<? super n6.a0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.a) r0
            int r1 = r0.f50270l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50270l = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f50268j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f50270l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker r0 = r0.f50267i
            tu.a0.throwOnFailure(r12)
            goto L73
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            tu.a0.throwOnFailure(r12)
            com.moloco.sdk.service_locator.a$i r12 = com.moloco.sdk.service_locator.a.i.f47469a
            io.ktor.client.HttpClient r12 = r12.a()
            androidx.work.b r2 = r11.getInputData()
            java.util.Map r2 = r2.getKeyValueMap()
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Sending request to "
            r5.<init>(r6)
            java.lang.String r6 = a(r2)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            r9 = 12
            r10 = 0
            r5 = 0
            java.lang.String r5 = io.odeeo.internal.h.vfsA.QCmNMSGd.lKWcAtG
            r7 = 0
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = a(r2)
            r0.f50267i = r11
            r0.f50270l = r3
            java.lang.Object r12 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(r12, r2, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            r0 = r11
        L73:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L85
            n6.a0 r12 = n6.a0.success()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r0)
            return r12
        L85:
            int r12 = r0.getRunAttemptCount()
            r0 = 5
            if (r12 < r0) goto L96
            n6.a0 r12 = n6.a0.failure()
            java.lang.String r0 = "failure(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r0)
            return r12
        L96:
            n6.a0 r12 = n6.a0.retry()
            java.lang.String r0 = "retry(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.doWork(zu.d):java.lang.Object");
    }
}
