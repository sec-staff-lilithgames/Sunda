package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.c f46812b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f46813c;

    /* renamed from: d, reason: collision with root package name */
    public final z f46814d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46815e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f46816f;

    /* renamed from: g, reason: collision with root package name */
    public Job f46817g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.l {

        /* renamed from: i, reason: collision with root package name */
        public int f46818i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46820k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.c cVar, zu.d<? super a> dVar) {
            super(1, dVar);
            this.f46820k = cVar;
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super l> dVar) {
            return ((a) create(dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(zu.d<?> dVar) {
            return e0.this.new a(this.f46820k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46818i;
            e0 e0Var = e0.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                e0Var.b("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
                z zVar = e0Var.f46814d;
                this.f46818i = 1;
                obj = zVar.a(this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                return obj;
            }
            tu.a0.throwOnFailure(obj);
            com.moloco.sdk.internal.services.bidtoken.b bVar = (com.moloco.sdk.internal.services.bidtoken.b) obj;
            e0Var.a("[Thread: " + Thread.currentThread().getName() + "] bidToken status: " + bVar);
            if (!bVar.b()) {
                e0Var.b("[Thread: " + Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
                l lVarB = f.b();
                this.f46818i = 2;
                Object objA = e0.this.a(this.f46820k, lVarB, false, false, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }
            com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45859x.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "true").withTag("initial_fetch", "false");
            com.moloco.sdk.internal.services.bidtoken.b bVar2 = com.moloco.sdk.internal.services.bidtoken.b.f46782c;
            com.moloco.sdk.acm.d dVarWithTag2 = dVarWithTag.withTag("expiring", bVar != bVar2 ? "false" : "true");
            com.moloco.sdk.acm.recorder.c cVar = this.f46820k;
            cVar.recordCountEvent(dVarWithTag2);
            l lVarA = e0Var.f46814d.a();
            if (bVar != bVar2) {
                e0Var.a("[Thread: " + Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
                return lVarA;
            }
            e0Var.a("[Thread: " + Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
            e0Var.a(cVar);
            return lVarA;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public e0 f46821i;

        /* renamed from: j, reason: collision with root package name */
        public Object f46822j;

        /* renamed from: k, reason: collision with root package name */
        public l f46823k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46824l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f46825m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f46826n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f46827o;

        /* renamed from: q, reason: collision with root package name */
        public int f46829q;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46827o = obj;
            this.f46829q |= Integer.MIN_VALUE;
            return e0.this.a(null, null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.l {

        /* renamed from: i, reason: collision with root package name */
        public int f46830i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.w f46832k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.internal.w wVar, zu.d<? super c> dVar) {
            super(1, dVar);
            this.f46832k = wVar;
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super x0> dVar) {
            return ((c) create(dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(zu.d<?> dVar) {
            return e0.this.new c(this.f46832k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46830i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                z zVar = e0.this.f46814d;
                l lVar = (l) ((w.b) this.f46832k).a();
                this.f46830i = 1;
                if (zVar.a(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46833i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46835k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.c cVar, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f46835k = cVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return e0.this.new d(this.f46835k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46833i;
            e0 e0Var = e0.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                e0Var.b("[Thread: " + Thread.currentThread().getName() + "] Fetching token from server");
                l lVarB = f.b();
                this.f46833i = 1;
                if (e0.this.a(this.f46835k, lVarB, true, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            e0Var.b("[Thread: " + Thread.currentThread().getName() + "] Finished fetching token from server");
            return x0.f87415a;
        }
    }

    public e0(com.moloco.sdk.internal.services.bidtoken.c bidTokenApi, CoroutineScope scope, z tokenCache) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidTokenApi, "bidTokenApi");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(tokenCache, "tokenCache");
        this.f46812b = bidTokenApi;
        this.f46813c = scope;
        this.f46814d = tokenCache;
        this.f46815e = true;
        this.f46816f = MutexKt.Mutex$default(false, 1, null);
    }

    public final void b(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }

    public final void a(com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        b("[Thread: " + Thread.currentThread().getName() + "] Refreshing token async");
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45861z.c());
        Job job = this.f46817g;
        metricsRecorder.recordCountEvent(dVar.withTag("async", String.valueOf(job != null ? job.isActive() : false)));
        Job job2 = this.f46817g;
        if (job2 != null && job2.isActive()) {
            b("[Thread: " + Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
            return;
        }
        b("[Thread: " + Thread.currentThread().getName() + "] Scheduling to fetch token from server");
        this.f46817g = BuildersKt__Builders_commonKt.launch$default(this.f46813c, null, null, new d(metricsRecorder, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.acm.recorder.c r20, com.moloco.sdk.internal.services.bidtoken.l r21, boolean r22, boolean r23, zu.d<? super com.moloco.sdk.internal.services.bidtoken.l> r24) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.e0.a(com.moloco.sdk.acm.recorder.c, com.moloco.sdk.internal.services.bidtoken.l, boolean, boolean, zu.d):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.d0
    public Object a(com.moloco.sdk.acm.recorder.c cVar, zu.d<? super l> dVar) {
        b("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return com.moloco.sdk.internal.utils.a.a(this.f46816f, new a(cVar, null), dVar);
    }

    public final void a(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }
}
