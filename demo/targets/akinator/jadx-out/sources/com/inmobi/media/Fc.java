package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Fc extends GestureDetectorOnGestureListenerC3093yc {

    /* renamed from: d1, reason: collision with root package name */
    public final byte f31795d1;

    /* renamed from: e1, reason: collision with root package name */
    public final F5 f31796e1;

    /* renamed from: f1, reason: collision with root package name */
    public final String f31797f1;

    /* renamed from: g1, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f31798g1;

    /* renamed from: h1, reason: collision with root package name */
    public final Ec f31799h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fc(Context context, byte b10, F5 f52, S adMetaData, Sf webViewFactory, Wc route) {
        super(context, b10, null, null, false, adMetaData.f32242s, 0L, adMetaData.f32243t, f52, route, webViewFactory, adMetaData, 92);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adMetaData, "adMetaData");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewFactory, "webViewFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        this.f31795d1 = b10;
        this.f31796e1 = f52;
        this.f31797f1 = "RenderViewSibling - " + route.f32467b;
        webViewFactory.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        this.f31798g1 = (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(BuildConfig.FLAVOR);
        this.f31799h1 = new Ec(this, webViewFactory, route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC3093yc getAdRenderView() {
        F5 f52;
        if (this.f31798g1 == null && (f52 = this.f31796e1) != null) {
            ((G5) f52).b(this.f31797f1, "Ad RenderView not found for id: " + getRoute().f32467b);
        }
        return this.f31798g1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc, com.inmobi.media.InterfaceC3063x
    public final void b() {
        h();
        removeAllViews();
        kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    public final F5 getLogger() {
        return this.f31796e1;
    }

    public final byte getMPlacementType() {
        return this.f31795d1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc, com.inmobi.media.InterfaceC3063x
    public AbstractC3062wf getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new U5(this, this, new Y4(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getMAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.f31796e1), this.f31796e1));
        }
        AbstractC3062wf mViewableAd = getMViewableAd();
        kotlin.jvm.internal.e0.checkNotNull(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc
    public final void i() {
        F5 f52 = this.f31796e1;
        if (f52 != null) {
            ((G5) f52).a(this.f31797f1, "dismissCurrentViewContainer " + this);
        }
        L7 mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            B7 b72 = mediaProcessor.f32003c;
            if (b72 != null) {
                b72.b();
            }
            mediaProcessor.f32003c = null;
        }
        if (kotlin.jvm.internal.e0.areEqual("Default", getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        Sf webViewFactory = getWebViewFactory();
        String id2 = getRoute().f32466a;
        webViewFactory.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(id2);
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            a(gestureDetectorOnGestureListenerC3093yc, getRoute().f32467b);
            return;
        }
        F5 f52 = this.f31796e1;
        if (f52 != null) {
            ((G5) f52).b(this.f31797f1, "Not able to give show success as the source view is not present");
        }
    }

    public final void a(AdConfig adConfig) throws JSONException {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        F5 f52 = this.f31796e1;
        if (f52 != null) {
            ((G5) f52).a(this.f31797f1, "initialize RenderViewSibling");
        }
        a(this.f31799h1, adConfig);
        GestureDetectorOnGestureListenerC3093yc adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC3093yc adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC3093yc adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof Fc)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        F5 f53 = this.f31796e1;
        if (f53 != null) {
            ((G5) f53).a(this.f31797f1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(uu.p1.toMutableMap(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc
    public final void a(Ba orientationProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientationProperties, "orientationProperties");
        F5 f52 = this.f31796e1;
        if (f52 != null) {
            ((G5) f52).a(this.f31797f1, "setOrientationProperties " + this);
        }
        setOrientationProperties(orientationProperties);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc
    public final void m() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3093yc
    public final void p() {
    }
}
