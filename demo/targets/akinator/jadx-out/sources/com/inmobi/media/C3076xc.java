package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.ads.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3076xc extends Zf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3093yc f33580a;

    public C3076xc(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        this.f33580a = gestureDetectorOnGestureListenerC3093yc;
    }

    @Override // com.inmobi.media.Zf
    public final boolean a() {
        return !kotlin.jvm.internal.e0.areEqual("Hidden", this.f33580a.getViewState());
    }

    @Override // com.inmobi.media.Zf
    public final void a(EnumC3108za orientation, bg finalInsets) throws JSONException {
        JSONObject jSONObjectA;
        GestureDetectorOnGestureListenerC3093yc renderView;
        ag agVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(finalInsets, "finalInsets");
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this.f33580a;
        F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f52).c(str, AbstractC2823ic.a(gestureDetectorOnGestureListenerC3093yc, str, "TAG", "fireOnSafeAreaChanged "));
        }
        StringBuilder sb2 = new StringBuilder("window.imraid.broadcastEvent('onSafeAreaChange', ");
        kotlin.jvm.internal.e0.checkNotNullParameter(finalInsets, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        try {
            finalInsets.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
            agVar = (ag) finalInsets.f32694a.get(orientation);
        } catch (Exception unused) {
        }
        if (agVar != null) {
            jSONObjectA = agVar.a();
            jSONObjectA.put("orientation", Aa.a(orientation));
        } else {
            jSONObjectA = null;
        }
        sb2.append(jSONObjectA);
        sb2.append(')');
        gestureDetectorOnGestureListenerC3093yc.c(sb2.toString());
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = this.f33580a;
        finalInsets.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        ag agVar2 = (ag) finalInsets.f32694a.get(orientation);
        if (agVar2 == null) {
            return;
        }
        if (agVar2.f32660b == 0 && agVar2.f32661c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC3093yc2.setCloseAssetArea(agVar2);
        tu.o oVar = Jc.f31925a;
        kotlin.jvm.internal.e0.checkNotNullParameter(gestureDetectorOnGestureListenerC3093yc2, "<this>");
        if (kotlin.jvm.internal.e0.areEqual(gestureDetectorOnGestureListenerC3093yc2.getRoute().f32467b, BuildConfig.FLAVOR)) {
            renderView = gestureDetectorOnGestureListenerC3093yc2;
        } else {
            Sf webViewFactory = gestureDetectorOnGestureListenerC3093yc2.getWebViewFactory();
            webViewFactory.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            renderView = (GestureDetectorOnGestureListenerC3093yc) webViewFactory.f32281b.get(BuildConfig.FLAVOR);
        }
        if (renderView != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
            ag insets = gestureDetectorOnGestureListenerC3093yc2.Y0;
            kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
            View viewFindViewById = renderView.getRootView().findViewById(65531);
            A3 a32 = viewFindViewById instanceof A3 ? (A3) viewFindViewById : null;
            if (a32 == null) {
                return;
            }
            View viewFindViewById2 = renderView.getRootView().findViewById(65531);
            A3 a33 = viewFindViewById2 instanceof A3 ? (A3) viewFindViewById2 : null;
            if (a33 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = a32.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = a33.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.f32660b, insets.f32661c, 0);
            layoutParams4.setMargins(0, insets.f32660b, insets.f32661c, 0);
        }
    }
}
