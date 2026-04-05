package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.unity3d.services.core.request.NJc.yFkbx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3006ta {
    public static C2956qa a(String creativeType, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, boolean z10, String str, byte b10, String str2) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeType, "creativeType");
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            C3091ya c3091ya = AbstractC3074xa.f33574a;
            c3091ya.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(gestureDetectorOnGestureListenerC3093yc, yFkbx.CmN);
            adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(c3091ya.f33607b, gestureDetectorOnGestureListenerC3093yc, str, str2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        } else {
            adSessionContextCreateHtmlAdSessionContext = null;
        }
        ImpressionType impressionType = b10 == 1 ? ImpressionType.DEFINED_BY_JAVASCRIPT : b10 == 2 ? ImpressionType.UNSPECIFIED : b10 == 3 ? ImpressionType.LOADED : b10 == 4 ? ImpressionType.BEGIN_TO_RENDER : b10 == 5 ? ImpressionType.ONE_PIXEL : b10 == 6 ? ImpressionType.VIEWABLE : b10 == 7 ? ImpressionType.AUDIBLE : b10 == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        int iHashCode = creativeType.hashCode();
        if (iHashCode != -284840886) {
            if (iHashCode != 93166550) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1425678798 && creativeType.equals("nonvideo")) {
                        return new C2956qa("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                    }
                } else if (creativeType.equals("video")) {
                    return new C2956qa("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
                }
            } else if (creativeType.equals("audio")) {
                return new C2956qa("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
            }
        } else if (creativeType.equals("unknown")) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "access$getTAG$cp(...)");
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(com.ironsource.Q6.f35252d0, "access$getTAG$cp(...)");
        return null;
    }
}
