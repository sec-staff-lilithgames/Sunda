package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.service_locator.a;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f46315f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final MolocoInitStatus f46316g;

    /* renamed from: h, reason: collision with root package name */
    public static final MolocoInitStatus f46317h;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46318a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f46319b;

    /* renamed from: c, reason: collision with root package name */
    public final StateFlow f46320c;

    /* renamed from: d, reason: collision with root package name */
    public Init$SDKInitResponse f46321d;

    /* renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f46322e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final MolocoInitStatus a() {
            return j0.f46316g;
        }

        public final MolocoInitStatus b() {
            return j0.f46317h;
        }

        public a() {
        }

        public final MolocoInitStatus a(String errorMessage) {
            kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
            return new MolocoInitStatus(Initialization.FAILURE, errorMessage);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f46323i;

        /* renamed from: k, reason: collision with root package name */
        public int f46325k;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46323i = obj;
            this.f46325k |= Integer.MIN_VALUE;
            return j0.this.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f46326i;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.internal.e eVar, zu.d<? super Boolean> dVar) {
            return ((c) create(eVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f46326i = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxBoolean(((com.moloco.sdk.internal.e) this.f46326i) != null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f46327i;

        /* renamed from: j, reason: collision with root package name */
        public Object f46328j;

        /* renamed from: k, reason: collision with root package name */
        public Object f46329k;

        /* renamed from: l, reason: collision with root package name */
        public Object f46330l;

        /* renamed from: m, reason: collision with root package name */
        public Init$SDKInitResponse f46331m;

        /* renamed from: n, reason: collision with root package name */
        public long f46332n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f46333o;

        /* renamed from: q, reason: collision with root package name */
        public int f46335q;

        public d(zu.d<? super d> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46333o = obj;
            this.f46335q |= Integer.MIN_VALUE;
            return j0.this.a((com.moloco.sdk.internal.w) null, 0L, (com.moloco.sdk.internal.services.init.n) null, (com.moloco.sdk.acm.recorder.c) null, (com.moloco.sdk.acm.g) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f46336i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f46337j;

        /* renamed from: k, reason: collision with root package name */
        public j.a f46338k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46339l;

        /* renamed from: n, reason: collision with root package name */
        public int f46341n;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46339l = obj;
            this.f46341n |= Integer.MIN_VALUE;
            return j0.this.a(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public Object f46342i;

        /* renamed from: j, reason: collision with root package name */
        public long f46343j;

        /* renamed from: k, reason: collision with root package name */
        public int f46344k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46345l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j0 f46346m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f46347n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ MediationInfo f46348o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.n f46349p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.c cVar, j0 j0Var, String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f46345l = cVar;
            this.f46346m = j0Var;
            this.f46347n = str;
            this.f46348o = mediationInfo;
            this.f46349p = nVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new f(this.f46345l, this.f46346m, this.f46347n, this.f46348o, this.f46349p, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.acm.g gVarStartTimerEvent;
            long j10;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46344k;
            j0 j0Var = this.f46346m;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "startInitialization switch to Dispatchers.IO", null, false, 12, null);
                gVarStartTimerEvent = this.f46345l.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45872c.c());
                long jA = j0Var.f().a();
                com.moloco.sdk.internal.services.init.k kVarB = a.f.f47455a.b();
                this.f46342i = gVarStartTimerEvent;
                this.f46343j = jA;
                this.f46344k = 1;
                obj = kVarB.a(this.f46347n, this.f46348o, this);
                if (obj != coroutine_suspended) {
                    j10 = jA;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.moloco.sdk.internal.w wVar = (com.moloco.sdk.internal.w) this.f46342i;
                tu.a0.throwOnFailure(obj);
                return wVar;
            }
            j10 = this.f46343j;
            gVarStartTimerEvent = (com.moloco.sdk.acm.g) this.f46342i;
            tu.a0.throwOnFailure(obj);
            com.moloco.sdk.acm.g gVar = gVarStartTimerEvent;
            com.moloco.sdk.internal.w wVar2 = (com.moloco.sdk.internal.w) obj;
            long jA2 = j0Var.f().a() - j10;
            this.f46342i = wVar2;
            this.f46344k = 2;
            return this.f46346m.a(wVar2, jA2, this.f46349p, this.f46345l, gVar, this) == coroutine_suspended ? coroutine_suspended : wVar2;
        }
    }

    static {
        Initialization initialization = Initialization.SUCCESS;
        f46316g = new MolocoInitStatus(initialization, "Already Initialized");
        f46317h = new MolocoInitStatus(initialization, "Initialized");
    }

    public j0(com.moloco.sdk.internal.services.i timeProviderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f46318a = timeProviderService;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f46319b = MutableStateFlow;
        this.f46320c = FlowKt.asStateFlow(MutableStateFlow);
        this.f46322e = StateFlowKt.MutableStateFlow(null);
    }

    public final boolean c() {
        return g();
    }

    public final StateFlow<Initialization> d() {
        return this.f46320c;
    }

    public final Init$SDKInitResponse e() {
        return this.f46321d;
    }

    public final com.moloco.sdk.internal.services.i f() {
        return this.f46318a;
    }

    public final boolean g() {
        try {
            a.i.f47469a.c();
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final Object b(String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, com.moloco.sdk.acm.recorder.c cVar, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new f(cVar, this, str, mediationInfo, nVar, null), dVar);
    }

    public final Object b(zu.d<? super x0> dVar) {
        this.f46321d = null;
        this.f46322e.setValue(null);
        this.f46319b.setValue(null);
        Object objA = a.f.f47455a.b().a(dVar);
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zu.d<? super com.moloco.sdk.internal.e> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.moloco.sdk.internal.publisher.j0.b
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.internal.publisher.j0$b r0 = (com.moloco.sdk.internal.publisher.j0.b) r0
            int r1 = r0.f46325k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46325k = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.j0$b r0 = new com.moloco.sdk.internal.publisher.j0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f46323i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46325k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r12)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            tu.a0.throwOnFailure(r12)
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 12
            r10 = 0
            java.lang.String r5 = "InitializationHandler"
            java.lang.String r6 = "Moloco SDK awaiting init to receive AdFactory"
            r7 = 0
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            com.moloco.sdk.internal.publisher.j0$c r12 = new com.moloco.sdk.internal.publisher.j0$c
            r2 = 0
            r12.<init>(r2)
            r0.f46325k = r3
            kotlinx.coroutines.flow.MutableStateFlow r2 = r11.f46322e
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.first(r2, r12, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            java.lang.String r0 = "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory"
            kotlin.jvm.internal.e0.checkNotNull(r12, r0)
            com.moloco.sdk.internal.e r12 = (com.moloco.sdk.internal.e) r12
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 12
            r6 = 0
            java.lang.String r1 = "InitializationHandler"
            java.lang.String r2 = "Moloco SDK init completed, AdFactory received"
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.j0.a(zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        if (r1.emit(r3, r5) == r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, com.moloco.sdk.publisher.MediationInfo r18, com.moloco.sdk.internal.services.init.n r19, com.moloco.sdk.acm.recorder.c r20, zu.d<? super com.moloco.sdk.internal.w> r21) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.j0.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.internal.services.init.n, com.moloco.sdk.acm.recorder.c, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0251, code lost:
    
        if (r2.emit(r1, r8) != r9) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.internal.w r24, long r25, com.moloco.sdk.internal.services.init.n r27, com.moloco.sdk.acm.recorder.c r28, com.moloco.sdk.acm.g r29, zu.d<? super tu.x0> r30) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.j0.a(com.moloco.sdk.internal.w, long, com.moloco.sdk.internal.services.init.n, com.moloco.sdk.acm.recorder.c, com.moloco.sdk.acm.g, zu.d):java.lang.Object");
    }
}
