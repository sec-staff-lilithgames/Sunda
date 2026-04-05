package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdShowListener f46427a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.r f46428b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f46429c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.a f46430d;

    /* renamed from: e, reason: collision with root package name */
    public final kv.a f46431e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.internal.y f46432f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.h f46433g;

    /* renamed from: h, reason: collision with root package name */
    public final AdFormatType f46434h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46435i;

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
        public int f46436i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f46438k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u f46439l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, u uVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f46438k = j10;
            this.f46439l = uVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return n0.this.new b(this.f46438k, this.f46439l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f46436i;
            n0 n0Var = n0.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar = n0Var.f46429c;
                a.e eVar = a.e.f50261a;
                String strA = this.f46439l.a();
                this.f46436i = 1;
                obj = bVar.a(this.f46438k, eVar, strA, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            n0Var.f46433g.a((String) obj);
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    public n0(AdShowListener adShowListener, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, kv.a provideSdkEvents, kv.a provideBUrlData, com.moloco.sdk.internal.y sdkEventUrlTracker, com.moloco.sdk.internal.h bUrlTracker, AdFormatType adType, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.e0.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46427a = adShowListener;
        this.f46428b = appLifecycleTrackerService;
        this.f46429c = customUserEventBuilderService;
        this.f46430d = provideSdkEvents;
        this.f46431e = provideBUrlData;
        this.f46432f = sdkEventUrlTracker;
        this.f46433g = bUrlTracker;
        this.f46434h = adType;
        this.f46435i = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void onAdClicked(MolocoAd molocoAd) {
        String strA;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdClicked: " + molocoAd, false, 4, null);
        this.f46428b.b();
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46430d.invoke();
        if (rVar != null && (strA = rVar.a()) != null) {
            com.moloco.sdk.internal.x.a(this.f46432f, strA, System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.F.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = this.f46434h.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f46435i.recordCountEvent(dVar.withTag(strC, lowerCase));
        AdShowListener adShowListener = this.f46427a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void onAdHidden(MolocoAd molocoAd) {
        String strC;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdHidden: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46430d.invoke();
        if (rVar != null && (strC = rVar.c()) != null) {
            com.moloco.sdk.internal.x.a(this.f46432f, strC, System.currentTimeMillis(), null, 4, null);
        }
        AdShowListener adShowListener = this.f46427a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void onAdShowSuccess(MolocoAd molocoAd) {
        n0 n0Var;
        String strM;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowSuccess: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46430d.invoke();
        if (rVar != null && (strM = rVar.m()) != null) {
            com.moloco.sdk.internal.x.a(this.f46432f, strM, System.currentTimeMillis(), null, 4, null);
        }
        u uVar = (u) this.f46431e.invoke();
        if (uVar != null) {
            n0Var = this;
            BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.d.f46748a.b(), null, null, n0Var.new b(System.currentTimeMillis(), uVar, null), 3, null);
        } else {
            n0Var = this;
        }
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.D.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = n0Var.f46434h.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        n0Var.f46435i.recordCountEvent(dVar.withTag(strC, lowerCase));
        AdShowListener adShowListener = n0Var.f46427a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void a(com.moloco.sdk.internal.s internalError) {
        String strK;
        kotlin.jvm.internal.e0.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onAdShowFailed: " + internalError, false, 4, null);
        com.moloco.sdk.internal.ortb.model.r rVar = (com.moloco.sdk.internal.ortb.model.r) this.f46430d.invoke();
        if (rVar != null && (strK = rVar.k()) != null) {
            this.f46432f.a(strK, System.currentTimeMillis(), internalError);
        }
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.E.c());
        String strC = com.moloco.sdk.internal.client_metrics_data.b.f45864e.c();
        String lowerCase = this.f46434h.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f46435i.recordCountEvent(dVar.withTag(strC, lowerCase).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), String.valueOf(internalError.c().getErrorType())));
        AdShowListener adShowListener = this.f46427a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(internalError.c());
        }
    }
}
