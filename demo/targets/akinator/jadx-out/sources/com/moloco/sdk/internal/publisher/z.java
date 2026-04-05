package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z extends Banner implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f46704b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.r f46705c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46706e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46707f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f46708g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f46709h;

    /* renamed from: i, reason: collision with root package name */
    public final kv.v f46710i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f46711j;

    /* renamed from: k, reason: collision with root package name */
    public final j f46712k;

    /* renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f46713l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.internal.k f46714m;

    /* renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.c0 f46715n;

    /* renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46716o;

    /* renamed from: p, reason: collision with root package name */
    public final com.moloco.sdk.acm.g f46717p;

    /* renamed from: q, reason: collision with root package name */
    public com.moloco.sdk.acm.g f46718q;

    /* renamed from: r, reason: collision with root package name */
    public final CoroutineScope f46719r;

    /* renamed from: s, reason: collision with root package name */
    public final v f46720s;

    /* renamed from: t, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p f46721t;

    /* renamed from: u, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.b f46722u;

    /* renamed from: v, reason: collision with root package name */
    public BannerAdShowListener f46723v;

    /* renamed from: w, reason: collision with root package name */
    public final AdLoad f46724w;

    /* renamed from: x, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 f46725x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.l {
        public b(Object obj) {
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
    public /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.l {
        public c(Object obj) {
            super(1, obj, z.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i invoke(com.moloco.sdk.internal.ortb.model.c p02) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            return ((z) this.receiver).a(p02);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f46726i;

        public d(zu.d<? super d> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super Boolean> dVar) {
            return ((d) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f46726i = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            return bv.b.boxBoolean(!this.f46726i);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f46727i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ v f46729k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v vVar, zu.d<? super e> dVar) {
            super(2, dVar);
            this.f46729k = vVar;
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((e) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            e eVar = z.this.new e(this.f46729k, dVar);
            eVar.f46727i = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVarF;
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            boolean z10 = this.f46727i;
            z zVar = z.this;
            if (zVar.f46720s.g() && (fVarF = zVar.f46720s.f()) != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.moloco.sdk.internal.l.a(zVar.f46714m.b()), com.moloco.sdk.internal.l.a(zVar.f46714m.a()));
                layoutParams.gravity = zVar.getCurrentBannerGravity();
                fVarF.setLayoutParams(layoutParams);
            }
            if (z10) {
                com.moloco.sdk.acm.g gVar = zVar.f46718q;
                if (gVar != null) {
                    com.moloco.sdk.acm.recorder.c cVar = zVar.f46716o;
                    String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
                    String lowerCase = com.ironsource.mediationsdk.l.f37554a.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    cVar.recordTimerEvent(gVar.withTag(strC, lowerCase));
                }
                com.moloco.sdk.internal.publisher.b bVar = zVar.f46722u;
                if (bVar != null) {
                    bVar.onAdShowSuccess(MolocoAdKt.createAdInfo$default(zVar.f46707f, null, 2, null));
                }
            } else {
                com.moloco.sdk.internal.publisher.b bVar2 = zVar.f46722u;
                if (bVar2 != null) {
                    bVar2.onAdHidden(MolocoAdKt.createAdInfo$default(zVar.f46707f, null, 2, null));
                }
                Job jobA = this.f46729k.a();
                if (jobA != null) {
                    Job.DefaultImpls.cancel$default(jobA, (CancellationException) null, 1, (Object) null);
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f46731j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46732k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, AdLoad.Listener listener, zu.d<? super f> dVar) {
            super(2, dVar);
            this.f46731j = str;
            this.f46732k = listener;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return z.this.new f(this.f46731j, this.f46732k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            z.this.f46724w.load(this.f46731j, this.f46732k);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46733i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SharedFlow f46734j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ z f46735k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f46736b;

            public a(z zVar) {
                this.f46736b = zVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(x0 x0Var, zu.d<? super x0> dVar) {
                this.f46736b.f46725x.a();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SharedFlow<x0> sharedFlow, z zVar, zu.d<? super g> dVar) {
            super(2, dVar);
            this.f46734j = sharedFlow;
            this.f46735k = zVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new g(this.f46734j, this.f46735k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46733i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                a aVar = new a(this.f46735k);
                this.f46733i = 1;
                if (this.f46734j.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            throw new tu.k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f46737i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f46738j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0 f46739k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ z f46740l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow f46741m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0 h0Var, z zVar, MutableSharedFlow<x0> mutableSharedFlow, zu.d<? super h> dVar) {
            super(2, dVar);
            this.f46738j = motionEvent;
            this.f46739k = h0Var;
            this.f46740l = zVar;
            this.f46741m = mutableSharedFlow;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new h(this.f46738j, this.f46739k, this.f46740l, this.f46741m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46737i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                MotionEvent motionEvent = this.f46738j;
                if (motionEvent != null) {
                    z zVar = this.f46740l;
                    com.moloco.sdk.internal.services.c0 c0Var = zVar.f46715n;
                    String strC = zVar.f46720s.c();
                    String strD = zVar.f46720s.d();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p pVar = zVar.f46721t;
                    this.f46737i = 1;
                    if (this.f46739k.a(motionEvent, c0Var, strC, strD, pVar, this.f46741m, (64 & 64) != 0 ? com.moloco.sdk.internal.a0.b() : null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public static final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 {
        public i() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0
        public void a(boolean z10) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(internalShowError, "internalShowError");
            z zVar = z.this;
            zVar.a(com.moloco.sdk.internal.t.a(zVar.f46707f, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError));
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a() {
            z zVar = z.this;
            com.moloco.sdk.internal.publisher.b bVar = zVar.f46722u;
            if (bVar != null) {
                bVar.onAdClicked(MolocoAdKt.createAdInfo$default(zVar.f46707f, null, 2, null));
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adUnitId, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, kv.v createXenossBannerView, kv.l createXenossBannerAdShowListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, j adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwner, com.moloco.sdk.internal.k bannerSize, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(createXenossBannerView, "createXenossBannerView");
        kotlin.jvm.internal.e0.checkNotNullParameter(createXenossBannerAdShowListener, "createXenossBannerAdShowListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46704b = context;
        this.f46705c = appLifecycleTrackerService;
        this.f46706e = customUserEventBuilderService;
        this.f46707f = adUnitId;
        this.f46708g = z10;
        this.f46709h = externalLinkHandler;
        this.f46710i = createXenossBannerView;
        this.f46711j = watermark;
        this.f46712k = adCreateLoadTimeoutManager;
        this.f46713l = viewLifecycleOwner;
        this.f46714m = bannerSize;
        this.f46715n = clickthroughService;
        this.f46716o = metricsRecorder;
        if (getLayoutParams() == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        }
        com.moloco.sdk.acm.g gVarStartTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45887s.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = com.ironsource.mediationsdk.l.f37554a.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f46717p = gVarStartTimerEvent.withTag(strC, lowerCase);
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f46719r = coroutineScopeO;
        this.f46720s = new v(null, null, null, null, null, null, false, 127, null);
        this.f46721t = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a();
        this.f46724w = p.a(coroutineScopeO, new b(adCreateLoadTimeoutManager), adUnitId, new c(this), AdFormatType.BANNER, a.C0394a.f47435a.b(), metricsRecorder);
        this.f46725x = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0) createXenossBannerAdShowListener.invoke(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentBannerGravity() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        return 0;
    }

    public static final com.moloco.sdk.internal.ortb.model.r l(z zVar) {
        return zVar.f46720s.e();
    }

    public static final u m(z zVar) {
        return zVar.f46720s.b();
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f46719r, null, 1, null);
        a(this, null, 1, null);
        setAdShowListener(null);
        this.f46722u = null;
    }

    @Override // com.moloco.sdk.publisher.Banner
    public BannerAdShowListener getAdShowListener() {
        return this.f46723v;
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public long getCreateAdObjectStartTime() {
        return this.f46712k.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46724w.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        com.moloco.sdk.acm.g gVar = this.f46717p;
        com.moloco.sdk.acm.recorder.c cVar = this.f46716o;
        cVar.recordTimerEvent(gVar);
        this.f46718q = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45886r.c());
        BuildersKt__Builders_commonKt.launch$default(this.f46719r, null, null, new f(bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(BannerAdShowListener bannerAdShowListener) {
        com.moloco.sdk.internal.publisher.b bVarA = a(bannerAdShowListener);
        this.f46722u = bVarA;
        this.f46723v = bVarA.a();
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46712k.setCreateAdObjectStartTime(j10);
    }

    public final com.moloco.sdk.internal.publisher.b a(BannerAdShowListener bannerAdShowListener) {
        final int i10 = 0;
        kv.a aVar = new kv.a(this) { // from class: com.moloco.sdk.internal.publisher.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f46700c;

            {
                this.f46700c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return z.l(this.f46700c);
                    default:
                        return z.m(this.f46700c);
                }
            }
        };
        final int i11 = 1;
        return new com.moloco.sdk.internal.publisher.b(bannerAdShowListener, this.f46705c, this.f46706e, aVar, new kv.a(this) { // from class: com.moloco.sdk.internal.publisher.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f46700c;

            {
                this.f46700c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return z.l(this.f46700c);
                    default:
                        return z.m(this.f46700c);
                }
            }
        }, AdFormatType.BANNER, this.f46716o);
    }

    public static /* synthetic */ void a(z zVar, com.moloco.sdk.internal.s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = null;
        }
        zVar.a(sVar);
    }

    public final void a(com.moloco.sdk.internal.s sVar) {
        com.moloco.sdk.internal.publisher.b bVar;
        com.moloco.sdk.internal.publisher.b bVar2;
        v vVar = this.f46720s;
        Job jobA = vVar.a();
        if (jobA != null) {
            Job.DefaultImpls.cancel$default(jobA, (CancellationException) null, 1, (Object) null);
        }
        vVar.a((Job) null);
        boolean zBooleanValue = a(vVar.f()).getValue().booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVarF = vVar.f();
        if (fVarF != null) {
            fVarF.destroy();
        }
        vVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) null);
        if (sVar != null && (bVar2 = this.f46722u) != null) {
            bVar2.a(sVar);
        }
        if (zBooleanValue && (bVar = this.f46722u) != null) {
            bVar.onAdHidden(MolocoAdKt.createAdInfo$default(this.f46707f, null, 2, null));
        }
        vVar.a((com.moloco.sdk.internal.ortb.model.r) null);
        vVar.a((u) null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i a(com.moloco.sdk.internal.ortb.model.c cVar) {
        com.moloco.sdk.internal.ortb.model.b bVarA;
        com.moloco.sdk.internal.ortb.model.b bVarA2;
        a(this, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f) this.f46710i.invoke(this.f46704b, this.f46706e, cVar, this.f46709h, this.f46711j, this.f46713l, this.f46715n, this.f46721t);
        v vVar = this.f46720s;
        vVar.a(fVar);
        vVar.a(cVar.e().i());
        vVar.a(cVar.c() != null ? new u(cVar.c(), Float.valueOf(cVar.g())) : null);
        com.moloco.sdk.internal.ortb.model.m mVarC = cVar.e().c();
        vVar.b((mVarC == null || (bVarA2 = mVarC.a()) == null) ? null : bVarA2.a());
        com.moloco.sdk.internal.ortb.model.m mVarC2 = cVar.e().c();
        vVar.a((mVarC2 == null || (bVarA = mVarC2.a()) == null) ? null : bVarA.c());
        com.moloco.sdk.internal.ortb.model.m mVarC3 = cVar.e().c();
        vVar.a((mVarC3 != null ? mVarC3.a() : null) != null);
        fVar.setAdShowListener(this.f46725x);
        a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) fVar);
        com.moloco.sdk.internal.k kVar = this.f46714m;
        addView(fVar, new FrameLayout.LayoutParams(com.moloco.sdk.internal.l.a(kVar.b()), com.moloco.sdk.internal.l.a(kVar.a())));
        if (vVar.g()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0 h0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0(this.f46704b);
            final MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            BuildersKt__Builders_commonKt.launch$default(this.f46719r, null, null, new g(mutableSharedFlowMutableSharedFlow$default, this, null), 3, null);
            h0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.y
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return z.a(this.f46701b, h0Var, mutableSharedFlowMutableSharedFlow$default, view, motionEvent);
                }
            });
            addView(h0Var, new FrameLayout.LayoutParams(-1, com.moloco.sdk.internal.l.a(kVar.a())));
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g(this.f46709h, this.f46704b, null, 0, 12, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        gVar.setPadding(12, 0, 0, 12);
        gVar.setPrivacyUrl("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
        gVar.setOnButtonRenderedListener(new aw.f(this, 3));
        gVar.setLayoutParams(layoutParams);
        addView(gVar);
        return fVar;
    }

    public static final boolean a(z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0 h0Var, MutableSharedFlow mutableSharedFlow, View view, MotionEvent motionEvent) {
        BuildersKt__Builders_commonKt.launch$default(zVar.f46719r, null, null, new h(motionEvent, h0Var, zVar, mutableSharedFlow, null), 3, null);
        return false;
    }

    public static final x0 a(z zVar, a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        zVar.f46721t.a(button);
        return x0.f87415a;
    }

    public final StateFlow<Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar) {
        if (!this.f46708g && fVar != null) {
            return fVar.m();
        }
        return isViewShown();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        v vVar = this.f46720s;
        Job jobA = vVar.a();
        if (jobA != null) {
            Job.DefaultImpls.cancel$default(jobA, (CancellationException) null, 1, (Object) null);
        }
        vVar.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(a(vVar.f()), new d(null)), new e(vVar, null)), this.f46719r));
    }
}
