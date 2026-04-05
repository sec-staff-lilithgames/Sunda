package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.moloco.sdk.BKC.KerkSviMAy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2900n5 implements InterfaceC2781g4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2934p5 f33133a;

    public C2900n5(C2934p5 c2934p5) {
        this.f33133a = c2934p5;
    }

    public final void a(String expandInput, EnumC2764f4 inputType, float f10, boolean z10, long j10, X6 x62) {
        String adType;
        String creativeId;
        String impressionId;
        C2747e4 c2747e4;
        kotlin.jvm.internal.e0.checkNotNullParameter(expandInput, "expandInput");
        kotlin.jvm.internal.e0.checkNotNullParameter(inputType, "inputType");
        C2934p5 c2934p5 = this.f33133a;
        Activity activity = (Activity) c2934p5.f33248a.get();
        if (activity == null) {
            return;
        }
        if (c2934p5.f33252e == null) {
            C2747e4 c2747e42 = new C2747e4(activity);
            F5 f52 = c2934p5.f33255h;
            if (f52 != null) {
                c2747e42.setLogger(f52);
            }
            c2747e42.setId(65518);
            c2747e42.setEmbeddedBrowserUpdateListener(c2934p5.f33256i);
            c2934p5.f33252e = c2747e42;
        }
        InterfaceC3063x interfaceC3063x = c2934p5.f33249b;
        if ((interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc) && (c2747e4 = c2934p5.f33252e) != null) {
            c2747e4.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3093yc) interfaceC3063x).getListener());
        }
        C2747e4 c2747e43 = c2934p5.f33252e;
        if (c2747e43 != null) {
            InterfaceC3063x interfaceC3063x2 = c2934p5.f33249b;
            if (interfaceC3063x2 == null || (adType = interfaceC3063x2.getAdType()) == null) {
                adType = "banner";
            }
            String placementType = adType;
            InterfaceC3063x interfaceC3063x3 = c2934p5.f33249b;
            String impressionId2 = (interfaceC3063x3 == null || (impressionId = interfaceC3063x3.getImpressionId()) == null) ? "" : impressionId;
            InterfaceC3063x interfaceC3063x4 = c2934p5.f33249b;
            String str = (interfaceC3063x4 == null || (creativeId = interfaceC3063x4.getCreativeId()) == null) ? "" : creativeId;
            kotlin.jvm.internal.e0.checkNotNullParameter(expandInput, "expandInput");
            kotlin.jvm.internal.e0.checkNotNullParameter(inputType, "inputType");
            kotlin.jvm.internal.e0.checkNotNullParameter(placementType, "placementType");
            kotlin.jvm.internal.e0.checkNotNullParameter(impressionId2, "impressionId");
            kotlin.jvm.internal.e0.checkNotNullParameter(str, KerkSviMAy.uCWYSfLaYLTO);
            if (c2747e43.f32802c == null) {
                Context context = c2747e43.getContext();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
                C2899n4 c2899n4 = new C2899n4(context, j10, placementType, impressionId2, str, new C2730d4(c2747e43), c2747e43.f32805f);
                c2747e43.f32802c = c2899n4;
                c2899n4.setId(65517);
            }
            C2899n4 c2899n42 = c2747e43.f32802c;
            if (c2899n42 != null) {
                c2899n42.setLandingPageTelemetryControlInfo(x62);
            }
            if (c2747e43.f32801b != expandInput.hashCode()) {
                if (inputType == EnumC2764f4.f32833a) {
                    C2899n4 c2899n43 = c2747e43.f32802c;
                    if (c2899n43 != null) {
                        c2899n43.loadUrl(expandInput);
                    }
                } else {
                    C2899n4 c2899n44 = c2747e43.f32802c;
                    if (c2899n44 != null) {
                        c2899n44.loadData(expandInput, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                    }
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                layoutParams.addRule(2, Utf8.REPLACEMENT_CODE_POINT);
                C2899n4 c2899n45 = c2747e43.f32802c;
                if (c2899n45 != null) {
                    c2899n45.setLayoutParams(layoutParams);
                }
                if (c2747e43.findViewById(65517) == null) {
                    c2747e43.addView(c2747e43.f32802c, layoutParams);
                }
            }
            c2747e43.f32801b = expandInput.hashCode();
            if (!z10) {
                View viewFindViewById = c2747e43.findViewById(Utf8.REPLACEMENT_CODE_POINT);
                if (viewFindViewById != null) {
                    c2747e43.removeView(viewFindViewById);
                }
            } else if (c2747e43.findViewById(Utf8.REPLACEMENT_CODE_POINT) == null) {
                float f11 = AbstractC2679a4.d().f32676c;
                LinearLayout linearLayout = new LinearLayout(c2747e43.getContext());
                linearLayout.setOrientation(0);
                linearLayout.setId(Utf8.REPLACEMENT_CODE_POINT);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setBackgroundResource(R.drawable.bottom_bar);
                linearLayout.setBackgroundColor(-7829368);
                c2747e43.setBackgroundColor(-7829368);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f11));
                layoutParams2.addRule(12);
                c2747e43.addView(linearLayout, layoutParams2);
                if (D2.a(c2747e43.f32800a)) {
                    cg cgVar = c2747e43.f32806g;
                    if (cgVar != null) {
                        cgVar.a();
                    }
                    c2747e43.f32806g = new cg(c2747e43.f32800a, new C2713c4(layoutParams2), c2747e43.f32805f);
                }
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.weight = 25.0f;
                c2747e43.b(linearLayout, layoutParams3);
                c2747e43.d(linearLayout, layoutParams3);
                c2747e43.a(linearLayout, layoutParams3);
                c2747e43.c(linearLayout, layoutParams3);
            }
        }
        float f12 = 1 - f10;
        c2934p5.f33254g = f12;
        Q q10 = c2934p5.f33250c;
        if (q10 != null) {
            q10.f32144c = f12;
            q10.e();
        }
        c2934p5.c();
    }
}
