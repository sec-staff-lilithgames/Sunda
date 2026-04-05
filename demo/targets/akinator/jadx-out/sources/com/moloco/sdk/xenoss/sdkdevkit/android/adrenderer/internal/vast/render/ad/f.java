package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.t;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a {

    /* renamed from: b, reason: collision with root package name */
    public final List f49475b;

    /* renamed from: c, reason: collision with root package name */
    public final j f49476c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f49477e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f49478f;

    /* renamed from: g, reason: collision with root package name */
    public final StateFlow f49479g;

    /* renamed from: h, reason: collision with root package name */
    public final StateFlow f49480h;

    /* renamed from: i, reason: collision with root package name */
    public final Flow f49481i;

    /* renamed from: j, reason: collision with root package name */
    public final StateFlow f49482j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c f49483k;

    /* renamed from: l, reason: collision with root package name */
    public final MutableSharedFlow f49484l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableSharedFlow f49485m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49486i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ n f49488k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49488k = nVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, zu.d<? super x0> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = f.this.new a(this.f49488k, dVar);
            aVar.f49486i = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b) this.f49486i;
            boolean z10 = bVar instanceof b.d;
            f fVar = f.this;
            if (z10) {
                j jVar = fVar.f49476c;
                if (jVar != null) {
                    jVar.a(z.f49426l);
                }
                fVar.a(new b.f(((b.d) bVar).b()));
            } else if (bVar instanceof b.a) {
                fVar.a(b.a.f49463a);
            } else if (bVar instanceof b.c) {
                j jVar2 = fVar.f49476c;
                if (jVar2 != null) {
                    bv.b.boxBoolean(jVar2.b());
                }
                fVar.a(b.C0459b.f49464a);
            } else {
                if (!(bVar instanceof b.C0465b)) {
                    throw new t();
                }
                ((n.a) this.f49488k).a().destroy();
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49489i;

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar, zu.d<? super x0> dVar2) {
            return ((b) create(dVar, dVar2)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = f.this.new b(dVar);
            bVar.f49489i = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.f49489i;
            boolean z10 = dVar instanceof d.C0481d;
            f fVar = f.this;
            if (z10) {
                j jVar = fVar.f49476c;
                if (jVar != null) {
                    jVar.a(z.f49423i);
                }
                fVar.a(new b.f(((d.C0481d) dVar).b()));
            } else if (e0.areEqual(dVar, d.a.f49974a)) {
                fVar.a(b.a.f49463a);
            } else if (e0.areEqual(dVar, d.e.f49978a)) {
                fVar.a(b.i.f49471a);
                fVar.T();
            } else if (e0.areEqual(dVar, d.b.f49975a)) {
                fVar.a(b.c.f49465a);
                bv.b.boxBoolean(fVar.S());
            } else {
                if (!e0.areEqual(dVar, d.c.f49976a)) {
                    throw new t();
                }
                j jVar2 = fVar.f49476c;
                if (jVar2 != null) {
                    bv.b.boxBoolean(jVar2.b());
                }
                fVar.a(b.g.f49469a);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49491i;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar, zu.d<? super x0> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = f.this.new c(dVar);
            cVar.f49491i = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.f49513a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.f49491i).ordinal()];
            f fVar = f.this;
            if (i10 == 1) {
                fVar.a(b.a.f49463a);
            } else {
                if (i10 != 2) {
                    throw new t();
                }
                j jVar = fVar.f49476c;
                if (jVar != null) {
                    bv.b.boxBoolean(jVar.b());
                }
                fVar.a(b.d.f49466a);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49493i;

        public d(zu.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar, zu.d<? super x0> dVar) {
            return ((d) create(nVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = f.this.new d(dVar);
            dVar2.f49493i = obj;
            return dVar2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h.f49514a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n) this.f49493i).ordinal()];
            f fVar = f.this;
            if (i10 == 1) {
                fVar.a(b.i.f49471a);
                fVar.T();
            } else {
                if (i10 != 2) {
                    throw new t();
                }
                fVar.a(b.a.f49463a);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ n f49495i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Boolean f49496j;

        public e(zu.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, Boolean bool, zu.d<? super Boolean> dVar) {
            e eVar = f.this.new e(dVar);
            eVar.f49495i = nVar;
            eVar.f49496j = bool;
            return eVar.invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                av.e.getCOROUTINE_SUSPENDED()
                tu.a0.throwOnFailure(r3)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n r3 = r2.f49495i
                java.lang.Boolean r0 = r2.f49496j
                if (r3 == 0) goto L28
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.this
                java.util.List r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.b(r1)
                java.lang.Object r1 = uu.y0.last(r1)
                boolean r3 = kotlin.jvm.internal.e0.areEqual(r3, r1)
                if (r3 == 0) goto L28
                r3 = 1
                java.lang.Boolean r1 = bv.b.boxBoolean(r3)
                boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r1)
                if (r0 != 0) goto L28
                goto L29
            L28:
                r3 = 0
            L29:
                java.lang.Boolean r3 = bv.b.boxBoolean(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$f, reason: collision with other inner class name */
    public static final class C0460f extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f49498i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b f49500k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0460f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, zu.d<? super C0460f> dVar) {
            super(2, dVar);
            this.f49500k = bVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C0460f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return f.this.new C0460f(this.f49500k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49498i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = f.this.f49484l;
                this.f49498i = 1;
                if (mutableSharedFlow.emit(this.f49500k, this) == coroutine_suspended) {
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
    public static final class g implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f49501b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f49502c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f49503b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f49504c;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a, reason: collision with other inner class name */
            public static final class C0461a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f49505i;

                /* renamed from: j, reason: collision with root package name */
                public int f49506j;

                public C0461a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f49505i = obj;
                    this.f49506j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, f fVar) {
                this.f49503b = flowCollector;
                this.f49504c = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.g.a.C0461a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.g.a.C0461a) r0
                    int r1 = r0.f49506j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f49506j = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f49505i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f49506j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L92
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f r6 = r4.f49504c
                    java.util.List r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.b(r6)
                    java.lang.Object r6 = uu.y0.lastOrNull(r6)
                    boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r5)
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.a
                    if (r2 == 0) goto L54
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n$a r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.a) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a r5 = r5.a()
                    r2.<init>(r5, r6)
                    goto L87
                L54:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.c
                    if (r2 == 0) goto L64
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n$c r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.c) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c r5 = r5.a()
                    r2.<init>(r5, r6)
                    goto L87
                L64:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.b
                    if (r2 == 0) goto L74
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n$b r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.b) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a r5 = r5.a()
                    r2.<init>(r5, r6)
                    goto L87
                L74:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.d
                    if (r2 == 0) goto L84
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$d r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$d
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n$d r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.d) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l r5 = r5.a()
                    r2.<init>(r5, r6)
                    goto L87
                L84:
                    if (r5 != 0) goto L95
                    r2 = 0
                L87:
                    r0.f49506j = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f49503b
                    java.lang.Object r5 = r5.emit(r2, r0)
                    if (r5 != r1) goto L92
                    return r1
                L92:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                L95:
                    tu.t r5 = new tu.t
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.g.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public g(Flow flow, f fVar) {
            this.f49501b = flow;
            this.f49502c = fVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f49501b.collect(new a(flowCollector, this.f49502c), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f49508b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f49509b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a, reason: collision with other inner class name */
            public static final class C0462a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f49510i;

                /* renamed from: j, reason: collision with root package name */
                public int f49511j;

                public C0462a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f49510i = obj;
                    this.f49511j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f49509b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.C0462a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.C0462a) r0
                    int r1 = r0.f49511j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f49511j = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f49510i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f49511j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L70
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n) r5
                    boolean r6 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.a
                    if (r6 == 0) goto L45
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n$a r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.a) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a r5 = r5.a()
                    boolean r5 = r5.K()
                    goto L61
                L45:
                    boolean r6 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.c
                    if (r6 == 0) goto L54
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n$c r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.c) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c r5 = r5.a()
                    boolean r5 = r5.K()
                    goto L61
                L54:
                    boolean r6 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.b
                    if (r6 == 0) goto L59
                    goto L60
                L59:
                    boolean r6 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n.d
                    if (r6 == 0) goto L5e
                    goto L60
                L5e:
                    if (r5 != 0) goto L73
                L60:
                    r5 = 0
                L61:
                    java.lang.Boolean r5 = bv.b.boxBoolean(r5)
                    r0.f49511j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f49509b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L70
                    return r1
                L70:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                L73:
                    tu.t r5 = new tu.t
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public h(Flow flow) {
            this.f49508b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f49508b.collect(new a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public f(List<? extends n> playlist, j jVar) {
        Flow flowOnEach;
        e0.checkNotNullParameter(playlist, "playlist");
        this.f49475b = playlist;
        this.f49476c = jVar;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f49477e = coroutineScopeO;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f49478f = MutableStateFlow;
        g gVar = new g(MutableStateFlow, this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f49479g = FlowKt.stateIn(gVar, coroutineScopeO, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        h hVar = new h(MutableStateFlow);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null);
        Boolean bool = Boolean.FALSE;
        this.f49480h = FlowKt.stateIn(hVar, coroutineScopeO, sharingStartedWhileSubscribed$default, bool);
        Flow flowB = i.b((Flow<? extends n>) MutableStateFlow, coroutineScopeO);
        this.f49481i = flowB;
        this.f49482j = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, flowB, new e(null)), coroutineScopeO, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), bool);
        this.f49483k = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e.a(MutableStateFlow, coroutineScopeO);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f49484l = mutableSharedFlowMutableSharedFlow$default;
        this.f49485m = mutableSharedFlowMutableSharedFlow$default;
        for (n nVar : playlist) {
            if (nVar instanceof n.a) {
                flowOnEach = FlowKt.onEach(((n.a) nVar).a().a(), new a(nVar, null));
            } else if (nVar instanceof n.c) {
                flowOnEach = FlowKt.onEach(((n.c) nVar).a().a(), new b(null));
            } else if (nVar instanceof n.b) {
                flowOnEach = FlowKt.onEach(((n.b) nVar).a().a(), new c(null));
            } else {
                if (!(nVar instanceof n.d)) {
                    throw new t();
                }
                flowOnEach = FlowKt.onEach(((n.d) nVar).a().a(), new d(null));
            }
            FlowKt.launchIn(flowOnEach, this.f49477e);
        }
    }

    public static Object f(f fVar) {
        return c1.property0(new q0(fVar.f49483k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l
    public void B() {
        K();
        a(b.h.f49470a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l
    public void C() {
        n nVar = (n) this.f49478f.getValue();
        if (nVar instanceof n.a) {
            ((n.a) nVar).a().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g.a());
            return;
        }
        if (nVar instanceof n.c) {
            ((n.c) nVar).a().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g.a());
            return;
        }
        if (nVar instanceof n.b) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA DEC playlist item reached", null, false, 12, null);
        } else if (nVar instanceof n.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA Mraid playlist item reached", null, false, 12, null);
        } else {
            if (nVar != null) {
                throw new t();
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA playlist item reached", null, false, 12, null);
        }
    }

    public final void K() {
        n nVar = (n) y0.firstOrNull(this.f49475b);
        if (nVar == null) {
            return;
        }
        a(nVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l
    public StateFlow<Boolean> P() {
        return this.f49482j;
    }

    public final boolean S() {
        Object value = this.f49478f.getValue();
        List list = this.f49475b;
        n nVar = (n) y0.getOrNull(list, y0.indexOf((List<? extends Object>) list, value) + 1);
        if (nVar == null) {
            return false;
        }
        a(nVar);
        return true;
    }

    public final void T() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a aVarB = i.b((List<? extends n>) this.f49475b, (n) this.f49478f.getValue());
        if (aVarB != null) {
            aVarB.u();
        }
        if (S()) {
            return;
        }
        j jVar = this.f49476c;
        if (jVar != null) {
            jVar.a();
        }
        a(b.e.f49467a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f49477e, null, 1, null);
        for (n nVar : this.f49475b) {
            if (nVar instanceof n.a) {
                ((n.a) nVar).a().destroy();
            } else if (nVar instanceof n.c) {
                ((n.c) nVar).a().destroy();
            } else if (nVar instanceof n.b) {
                ((n.b) nVar).a().destroy();
            } else {
                if (!(nVar instanceof n.d)) {
                    throw new t();
                }
                ((n.d) nVar).a().destroy();
            }
        }
        a((n) null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l
    public StateFlow<k> k() {
        return this.f49479g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        return this.f49483k.m();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l
    public StateFlow<Boolean> o() {
        return this.f49480h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l
    public void y() {
        if (m().getValue() instanceof d.a) {
            Object value = this.f49478f.getValue();
            n.c cVar = value instanceof n.c ? (n.c) value : null;
            if (cVar != null) {
                cVar.a().h();
            } else {
                T();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public void d() {
        K();
    }

    public final void a(n nVar) {
        this.f49478f.setValue(nVar);
        if (nVar instanceof n.c) {
            ((n.c) nVar).a().s();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> a() {
        return this.f49485m;
    }

    public final Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
        return BuildersKt__Builders_commonKt.launch$default(this.f49477e, null, null, new C0460f(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        e0.checkNotNullParameter(button, "button");
        MutableStateFlow mutableStateFlow = this.f49478f;
        a.c cVarB = i.b((List<? extends n>) this.f49475b, (n) mutableStateFlow.getValue(), button);
        n nVar = (n) mutableStateFlow.getValue();
        if (nVar instanceof n.c) {
            ((n.c) nVar).a().a(cVarB);
            return;
        }
        if (nVar instanceof n.a) {
            ((n.a) nVar).a().a(cVarB);
            return;
        }
        if (nVar instanceof n.b) {
            ((n.b) nVar).a().a(cVarB);
            return;
        }
        if (nVar instanceof n.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (nVar == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Displaying " + cVarB.d() + " at position: " + cVarB.e() + " of size: " + cVarB.f() + " in unknown playlist item type", null, false, 12, null);
            return;
        }
        throw new t();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        e0.checkNotNullParameter(buttonType, "buttonType");
        MutableStateFlow mutableStateFlow = this.f49478f;
        a.c.EnumC0490a enumC0490aB = i.b((List<? extends n>) this.f49475b, (n) mutableStateFlow.getValue(), buttonType);
        n nVar = (n) mutableStateFlow.getValue();
        if (nVar instanceof n.c) {
            ((n.c) nVar).a().a(enumC0490aB);
            return;
        }
        if (nVar instanceof n.a) {
            ((n.a) nVar).a().a(enumC0490aB);
            return;
        }
        if (nVar instanceof n.b) {
            ((n.b) nVar).a().a(enumC0490aB);
            return;
        }
        if (nVar instanceof n.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonUnRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (nVar == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Unrendering " + enumC0490aB + " in unknown playlist item type", null, false, 12, null);
            return;
        }
        throw new t();
    }
}
