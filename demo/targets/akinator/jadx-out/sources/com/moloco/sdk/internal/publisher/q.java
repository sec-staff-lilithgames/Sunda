package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdLoad.Listener f46681a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.y f46682b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.g f46683c;

    /* renamed from: d, reason: collision with root package name */
    public final AdFormatType f46684d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f46685e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public q(AdLoad.Listener listener, com.moloco.sdk.internal.y sdkEventUrlTracker, com.moloco.sdk.acm.g acmLoadTimerEvent, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46681a = listener;
        this.f46682b = sdkEventUrlTracker;
        this.f46683c = acmLoadTimerEvent;
        this.f46684d = adFormatType;
        this.f46685e = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.l0
    public void a(MolocoAd molocoAd, long j10, com.moloco.sdk.internal.ortb.model.r rVar) {
        String strG;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadStarted: " + molocoAd + ", " + j10, null, false, 12, null);
        if (rVar == null || (strG = rVar.g()) == null) {
            return;
        }
        com.moloco.sdk.internal.x.a(this.f46682b, strG, j10, null, 4, null);
    }

    @Override // com.moloco.sdk.internal.publisher.l0
    public void a(MolocoAd molocoAd, com.moloco.sdk.internal.ortb.model.r rVar) {
        String strI;
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (rVar != null && (strI = rVar.i()) != null) {
            com.moloco.sdk.internal.x.a(this.f46682b, strI, System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.g gVarWithTag = this.f46683c.withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "success");
        com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45864e;
        String strC = bVar.c();
        AdFormatType adFormatType = this.f46684d;
        String strName = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        com.moloco.sdk.acm.g gVarWithTag2 = gVarWithTag.withTag(strC, lowerCase);
        com.moloco.sdk.acm.recorder.c cVar = this.f46685e;
        cVar.recordTimerEvent(gVarWithTag2);
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45849n.c());
        String strC2 = bVar.c();
        String lowerCase2 = adFormatType.name().toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        cVar.recordCountEvent(dVar.withTag(strC2, lowerCase2));
        AdLoad.Listener listener = this.f46681a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.l0
    public void a(com.moloco.sdk.internal.s internalError, com.moloco.sdk.internal.ortb.model.r rVar) {
        String strE;
        kotlin.jvm.internal.e0.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdLoadListenerTrackerImpl", "onAdLoadFailed: " + internalError, null, false, 12, null);
        if (rVar != null && (strE = rVar.e()) != null) {
            this.f46682b.a(strE, System.currentTimeMillis(), internalError);
        }
        com.moloco.sdk.acm.g gVarWithTag = this.f46683c.withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure");
        com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
        com.moloco.sdk.acm.g gVarWithTag2 = gVarWithTag.withTag(bVar.c(), internalError.d().a());
        com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45864e;
        String strC = bVar2.c();
        AdFormatType adFormatType = this.f46684d;
        String strName = adFormatType.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        com.moloco.sdk.acm.g gVarWithTag3 = gVarWithTag2.withTag(strC, lowerCase);
        com.moloco.sdk.acm.recorder.c cVar = this.f46685e;
        cVar.recordTimerEvent(gVarWithTag3);
        com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.f45850o.c()).withTag("network", internalError.c().getNetworkName()).withTag(bVar.c(), internalError.d().a());
        String strC2 = bVar2.c();
        String lowerCase2 = adFormatType.name().toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        cVar.recordCountEvent(dVarWithTag.withTag(strC2, lowerCase2));
        AdLoad.Listener listener = this.f46681a;
        if (listener != null) {
            listener.onAdLoadFailed(internalError.c());
        }
    }
}
