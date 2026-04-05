package com.moloco.sdk.internal.services.bidtoken;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f46860a;

    /* renamed from: b, reason: collision with root package name */
    public final u f46861b;

    /* renamed from: c, reason: collision with root package name */
    public final Mutex f46862c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public n f46863i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f46864j;

        /* renamed from: k, reason: collision with root package name */
        public Mutex f46865k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46866l;

        /* renamed from: m, reason: collision with root package name */
        public String f46867m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f46868n;

        /* renamed from: p, reason: collision with root package name */
        public int f46870p;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46868n = obj;
            this.f46870p |= Integer.MIN_VALUE;
            return n.this.a(null, this);
        }
    }

    public n(d0 serverBidTokenService, u clientBidTokenService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverBidTokenService, "serverBidTokenService");
        kotlin.jvm.internal.e0.checkNotNullParameter(clientBidTokenService, "clientBidTokenService");
        this.f46860a = serverBidTokenService;
        this.f46861b = clientBidTokenService;
        this.f46862c = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:21:0x005a, B:34:0x00a7, B:36:0x00b3), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x003c, B:40:0x00d4, B:43:0x00db, B:45:0x00e3, B:51:0x0113, B:46:0x00f8), top: B:59:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:14:0x003c, B:40:0x00d4, B:43:0x00db, B:45:0x00e3, B:51:0x0113, B:46:0x00f8), top: B:59:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.internal.services.bidtoken.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.c r19, zu.d<? super java.lang.String> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.n.a(com.moloco.sdk.acm.recorder.c, zu.d):java.lang.Object");
    }

    public final void a(com.moloco.sdk.acm.g gVar, com.moloco.sdk.acm.recorder.c cVar, String str) {
        if (str != null) {
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45855t.c());
            com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
            com.moloco.sdk.acm.d dVarWithTag = dVar.withTag(bVar.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            cVar.recordCountEvent(dVarWithTag.withTag(bVar2.c(), str));
            cVar.recordTimerEvent(gVar.withTag(bVar.c(), "failure").withTag(bVar2.c(), str));
            return;
        }
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45855t.c());
        com.moloco.sdk.internal.client_metrics_data.b bVar3 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
        cVar.recordCountEvent(dVar2.withTag(bVar3.c(), "success"));
        cVar.recordTimerEvent(gVar.withTag(bVar3.c(), "success"));
    }
}
