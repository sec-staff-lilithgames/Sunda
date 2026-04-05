package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.Banner;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class w {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.v {

        /* renamed from: b, reason: collision with root package name */
        public static final a f46696b = new a();

        public a() {
            super(8, w.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);
        }

        @Override // kv.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f invoke(Context p02, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b p12, com.moloco.sdk.internal.ortb.model.c p22, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 p32, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 p42, com.moloco.sdk.internal.a p52, com.moloco.sdk.internal.services.c0 p62, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p p72) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            kotlin.jvm.internal.e0.checkNotNullParameter(p12, "p1");
            kotlin.jvm.internal.e0.checkNotNullParameter(p22, "p2");
            kotlin.jvm.internal.e0.checkNotNullParameter(p32, "p3");
            kotlin.jvm.internal.e0.checkNotNullParameter(p42, "p4");
            kotlin.jvm.internal.e0.checkNotNullParameter(p52, "p5");
            kotlin.jvm.internal.e0.checkNotNullParameter(p62, "p6");
            kotlin.jvm.internal.e0.checkNotNullParameter(p72, "p7");
            return w.b(p02, p12, p22, p32, p42, p52, p62, p72);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.l {

        /* renamed from: b, reason: collision with root package name */
        public static final b f46697b = new b();

        public b() {
            super(1, w.class, "createXenossAggregatedAdShowListener", "createXenossAggregatedAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/VastAdShowListener;)Lcom/moloco/sdk/internal/publisher/BannerKt$createXenossAggregatedAdShowListener$1;", 1);
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 p02) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            return w.b(p02);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 f46698a;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
            this.f46698a = c0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a() {
            this.f46698a.a();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(internalShowError, "internalShowError");
            this.f46698a.a(internalShowError);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0
        public void a(boolean z10) {
            this.f46698a.a(z10);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, com.moloco.sdk.internal.ortb.model.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, com.moloco.sdk.internal.a aVar, com.moloco.sdk.internal.services.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p pVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r(context, bVar, null, cVar, a(cVar.e().g()), e0Var, e0Var2, aVar, CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), c0Var, pVar);
    }

    public static final Banner a(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adUnitId, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, j adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, com.moloco.sdk.internal.k bannerSize, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new z(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, z10, externalLinkHandler, a.f46696b, b.f46697b, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, clickthroughService, metricsRecorder);
    }

    public static final c b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        return new c(c0Var);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n a(com.moloco.sdk.internal.ortb.model.p pVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVarA;
        return (pVar == null || (nVarA = com.moloco.sdk.internal.g.a(pVar)) == null) ? com.moloco.sdk.internal.g.a() : nVarA;
    }
}
