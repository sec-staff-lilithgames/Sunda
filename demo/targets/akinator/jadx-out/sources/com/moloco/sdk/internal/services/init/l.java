package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.init.d f47115a;

    /* renamed from: b, reason: collision with root package name */
    public final h f47116b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f47117c;

    /* renamed from: d, reason: collision with root package name */
    public Init$SDKInitResponse f47118d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public l f47119i;

        /* renamed from: j, reason: collision with root package name */
        public String f47120j;

        /* renamed from: k, reason: collision with root package name */
        public MediationInfo f47121k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f47122l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f47123m;

        /* renamed from: o, reason: collision with root package name */
        public int f47125o;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47123m = obj;
            this.f47125o |= Integer.MIN_VALUE;
            return l.this.a(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47126i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47128k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MediationInfo f47129l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f47130m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.c cVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47128k = str;
            this.f47129l = mediationInfo;
            this.f47130m = cVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return l.this.new b(this.f47128k, this.f47129l, this.f47130m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47126i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Async fetching init response", null, false, 12, null);
                this.f47126i = 1;
                if (l.this.a(this.f47128k, this.f47129l, this.f47130m, true, (zu.d<? super w>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f47131i;

        /* renamed from: j, reason: collision with root package name */
        public Object f47132j;

        /* renamed from: k, reason: collision with root package name */
        public Object f47133k;

        /* renamed from: l, reason: collision with root package name */
        public Object f47134l;

        /* renamed from: m, reason: collision with root package name */
        public b1 f47135m;

        /* renamed from: n, reason: collision with root package name */
        public b1 f47136n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f47137o;

        /* renamed from: p, reason: collision with root package name */
        public int f47138p;

        /* renamed from: q, reason: collision with root package name */
        public int f47139q;

        /* renamed from: r, reason: collision with root package name */
        public int f47140r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f47141s;

        /* renamed from: u, reason: collision with root package name */
        public int f47143u;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47141s = obj;
            this.f47143u |= Integer.MIN_VALUE;
            return l.this.a((String) null, (MediationInfo) null, (com.moloco.sdk.acm.recorder.c) null, false, (zu.d<? super w>) this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f47144i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.g f47145j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47146k;

        /* renamed from: m, reason: collision with root package name */
        public int f47148m;

        public d(zu.d<? super d> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47146k = obj;
            this.f47148m |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    public l(com.moloco.sdk.internal.services.init.d initApi, h initCache, CoroutineScope scope) {
        e0.checkNotNullParameter(initApi, "initApi");
        e0.checkNotNullParameter(initCache, "initCache");
        e0.checkNotNullParameter(scope, "scope");
        this.f47115a = initApi;
        this.f47116b = initCache;
        this.f47117c = scope;
    }

    @Override // com.moloco.sdk.internal.services.init.k
    public Init$SDKInitResponse a() {
        return this.f47118d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.init.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r6, com.moloco.sdk.publisher.MediationInfo r7, zu.d<? super com.moloco.sdk.internal.w> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.moloco.sdk.internal.services.init.l.d
            if (r0 == 0) goto L13
            r0 = r8
            com.moloco.sdk.internal.services.init.l$d r0 = (com.moloco.sdk.internal.services.init.l.d) r0
            int r1 = r0.f47148m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47148m = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.init.l$d r0 = new com.moloco.sdk.internal.services.init.l$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f47146k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47148m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.moloco.sdk.acm.g r6 = r0.f47145j
            com.moloco.sdk.acm.recorder.c r7 = r0.f47144i
            tu.a0.throwOnFailure(r8)
            goto L5c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            tu.a0.throwOnFailure(r8)
            com.moloco.sdk.acm.recorder.a r8 = com.moloco.sdk.acm.recorder.c.Companion
            java.lang.String r2 = r7.getName()
            com.moloco.sdk.acm.recorder.c r8 = r8.create(r2)
            com.moloco.sdk.internal.client_metrics_data.c r2 = com.moloco.sdk.internal.client_metrics_data.c.f45873e
            java.lang.String r2 = r2.c()
            com.moloco.sdk.acm.g r2 = r8.startTimerEvent(r2)
            r0.f47144i = r8
            r0.f47145j = r2
            r0.f47148m = r3
            java.lang.Object r6 = r5.a(r6, r7, r8, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r7 = r8
            r8 = r6
            r6 = r2
        L5c:
            com.moloco.sdk.internal.services.init.c r8 = (com.moloco.sdk.internal.services.init.c) r8
            com.moloco.sdk.internal.w r0 = r8.d()
            boolean r1 = r0 instanceof com.moloco.sdk.internal.w.a
            java.lang.String r2 = "state"
            if (r1 == 0) goto L9e
            com.moloco.sdk.acm.d r0 = new com.moloco.sdk.acm.d
            com.moloco.sdk.internal.client_metrics_data.a r1 = com.moloco.sdk.internal.client_metrics_data.a.f45842g
            java.lang.String r1 = r1.c()
            r0.<init>(r1)
            com.moloco.sdk.internal.client_metrics_data.b r1 = com.moloco.sdk.internal.client_metrics_data.b.f45865f
            java.lang.String r3 = r1.c()
            java.lang.String r4 = "failure"
            com.moloco.sdk.acm.d r0 = r0.withTag(r3, r4)
            java.lang.String r3 = r8.c()
            com.moloco.sdk.acm.d r0 = r0.withTag(r2, r3)
            r7.recordCountEvent(r0)
            java.lang.String r0 = r1.c()
            com.moloco.sdk.acm.g r6 = r6.withTag(r0, r4)
            java.lang.String r0 = r8.c()
            com.moloco.sdk.acm.g r6 = r6.withTag(r2, r0)
            r7.recordTimerEvent(r6)
            goto Ld7
        L9e:
            boolean r0 = r0 instanceof com.moloco.sdk.internal.w.b
            if (r0 == 0) goto Ldc
            com.moloco.sdk.acm.d r0 = new com.moloco.sdk.acm.d
            com.moloco.sdk.internal.client_metrics_data.a r1 = com.moloco.sdk.internal.client_metrics_data.a.f45842g
            java.lang.String r1 = r1.c()
            r0.<init>(r1)
            com.moloco.sdk.internal.client_metrics_data.b r1 = com.moloco.sdk.internal.client_metrics_data.b.f45865f
            java.lang.String r3 = r1.c()
            java.lang.String r4 = "success"
            com.moloco.sdk.acm.d r0 = r0.withTag(r3, r4)
            java.lang.String r3 = r8.c()
            com.moloco.sdk.acm.d r0 = r0.withTag(r2, r3)
            r7.recordCountEvent(r0)
            java.lang.String r0 = r1.c()
            com.moloco.sdk.acm.g r6 = r6.withTag(r0, r4)
            java.lang.String r0 = r8.c()
            com.moloco.sdk.acm.g r6 = r6.withTag(r2, r0)
            r7.recordTimerEvent(r6)
        Ld7:
            com.moloco.sdk.internal.w r6 = r8.d()
            return r6
        Ldc:
            tu.t r6 = new tu.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.l.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r24, com.moloco.sdk.publisher.MediationInfo r25, com.moloco.sdk.acm.recorder.c r26, zu.d<? super com.moloco.sdk.internal.services.init.c> r27) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.l.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.c, zu.d):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.init.k
    public Object a(zu.d<? super x0> dVar) {
        this.f47118d = null;
        Object objA = this.f47116b.a(dVar);
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0.f87415a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02d8, code lost:
    
        if (r0.b(r2, r14, r1) == r3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0329 -> B:79:0x0331). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r30, com.moloco.sdk.publisher.MediationInfo r31, com.moloco.sdk.acm.recorder.c r32, boolean r33, zu.d<? super com.moloco.sdk.internal.w> r34) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.l.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.c, boolean, zu.d):java.lang.Object");
    }
}
