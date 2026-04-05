package com.moloco.sdk.internal.services.bidtoken;

import android.util.Base64;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.internal.MolocoLogger;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v implements u {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46944b;

    /* renamed from: c, reason: collision with root package name */
    public final q f46945c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.encryption.b f46946d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.providers.m f46947e;

    /* renamed from: f, reason: collision with root package name */
    public String f46948f;

    /* renamed from: g, reason: collision with root package name */
    public String f46949g;

    /* renamed from: h, reason: collision with root package name */
    public g f46950h;

    /* renamed from: i, reason: collision with root package name */
    public final Mutex f46951i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public v f46952i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f46953j;

        /* renamed from: k, reason: collision with root package name */
        public String f46954k;

        /* renamed from: l, reason: collision with root package name */
        public g f46955l;

        /* renamed from: m, reason: collision with root package name */
        public Mutex f46956m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f46957n;

        /* renamed from: p, reason: collision with root package name */
        public int f46959p;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46957n = obj;
            this.f46959p |= Integer.MIN_VALUE;
            Object objA = v.this.a(null, null, null, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : tu.z.m7130boximpl(objA);
        }
    }

    public v(com.moloco.sdk.internal.services.i timeProviderService, q clientBidTokenBuilder, com.moloco.sdk.internal.services.encryption.b encryptionService, com.moloco.sdk.internal.services.bidtoken.providers.m signalProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(clientBidTokenBuilder, "clientBidTokenBuilder");
        kotlin.jvm.internal.e0.checkNotNullParameter(encryptionService, "encryptionService");
        kotlin.jvm.internal.e0.checkNotNullParameter(signalProvider, "signalProvider");
        this.f46944b = timeProviderService;
        this.f46945c = clientBidTokenBuilder;
        this.f46946d = encryptionService;
        this.f46947e = signalProvider;
        this.f46948f = "";
        this.f46949g = "";
        this.f46950h = f.a();
        this.f46951i = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.c r12, java.lang.String r13, com.moloco.sdk.internal.services.bidtoken.g r14, zu.d<? super tu.z> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.services.bidtoken.v.a
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.services.bidtoken.v$a r0 = (com.moloco.sdk.internal.services.bidtoken.v.a) r0
            int r1 = r0.f46959p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46959p = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.bidtoken.v$a r0 = new com.moloco.sdk.internal.services.bidtoken.v$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f46957n
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46959p
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            kotlinx.coroutines.sync.Mutex r12 = r0.f46956m
            com.moloco.sdk.internal.services.bidtoken.g r14 = r0.f46955l
            java.lang.String r13 = r0.f46954k
            com.moloco.sdk.acm.recorder.c r1 = r0.f46953j
            com.moloco.sdk.internal.services.bidtoken.v r0 = r0.f46952i
            tu.a0.throwOnFailure(r15)
            r15 = r12
            r12 = r1
            goto L57
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3e:
            tu.a0.throwOnFailure(r15)
            r0.f46952i = r11
            r0.f46953j = r12
            r0.f46954k = r13
            r0.f46955l = r14
            kotlinx.coroutines.sync.Mutex r15 = r11.f46951i
            r0.f46956m = r15
            r0.f46959p = r3
            java.lang.Object r0 = r15.lock(r4, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = r11
        L57:
            boolean r1 = r0.a(r13, r14)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L91
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "ClientBidTokenServiceImpl"
            java.lang.String r7 = "Bid token needs refresh, fetching new bid token"
            r9 = 4
            r10 = 0
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8e
            r0.f46948f = r13     // Catch: java.lang.Throwable -> L8e
            r0.f46950h = r14     // Catch: java.lang.Throwable -> L8e
            com.moloco.sdk.acm.d r14 = new com.moloco.sdk.acm.d     // Catch: java.lang.Throwable -> L8e
            com.moloco.sdk.internal.client_metrics_data.a r1 = com.moloco.sdk.internal.client_metrics_data.a.B     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L8e
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            com.moloco.sdk.internal.client_metrics_data.b r1 = com.moloco.sdk.internal.client_metrics_data.b.f45865f     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "false"
            com.moloco.sdk.acm.d r14 = r14.withTag(r1, r2)     // Catch: java.lang.Throwable -> L8e
            r12.recordCountEvent(r14)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = r0.a(r13, r12)     // Catch: java.lang.Throwable -> L8e
            r0.f46949g = r12     // Catch: java.lang.Throwable -> L8e
            goto Lab
        L8e:
            r0 = move-exception
            r12 = r0
            goto Ld4
        L91:
            com.moloco.sdk.acm.d r13 = new com.moloco.sdk.acm.d     // Catch: java.lang.Throwable -> L8e
            com.moloco.sdk.internal.client_metrics_data.a r14 = com.moloco.sdk.internal.client_metrics_data.a.B     // Catch: java.lang.Throwable -> L8e
            java.lang.String r14 = r14.c()     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L8e
            com.moloco.sdk.internal.client_metrics_data.b r14 = com.moloco.sdk.internal.client_metrics_data.b.f45865f     // Catch: java.lang.Throwable -> L8e
            java.lang.String r14 = r14.c()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = "true"
            com.moloco.sdk.acm.d r13 = r13.withTag(r14, r1)     // Catch: java.lang.Throwable -> L8e
            r12.recordCountEvent(r13)     // Catch: java.lang.Throwable -> L8e
        Lab:
            java.lang.String r12 = r0.f46949g     // Catch: java.lang.Throwable -> L8e
            int r12 = r12.length()     // Catch: java.lang.Throwable -> L8e
            if (r12 != 0) goto Lc8
            int r12 = tu.z.f87419c     // Catch: java.lang.Throwable -> L8e
            java.lang.Exception r12 = new java.lang.Exception     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = "Client bid token is empty"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r12 = tu.a0.createFailure(r12)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r12 = tu.z.m7131constructorimpl(r12)     // Catch: java.lang.Throwable -> L8e
            r15.unlock(r4)
            return r12
        Lc8:
            int r12 = tu.z.f87419c     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = r0.f46949g     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r12 = tu.z.m7131constructorimpl(r12)     // Catch: java.lang.Throwable -> L8e
            r15.unlock(r4)
            return r12
        Ld4:
            r15.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.v.a(com.moloco.sdk.acm.recorder.c, java.lang.String, com.moloco.sdk.internal.services.bidtoken.g, zu.d):java.lang.Object");
    }

    public final boolean a(g gVar) {
        g gVar2 = this.f46950h;
        this.f46950h = gVar;
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(gVar2, gVar);
        boolean z10 = !zAreEqual;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", !zAreEqual ? "config updated" : "config didn't change", false, 4, null);
        return z10;
    }

    public final boolean a(String str, g gVar) {
        if (!kotlin.jvm.internal.e0.areEqual(this.f46948f, str)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "rp changed, needs refresh", false, 4, null);
            return true;
        }
        if (a(gVar)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (this.f46949g.length() == 0) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (this.f46947e.b()) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "Bid token doesn't need refresh", false, 4, null);
        return false;
    }

    public final String a(String str, com.moloco.sdk.acm.recorder.c cVar) {
        Exception exc;
        String str2;
        long jA;
        q qVar = this.f46945c;
        com.moloco.sdk.internal.services.bidtoken.providers.m mVar = this.f46947e;
        com.moloco.sdk.internal.services.encryption.b bVar = this.f46946d;
        com.moloco.sdk.internal.services.i iVar = this.f46944b;
        if (str.length() == 0) {
            cVar.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.A.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), "empty_public_key"));
            return "";
        }
        com.moloco.sdk.acm.g gVarStartTimerEvent = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45885q.c());
        try {
            jA = iVar.a();
            str2 = "rsa";
        } catch (Exception e10) {
            exc = e10;
            str2 = "";
        }
        try {
            byte[] bArrA = bVar.a(str);
            mVar.a();
            BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponentsA = qVar.a((com.moloco.sdk.internal.services.bidtoken.providers.k) mVar.d(), this.f46950h);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "BidToken Component: " + bidToken$ClientBidTokenComponentsA, false, 4, null);
            byte[] bArrEncode = Base64.encode(bidToken$ClientBidTokenComponentsA.toByteArray(), 0);
            str2 = "aes";
            kotlin.jvm.internal.e0.checkNotNull(bArrEncode);
            byte[] bArrEncode2 = Base64.encode(bVar.a(bArrEncode), 0);
            kotlin.jvm.internal.e0.checkNotNull(bArrEncode2);
            String strEncodeToString = Base64.encodeToString(qVar.a(bArrEncode2, bArrA), 0);
            com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
            cVar.recordTimerEvent(gVarStartTimerEvent.withTag(bVar2.c(), "success"));
            cVar.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.A.c()).withTag(bVar2.c(), "success"));
            MolocoLogger.info$default(molocoLogger, "ClientBidTokenServiceImpl", "Client bid token build time: " + (iVar.a() - jA) + " ms", null, false, 12, null);
            return "v2:" + strEncodeToString;
        } catch (Exception e11) {
            exc = e11;
            String simpleName = exc.getClass().getSimpleName();
            MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
            MolocoLogger.warn$default(molocoLogger2, "ClientBidTokenServiceImpl", "Client bid token build failed: ".concat(simpleName), exc, false, 8, null);
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.A.c());
            com.moloco.sdk.internal.client_metrics_data.b bVar3 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
            com.moloco.sdk.acm.d dVarWithTag = dVar.withTag(bVar3.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar4 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            com.moloco.sdk.acm.d dVarWithTag2 = dVarWithTag.withTag(bVar4.c(), simpleName);
            if (str2.length() > 0) {
                dVarWithTag2.withTag(com.moloco.sdk.internal.client_metrics_data.b.f45868i.c(), str2);
            }
            MolocoLogger.debugBuildLog$default(molocoLogger2, "ClientBidTokenServiceImpl", "Recording metric failure: " + dVarWithTag2.getName() + ", tags: " + y0.joinToString$default(dVarWithTag2.getEventTags(), ",", null, null, 0, null, null, 62, null), false, 4, null);
            cVar.recordCountEvent(dVarWithTag2);
            cVar.recordTimerEvent(gVarStartTimerEvent.withTag(bVar3.c(), "failure").withTag(bVar4.c(), simpleName));
            return "";
        }
    }
}
