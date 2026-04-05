package com.inmobi.media;

import android.content.Context;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.ads.BuildConfig;
import i2.hQ.aTNDubNmpwAqdU;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M9 extends B9 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N9 f32030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(N9 n9) {
        super(n9);
        this.f32030e = n9;
    }

    @Override // com.inmobi.media.B9
    public final View a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            Sf sf2 = new Sf(null);
            Wc wc2 = new Wc("adUnit", BuildConfig.FLAVOR);
            kotlin.jvm.internal.e0.checkNotNull(applicationContext);
            return new GestureDetectorOnGestureListenerC3093yc(applicationContext, (byte) 0, null, null, false, null, 0L, null, null, wc2, sf2, null, 252);
        } catch (Exception e10) {
            HashMap map = N9.f32067c;
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, aTNDubNmpwAqdU.qwG));
            return null;
        }
    }

    @Override // com.inmobi.media.B9
    public final void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        super.a(view, asset, adConfig);
        if (view instanceof GestureDetectorOnGestureListenerC3093yc) {
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) view;
            this.f32030e.getClass();
            try {
                P9 p92 = asset instanceof P9 ? (P9) asset : null;
                gestureDetectorOnGestureListenerC3093yc.a(GestureDetectorOnGestureListenerC3093yc.f33610a1, adConfig);
                F5 f52 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                if (f52 != null) {
                    String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "disableUrlsToOpenInExternalApp " + gestureDetectorOnGestureListenerC3093yc);
                }
                gestureDetectorOnGestureListenerC3093yc.f33662z = true;
                Object obj = asset.f33140e;
                String str = obj instanceof String ? (String) obj : null;
                String str2 = p92 != null ? p92.f32129y : null;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode == -1081286672) {
                        if (!str2.equals("REF_IFRAME")) {
                        }
                        gestureDetectorOnGestureListenerC3093yc.e(str);
                        return;
                    }
                    if (iHashCode == 84303) {
                        if (!str2.equals("URL")) {
                        }
                        gestureDetectorOnGestureListenerC3093yc.e(str);
                        return;
                    } else if (iHashCode != 2228139) {
                        if (iHashCode != 83774455 || !str2.equals("REF_HTML")) {
                        }
                        gestureDetectorOnGestureListenerC3093yc.d(str);
                        return;
                    } else {
                        if (!str2.equals("HTML")) {
                        }
                        gestureDetectorOnGestureListenerC3093yc.d(str);
                        return;
                    }
                }
                gestureDetectorOnGestureListenerC3093yc.e(str);
            } catch (Exception e10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "TAG");
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }

    @Override // com.inmobi.media.B9
    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (!(view instanceof GestureDetectorOnGestureListenerC3093yc) || ((GestureDetectorOnGestureListenerC3093yc) view).f33629i0) {
            return;
        }
        super.a(view);
    }
}
