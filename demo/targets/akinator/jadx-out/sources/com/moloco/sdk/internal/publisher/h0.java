package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h0 implements FullscreenAd, e0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f46272b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.r f46273c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46274e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46275f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k f46276g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f46277h;

    /* renamed from: i, reason: collision with root package name */
    public final kv.l f46278i;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f46279j;

    /* renamed from: k, reason: collision with root package name */
    public final AdFormatType f46280k;

    /* renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f46281l;

    /* renamed from: m, reason: collision with root package name */
    public final j f46282m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46283n;

    /* renamed from: o, reason: collision with root package name */
    public final CoroutineScope f46284o;

    /* renamed from: p, reason: collision with root package name */
    public final com.moloco.sdk.acm.g f46285p;

    /* renamed from: q, reason: collision with root package name */
    public com.moloco.sdk.acm.g f46286q;

    /* renamed from: r, reason: collision with root package name */
    public final AdLoad f46287r;

    /* renamed from: s, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f46288s;

    /* renamed from: t, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.a f46289t;

    /* renamed from: u, reason: collision with root package name */
    public kv.l f46290u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.l {
        public a(Object obj) {
            super(1, obj, j.class, "calculateTimeout", "calculateTimeout-5sfh64U(J)J", 0);
        }

        public final long a(long j10) {
            return ((j) this.receiver).a(j10);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return tv.f.m7182boximpl(a(((Number) obj).longValue()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.l {
        public b(Object obj) {
            super(1, obj, h0.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i invoke(com.moloco.sdk.internal.ortb.model.c p02) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            return h0.a((h0) this.receiver, p02);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46291i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f46292j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ m0 f46293k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h0 f46294l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ boolean f46295i;

            public a(zu.d<? super a> dVar) {
                super(2, dVar);
            }

            public final Object a(boolean z10, zu.d<? super Boolean> dVar) {
                return ((a) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f46295i = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                return bv.b.boxBoolean(this.f46295i);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ boolean f46296i;

            public b(zu.d<? super b> dVar) {
                super(2, dVar);
            }

            public final Object a(boolean z10, zu.d<? super Boolean> dVar) {
                return ((b) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f46296i = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                return bv.b.boxBoolean(!this.f46296i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, m0 m0Var, h0 h0Var, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f46292j = gVar;
            this.f46293k = m0Var;
            this.f46294l = h0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new c(this.f46292j, this.f46293k, this.f46294l, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r9, r1, r8) == r0) goto L17;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r8.f46291i
                com.moloco.sdk.internal.publisher.h0 r2 = r8.f46294l
                com.moloco.sdk.internal.publisher.m0 r3 = r8.f46293k
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g r4 = r8.f46292j
                r5 = 1
                r6 = 2
                r7 = 0
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 != r6) goto L19
                tu.a0.throwOnFailure(r9)
                goto L59
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                tu.a0.throwOnFailure(r9)
                goto L3a
            L25:
                tu.a0.throwOnFailure(r9)
                kotlinx.coroutines.flow.StateFlow r9 = r4.m()
                com.moloco.sdk.internal.publisher.h0$c$a r1 = new com.moloco.sdk.internal.publisher.h0$c$a
                r1.<init>(r7)
                r8.f46291i = r5
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1, r8)
                if (r9 != r0) goto L3a
                goto L58
            L3a:
                if (r3 == 0) goto L47
                java.lang.String r9 = com.moloco.sdk.internal.publisher.h0.d(r2)
                com.moloco.sdk.publisher.MolocoAd r9 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r9, r7, r6, r7)
                r3.onAdShowSuccess(r9)
            L47:
                kotlinx.coroutines.flow.StateFlow r9 = r4.m()
                com.moloco.sdk.internal.publisher.h0$c$b r1 = new com.moloco.sdk.internal.publisher.h0$c$b
                r1.<init>(r7)
                r8.f46291i = r6
                java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r1, r8)
                if (r9 != r0) goto L59
            L58:
                return r0
            L59:
                if (r3 == 0) goto L66
                java.lang.String r9 = com.moloco.sdk.internal.publisher.h0.d(r2)
                com.moloco.sdk.publisher.MolocoAd r9 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r9, r7, r6, r7)
                r3.onAdHidden(r9)
            L66:
                tu.x0 r9 = tu.x0.f87415a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.h0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46298j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46299k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, AdLoad.Listener listener, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f46298j = str;
            this.f46299k = listener;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return h0.this.new d(this.f46298j, this.f46299k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            h0.this.f46287r.load(this.f46298j, this.f46299k);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f46303b;

        public f(m0 m0Var) {
            this.f46303b = m0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(internalShowError, "internalShowError");
            h0 h0Var = h0.this;
            h0Var.b(com.moloco.sdk.internal.t.a(h0Var.f46275f, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a() {
            m0 m0Var = this.f46303b;
            if (m0Var != null) {
                m0Var.onAdClicked(MolocoAdKt.createAdInfo$default(h0.this.f46275f, null, 2, null));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdShowListener f46304i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ h0 f46305j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdShowListener adShowListener, h0 h0Var, zu.d<? super g> dVar) {
            super(2, dVar);
            this.f46304i = adShowListener;
            this.f46305j = h0Var;
        }

        public static final u b(h0 h0Var) {
            return h0Var.a();
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new g(this.f46304i, this.f46305j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            AdShowListener adShowListener = this.f46304i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = null;
            final h0 h0Var = this.f46305j;
            if (adShowListener != null) {
                g0 g0Var = h0Var.f46279j;
                com.moloco.sdk.internal.services.r rVar = h0Var.f46273c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar = h0Var.f46274e;
                final int i10 = 0;
                kv.a aVar = new kv.a() { // from class: com.moloco.sdk.internal.publisher.i0
                    @Override // kv.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return h0.g.a(h0Var);
                            default:
                                return h0.g.b(h0Var);
                        }
                    }
                };
                final int i11 = 1;
                g0Var.a(new com.moloco.sdk.internal.publisher.c(this.f46304i, rVar, bVar, aVar, new kv.a() { // from class: com.moloco.sdk.internal.publisher.i0
                    @Override // kv.a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return h0.g.a(h0Var);
                            default:
                                return h0.g.b(h0Var);
                        }
                    }
                }, h0Var.f46280k, h0Var.f46283n));
            } else {
                h0Var.f46279j.a((m0) null);
            }
            m0 m0VarD = h0Var.f46279j.d();
            if (h0Var.f46279j.a() instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA = h0Var.f46279j.a();
                if (rVarA instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) {
                    gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) rVarA;
                }
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA2 = h0Var.f46279j.a();
                if (rVarA2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) {
                    gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) rVarA2;
                }
            }
            x0 x0Var = x0.f87415a;
            if (gVar == null || !h0Var.isLoaded()) {
                if (m0VarD != null) {
                    m0VarD.a(com.moloco.sdk.internal.t.a(h0Var.f46275f, MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED, com.moloco.sdk.internal.p.f46223f));
                }
            } else if (!gVar.m().getValue().booleanValue()) {
                h0Var.a(gVar, m0VarD);
                if (gVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0) gVar).a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z(), h0Var.b(m0VarD));
                    return x0Var;
                }
                if (gVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u) gVar).a(h0Var.f46288s, h0Var.a(m0VarD));
                    return x0Var;
                }
            } else if (m0VarD != null) {
                m0VarD.a(com.moloco.sdk.internal.t.a(h0Var.f46275f, MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING, com.moloco.sdk.internal.p.f46224g));
                return x0Var;
            }
            return x0Var;
        }

        public static final com.moloco.sdk.internal.ortb.model.r a(h0 h0Var) {
            return h0Var.c();
        }
    }

    public h0(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, kv.l generateAggregatedOptions, g0 adDataHolder, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, j adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(generateAggregatedOptions, "generateAggregatedOptions");
        kotlin.jvm.internal.e0.checkNotNullParameter(adDataHolder, "adDataHolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46272b = context;
        this.f46273c = appLifecycleTrackerService;
        this.f46274e = customUserEventBuilderService;
        this.f46275f = adUnitId;
        this.f46276g = persistentHttpRequest;
        this.f46277h = externalLinkHandler;
        this.f46278i = generateAggregatedOptions;
        this.f46279j = adDataHolder;
        this.f46280k = adFormatType;
        this.f46281l = watermark;
        this.f46282m = adCreateLoadTimeoutManager;
        this.f46283n = metricsRecorder;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f46284o = coroutineScopeO;
        com.moloco.sdk.acm.g gVarStartTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45887s.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f46285p = gVarStartTimerEvent.withTag(strC, lowerCase);
        this.f46287r = p.a(coroutineScopeO, new a(adCreateLoadTimeoutManager), adUnitId, new b(this), adFormatType, a.C0394a.f47435a.b(), metricsRecorder);
        this.f46288s = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n) generateAggregatedOptions.invoke(null);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f46284o, null, 1, null);
        a(this, null, 1, null);
        this.f46290u = null;
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public long getCreateAdObjectStartTime() {
        return this.f46282m.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46287r.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        com.moloco.sdk.acm.g gVar = this.f46285p;
        com.moloco.sdk.acm.recorder.c cVar = this.f46283n;
        cVar.recordTimerEvent(gVar);
        this.f46286q = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45886r.c());
        BuildersKt__Builders_commonKt.launch$default(this.f46284o, null, null, new d(bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46282m.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(AdShowListener adShowListener) {
        com.moloco.sdk.acm.g gVar = this.f46286q;
        AdFormatType adFormatType = this.f46280k;
        com.moloco.sdk.acm.recorder.c cVar = this.f46283n;
        if (gVar != null) {
            String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
            String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            cVar.recordTimerEvent(gVar.withTag(strC, lowerCase));
        }
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.C.c());
        String strC2 = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase2 = adFormatType.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        cVar.recordCountEvent(dVar.withTag(strC2, lowerCase2));
        BuildersKt__Builders_commonKt.launch$default(this.f46284o, null, null, new g(adShowListener, this, null), 3, null);
    }

    public final com.moloco.sdk.internal.ortb.model.r c() {
        return this.f46279j.e();
    }

    public final kv.l d() {
        return this.f46290u;
    }

    public final Boolean e() {
        StateFlow<Boolean> stateFlowK;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA = this.f46279j.a();
        if (rVarA == null || (stateFlowK = rVarA.k()) == null) {
            return null;
        }
        return stateFlowK.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o b() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA = this.f46279j.a();
        if (rVarA != null) {
            return rVarA.getCreativeType();
        }
        return null;
    }

    public final f b(m0 m0Var) {
        return new f(m0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f46301b;

        public e(m0 m0Var) {
            this.f46301b = m0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0
        public void a(boolean z10) {
            String strC;
            h0 h0Var = h0.this;
            com.moloco.sdk.internal.ortb.model.a aVar = h0Var.f46289t;
            if (aVar != null && aVar.a() && ((!z10 || aVar.e()) && (strC = aVar.c()) != null)) {
                h0Var.f46276g.a(strC);
            }
            kv.l lVarD = h0Var.d();
            if (lVarD != null) {
                lVarD.invoke(Boolean.valueOf(z10));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(internalShowError, "internalShowError");
            h0 h0Var = h0.this;
            h0Var.b(com.moloco.sdk.internal.t.a(h0Var.f46275f, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a() {
            m0 m0Var = this.f46301b;
            if (m0Var != null) {
                m0Var.onAdClicked(MolocoAdKt.createAdInfo$default(h0.this.f46275f, null, 2, null));
            }
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(h0 h0Var, com.moloco.sdk.internal.ortb.model.c cVar) {
        com.moloco.sdk.internal.ortb.model.p pVarG;
        g0 g0Var = h0Var.f46279j;
        a(h0Var, null, 1, null);
        com.moloco.sdk.internal.ortb.model.n nVarA = cVar.e().a();
        if (nVarA != null ? kotlin.jvm.internal.e0.areEqual(nVarA.a(), Boolean.TRUE) : false) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t.a(h0Var.f46272b, cVar.a(), new com.moloco.sdk.internal.services.d0(h0Var.f46277h, h0Var.f46274e), h0Var.f46281l, h0Var.f46283n);
            g0Var.a(rVarA);
            com.moloco.sdk.internal.ortb.model.d dVarE = cVar.e();
            g0Var.a(dVarE != null ? dVarE.i() : null);
            g0Var.a(cVar.c() != null ? new u(cVar.c(), Float.valueOf(cVar.g())) : null);
            return rVarA;
        }
        kv.l lVar = h0Var.f46278i;
        com.moloco.sdk.internal.ortb.model.d dVarE2 = cVar.e();
        h0Var.f46288s = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n) lVar.invoke(dVarE2 != null ? dVarE2.g() : null);
        com.moloco.sdk.internal.ortb.model.d dVarE3 = cVar.e();
        h0Var.f46289t = (dVarE3 == null || (pVarG = dVarE3.g()) == null) ? null : pVarG.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t.a(h0Var.f46272b, h0Var.f46274e, null, cVar, h0Var.f46277h, h0Var.f46281l, 4, null);
        g0Var.a(rVarA2);
        com.moloco.sdk.internal.ortb.model.d dVarE4 = cVar.e();
        g0Var.a(dVarE4 != null ? dVarE4.i() : null);
        g0Var.a(cVar.c() != null ? new u(cVar.c(), Float.valueOf(cVar.g())) : null);
        return rVarA2;
    }

    public final void b(com.moloco.sdk.internal.s sVar) {
        StateFlow<Boolean> stateFlowM;
        g0 g0Var = this.f46279j;
        Job jobB = g0Var.b();
        if (jobB != null) {
            Job.DefaultImpls.cancel$default(jobB, (CancellationException) null, 1, (Object) null);
        }
        g0Var.a((Job) null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA = g0Var.a();
        boolean z10 = (rVarA == null || (stateFlowM = rVarA.m()) == null || !stateFlowM.getValue().booleanValue()) ? false : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarA2 = g0Var.a();
        if (rVarA2 != null) {
            rVarA2.destroy();
        }
        g0Var.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r) null);
        m0 m0VarD = g0Var.d();
        g0Var.a((m0) null);
        if (sVar != null && m0VarD != null) {
            m0VarD.a(sVar);
        }
        if (z10 && m0VarD != null) {
            m0VarD.onAdHidden(MolocoAdKt.createAdInfo$default(this.f46275f, null, 2, null));
        }
        g0Var.a((com.moloco.sdk.internal.ortb.model.r) null);
        g0Var.a((u) null);
    }

    public /* synthetic */ h0(Context context, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, kv.l lVar, g0 g0Var, AdFormatType adFormatType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, j jVar, com.moloco.sdk.acm.recorder.c cVar, int i10, kotlin.jvm.internal.u uVar) {
        this(context, rVar, bVar, str, kVar, e0Var, lVar, (i10 & 128) != 0 ? new g0(null, null, null, null, null, 31, null) : g0Var, adFormatType, e0Var2, jVar, cVar);
    }

    public final u a() {
        return this.f46279j.c();
    }

    public static /* synthetic */ void a(h0 h0Var, com.moloco.sdk.internal.s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = null;
        }
        h0Var.b(sVar);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, m0 m0Var) {
        g0 g0Var = this.f46279j;
        Job jobB = g0Var.b();
        if (jobB != null) {
            Job.DefaultImpls.cancel$default(jobB, (CancellationException) null, 1, (Object) null);
        }
        g0Var.a(BuildersKt__Builders_commonKt.launch$default(this.f46284o, null, null, new c(gVar, m0Var, this, null), 3, null));
    }

    public final void a(kv.l lVar) {
        this.f46290u = lVar;
    }

    public final e a(m0 m0Var) {
        return new e(m0Var);
    }
}
