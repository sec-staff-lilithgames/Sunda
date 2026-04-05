package com.moloco.sdk.internal.publisher.nativead;

import av.e;
import bv.n;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.moloco.sdk.acm.g;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.e0;
import com.moloco.sdk.internal.publisher.j;
import com.moloco.sdk.internal.publisher.l0;
import com.moloco.sdk.internal.publisher.nativead.c;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kv.p;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements NativeAd, e0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f46450b;

    /* renamed from: c, reason: collision with root package name */
    public final c f46451c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.a f46452e;

    /* renamed from: f, reason: collision with root package name */
    public final r f46453f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46454g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f46455h;

    /* renamed from: i, reason: collision with root package name */
    public final k f46456i;

    /* renamed from: j, reason: collision with root package name */
    public final j f46457j;

    /* renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46458k;

    /* renamed from: l, reason: collision with root package name */
    public NativeAd.InteractionListener f46459l;

    /* renamed from: m, reason: collision with root package name */
    public final AdFormatType f46460m;

    /* renamed from: n, reason: collision with root package name */
    public final CoroutineScope f46461n;

    /* renamed from: o, reason: collision with root package name */
    public final g f46462o;

    /* renamed from: p, reason: collision with root package name */
    public d f46463p;

    /* renamed from: q, reason: collision with root package name */
    public Job f46464q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.b$b, reason: collision with other inner class name */
    public static final class C0376b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public l0 f46465i;

        /* renamed from: j, reason: collision with root package name */
        public int f46466j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f46468l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f46469m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.b$b$a */
        public /* synthetic */ class a extends a0 implements kv.a {
            public a(Object obj) {
                super(0, obj, b.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0);
            }

            public final void a() {
                ((b) this.receiver).handleGeneralAdClick();
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0376b(AdLoad.Listener listener, String str, zu.d<? super C0376b> dVar) {
            super(2, dVar);
            this.f46468l = listener;
            this.f46469m = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C0376b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new C0376b(this.f46468l, this.f46469m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            l0 l0Var;
            Object objM7139unboximpl;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46466j;
            b bVar = b.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                l0 l0VarA = bVar.a(bVar.f46462o, this.f46468l);
                c cVar = bVar.f46451c;
                g gVar = bVar.f46462o;
                this.f46465i = l0VarA;
                this.f46466j = 1;
                Object objB = cVar.b(this.f46469m, gVar, l0VarA, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                l0Var = l0VarA;
                objM7139unboximpl = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l0Var = this.f46465i;
                tu.a0.throwOnFailure(obj);
                objM7139unboximpl = ((z) obj).m7139unboximpl();
            }
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7139unboximpl);
            x0 x0Var = x0.f87415a;
            if (thM7134exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "Failed to load native ad.", thM7134exceptionOrNullimpl, false, 8, null);
                return x0Var;
            }
            c.b bVar2 = (c.b) objM7139unboximpl;
            bVar.a(new d(bVar.f46450b, bVar2.d(), bVar2.e(), bVar.f46453f, bVar.f46454g, bVar.f46460m, bVar.f46456i, bVar.f46455h, bVar.f46458k));
            bVar.getAssets().a(bVar2.f());
            bVar.getAssets().a(new a(bVar));
            l0Var.a(MolocoAdKt.createAdInfo(bVar.f46450b, bv.b.boxFloat(bVar2.d().g())), bVar2.d().e().i());
            return x0Var;
        }
    }

    static {
        new a(null);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f46461n, null, 1, null);
        getAssets().a();
        setInteractionListener(null);
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public long getCreateAdObjectStartTime() {
        return this.f46457j.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public NativeAd.InteractionListener getInteractionListener() {
        return this.f46459l;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleGeneralAdClick() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        d dVar = this.f46463p;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleImpression() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        d dVar = this.f46463p;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return getAssets().c() != null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public synchronized void load(String bidResponseJson, AdLoad.Listener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Job job = this.f46464q;
        if (job != null && job.isActive()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            this.f46464q = BuildersKt__Builders_commonKt.launch$default(this.f46461n, null, null, new C0376b(listener, bidResponseJson, null), 3, null);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46457j.setCreateAdObjectStartTime(j10);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void setInteractionListener(NativeAd.InteractionListener interactionListener) {
        this.f46459l = interactionListener;
    }

    public b(String adUnitId, c nativeAdLoader, com.moloco.sdk.internal.publisher.nativead.a assets, r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, k persistentHttpRequest, j createLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(assets, "assets");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, SFPXhf.kaLrDQsdvAhwZQ);
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46450b = adUnitId;
        this.f46451c = nativeAdLoader;
        this.f46452e = assets;
        this.f46453f = appLifecycleTrackerService;
        this.f46454g = bVar;
        this.f46455h = externalLinkHandler;
        this.f46456i = persistentHttpRequest;
        this.f46457j = createLoadTimeoutManager;
        this.f46458k = metricsRecorder;
        this.f46460m = AdFormatType.NATIVE;
        this.f46461n = com.google.android.gms.internal.play_billing.a.o();
        this.f46462o = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45880l.c());
    }

    public final Job c() {
        return this.f46464q;
    }

    public final CoroutineScope e() {
        return this.f46461n;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public com.moloco.sdk.internal.publisher.nativead.a getAssets() {
        return this.f46452e;
    }

    public final d a() {
        return this.f46463p;
    }

    public final void a(d dVar) {
        this.f46463p = dVar;
    }

    public final void a(Job job) {
        this.f46464q = job;
    }

    public final l0 a(g gVar, AdLoad.Listener listener) {
        return com.moloco.sdk.internal.publisher.r.a(listener, gVar, this.f46460m, this.f46458k);
    }
}
