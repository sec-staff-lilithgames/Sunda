package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2839jc implements InterfaceC2779g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f32980a;

    public C2839jc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f32980a = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(String url, String api, X6 x62) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        this.f32980a.getLandingPageHandler().a(url, api, x62);
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void b() {
        F5 f52 = this.f32980a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onCCTScreenDisplayed");
        }
        this.f32980a.getListener().f(this.f32980a);
        GestureDetectorOnGestureListenerC3093yc.a(this.f32980a, null, null, null);
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void c() {
        F5 f52 = this.f32980a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onCCTPageLoadedSuccessfully");
        }
        this.f32980a.q();
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(L6 funnelState, X6 x62, Integer num) {
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "landingPageFunnelState");
        S6 landingPageHandler = this.f32980a.getLandingPageHandler();
        landingPageHandler.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
        P6.a(funnelState, x62, num, new R6(landingPageHandler));
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a() {
        F5 f52 = this.f32980a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onCCTScreenDismissed");
        }
        this.f32980a.A();
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        F5 f52 = this.f32980a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onCCTLayout");
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f32980a;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(NotificationCompat.CATEGORY_EVENT, "customTabLayout");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.LEFT, D2.a(i10));
        jSONObject.put("top", D2.a(i11));
        jSONObject.put(TtmlNode.RIGHT, D2.a(i12));
        jSONObject.put("bottom", D2.a(i13));
        jSONObject.put("state", i14);
        jsonObject.put(TtmlNode.TAG_LAYOUT, jSONObject);
        gestureDetectorOnGestureListenerC3093yc.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f53 != null) {
            String str2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f53).a(str2, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str2, "TAG", "onCTLifeCycleEvent "));
        }
        gestureDetectorOnGestureListenerC3093yc.c("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    @Override // com.inmobi.media.InterfaceC2779g2
    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        F5 f52 = this.f32980a.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((G5) f52).a(str, "onCCTLifeCycleEvent");
        }
        this.f32980a.a(jsonObject);
    }
}
