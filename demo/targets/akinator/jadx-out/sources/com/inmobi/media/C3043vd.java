package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.C3284j8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3043vd {

    /* renamed from: a, reason: collision with root package name */
    public final Sf f33516a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f33517b;

    public C3043vd(Sf wvFactory, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wvFactory, "wvFactory");
        this.f33516a = wvFactory;
        this.f33517b = f52;
    }

    public final GestureDetectorOnGestureListenerC3093yc a() {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC3093ycA != null) {
            return gestureDetectorOnGestureListenerC3093ycA;
        }
        F5 f52 = this.f33517b;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
            ((G5) f52).b("vd", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) throws JSONException {
        Object next;
        Context context;
        AbstractC3062wf viewableAd;
        Integer numA;
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetId, "targetId");
        F5 f52 = this.f33517b;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
            ((G5) f52).a("vd", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3093ycA2 == null) {
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            gestureDetectorOnGestureListenerC3093ycA.a("showWebView", jSONObjectA);
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(targetId, BuildConfig.FLAVOR)) {
            a(gestureDetectorOnGestureListenerC3093ycA, targetId, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC3093ycA2 instanceof Fc)) {
            tu.o oVar2 = Jc.f31925a;
            JSONObject jSONObjectA2 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            gestureDetectorOnGestureListenerC3093ycA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA3 = a();
        if (gestureDetectorOnGestureListenerC3093ycA3 != null && !gestureDetectorOnGestureListenerC3093ycA3.isAttachedToWindow()) {
            tu.o oVar3 = Jc.f31925a;
            JSONObject jSONObjectA3 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            gestureDetectorOnGestureListenerC3093ycA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC3093ycA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            tu.o oVar4 = Jc.f31925a;
            JSONObject jSONObjectA4 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA4.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC3093ycA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = uu.p1.toMap(this.f33516a.f32281b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) next;
            if (gestureDetectorOnGestureListenerC3093yc.getWvStateMachine().f32656b == 105 && !kotlin.jvm.internal.e0.areEqual(gestureDetectorOnGestureListenerC3093yc, gestureDetectorOnGestureListenerC3093ycA2) && !kotlin.jvm.internal.e0.areEqual(gestureDetectorOnGestureListenerC3093yc.getRoute().f32467b, BuildConfig.FLAVOR)) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = (GestureDetectorOnGestureListenerC3093yc) next;
        if (gestureDetectorOnGestureListenerC3093yc2 != null && (numA = gestureDetectorOnGestureListenerC3093yc2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            tu.o oVar5 = Jc.f31925a;
            JSONObject jSONObjectA5 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA5.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue2);
            gestureDetectorOnGestureListenerC3093ycA.a("showWebView", jSONObjectA5);
        }
        Fc fc2 = (Fc) gestureDetectorOnGestureListenerC3093ycA2;
        if (fc2.isAttachedToWindow()) {
            ViewParent parent = gestureDetectorOnGestureListenerC3093ycA2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                tu.o oVar6 = Jc.f31925a;
                JSONObject jSONObjectA6 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
                jSONObjectA6.put(IronSourceConstants.EVENTS_ERROR_CODE, 307);
                gestureDetectorOnGestureListenerC3093ycA.a("showWebView", jSONObjectA6);
                return;
            }
            if (viewGroup.indexOfChild(gestureDetectorOnGestureListenerC3093ycA2) != -1) {
                viewGroup.bringChildToFront(gestureDetectorOnGestureListenerC3093ycA2);
                F5 f53 = this.f33517b;
                if (f53 != null) {
                    ((G5) f53).a("vd", AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093ycA2, "vd", "TAG", "Sibling view brought to front: "));
                }
            } else {
                F5 f54 = this.f33517b;
                if (f54 != null) {
                    ((G5) f54).b("vd", AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093ycA2, "vd", "TAG", "Sibling view not found in parent: "));
                }
            }
            gestureDetectorOnGestureListenerC3093ycA.a(gestureDetectorOnGestureListenerC3093ycA, targetId);
            return;
        }
        F5 f55 = this.f33517b;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
            ((G5) f55).a("vd", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA4 = a();
        Context containerContext = gestureDetectorOnGestureListenerC3093ycA4 != null ? gestureDetectorOnGestureListenerC3093ycA4.getContainerContext() : null;
        if (containerContext == null) {
            F5 f56 = this.f33517b;
            if (f56 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
                ((G5) f56).b("vd", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context != null) {
            if (context instanceof InMobiAdActivity) {
                fc2.setFullScreenActivityContext((Activity) context);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                F5 f57 = this.f33517b;
                if (f57 != null) {
                    StringBuilder sbA = N6.a("vd", "TAG", "target View's Viewable ad - ");
                    sbA.append(fc2.getViewableAd());
                    ((G5) f57).a("vd", sbA.toString());
                }
                View viewD = fc2.getViewableAd().d();
                ((ViewGroup) ((InMobiAdActivity) context).findViewById(65534)).addView(viewD, layoutParams);
                F5 f58 = this.f33517b;
                if (f58 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
                    ((G5) f58).a("vd", "Target View added - the inflatedView is - " + viewD);
                }
            } else {
                F5 f59 = this.f33517b;
                if (f59 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
                    ((G5) f59).b("vd", "Context is not an instance of InMobiAdActivity.");
                }
                a(gestureDetectorOnGestureListenerC3093ycA, fc2.getRoute().f32467b, "loadWebView");
            }
        }
        F5 f510 = this.f33517b;
        if (f510 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
            ((G5) f510).a("vd", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA5 = a();
        if (gestureDetectorOnGestureListenerC3093ycA5 != null && (viewableAd = gestureDetectorOnGestureListenerC3093ycA5.getViewableAd()) != null) {
            viewableAd.a(gestureDetectorOnGestureListenerC3093ycA2, FriendlyObstructionPurpose.OTHER);
        }
        AbstractC3062wf viewableAd2 = gestureDetectorOnGestureListenerC3093ycA2.getViewableAd();
        Map friendlyViews = gestureDetectorOnGestureListenerC3093ycA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap();
        }
        viewableAd2.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC3093yc a(String id2) {
        Sf sf2 = this.f33516a;
        sf2.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) sf2.f32281b.get(id2);
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            return gestureDetectorOnGestureListenerC3093yc;
        }
        F5 f52 = this.f33517b;
        if (f52 == null) {
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
        ((G5) f52).b("vd", "View with ID: " + id2 + " not found.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r35, java.lang.String r36, java.lang.String r37) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3043vd.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void a(String sourceId, String targetId) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetId, "targetId");
        GestureDetectorOnGestureListenerC3093yc sourceView = a(sourceId);
        if (sourceView == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a(targetId);
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            sourceView.a("destroyWebView", jSONObjectA);
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(targetId, BuildConfig.FLAVOR)) {
            a(sourceView, targetId, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3093ycA.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            tu.o oVar2 = Jc.f31925a;
            JSONObject jSONObjectA2 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            sourceView.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC3093ycA.b();
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceView, "sourceView");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetId, "targetId");
        F5 f52 = sourceView.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(sourceView, str, "TAG", "fireDestroyWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.c("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
        F5 f53 = this.f33517b;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
            ((G5) f53).a("vd", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, String str, String str2) {
        F5 f52 = this.f33517b;
        if (f52 != null) {
            ((G5) f52).b("vd", O6.a("vd", "TAG", "Cannot perform operations on default WebView with ID: ", str));
        }
        gestureDetectorOnGestureListenerC3093yc.a(str2, Jc.a(str, 303));
    }

    public final void b(String sourceId, String targetId, String message) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceId, "sourceId");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetId, "targetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3093ycA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3093ycA2 == null) {
            tu.o oVar = Jc.f31925a;
            JSONObject jSONObjectA = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            gestureDetectorOnGestureListenerC3093ycA.a(C3284j8.f37009j, jSONObjectA);
            return;
        }
        int i10 = gestureDetectorOnGestureListenerC3093ycA2.getWvStateMachine().f32656b;
        if (!kotlin.jvm.internal.e0.areEqual(gestureDetectorOnGestureListenerC3093ycA2.getRoute().f32467b, BuildConfig.FLAVOR) && uu.p0.listOf((Object[]) new Integer[]{101, 104, 107}).contains(Integer.valueOf(i10))) {
            F5 f52 = this.f33517b;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
                ((G5) f52).b("vd", "WebView is not in state to receive messages: ".concat(targetId));
            }
            int i11 = gestureDetectorOnGestureListenerC3093ycA2.getWvStateMachine().f32656b;
            tu.o oVar2 = Jc.f31925a;
            JSONObject jSONObjectA2 = AbstractC3026ud.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, i11);
            gestureDetectorOnGestureListenerC3093ycA.a(C3284j8.f37009j, jSONObjectA2);
            return;
        }
        F5 f53 = this.f33517b;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("vd", "TAG");
            ((G5) f53).a("vd", "Sending message to WebView ID: ".concat(targetId));
        }
        gestureDetectorOnGestureListenerC3093ycA2.c(message);
    }
}
