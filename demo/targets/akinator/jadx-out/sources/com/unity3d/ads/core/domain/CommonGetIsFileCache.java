package com.unity3d.ads.core.domain;

import bv.d;
import bv.f;
import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", f = "CommonGetIsFileCache.kt", i = {0, 0}, l = {18}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
    /* renamed from: com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetIsFileCache.this.invoke(null, this);
        }
    }

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(cacheRepository, "cacheRepository");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.String r13, zu.d<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.J$0
            java.lang.Object r13 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetIsFileCache r13 = (com.unity3d.ads.core.domain.CommonGetIsFileCache) r13
            tu.a0.throwOnFailure(r14)
            goto L59
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            tu.a0.throwOnFailure(r14)
            tv.y r14 = tv.y.f87465a
            long r4 = r14.m7254markNowz9LOYto()
            java.lang.String r14 = "/"
            r2 = 2
            r6 = 0
            java.lang.String r13 = sv.n0.substringAfterLast$default(r13, r14, r6, r2, r6)
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r12.cacheRepository
            r0.L$0 = r12
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r14 = r14.doesFileExist(r13, r0)
            if (r14 != r1) goto L57
            return r1
        L57:
            r13 = r12
            r1 = r4
        L59:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r13.sendDiagnosticEvent
            if (r14 == 0) goto L67
            java.lang.String r13 = "native_show_is_file_cached_success_time"
        L65:
            r4 = r13
            goto L6a
        L67:
            java.lang.String r13 = "native_show_is_file_cached_failure_time"
            goto L65
        L6a:
            tv.x r13 = tv.x.m7236boximpl(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r13)
            java.lang.Double r5 = bv.b.boxDouble(r0)
            r10 = 60
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = bv.b.boxBoolean(r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke(java.lang.String, zu.d):java.lang.Object");
    }
}
