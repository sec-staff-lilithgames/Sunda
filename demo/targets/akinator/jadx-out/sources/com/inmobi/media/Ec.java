package com.inmobi.media;

import com.amazon.device.ads.DTBMetricReport;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ec extends Ac {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fc f31756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sf f31757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wc f31758c;

    public Ec(Fc fc2, Sf sf2, Wc wc2) {
        this.f31756a = fc2;
        this.f31757b = sf2;
        this.f31758c = wc2;
    }

    public static final void b(Sf webViewFactory, Wc route, Fc this$0, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewFactory, "$webViewFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "$route");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        String id2 = route.f32466a;
        webViewFactory.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3093yc sourceView = (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(id2);
        if (sourceView == null) {
            F5 logger = this$0.getLogger();
            if (logger != null) {
                ((G5) logger).b(this$0.f31797f1, "Source RenderView not found for id: " + route.f32466a);
                return;
            }
            return;
        }
        Integer numA = renderView.getWvStateMachine().a(2);
        if (numA != null) {
            int iIntValue = numA.intValue();
            F5 logger2 = this$0.getLogger();
            if (logger2 != null) {
                ((G5) logger2).b(this$0.f31797f1, a.b.e(iIntValue, "Failed to transition to FIRE_AD_READY state: "));
            }
            sourceView.a("loadWebView", Jc.a(renderView.getRoute().f32467b, iIntValue));
            return;
        }
        String targetId = route.f32467b;
        this$0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceView, "sourceView");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetId, "targetId");
        F5 f52 = this$0.f33628i;
        if (f52 != null) {
            String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).c(TAG, "fireLoadWebViewSuccess " + this$0);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        Hc hc2 = this$0.f33613a0;
        jSONObject.put(DTBMetricReport.LATENCY, hc2 != null ? hc2.f31854h : 0L);
        sourceView.c("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    @Override // com.inmobi.media.Ac
    public final void a(C3078xe telemetryOnAdImpression) {
        Ac listener;
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.Ac
    public final void e(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.Ac
    public final void f(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.Ac
    public final void g(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.Ac
    public final void h(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.l runnable = new zk.l(this.f31757b, this.f31758c, this.f31756a, renderView, 1);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @Override // com.inmobi.media.Ac
    public final void i(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        zk.l runnable = new zk.l(this.f31757b, this.f31758c, this.f31756a, renderView, 0);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @Override // com.inmobi.media.Ac
    public final void j(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.Ac
    public final void k(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().k(adRenderView);
        }
    }

    public static final void a(Sf webViewFactory, Wc route, Fc this$0, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewFactory, "$webViewFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "$route");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        String id2 = route.f32466a;
        webViewFactory.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(id2);
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            F5 logger = this$0.getLogger();
            if (logger != null) {
                ((G5) logger).b(this$0.f31797f1, "Source RenderView not found for id: " + route.f32466a);
                return;
            }
            return;
        }
        Integer numA = renderView.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            F5 logger2 = this$0.getLogger();
            if (logger2 != null) {
                ((G5) logger2).b(this$0.f31797f1, a.b.e(iIntValue, "Failed to transition to FIRE_AD_FAILED state: "));
            }
            gestureDetectorOnGestureListenerC3093yc.a("loadWebView", Jc.a(renderView.getRoute().f32467b, iIntValue));
        }
    }

    @Override // com.inmobi.media.Ac
    public final void c() {
    }

    @Override // com.inmobi.media.Ac
    public final void a(HashMap params) {
        Ac listener;
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(params);
    }

    @Override // com.inmobi.media.Ac
    public final void a(String eventType, Map kv2) {
        Ac listener;
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(kv2, "kv");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv2);
    }

    @Override // com.inmobi.media.Ac, com.inmobi.media.InterfaceC2758ef
    public final void a() {
        Ac listener;
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.Ac
    public final void a(GestureDetectorOnGestureListenerC3093yc renderView, String trackerName, Map macros) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.e0.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.Ac
    public final void a(F1 audioStatusInternal) {
        Ac listener;
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.Ac
    public final void a(boolean z10) {
        Ac listener;
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z10);
    }

    @Override // com.inmobi.media.Ac
    public final void a(String data) {
        Ac listener;
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    @Override // com.inmobi.media.Ac
    public final void a(GestureDetectorOnGestureListenerC3093yc renderView, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
        com.applovin.impl.d9 runnable = new com.applovin.impl.d9(this.f31756a, this.f31758c, z10, 6);
        executorC3020u7.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        executorC3020u7.f33447a.post(runnable);
    }

    @Override // com.inmobi.media.Ac
    public final void b(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC3093yc adRenderView = this.f31756a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    public static final void a(Fc this$0, Wc route, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "$route");
        if (this$0.getWvStateMachine().a(4) != null) {
            this$0.a("loadWebView", Jc.a(route.f32467b, 307));
        }
        GestureDetectorOnGestureListenerC3093yc adRenderView = this$0.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z10);
        }
    }
}
