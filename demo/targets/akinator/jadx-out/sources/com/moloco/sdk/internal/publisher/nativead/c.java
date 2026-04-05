package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import bv.n;
import com.moloco.sdk.internal.ortb.model.r;
import com.moloco.sdk.internal.publisher.b0;
import com.moloco.sdk.internal.publisher.l0;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import com.moloco.sdk.internal.s;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46471b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f46472c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.parser.a f46473d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.j f46474e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46475f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f46476g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f46477h;

    /* renamed from: i, reason: collision with root package name */
    public final AdFormatType f46478i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.acm.g f46479j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.internal.scheduling.a f46480k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.internal.ortb.model.c f46481a;

        /* renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.internal.publisher.nativead.model.a f46482b;

        /* renamed from: c, reason: collision with root package name */
        public final com.moloco.sdk.internal.publisher.nativead.model.c f46483c;

        public b(com.moloco.sdk.internal.ortb.model.c bid, com.moloco.sdk.internal.publisher.nativead.model.a ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.c preparedAssets) {
            e0.checkNotNullParameter(bid, "bid");
            e0.checkNotNullParameter(ortbResponse, "ortbResponse");
            e0.checkNotNullParameter(preparedAssets, "preparedAssets");
            this.f46481a = bid;
            this.f46482b = ortbResponse;
            this.f46483c = preparedAssets;
        }

        public final com.moloco.sdk.internal.ortb.model.c a() {
            return this.f46481a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.a b() {
            return this.f46482b;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.c c() {
            return this.f46483c;
        }

        public final com.moloco.sdk.internal.ortb.model.c d() {
            return this.f46481a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.a e() {
            return this.f46482b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return e0.areEqual(this.f46481a, bVar.f46481a) && e0.areEqual(this.f46482b, bVar.f46482b) && e0.areEqual(this.f46483c, bVar.f46483c);
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.c f() {
            return this.f46483c;
        }

        public int hashCode() {
            return this.f46483c.hashCode() + ((this.f46482b.hashCode() + (this.f46481a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "LoadedNativeAd(bid=" + this.f46481a + ", ortbResponse=" + this.f46482b + ", preparedAssets=" + this.f46483c + ')';
        }

        public final b a(com.moloco.sdk.internal.ortb.model.c bid, com.moloco.sdk.internal.publisher.nativead.model.a ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.c preparedAssets) {
            e0.checkNotNullParameter(bid, "bid");
            e0.checkNotNullParameter(ortbResponse, "ortbResponse");
            e0.checkNotNullParameter(preparedAssets, "preparedAssets");
            return new b(bid, ortbResponse, preparedAssets);
        }

        public static /* synthetic */ b a(b bVar, com.moloco.sdk.internal.ortb.model.c cVar, com.moloco.sdk.internal.publisher.nativead.model.a aVar, com.moloco.sdk.internal.publisher.nativead.model.c cVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = bVar.f46481a;
            }
            if ((i10 & 2) != 0) {
                aVar = bVar.f46482b;
            }
            if ((i10 & 4) != 0) {
                cVar2 = bVar.f46483c;
            }
            return bVar.a(cVar, aVar, cVar2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.c$c, reason: collision with other inner class name */
    public static final class C0377c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public c f46484i;

        /* renamed from: j, reason: collision with root package name */
        public String f46485j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46486k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46487l;

        /* renamed from: n, reason: collision with root package name */
        public int f46489n;

        public C0377c(zu.d<? super C0377c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46487l = obj;
            this.f46489n |= Integer.MIN_VALUE;
            return c.this.a((com.moloco.sdk.internal.publisher.nativead.model.a) null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l0 f46490i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ s f46491j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r f46492k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l0 l0Var, s sVar, r rVar, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f46490i = l0Var;
            this.f46491j = sVar;
            this.f46492k = rVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f46490i, this.f46491j, this.f46492k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            this.f46490i.a(this.f46491j, this.f46492k);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f46493i;

        /* renamed from: j, reason: collision with root package name */
        public r f46494j;

        /* renamed from: k, reason: collision with root package name */
        public l0 f46495k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46496l;

        /* renamed from: n, reason: collision with root package name */
        public int f46498n;

        public e(zu.d<? super e> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46496l = obj;
            this.f46498n |= Integer.MIN_VALUE;
            Object objA = c.this.a((r) null, (com.moloco.sdk.internal.publisher.nativead.model.a) null, (l0) null, 0L, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f46499i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.a f46501k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f46502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.nativead.model.a aVar, long j10, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f46501k = aVar;
            this.f46502l = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super w> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new f(this.f46501k, this.f46502l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46499i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            this.f46499i = 1;
            Object objA = c.this.a(this.f46501k, this.f46502l, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f46503i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46504j;

        /* renamed from: k, reason: collision with root package name */
        public l0 f46505k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46506l;

        /* renamed from: n, reason: collision with root package name */
        public int f46508n;

        public g(zu.d<? super g> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46506l = obj;
            this.f46508n |= Integer.MIN_VALUE;
            Object objA = c.this.a((String) null, (com.moloco.sdk.acm.g) null, (l0) null, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f46509i;

        /* renamed from: j, reason: collision with root package name */
        public Object f46510j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f46511k;

        /* renamed from: m, reason: collision with root package name */
        public int f46513m;

        public h(zu.d<? super h> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46511k = obj;
            this.f46513m |= Integer.MIN_VALUE;
            Object objA = c.this.a((String) null, (r) null, (l0) null, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f46514i;

        /* renamed from: k, reason: collision with root package name */
        public int f46516k;

        public i(zu.d<? super i> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46514i = obj;
            this.f46516k |= Integer.MIN_VALUE;
            Object objB = c.this.b(null, null, null, this);
            return objB == av.e.getCOROUTINE_SUSPENDED() ? objB : z.m7130boximpl(objB);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public long f46517i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.internal.ortb.model.c f46518j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.internal.publisher.nativead.model.a f46519k;

        /* renamed from: l, reason: collision with root package name */
        public int f46520l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.g f46522n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f46523o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l0 f46524p;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ l0 f46525i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ c f46526j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.c f46527k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f46528l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l0 l0Var, c cVar, com.moloco.sdk.internal.ortb.model.c cVar2, long j10, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f46525i = l0Var;
                this.f46526j = cVar;
                this.f46527k = cVar2;
                this.f46528l = j10;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f46525i, this.f46526j, this.f46527k, this.f46528l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                String str = this.f46526j.f46471b;
                com.moloco.sdk.internal.ortb.model.c cVar = this.f46527k;
                this.f46525i.a(MolocoAdKt.createAdInfo(str, bv.b.boxFloat(cVar.g())), this.f46528l, cVar.e().i());
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.g gVar, String str, l0 l0Var, zu.d<? super j> dVar) {
            super(2, dVar);
            this.f46522n = gVar;
            this.f46523o = str;
            this.f46524p = l0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super z> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new j(this.f46522n, this.f46523o, this.f46524p, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 415
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f46529i;

        /* renamed from: k, reason: collision with root package name */
        public int f46531k;

        public k(zu.d<? super k> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46529i = obj;
            this.f46531k |= Integer.MIN_VALUE;
            return c.this.a((List<? extends a.AbstractC0378a>) null, 0L, this);
        }
    }

    static {
        new a(null);
    }

    public c(Context context, String adUnitId, b0 bidLoader, com.moloco.sdk.internal.publisher.nativead.parser.a ortbResponseParser, com.moloco.sdk.internal.publisher.j createLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder, com.moloco.sdk.internal.services.i timeProvider, com.moloco.sdk.internal.services.k webViewChecker) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(bidLoader, "bidLoader");
        e0.checkNotNullParameter(ortbResponseParser, "ortbResponseParser");
        e0.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        e0.checkNotNullParameter(timeProvider, "timeProvider");
        e0.checkNotNullParameter(webViewChecker, "webViewChecker");
        this.f46470a = context;
        this.f46471b = adUnitId;
        this.f46472c = bidLoader;
        this.f46473d = ortbResponseParser;
        this.f46474e = createLoadTimeoutManager;
        this.f46475f = metricsRecorder;
        this.f46476g = timeProvider;
        this.f46477h = webViewChecker;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.f46478i = adFormatType;
        com.moloco.sdk.acm.g gVarStartTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45887s.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f46479j = gVarStartTimerEvent.withTag(strC, lowerCase);
        this.f46480k = com.moloco.sdk.internal.scheduling.c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, com.moloco.sdk.acm.g r12, com.moloco.sdk.internal.publisher.l0 r13, zu.d<? super tu.z> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.nativead.c.i
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.nativead.c$i r0 = (com.moloco.sdk.internal.publisher.nativead.c.i) r0
            int r1 = r0.f46516k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46516k = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$i r0 = new com.moloco.sdk.internal.publisher.nativead.c$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f46514i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46516k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r14)
            goto L4d
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            tu.a0.throwOnFailure(r14)
            com.moloco.sdk.internal.scheduling.a r14 = r10.f46480k
            zu.m r14 = r14.getDefault()
            com.moloco.sdk.internal.publisher.nativead.c$j r4 = new com.moloco.sdk.internal.publisher.nativead.c$j
            r9 = 0
            r5 = r10
            r7 = r11
            r6 = r12
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f46516k = r3
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r14, r4, r0)
            if (r14 != r1) goto L4d
            return r1
        L4d:
            tu.z r14 = (tu.z) r14
            java.lang.Object r11 = r14.m7139unboximpl()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.b(java.lang.String, com.moloco.sdk.acm.g, com.moloco.sdk.internal.publisher.l0, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, com.moloco.sdk.acm.g r19, com.moloco.sdk.internal.publisher.l0 r20, zu.d<? super tu.z> r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.a(java.lang.String, com.moloco.sdk.acm.g, com.moloco.sdk.internal.publisher.l0, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, com.moloco.sdk.internal.ortb.model.r r13, com.moloco.sdk.internal.publisher.l0 r14, zu.d<? super tu.z> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.publisher.nativead.c.h
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.publisher.nativead.c$h r0 = (com.moloco.sdk.internal.publisher.nativead.c.h) r0
            int r1 = r0.f46513m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46513m = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$h r0 = new com.moloco.sdk.internal.publisher.nativead.c$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f46511k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46513m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r12 = r0.f46509i
            tu.a0.throwOnFailure(r15)
            return r12
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            tu.a0.throwOnFailure(r15)
            com.moloco.sdk.internal.publisher.nativead.parser.a r15 = r11.f46473d
            java.lang.Object r12 = r15.a(r12)
            java.lang.Throwable r7 = tu.z.m7134exceptionOrNullimpl(r12)
            if (r7 == 0) goto L66
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 8
            r10 = 0
            java.lang.String r5 = "NativeAdLoader"
            java.lang.String r6 = "handleOrtbParsing"
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r4, r5, r6, r7, r8, r9, r10)
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r15 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_FAILED
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f47688b
            java.lang.String r4 = r11.f46471b
            com.moloco.sdk.internal.s r15 = com.moloco.sdk.internal.t.a(r4, r15, r2)
            r0.f46509i = r12
            r0.f46510j = r12
            r0.f46513m = r3
            java.lang.Object r13 = r11.a(r14, r15, r13, r0)
            if (r13 != r1) goto L66
            return r1
        L66:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.a(java.lang.String, com.moloco.sdk.internal.ortb.model.r, com.moloco.sdk.internal.publisher.l0, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.internal.ortb.model.r r19, com.moloco.sdk.internal.publisher.nativead.model.a r20, com.moloco.sdk.internal.publisher.l0 r21, long r22, zu.d<? super tu.z> r24) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.a(com.moloco.sdk.internal.ortb.model.r, com.moloco.sdk.internal.publisher.nativead.model.a, com.moloco.sdk.internal.publisher.l0, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.moloco.sdk.internal.publisher.nativead.model.a r14, long r15, zu.d<? super com.moloco.sdk.internal.w> r17) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.a(com.moloco.sdk.internal.publisher.nativead.model.a, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<? extends com.moloco.sdk.internal.publisher.nativead.model.a.AbstractC0378a> r8, long r9, zu.d<? super com.moloco.sdk.internal.w> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.moloco.sdk.internal.publisher.nativead.c.k
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.internal.publisher.nativead.c$k r0 = (com.moloco.sdk.internal.publisher.nativead.c.k) r0
            int r1 = r0.f46531k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46531k = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$k r0 = new com.moloco.sdk.internal.publisher.nativead.c$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f46529i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46531k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r11)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            tu.a0.throwOnFailure(r11)
            r0.f46531k = r3
            android.content.Context r11 = r7.f46470a
            java.lang.Object r11 = com.moloco.sdk.internal.publisher.nativead.parser.d.a(r11, r8, r9, r0)
            if (r11 != r1) goto L3f
            return r1
        L3f:
            com.moloco.sdk.internal.w r11 = (com.moloco.sdk.internal.w) r11
            boolean r8 = r11 instanceof com.moloco.sdk.internal.w.b
            if (r8 == 0) goto L51
            com.moloco.sdk.internal.w$b r8 = new com.moloco.sdk.internal.w$b
            com.moloco.sdk.internal.w$b r11 = (com.moloco.sdk.internal.w.b) r11
            java.lang.Object r9 = r11.a()
            r8.<init>(r9)
            return r8
        L51:
            boolean r8 = r11 instanceof com.moloco.sdk.internal.w.a
            if (r8 == 0) goto L75
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.w$a r11 = (com.moloco.sdk.internal.w.a) r11
            java.lang.Object r8 = r11.a()
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5 = 8
            r6 = 0
            java.lang.String r1 = "NativeAdLoader"
            java.lang.String r2 = "NativeAd prepareAssets failed"
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.w$a r8 = new com.moloco.sdk.internal.w$a
            java.lang.Object r9 = r11.a()
            r8.<init>(r9)
            return r8
        L75:
            tu.t r8 = new tu.t
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.a(java.util.List, long, zu.d):java.lang.Object");
    }

    public final Object a(l0 l0Var, s sVar, r rVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f46480k.getMain(), new d(l0Var, sVar, rVar, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }
}
