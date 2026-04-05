package com.moloco.sdk.internal.ilrd;

import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import b0.e2;
import bv.n;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.IlrdRequest$ImpressionLevelRevenue;
import com.moloco.sdk.IlrdRequest$ImpressionRevenueRequest;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.g0;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.internal.services.p;
import com.moloco.sdk.s7;
import com.moloco.sdk.v7;
import io.ktor.http.ContentType;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p0.o2;
import tu.a0;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements r {

    /* renamed from: u, reason: collision with root package name */
    public static final C0371b f45958u = new C0371b(null);

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f45959b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45960c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k f45961e;

    /* renamed from: f, reason: collision with root package name */
    public final long f45962f;

    /* renamed from: g, reason: collision with root package name */
    public final int f45963g;

    /* renamed from: h, reason: collision with root package name */
    public final long f45964h;

    /* renamed from: i, reason: collision with root package name */
    public final long f45965i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f45966j;

    /* renamed from: k, reason: collision with root package name */
    public final p f45967k;

    /* renamed from: l, reason: collision with root package name */
    public final String f45968l;

    /* renamed from: m, reason: collision with root package name */
    public final String f45969m;

    /* renamed from: n, reason: collision with root package name */
    public final g0 f45970n;

    /* renamed from: o, reason: collision with root package name */
    public final i f45971o;

    /* renamed from: p, reason: collision with root package name */
    public final i f45972p;

    /* renamed from: q, reason: collision with root package name */
    public final i f45973q;

    /* renamed from: r, reason: collision with root package name */
    public final Mutex f45974r;

    /* renamed from: s, reason: collision with root package name */
    public com.moloco.sdk.internal.ilrd.a f45975s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f45976t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f45977i;

        /* renamed from: j, reason: collision with root package name */
        public b f45978j;

        /* renamed from: k, reason: collision with root package name */
        public int f45979k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k0 f45981m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.ilrd.b$a$a, reason: collision with other inner class name */
        public static final class C0370a extends n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ k0 f45982i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ b f45983j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0370a(k0 k0Var, b bVar, zu.d<? super C0370a> dVar) {
                super(2, dVar);
                this.f45982i = k0Var;
                this.f45983j = bVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0370a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0370a(this.f45982i, this.f45983j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                this.f45982i.addObserver(this.f45983j);
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f45981m = k0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new a(this.f45981m, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7) != r0) goto L27;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.f45979k
                r2 = 3
                r3 = 2
                r4 = 1
                com.moloco.sdk.internal.ilrd.b r5 = com.moloco.sdk.internal.ilrd.b.this
                r6 = 0
                if (r1 == 0) goto L31
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                tu.a0.throwOnFailure(r8)
                goto L71
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                kotlinx.coroutines.sync.Mutex r1 = r7.f45977i
                tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L26
                goto L54
            L26:
                r8 = move-exception
                goto L77
            L28:
                com.moloco.sdk.internal.ilrd.b r1 = r7.f45978j
                kotlinx.coroutines.sync.Mutex r4 = r7.f45977i
                tu.a0.throwOnFailure(r8)
                r8 = r4
                goto L46
            L31:
                tu.a0.throwOnFailure(r8)
                kotlinx.coroutines.sync.Mutex r8 = com.moloco.sdk.internal.ilrd.b.b(r5)
                r7.f45977i = r8
                r7.f45978j = r5
                r7.f45979k = r4
                java.lang.Object r1 = r8.lock(r6, r7)
                if (r1 != r0) goto L45
                goto L70
            L45:
                r1 = r5
            L46:
                r7.f45977i = r8     // Catch: java.lang.Throwable -> L74
                r7.f45978j = r6     // Catch: java.lang.Throwable -> L74
                r7.f45979k = r3     // Catch: java.lang.Throwable -> L74
                java.lang.Object r1 = com.moloco.sdk.internal.ilrd.b.a(r1, r7)     // Catch: java.lang.Throwable -> L74
                if (r1 != r0) goto L53
                goto L70
            L53:
                r1 = r8
            L54:
                r1.unlock(r6)
                com.moloco.sdk.internal.scheduling.a r8 = com.moloco.sdk.internal.scheduling.c.a()
                zu.m r8 = r8.getMain()
                com.moloco.sdk.internal.ilrd.b$a$a r1 = new com.moloco.sdk.internal.ilrd.b$a$a
                androidx.lifecycle.k0 r3 = r7.f45981m
                r1.<init>(r3, r5, r6)
                r7.f45977i = r6
                r7.f45979k = r2
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
                if (r8 != r0) goto L71
            L70:
                return r0
            L71:
                tu.x0 r8 = tu.x0.f87415a
                return r8
            L74:
                r0 = move-exception
                r1 = r8
                r8 = r0
            L77:
                r1.unlock(r6)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.ilrd.b$b, reason: collision with other inner class name */
    public static final class C0371b {
        public /* synthetic */ C0371b(u uVar) {
            this();
        }

        public static /* synthetic */ void a() {
        }

        public C0371b() {
        }

        public final byte[] a(byte[] bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gv.d.closeFinally(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gv.d.closeFinally(byteArrayOutputStream, null);
                    e0.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f45984i;

        /* renamed from: j, reason: collision with root package name */
        public b f45985j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.internal.ilrd.g f45986k;

        /* renamed from: l, reason: collision with root package name */
        public int f45987l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.g f45989n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.internal.ilrd.g gVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f45989n = gVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new c(this.f45989n, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Mutex mutex;
            com.moloco.sdk.internal.ilrd.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f45987l;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                bVar = b.this;
                Mutex mutex2 = bVar.f45974r;
                this.f45984i = mutex2;
                this.f45985j = bVar;
                com.moloco.sdk.internal.ilrd.g gVar2 = this.f45989n;
                this.f45986k = gVar2;
                this.f45987l = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                gVar = gVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = this.f45986k;
                bVar = this.f45985j;
                mutex = this.f45984i;
                a0.throwOnFailure(obj);
            }
            try {
                bVar.a();
                bVar.k();
                com.moloco.sdk.internal.ilrd.a aVarE = bVar.e();
                if (aVarE != null) {
                    aVarE.a(gVar);
                }
                IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenueA = bVar.a(gVar);
                List<IlrdRequest$ImpressionLevelRevenue> listB = bVar.b();
                e0.checkNotNull(ilrdRequest$ImpressionLevelRevenueA);
                listB.add(ilrdRequest$ImpressionLevelRevenueA);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Event id " + ilrdRequest$ImpressionLevelRevenueA.getEventId() + " added. Count: " + bVar.b().size(), null, false, 12, null);
                if (bVar.h()) {
                    bVar.m();
                }
                x0 x0Var = x0.f87415a;
                mutex.unlock(null);
                return x0Var;
            } catch (Throwable th2) {
                mutex.unlock(null);
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public Mutex f45990i;

        /* renamed from: j, reason: collision with root package name */
        public b f45991j;

        /* renamed from: k, reason: collision with root package name */
        public int f45992k;

        public d(zu.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new d(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Mutex mutex;
            b bVar2;
            Mutex mutex2;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f45992k;
            try {
                if (r12 == 0) {
                    a0.throwOnFailure(obj);
                    bVar = b.this;
                    Mutex mutex3 = bVar.f45974r;
                    this.f45990i = mutex3;
                    this.f45991j = bVar;
                    this.f45992k = 1;
                    Object objLock = mutex3.lock(null, this);
                    mutex = mutex3;
                    if (objLock != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = this.f45991j;
                    Mutex mutex4 = this.f45990i;
                    a0.throwOnFailure(obj);
                    mutex2 = mutex4;
                    bVar = bVar2;
                    r12 = mutex2;
                    bVar.m();
                    x0 x0Var = x0.f87415a;
                    r12.unlock(null);
                    return x0Var;
                }
                b bVar3 = this.f45991j;
                Mutex mutex5 = this.f45990i;
                a0.throwOnFailure(obj);
                bVar = bVar3;
                mutex = mutex5;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "onPause called, storing session and sending events", null, false, 12, null);
                com.moloco.sdk.internal.ilrd.a aVarE = bVar.e();
                r12 = mutex;
                if (aVarE != null) {
                    String strG = aVarE.g();
                    g0 g0Var = bVar.f45970n;
                    this.f45990i = mutex;
                    this.f45991j = bVar;
                    this.f45992k = 2;
                    if (g0Var.a("ilrd_session_store", strG, this) != coroutine_suspended) {
                        bVar2 = bVar;
                        mutex2 = mutex;
                        bVar = bVar2;
                        r12 = mutex2;
                    }
                    return coroutine_suspended;
                }
                bVar.m();
                x0 x0Var2 = x0.f87415a;
                r12.unlock(null);
                return x0Var2;
            } catch (Throwable th2) {
                r12.unlock(null);
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b f45994i;

        /* renamed from: j, reason: collision with root package name */
        public String f45995j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f45996k;

        /* renamed from: m, reason: collision with root package name */
        public int f45998m;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45996k = obj;
            this.f45998m |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends n implements kv.l {
        public f(zu.d<? super f> dVar) {
            super(1, dVar);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super x0> dVar) {
            return ((f) create(dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(zu.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            b bVar = b.this;
            com.moloco.sdk.internal.ilrd.a aVarE = bVar.e();
            if (aVarE != null) {
                aVarE.a();
            }
            bVar.m();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends n implements kv.l {
        public g(zu.d<? super g> dVar) {
            super(1, dVar);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super x0> dVar) {
            return ((g) create(dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(zu.d<?> dVar) {
            return b.this.new g(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            b bVar = b.this;
            com.moloco.sdk.internal.ilrd.a aVarE = bVar.e();
            if (aVarE != null) {
                aVarE.a();
            }
            bVar.m();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends n implements kv.l {
        public h(zu.d<? super h> dVar) {
            super(1, dVar);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zu.d<? super x0> dVar) {
            return ((h) create(dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(zu.d<?> dVar) {
            return b.this.new h(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            b.this.m();
            return x0.f87415a;
        }
    }

    public /* synthetic */ b(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.i iVar, k0 k0Var, p pVar, String str2, String str3, g0 g0Var, i iVar2, i iVar3, i iVar4, u uVar) {
        this(coroutineScope, str, kVar, j10, i10, j11, j12, iVar, k0Var, pVar, str2, str3, g0Var, iVar2, iVar3, iVar4);
    }

    public final i d() {
        return this.f45973q;
    }

    public final com.moloco.sdk.internal.ilrd.a e() {
        return this.f45975s;
    }

    public final i f() {
        return this.f45971o;
    }

    public final i g() {
        return this.f45972p;
    }

    public final boolean h() {
        boolean z10 = this.f45976t.size() >= this.f45963g;
        if (z10) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "batch size reached", null, false, 12, null);
        }
        return z10;
    }

    public final synchronized void i() {
        a();
        k();
    }

    public final void j() {
        this.f45972p.a(this.f45965i, new f(null));
    }

    public final void k() {
        this.f45971o.a(this.f45962f, new g(null));
    }

    public final void l() {
        this.f45973q.a(this.f45964h, new h(null));
    }

    public final void m() {
        l();
        ArrayList arrayList = this.f45976t;
        if (arrayList.isEmpty()) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Request for sendEvent came, but event list is empty. Returning", null, false, 12, null);
            return;
        }
        v7 v7VarNewBuilder = IlrdRequest$ImpressionRevenueRequest.newBuilder();
        v7VarNewBuilder.setOs("Android");
        v7VarNewBuilder.setPublisherId(this.f45968l);
        v7VarNewBuilder.setPublisherAppId(this.f45969m);
        o oVarA = this.f45967k.a();
        o.a aVar = oVarA instanceof o.a ? (o.a) oVarA : null;
        if (aVar != null) {
            v7VarNewBuilder.setDeviceId(aVar.b());
        }
        v7VarNewBuilder.addAllEvents(arrayList);
        IlrdRequest$ImpressionRevenueRequest ilrdRequest$ImpressionRevenueRequest = (IlrdRequest$ImpressionRevenueRequest) v7VarNewBuilder.build();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Ilrd request created now sending it with " + ilrdRequest$ImpressionRevenueRequest.getEventsList().size() + " events", null, false, 12, null);
        byte[] byteArray = ilrdRequest$ImpressionRevenueRequest.toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        this.f45961e.a(this.f45960c, f45958u.a(byteArray), ContentType.Application.INSTANCE.getProtoBuf(), "gzip");
        arrayList.clear();
    }

    public final void n() {
        this.f45975s = new com.moloco.sdk.internal.ilrd.a(this.f45966j, null, 2, null);
        j();
        l();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("New session started: ");
        com.moloco.sdk.internal.ilrd.a aVar = this.f45975s;
        sb2.append(aVar != null ? aVar.d() : null);
        MolocoLogger.info$default(molocoLogger, "IlrdEventsRepository", sb2.toString(), null, false, 12, null);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // androidx.lifecycle.r
    public void onPause(b1 owner) {
        e0.checkNotNullParameter(owner, "owner");
        d dVar = new d(null);
        BuildersKt.launch(this.f45959b, zu.n.f98854b, CoroutineStart.DEFAULT, dVar);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStart(b1 b1Var) {
        super.onStart(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onStop(b1 b1Var) {
        super.onStop(b1Var);
    }

    public b(CoroutineScope scope, String url, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.i timeProvider, k0 processLifeycle, p advertisingIdService, String pubId, String appId, g0 dataStoreService, i sessionExpiryScheduler, i sessionMaxLengthScheduler, i scheduledUploadScheduler) {
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        e0.checkNotNullParameter(timeProvider, "timeProvider");
        e0.checkNotNullParameter(processLifeycle, "processLifeycle");
        e0.checkNotNullParameter(advertisingIdService, "advertisingIdService");
        e0.checkNotNullParameter(pubId, "pubId");
        e0.checkNotNullParameter(appId, "appId");
        e0.checkNotNullParameter(dataStoreService, "dataStoreService");
        e0.checkNotNullParameter(sessionExpiryScheduler, "sessionExpiryScheduler");
        e0.checkNotNullParameter(sessionMaxLengthScheduler, "sessionMaxLengthScheduler");
        e0.checkNotNullParameter(scheduledUploadScheduler, "scheduledUploadScheduler");
        this.f45959b = scope;
        this.f45960c = url;
        this.f45961e = persistentHttpRequest;
        this.f45962f = j10;
        this.f45963g = i10;
        this.f45964h = j11;
        this.f45965i = j12;
        this.f45966j = timeProvider;
        this.f45967k = advertisingIdService;
        this.f45968l = pubId;
        this.f45969m = appId;
        this.f45970n = dataStoreService;
        this.f45971o = sessionExpiryScheduler;
        this.f45972p = sessionMaxLengthScheduler;
        this.f45973q = scheduledUploadScheduler;
        this.f45974r = MutexKt.Mutex$default(false, 1, null);
        this.f45976t = new ArrayList();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbO = e3.g.o("ILRD repository initialized - url=", url, ", uploadInterval=");
        sbO.append((Object) tv.f.m7219toStringimpl(j11));
        sbO.append(", maxBatchSize=");
        sbO.append(i10);
        sbO.append(", sessionExpiry=");
        sbO.append((Object) tv.f.m7219toStringimpl(j10));
        sbO.append(", maxSessionLength=");
        sbO.append((Object) tv.f.m7219toStringimpl(j12));
        MolocoLogger.info$default(molocoLogger, "IlrdEventsRepository", sbO.toString(), null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(processLifeycle, null), 3, null);
    }

    public final List<IlrdRequest$ImpressionLevelRevenue> b() {
        return this.f45976t;
    }

    public final void b(com.moloco.sdk.internal.ilrd.g ilrdData) {
        e0.checkNotNullParameter(ilrdData, "ilrdData");
        c cVar = new c(ilrdData, null);
        BuildersKt.launch(this.f45959b, zu.n.f98854b, CoroutineStart.DEFAULT, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zu.d<? super tu.x0> r24) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.b.a(zu.d):java.lang.Object");
    }

    public static /* synthetic */ void c() {
    }

    public final IlrdRequest$ImpressionLevelRevenue a(com.moloco.sdk.internal.ilrd.g gVar) {
        s7 eventId = IlrdRequest$ImpressionLevelRevenue.newBuilder().setEventId(UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar = this.f45975s;
        if (aVar != null) {
            eventId.setSessionId(aVar.d());
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Event created: sessionId=" + aVar.d() + ", sessionAge=" + (this.f45966j.a() - aVar.e()) + "ms", null, false, 12, null);
        }
        if (gVar instanceof com.moloco.sdk.internal.ilrd.f) {
            eventId.setMax(((com.moloco.sdk.internal.ilrd.f) gVar).b());
        } else {
            if (!(gVar instanceof com.moloco.sdk.internal.ilrd.e)) {
                throw new t();
            }
            eventId.setLevelplay(((com.moloco.sdk.internal.ilrd.e) gVar).b());
        }
        return (IlrdRequest$ImpressionLevelRevenue) eventId.build();
    }

    public final void a() {
        com.moloco.sdk.internal.ilrd.a aVar = this.f45975s;
        if (aVar != null && !aVar.f()) {
            com.moloco.sdk.internal.ilrd.a aVar2 = this.f45975s;
            if (aVar2 != null) {
                long jA = this.f45966j.a() - aVar2.e();
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sbR = e2.r(jA, "Session validation - age: ", "ms, limit: ");
                long j10 = this.f45965i;
                sbR.append(tv.f.m7195getInWholeMillisecondsimpl(j10));
                sbR.append("ms");
                MolocoLogger.info$default(molocoLogger, "IlrdEventsRepository", sbR.toString(), null, false, 12, null);
                if (jA > tv.f.m7195getInWholeMillisecondsimpl(j10) || jA < 0) {
                    MolocoLogger.info$default(molocoLogger, "IlrdEventsRepository", o2.n(jA, "Session has invalid duration (", "ms), expiring"), null, false, 12, null);
                    aVar2.a();
                    n();
                    return;
                }
                return;
            }
            return;
        }
        n();
    }

    public /* synthetic */ b(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.i iVar, k0 k0Var, p pVar, String str2, String str3, g0 g0Var, i iVar2, i iVar3, i iVar4, int i11, u uVar) {
        this(coroutineScope, str, kVar, j10, i10, j11, j12, iVar, k0Var, pVar, str2, str3, g0Var, (i11 & Segment.SIZE) != 0 ? new i(coroutineScope, iVar, "SessionExpiryScheduler") : iVar2, (i11 & 16384) != 0 ? new i(coroutineScope, iVar, "SessionMaxLengthScheduler") : iVar3, (i11 & 32768) != 0 ? new i(coroutineScope, iVar, "UploadIntervalScheduler") : iVar4, null);
    }
}
