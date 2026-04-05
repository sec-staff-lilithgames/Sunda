package com.moloco.sdk.internal.publisher;

import b0.e2;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o implements AdLoad {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f46640b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46641c;

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f46642e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.a f46643f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f46644g;

    /* renamed from: h, reason: collision with root package name */
    public final AdFormatType f46645h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f46646i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46647j;

    /* renamed from: k, reason: collision with root package name */
    public final CoroutineScope f46648k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f46649l;

    /* renamed from: m, reason: collision with root package name */
    public String f46650m;

    /* renamed from: n, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.e f46651n;

    /* renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.acm.g f46652o;

    /* renamed from: p, reason: collision with root package name */
    public Job f46653p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46654i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f46656k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46657l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f46658m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdLoad.Listener listener, long j10, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f46656k = str;
            this.f46657l = listener;
            this.f46658m = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return o.this.new b(this.f46656k, this.f46657l, this.f46658m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.internal.ortb.model.d dVarE;
            com.moloco.sdk.internal.ortb.model.d dVarE2;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46654i;
            o oVar = o.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                this.f46654i = 1;
                obj = oVar.a(this.f46656k, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            String str = (String) obj;
            AdLoad.Listener listener = this.f46657l;
            x0 x0Var = x0.f87415a;
            if (str == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                if (listener != null) {
                    listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(oVar.f46641c, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                com.moloco.sdk.acm.recorder.c cVar = oVar.f46647j;
                com.moloco.sdk.acm.g gVarWithTag = oVar.f46652o.withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure");
                com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
                String strC = bVar.c();
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                com.moloco.sdk.acm.g gVarWithTag2 = gVarWithTag.withTag(strC, String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45864e;
                String strC2 = bVar2.c();
                String strName = oVar.f46645h.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                cVar.recordTimerEvent(gVarWithTag2.withTag(strC2, lowerCase));
                com.moloco.sdk.acm.recorder.c cVar2 = oVar.f46647j;
                com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45850o.c()).withTag(bVar.c(), String.valueOf(errorType.getErrorCode()));
                String strC3 = bVar2.c();
                String lowerCase2 = oVar.f46645h.name().toLowerCase(locale);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                cVar2.recordCountEvent(dVarWithTag.withTag(strC3, lowerCase2));
                return x0Var;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "AdLoad", "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            l0 l0VarA = r.a(listener, oVar.f46652o, oVar.f46645h, oVar.f46647j);
            boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(oVar.f46650m, str);
            long j10 = this.f46658m;
            if (zAreEqual) {
                if (oVar.isLoaded()) {
                    com.moloco.sdk.internal.ortb.model.r rVarI = null;
                    MolocoAd molocoAdCreateAdInfo$default = MolocoAdKt.createAdInfo$default(oVar.f46641c, null, 2, null);
                    com.moloco.sdk.internal.ortb.model.c cVarA = oVar.a(oVar.f46651n);
                    l0VarA.a(molocoAdCreateAdInfo$default, j10, (cVarA == null || (dVarE2 = cVarA.e()) == null) ? null : dVarE2.i());
                    com.moloco.sdk.internal.ortb.model.c cVarA2 = oVar.a(oVar.f46651n);
                    if (cVarA2 != null && (dVarE = cVarA2.e()) != null) {
                        rVarI = dVarE.i();
                    }
                    l0VarA.a(molocoAdCreateAdInfo$default, rVarI);
                    return x0Var;
                }
                Job job = oVar.f46653p;
                if (job != null && job.isActive()) {
                    MolocoLogger.info$default(molocoLogger, "AdLoad", "Already loading ad " + oVar.f46645h + ' ' + oVar.f46641c + ". Returning", null, false, 12, null);
                    return x0Var;
                }
            }
            oVar.a(str, j10, l0VarA);
            return x0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public String f46659i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46660j;

        /* renamed from: l, reason: collision with root package name */
        public int f46662l;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46660j = obj;
            this.f46662l |= Integer.MIN_VALUE;
            return o.this.a((String) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46663i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46664j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f46666l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f46667m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0 f46668n;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f46669a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f46670b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.c f46671c;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.internal.publisher.o$d$a$a, reason: collision with other inner class name */
            public static final class C0385a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ o f46672i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ l0 f46673j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.c f46674k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0385a(o oVar, l0 l0Var, com.moloco.sdk.internal.ortb.model.c cVar, zu.d<? super C0385a> dVar) {
                    super(2, dVar);
                    this.f46672i = oVar;
                    this.f46673j = l0Var;
                    this.f46674k = cVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                    return ((C0385a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0385a(this.f46672i, this.f46673j, this.f46674k, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.d dVarE;
                    av.e.getCOROUTINE_SUSPENDED();
                    tu.a0.throwOnFailure(obj);
                    o oVar = this.f46672i;
                    oVar.f46649l = true;
                    MolocoAd molocoAdCreateAdInfo = MolocoAdKt.createAdInfo(oVar.f46641c, bv.b.boxFloat(this.f46674k.g()));
                    com.moloco.sdk.internal.ortb.model.c cVarA = oVar.a(oVar.f46651n);
                    this.f46673j.a(molocoAdCreateAdInfo, (cVarA == null || (dVarE = cVarA.e()) == null) ? null : dVarE.i());
                    return x0.f87415a;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class b extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ o f46675i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ l0 f46676j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f46677k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(o oVar, l0 l0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, zu.d<? super b> dVar) {
                    super(2, dVar);
                    this.f46675i = oVar;
                    this.f46676j = l0Var;
                    this.f46677k = cVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                    return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new b(this.f46675i, this.f46676j, this.f46677k, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.d dVarE;
                    av.e.getCOROUTINE_SUSPENDED();
                    tu.a0.throwOnFailure(obj);
                    o oVar = this.f46675i;
                    oVar.f46649l = false;
                    com.moloco.sdk.internal.s sVarA = com.moloco.sdk.internal.t.a(oVar.f46641c, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.f46677k);
                    com.moloco.sdk.internal.ortb.model.c cVarA = oVar.a(oVar.f46651n);
                    this.f46676j.a(sVarA, (cVarA == null || (dVarE = cVarA.e()) == null) ? null : dVarE.i());
                    return x0.f87415a;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class c extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ o f46678i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ l0 f46679j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a f46680k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(o oVar, l0 l0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, zu.d<? super c> dVar) {
                    super(2, dVar);
                    this.f46678i = oVar;
                    this.f46679j = l0Var;
                    this.f46680k = aVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                    return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new c(this.f46678i, this.f46679j, this.f46680k, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.d dVarE;
                    av.e.getCOROUTINE_SUSPENDED();
                    tu.a0.throwOnFailure(obj);
                    o oVar = this.f46678i;
                    oVar.f46649l = false;
                    com.moloco.sdk.internal.s sVarA = com.moloco.sdk.internal.t.a(oVar.f46641c, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.f46680k);
                    com.moloco.sdk.internal.ortb.model.c cVarA = oVar.a(oVar.f46651n);
                    this.f46679j.a(sVarA, (cVarA == null || (dVarE = cVarA.e()) == null) ? null : dVarE.i());
                    return x0.f87415a;
                }
            }

            public a(o oVar, l0 l0Var, com.moloco.sdk.internal.ortb.model.c cVar) {
                this.f46669a = oVar;
                this.f46670b = l0Var;
                this.f46671c = cVar;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            public void a() {
                o oVar = this.f46669a;
                BuildersKt__Builders_commonKt.launch$default(oVar.f46648k, null, null, new C0385a(oVar, this.f46670b, this.f46671c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                kotlin.jvm.internal.e0.checkNotNullParameter(timeoutError, "timeoutError");
                o oVar = this.f46669a;
                BuildersKt__Builders_commonKt.launch$default(oVar.f46648k, null, null, new c(oVar, this.f46670b, timeoutError, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                kotlin.jvm.internal.e0.checkNotNullParameter(internalError, "internalError");
                o oVar = this.f46669a;
                BuildersKt__Builders_commonKt.launch$default(oVar.f46648k, null, null, new b(oVar, this.f46670b, internalError, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j10, l0 l0Var, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f46666l = str;
            this.f46667m = j10;
            this.f46668n = l0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = o.this.new d(this.f46666l, this.f46667m, this.f46668n, dVar);
            dVar2.f46664j = obj;
            return dVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public o(CoroutineScope scope, kv.l timeout, String adUnitId, kv.l recreateXenossAdLoader, com.moloco.sdk.internal.ortb.a parseBidResponse, c0 adLoadPreprocessor, AdFormatType adFormatType, com.moloco.sdk.internal.services.k webViewChecker, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(parseBidResponse, "parseBidResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadPreprocessor, "adLoadPreprocessor");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewChecker, "webViewChecker");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46640b = timeout;
        this.f46641c = adUnitId;
        this.f46642e = recreateXenossAdLoader;
        this.f46643f = parseBidResponse;
        this.f46644g = adLoadPreprocessor;
        this.f46645h = adFormatType;
        this.f46646i = webViewChecker;
        this.f46647j = metricsRecorder;
        this.f46648k = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f46652o = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45880l.c());
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46649l;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(this.f46646i.a());
        if (thM7134exceptionOrNullimpl != null) {
            MolocoLogger.INSTANCE.error("AdLoad", e2.o(thM7134exceptionOrNullimpl, new StringBuilder("WebView Error: ")), thM7134exceptionOrNullimpl, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.f46641c, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long jA = a.h.f47463a.h().a();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", a.b.k("load() called with bidResponseJson: ", bidResponseJson), false, 4, null);
        this.f46652o.startTimer();
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45848m.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = this.f46645h.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f46647j.recordCountEvent(dVar.withTag(strC, lowerCase));
        BuildersKt__Builders_commonKt.launch$default(this.f46648k, null, null, new b(bidResponseJson, listener, jA, null), 3, null);
    }

    public final com.moloco.sdk.internal.ortb.model.c a(com.moloco.sdk.internal.ortb.model.e eVar) {
        List<com.moloco.sdk.internal.ortb.model.s> listB;
        com.moloco.sdk.internal.ortb.model.s sVar;
        List<com.moloco.sdk.internal.ortb.model.c> listB2;
        if (eVar == null || (listB = eVar.b()) == null || (sVar = listB.get(0)) == null || (listB2 = sVar.b()) == null) {
            return null;
        }
        return listB2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, zu.d<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.internal.publisher.o.c
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.internal.publisher.o$c r0 = (com.moloco.sdk.internal.publisher.o.c) r0
            int r1 = r0.f46662l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46662l = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.o$c r0 = new com.moloco.sdk.internal.publisher.o$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f46660j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46662l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f46659i
            tu.a0.throwOnFailure(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            tu.a0.throwOnFailure(r6)
            r0.f46659i = r5
            r0.f46662l = r3
            com.moloco.sdk.internal.publisher.c0 r6 = r4.f46644g
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L48
            return r6
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o.a(java.lang.String, zu.d):java.lang.Object");
    }

    public final void a(String str, long j10, l0 l0Var) {
        Job job = this.f46653p;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f46653p = BuildersKt__Builders_commonKt.launch$default(this.f46648k, null, null, new d(str, j10, l0Var, null), 3, null);
    }
}
