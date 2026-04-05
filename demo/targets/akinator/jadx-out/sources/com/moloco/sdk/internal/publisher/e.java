package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements InterstitialAdShowListener, AdShowListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdShowListener f46249a;

        public a(InterstitialAdShowListener interstitialAdShowListener) {
            this.f46249a = t.a(interstitialAdShowListener);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46249a.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46249a.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f46249a.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
            this.f46249a.onAdShowSuccess(molocoAd);
        }
    }

    public static final InterstitialAd a(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, g0 adDataHolder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, j adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(adDataHolder, "adDataHolder");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new d(new h0(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new a1.o(7), adDataHolder, AdFormatType.INTERSTITIAL, watermark, adCreateLoadTimeoutManager, metricsRecorder));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n a(com.moloco.sdk.internal.ortb.model.p pVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVarB;
        return (pVar == null || (nVarB = com.moloco.sdk.internal.g.b(pVar)) == null) ? com.moloco.sdk.internal.g.b() : nVarB;
    }

    public static final InterstitialAdShowListener a(InterstitialAdShowListener interstitialAdShowListener) {
        return new a(interstitialAdShowListener);
    }
}
